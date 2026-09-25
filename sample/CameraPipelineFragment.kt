package com.effectssdk.tsvb.demo.fragment

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.os.Bundle
import android.util.Log
import android.util.Size
import android.view.LayoutInflater
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.effectssdk.tsvb.Camera
import com.effectssdk.tsvb.EffectsSDK
import com.effectssdk.tsvb.LutProvider
import com.effectssdk.tsvb.demo.R
import com.effectssdk.tsvb.pipeline.CameraPipeline
import com.effectssdk.tsvb.pipeline.ColorCorrectionConfig
import com.effectssdk.tsvb.pipeline.ColorCorrectionMode
import com.effectssdk.tsvb.pipeline.LowLightConfig
import com.effectssdk.tsvb.pipeline.PipelineMode
import com.effectssdk.tsvb.pipeline.PortraitLightingOptions
import com.effectssdk.tsvb.pipeline.SegmentationMode
import java.io.IOException


/**
 * Reference fragment showing every option a pipeline exposes.
 *
 * The working part is small: create a pipeline in [onStart], give it a surface
 * when one appears, release it in [onStop]. Everything between is a tour of
 * [com.effectssdk.tsvb.pipeline.BasePipeline] grouped by what the options do,
 * so you can copy the group you need.
 *
 **/

class CameraPipelineFragment : Fragment() {

