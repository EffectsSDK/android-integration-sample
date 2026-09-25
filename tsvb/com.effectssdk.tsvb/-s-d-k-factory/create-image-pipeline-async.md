//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[SDKFactory](index.md)/[createImagePipelineAsync](create-image-pipeline-async.md)

# createImagePipelineAsync

[androidJvm]\
abstract fun [createImagePipelineAsync](create-image-pipeline-async.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), mode: [PipelineMode](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/index.md) = PipelineMode.NO_EFFECT, segmentationMode: [SegmentationMode](../../com.effectssdk.tsvb.pipeline/-segmentation-mode/index.md) = SegmentationMode.AUTO, colorCorrectionMode: [ColorCorrectionMode](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/index.md) = ColorCorrectionMode.NO_FILTER_MODE, background: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) = createBitmap(1, 1), gradingReference: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) = createBitmap(1, 1), segmentationGap: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) = 0, blurPower: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, faceDetectionGap: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) = 0, colorFilterStrength: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, isBeautificationEnabled: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) = false, fpsListener: [FPSListener](../-f-p-s-listener/index.md)? = null, callback: (pipeline: [ImagePipeline](../../com.effectssdk.tsvb.pipeline/-image-pipeline/index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html))

Create an [ImagePipeline](../../com.effectssdk.tsvb.pipeline/-image-pipeline/index.md) instance off the calling thread.

Takes the same options as [createImagePipeline](create-image-pipeline.md) and hands the result to [callback](create-image-pipeline-async.md) once the pipeline has warmed up on an empty 640x480 frame. See the note on asynchronous creation in [SDKFactory](index.md) for what that implies.

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
| blurPower | power of [PipelineMode.BLUR](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/-b-l-u-r/index.md). Default value: 0 |
| faceDetectionGap | number of skipped frames for face detection model. Default value: 0 |
| colorFilterStrength | power of [ColorCorrectionMode](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/index.md). Default value: 0 |
| isBeautificationEnabled | face beautification option. Default value: false |
| fpsListener | listener for frames per second number |
| callback | receives the ready pipeline, on the pipeline's frame thread |