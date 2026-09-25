//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[SDKFactory](index.md)/[createLiteImagePipelineAsync](create-lite-image-pipeline-async.md)

# createLiteImagePipelineAsync

[androidJvm]\
abstract fun [createLiteImagePipelineAsync](create-lite-image-pipeline-async.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), mode: [PipelineMode](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/index.md) = PipelineMode.NO_EFFECT, segmentationMode: [SegmentationMode](../../com.effectssdk.tsvb.pipeline/-segmentation-mode/index.md) = SegmentationMode.AUTO, background: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) = createBitmap(1, 1), blurPower: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, fpsListener: [FPSListener](../-f-p-s-listener/index.md)? = null, callback: (pipeline: [ImagePipeline](../../com.effectssdk.tsvb.pipeline/-image-pipeline/index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html))

Create a lite [ImagePipeline](../../com.effectssdk.tsvb.pipeline/-image-pipeline/index.md) instance off the calling thread.

Takes the same options as [createLiteImagePipeline](create-lite-image-pipeline.md) and hands the result to [callback](create-lite-image-pipeline-async.md) once the pipeline has warmed up on an empty 640x480 frame. See the note on asynchronous creation in [SDKFactory](index.md) for what that implies.

#### Parameters

androidJvm

| | |
|---|---|
| context | context link. |
| mode | pipeline mode. Default value: [PipelineMode.NO_EFFECT](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/-n-o_-e-f-f-e-c-t/index.md) |
| segmentationMode | segmentation mode. Default value: [SegmentationMode.AUTO](../../com.effectssdk.tsvb.pipeline/-segmentation-mode/-a-u-t-o/index.md) |
| background | background image for [PipelineMode.REPLACE](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/-r-e-p-l-a-c-e/index.md). Default value: empty bitmap 1x1 px |
| blurPower | power of [PipelineMode.BLUR](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/-b-l-u-r/index.md). Default value: 0 |
| fpsListener | listener for frames per second number |
| callback | receives the ready pipeline, on the pipeline's frame thread |