	private lateinit var previewSurfaceView: SurfaceView
	private var pipeline: CameraPipeline? = null

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val view = layoutInflater.inflate(R.layout.fragment_main, container, false)
		//SurfaceView for pipeline output
		previewSurfaceView = view.findViewById(R.id.surface_preview)
		return view
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		previewSurfaceView.holder.addCallback(holderCallback)
	}

	override fun onStart() {
		super.onStart()

		//Create pipeline for background blur.
		//Everything passed here can also be changed later through the setters below.
		val sdkFactory = EffectsSDK.createSDKFactory()
		pipeline = sdkFactory.createCameraPipeline(
			requireContext(),
			mode = PipelineMode.BLUR,
			blurPower = 0.75f
		)

		attachListeners(pipeline)
		configureBackground(pipeline)
		configureSegmentation(pipeline)
		configureFraming(pipeline)
		configureBeautification(pipeline)
		configurePortraitLighting(pipeline)
		configureImageQuality(pipeline)
		useAutoColorCorrection(pipeline)

		//Start camera pipeline
		pipeline.startPipeline()
	}

	override fun onStop() {
		super.onStop()
		//Frees the graph and every resource the pipeline holds.
		//The pipeline cannot be used after this call.
		pipeline?.release()
		pipeline = null
	}

	// ---------------------------------------------------------------- listeners

	private fun attachListeners(pipeline: CameraPipeline) {
		//Get sdk output as bitmap. Called on the pipeline's own frame thread,
		//so hop to the main thread before touching views.
		pipeline.setOnFrameAvailableListener { bitmapFromSDK, timestamp ->
			//Do something with bitmap
			//Can be displayed by imageView
			Log.v(TAG, "frame ${bitmapFromSDK.width}x${bitmapFromSDK.height} at $timestamp us")
		}

		//Throughput counter, reported at most once per second while frames flow.
		pipeline.setFPSListener { framesPerSecond ->
			Log.d(TAG, "fps: $framesPerSecond")
		}

		//Only reports anything under SegmentationMode.AUTO, and only on a camera
		//pipeline: an image pipeline throws NotImplementedError here.
		pipeline.setOrientationChangeListener { deviceOrientation, rotation ->
			Log.d(TAG, "orientation: $deviceOrientation, frame rotated by $rotation")
		}

		//Pass null to any of the three to detach.
	}

	// --------------------------------------------------------------- background

	private fun configureBackground(pipeline: CameraPipeline) {
		//REMOVE makes the background transparent, REPLACE swaps in an image,
		//BLUR blurs it, NO_EFFECT leaves it alone.
		pipeline.setMode(PipelineMode.BLUR)

		//Used by PipelineMode.REPLACE. Stretched to the frame, so its own size
		//does not matter. Safe to set even while another mode is active.
		pipeline.setBackground(getBitmapFromAsset("demo_background.jpg"))

		//Only affects PipelineMode.BLUR. Higher costs more. Outside 0..1 this
		//throws IllegalArgumentException rather than clamping.
		pipeline.setBlurPower(0.75f)

	}

	// ------------------------------------------------------------- segmentation

	private fun configureSegmentation(pipeline: CameraPipeline) {
		//AUTO follows the device and is what the orientation listener reports on.
		//PORTRAIT and LANDSCAPE pin the model instead.
		pipeline.setSegmentationMode(SegmentationMode.AUTO)

		//0 segments every frame. Higher reuses the cached mask for that many
		//frames, which buys performance at the cost of latency on the mask.
		pipeline.setSegmentationGap(0)
	}

	// ------------------------------------------------------------------ framing

	/** Not available on a lite pipeline: these five throw NotImplementedError there. */
	private fun configureFraming(pipeline: CameraPipeline) {
		//Smart zoom: crop around the face so it takes up this percentage of the
		//frame. 0 disables the zoom and the face detection behind it. Keep it in
		//0..100, larger values are not rejected but produce a broken crop.
		pipeline.setZoomLevel(0)

		//Only matters while the zoom level is above 0, since face detection
		//exists to drive it. Same trade-off as the segmentation gap.
		pipeline.setFaceDetectionGap(1)

	}

	// ----------------------------------------------------------- beautification

	private fun configureBeautification(pipeline: CameraPipeline) {
		//Smooths skin. Needs segmentation, so it forces the models to run even
		//in PipelineMode.NO_EFFECT.
		pipeline.enableBeautification(true)

		//0 leaves the frame untouched, 1 is the maximum smoothing.
		//Values outside 0..1 are clamped.
		pipeline.setBeautificationPower(0.5f)

	}

	// -------------------------------------------------------- portrait lighting

	private fun configurePortraitLighting(pipeline: CameraPipeline) {
		//Brightens the person and dims the background around them. Also needs
		//segmentation, and works on top of any background mode.
		pipeline.enablePortraitLighting(true)

		//Every field is applied, so the ones left out fall back to their
		//defaults rather than keeping the current value. Keep your own instance
		//and copy() it to change one field.
		pipeline.setPortraitLightingOptions(
			PortraitLightingOptions(
				lightStrength = 0.6f,
				//Ignored in REPLACE and REMOVE, where there is no real
				//background left to dim.
				backgroundDarkness = 0.4f
			)
		)
	}

	// ------------------------------------------------------------ image quality

	private fun configureImageQuality(pipeline: CameraPipeline) {
		//Blends each frame with the previous result, weaker where the scene
		//moves. Runs before color correction, so noise is gone before low light
		//or auto exposure amplifies it.
		pipeline.enableNoiseSuppression(true)

		//Sharpening is off by default and its strength starts at 0, so both
		//calls are needed to see anything.
		pipeline.enableSharpening(true)
		pipeline.setSharpeningStrength(0.4f)
	}

	// --------------------------------------------------------- color correction

	/**
	 * Automatic correction: white balance, exposure and local contrast driven by
	 * the frame.
	 */
	private fun useAutoColorCorrection(pipeline: CameraPipeline) {
		pipeline.setColorCorrectionMode(ColorCorrectionMode.COLOR_CORRECTION_MODE)

		//Every field is applied on each call, same as the portrait options.
		pipeline.setColorCorrectionConfig(
			ColorCorrectionConfig(
				autoMode = true,
				power = 1.0f,
				//The manual fields below only apply while autoMode is false.
				whiteBalance = 0.0f,
				exposure = 0.0f,
				temperature = 0.0f,
				tint = 0.0f,
				vibrance = 0.0f,
				contrast = 0.0f,
				//Larger reacts slower to scene changes but costs less.
				updatePeriodMs = 200.0f
			)
		)

		//Shortcuts for the two fields worth changing at runtime. Both clamp
		//instead of throwing.
		pipeline.setColorCorrectionPower(1.0f)
		pipeline.setColorCorrectionPeriod(200.0f)

		//Blends the result over the original frame. It defaults to 0, so
		//without this call the mode above does nothing at all.
		pipeline.setColorFilterStrength(1.0f)

	}

	/** Call instead of [useAutoColorCorrection] to brighten a dark scene. */
	private fun useLowLight(pipeline: CameraPipeline) {
		pipeline.setColorCorrectionMode(ColorCorrectionMode.LOW_LIGHT_MODE)

		//The exposure is picked from the scene brightness, power scales how much
		//of it is applied.
		pipeline.setLowLightConfig(LowLightConfig(power = 0.8f))
		pipeline.setLowLightPower(0.8f)

		//Deprecated: while LOW_LIGHT_MODE is set the frame is re-analysed every
		//500 ms on its own, so a camera pipeline never needs this.
		@Suppress("DEPRECATION")
		pipeline.updateLowLightLut()
	}

	/** Call instead of [useAutoColorCorrection] to match the colors of a reference shot. */
	private fun useColorGrading(pipeline: CameraPipeline) {
		pipeline.setColorCorrectionMode(ColorCorrectionMode.COLOR_GRADING_MODE)

		//Only the colors of this image are used, it is rescaled to 700x700 and
		//should be ARGB_8888. Setting the same image twice is a no-op.
		pipeline.setColorGradingReferenceImage(getBitmapFromAsset("demo_background.jpg"))

		pipeline.setColorFilterStrength(1.0f)
	}

	private fun getBitmapFromAsset(path: String): Bitmap {
		val options = BitmapFactory.Options()
		options.inScaled = false
		return BitmapFactory.decodeStream(requireContext().assets.open(path), null, options)!!
	}

	private val holderCallback = object : SurfaceHolder.Callback {
		override fun surfaceCreated(holder: SurfaceHolder) {
			//set preview surface
			pipeline?.setOutputSurface(holder.surface)
		}

		override fun surfaceChanged(holder: SurfaceHolder, format: Int, width: Int, height: Int) {

		}

		override fun surfaceDestroyed(holder: SurfaceHolder) {
			pipeline?.setOutputSurface(null)
		}
	}

	private companion object {
		private const val TAG = "CameraPipelineFragment"
	}
}
