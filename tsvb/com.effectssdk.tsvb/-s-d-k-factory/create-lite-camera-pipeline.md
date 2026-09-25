//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[SDKFactory](index.md)/[createLiteCameraPipeline](create-lite-camera-pipeline.md)

# createLiteCameraPipeline

[androidJvm]\
abstract fun [createLiteCameraPipeline](create-lite-camera-pipeline.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), pipelineMode: [PipelineMode](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/index.md) = PipelineMode.NO_EFFECT, blurPower: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, background: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) = createBitmap(1, 1), resolution: [Size](https://developer.android.com/reference/kotlin/android/util/Size.html) = Size(1280, 720), camera: [Camera](../-camera/index.md) = Camera.FRONT, segmentationMode: [SegmentationMode](../../com.effectssdk.tsvb.pipeline/-segmentation-mode/index.md) = SegmentationMode.AUTO, orientationChangeListener: [OrientationChangeListener](../../com.effectssdk.tsvb.pipeline/-orientation-change-listener/index.md)? = null, fpsListener: [FPSListener](../-f-p-s-listener/index.md)? = null): [CameraPipeline](../../com.effectssdk.tsvb.pipeline/-camera-pipeline/index.md)

Create a lite [CameraPipeline](../../com.effectssdk.tsvb.pipeline/-camera-pipeline/index.md) instance.

Same as [createCameraPipeline](create-camera-pipeline.md) without smart zoom, so every option but the zoom related ones works as usual. Color correction and beautification are not arguments here, they start off and are turned on later through [com.effectssdk.tsvb.pipeline.BasePipeline.setColorCorrectionMode](../../com.effectssdk.tsvb.pipeline/-base-pipeline/set-color-correction-mode.md) and [com.effectssdk.tsvb.pipeline.BasePipeline.enableBeautification](../../com.effectssdk.tsvb.pipeline/-base-pipeline/enable-beautification.md).

The camera is not opened until [CameraPipeline.startPipeline](../../com.effectssdk.tsvb.pipeline/-camera-pipeline/start-pipeline.md) is called.

#### Return

[CameraPipeline](../../com.effectssdk.tsvb.pipeline/-camera-pipeline/index.md) instance running the lite graph

#### Parameters

androidJvm

| | |
|---|---|
| context | context link. |
| pipelineMode | pipeline mode. Default value: [PipelineMode.NO_EFFECT](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/-n-o_-e-f-f-e-c-t/index.md) |
| blurPower | power of [PipelineMode.BLUR](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/-b-l-u-r/index.md). Default value: 0 |
| background | background image for [PipelineMode.REPLACE](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/-r-e-p-l-a-c-e/index.md). Default value: empty bitmap 1x1 px |
| resolution | input image resolution. Use one of available for you camera. See [EffectsSDK.getCameraResolution](../-effects-s-d-k/get-camera-resolution.md) |
| camera | front/back camera |
| segmentationMode | segmentation mode. Default value: [SegmentationMode.AUTO](../../com.effectssdk.tsvb.pipeline/-segmentation-mode/-a-u-t-o/index.md) |
| orientationChangeListener | listener for orientation change event |
| fpsListener | listener for frames per second number |