package com.effectssdk.tsvb.demo.fragment

import android.graphics.Bitmap
import android.media.MediaCodec
import android.media.MediaRecorder
import android.os.Bundle
import android.util.Size
import android.view.LayoutInflater
import android.view.Surface
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.camera.core.AspectRatio
import androidx.camera.core.CameraSelector
import androidx.camera.core.ImageAnalysis
import androidx.camera.lifecycle.ProcessCameraProvider
import androidx.core.content.ContextCompat
import com.effectssdk.tsvb.EffectsSDK
import com.effectssdk.tsvb.demo.R
import com.effectssdk.tsvb.pipeline.ImagePipeline
import com.effectssdk.tsvb.pipeline.PipelineMode
import java.util.concurrent.Executors


class VideoRecordFragment : BaseFragment() {
	private var pipeline: ImagePipeline? = null
	private var cameraProvider: ProcessCameraProvider? = null

	private var recorder: MediaRecorder? = null
	private var recordButton: Button? = null
	private var isVideoRecordStarted = false
	private var videoSurface: Surface? = null

	override fun onCreateView(
		inflater: LayoutInflater,
		container: ViewGroup?,
		savedInstanceState: Bundle?
	): View? {
		val view = layoutInflater.inflate(R.layout.fragment_main, container, false)
		recordButton = view.findViewById(R.id.record_button)
		return view
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		recordButton?.setOnClickListener {
			if (!isVideoRecordStarted) {
				pipeline?.setOutputSurface(videoSurface)
				recorder?.start()
			} else {
				recorder?.stop()
			}
			isVideoRecordStarted = !isVideoRecordStarted
		}
	}

	override fun onStart() {
		super.onStart()
		EffectsSDK.initialize(requireContext())
		val sdkFactory = EffectsSDK.createSDKFactory()
		pipeline = sdkFactory.createImagePipeline(
			requireContext(),
			mode = PipelineMode.BLUR,
			blurPower = 0.75f,
		)
		pipeline?.setOnFrameAvailableListener { bitmapFromSDK, timestamp ->
			// process bitmap here
		}

		recorder = MediaRecorder(requireContext()).apply {
			setAudioSource(MediaRecorder.AudioSource.MIC)
			setVideoSource(MediaRecorder.VideoSource.SURFACE)
			setOutputFormat(MediaRecorder.OutputFormat.MPEG_4)
			setAudioEncoder(MediaRecorder.AudioEncoder.AAC)
			setVideoEncoder(MediaRecorder.VideoEncoder.H264)
			setAudioEncodingBitRate(16)
			setAudioSamplingRate(44_100)
			setVideoEncodingBitRate(6_000_000)
			setVideoFrameRate(30)
			setOrientationHint(270)
			setVideoSize(720, 1280)
			setOutputFile("Your_video_file_path")
			videoSurface = MediaCodec.createPersistentInputSurface()
			setInputSurface(videoSurface!!)
			prepare()
		}
		val cameraProviderFuture = ProcessCameraProvider.getInstance(requireContext())
		cameraProviderFuture.addListener({
			cameraProvider = cameraProviderFuture.get()
			val imageAnalyzer = ImageAnalysis.Builder()
				.setTargetAspectRatio(AspectRatio.RATIO_16_9)
				.setDefaultResolution(Size(1280, 720))
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
				cameraProvider?.bindToLifecycle(viewLifecycleOwner, cameraSelector, imageAnalyzer)
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
}
