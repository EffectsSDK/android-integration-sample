package com.effectssdk.tsvb.demo.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.SurfaceHolder
import android.view.SurfaceView
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.effectssdk.tsvb.EffectsSDK
import com.effectssdk.tsvb.demo.R
import com.effectssdk.tsvb.pipeline.CameraPipeline
import com.effectssdk.tsvb.pipeline.PipelineMode


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

		//Create pipeline for background blur
		val sdkFactory = EffectsSDK.createSDKFactory()
		pipeline = sdkFactory.createCameraPipeline(
			requireContext(),
			mode = PipelineMode.BLUR,
			blurPower = 0.75f
		)

		//Get sdk output as bitmap
		pipeline?.setOnFrameAvailableListener { bitmapFromSDK ->
			//Do something with bitmap
			//Can be displayed by imageView
		}

		//Start camera pipeline
		pipeline?.startPipeline()
	}

	override fun onStop() {
		super.onStop()
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
