//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[SDKFactory](index.md)/[createCameraPipeline](create-camera-pipeline.md)

# createCameraPipeline

[androidJvm]\
abstract fun [createCameraPipeline](create-camera-pipeline.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), mode: [PipelineMode](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/index.md) = PipelineMode.NO_EFFECT, segmentationMode: [SegmentationMode](../../com.effectssdk.tsvb.pipeline/-segmentation-mode/index.md) = SegmentationMode.AUTO, colorCorrectionMode: [ColorCorrectionMode](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/index.md) = ColorCorrectionMode.NO_FILTER_MODE, background: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888), gradingReference: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888), segmentationGap: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, faceDetectionGap: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, blurPower: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.0f, foregroundAreaSize: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = -1f, colorFilterStrength: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.0f, isBeautificationEnabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, fpsListener: [FPSListener](../-f-p-s-listener/index.md)? = null, orientationChangeListener: [OrientationChangeListener](../../com.effectssdk.tsvb.pipeline/-orientation-change-listener/index.md)? = null, resolution: [Size](https://developer.android.com/reference/kotlin/android/util/Size.html) = Size(1280, 720), camera: [Camera](../-camera/index.md) = Camera.FRONT): [CameraPipeline](../../com.effectssdk.tsvb.pipeline/-camera-pipeline/index.md)

Create [CameraPipeline](../../com.effectssdk.tsvb.pipeline/-camera-pipeline/index.md) instance.

This pipeline take camera input automatically and pass frames to [com.effectssdk.tsvb.pipeline.OnFrameAvailableListener](../../com.effectssdk.tsvb.pipeline/-on-frame-available-listener/index.md). Also pipeline result could be drawn on surface. Use [com.effectssdk.tsvb.pipeline.BasePipeline.setOutputSurface](../../com.effectssdk.tsvb.pipeline/-base-pipeline/set-output-surface.md) method, if u need this option.

#### Return

[CameraPipeline](../../com.effectssdk.tsvb.pipeline/-camera-pipeline/index.md) instance

#### Parameters

androidJvm

| | |
|---|---|
| context | context link. |
| mode | pipeline mode. Default value: [PipelineMode.NO_EFFECT](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/-n-o_-e-f-f-e-c-t/index.md) |
| segmentationMode | segmentation mode. Default value: [SegmentationMode.AUTO](../../com.effectssdk.tsvb.pipeline/-segmentation-mode/-a-u-t-o/index.md) |
| colorCorrectionMode | color correction mode. Default value: [ColorCorrectionMode.NO_FILTER_MODE](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/-n-o_-f-i-l-t-e-r_-m-o-d-e/index.md) |
| background | background image for [PipelineMode.REPLACE](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/-r-e-p-l-a-c-e/index.md). Default value: empty bitmap 1x1 px |
| gradingReference | image for [ColorCorrectionMode.COLOR_GRADING_MODE](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/-c-o-l-o-r_-g-r-a-d-i-n-g_-m-o-d-e/index.md). Default value: empty bitmap 1x1 px |
| segmentationGap | number of skipped frames for segmentation model. Default value: 0 |
| faceDetectionGap | number of skipped frames for face detection model. Default value: 0 |
| blurPower | power of [PipelineMode.BLUR](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/-b-l-u-r/index.md). Default value: 0 |
| foregroundAreaSize | size of [com.effectssdk.tsvb.pipeline.BasePipeline.setForegroundSize](../../com.effectssdk.tsvb.pipeline/-base-pipeline/set-foreground-size.md). Default value: -1 |
| colorFilterStrength | power of [ColorCorrectionMode](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/index.md). Default value: 0 |
| isBeautificationEnabled | face beautification option. Default value: false |
| fpsListener | listener for frames per second number |
| orientationChangeListener | listener for orientation change event |
| resolution | input image resolution. Use one of available for you camera. See [EffectsSDK.getCameraResolution](../-effects-s-d-k/get-camera-resolution.md) |
| camera | front/back camera |
