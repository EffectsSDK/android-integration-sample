//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[SDKFactory](index.md)/[createCameraPipelineAsync](create-camera-pipeline-async.md)

# createCameraPipelineAsync

[androidJvm]\
abstract fun [createCameraPipelineAsync](create-camera-pipeline-async.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), mode: [PipelineMode](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/index.md) = PipelineMode.NO_EFFECT, segmentationMode: [SegmentationMode](../../com.effectssdk.tsvb.pipeline/-segmentation-mode/index.md) = SegmentationMode.AUTO, colorCorrectionMode: [ColorCorrectionMode](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/index.md) = ColorCorrectionMode.NO_FILTER_MODE, background: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) = createBitmap(1, 1), gradingReference: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) = createBitmap(1, 1), segmentationGap: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) = 0, faceDetectionGap: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) = 0, blurPower: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, colorFilterStrength: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, isBeautificationEnabled: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) = false, fpsListener: [FPSListener](../-f-p-s-listener/index.md)? = null, orientationChangeListener: [OrientationChangeListener](../../com.effectssdk.tsvb.pipeline/-orientation-change-listener/index.md)? = null, resolution: [Size](https://developer.android.com/reference/kotlin/android/util/Size.html) = Size(1280, 720), camera: [Camera](../-camera/index.md) = Camera.FRONT, callback: (pipeline: [CameraPipeline](../../com.effectssdk.tsvb.pipeline/-camera-pipeline/index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html))

Create a [CameraPipeline](../../com.effectssdk.tsvb.pipeline/-camera-pipeline/index.md) instance off the calling thread.

Takes the same options as [createCameraPipeline](create-camera-pipeline.md) and hands the result to [callback](create-camera-pipeline-async.md) once the pipeline has warmed up on a small synthetic frame. See the note on asynchronous creation in [SDKFactory](index.md) for what that implies, in particular that the camera still has to be started with [CameraPipeline.startPipeline](../../com.effectssdk.tsvb.pipeline/-camera-pipeline/start-pipeline.md).

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
| colorFilterStrength | power of [ColorCorrectionMode](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/index.md). Default value: 0 |
| isBeautificationEnabled | face beautification option. Default value: false |
| fpsListener | listener for frames per second number |
| orientationChangeListener | listener for orientation change event |
| resolution | input image resolution. Use one of available for you camera. See [EffectsSDK.getCameraResolution](../-effects-s-d-k/get-camera-resolution.md) |
| camera | front/back camera |
| callback | receives the ready pipeline, on the pipeline's frame thread |