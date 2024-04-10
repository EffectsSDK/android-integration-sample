package com.effectssdk.tsvb.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View
import android.view.ViewGroup
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.core.ImageCapture
import androidx.camera.core.Preview
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import androidx.fragment.app.Fragment
import com.effectssdk.tsvb.EffectsSDK
import com.effectssdk.tsvb.pipeline.ImagePipeline
import com.effectssdk.tsvb.pipeline.PipelineMode
import com.effectssdk.tsvb.demo.R

import java.util.concurrent.Executors

class ImagePipelineFragment : Fragment() {
	private lateinit var previewSurfaceView: SurfaceView
	private var pipeline: ImagePipeline? = null
	private var cameraProvider: ProcessCameraProvider? = null

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

		//Create pipeline for background blur
		val sdkFactory = EffectsSDK.createSDKFactory()
		pipeline = sdkFactory.createImagePipeline(
			requireContext(),
			mode = PipelineMode.BLUR,
			blurPower = 0.75f
		)

		//Get sdk output as bitmap
		pipeline?.setOnFrameAvailableListener { bitmapFromSDK ->
			//Do something with bitmap
			//Can be displayed by imageView
		}

		val cameraProviderFuture = ProcessCameraProvider.getInstance(requireContext())
		cameraProviderFuture.addListener({
			cameraProvider = cameraProviderFuture.get()
			val preview = Preview.Builder()
				.build()
			val imageCapture = ImageCapture.Builder()
				.build()
			val imageAnalyzer = ImageAnalysis.Builder()
				.build()
				.also {
					it.setAnalyzer(Executors.newSingleThreadExecutor()) { image ->
						//Handle camera frame orientation here
						val bitmap = image.toBitmap()
						image.close()
						pipeline?.process(bitmap)
					}
				}

			val cameraSelector = CameraSelector.DEFAULT_FRONT_CAMERA

			try {
				cameraProvider?.unbindAll()
				cameraProvider?.bindToLifecycle(viewLifecycleOwner, cameraSelector, preview, imageCapture, imageAnalyzer)
			} catch (exc: Exception) {
				exc.printStackTrace()
			}

		}, ContextCompat.getMainExecutor(requireContext()))


	}

	override fun onStop() {
		super.onStop()
		cameraProvider?.unbindAll()
		cameraProvider = null
		pipeline?.release()
		pipeline = null
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
}
