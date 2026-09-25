//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[SDKFactory](index.md)/[createLiteImagePipeline](create-lite-image-pipeline.md)

# createLiteImagePipeline

[androidJvm]\
abstract fun [createLiteImagePipeline](create-lite-image-pipeline.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), mode: [PipelineMode](../../com.effectssdk.tsvb.pipeline/-pipeline-mode/index.md) = PipelineMode.NO_EFFECT, segmentationMode: [SegmentationMode](../../com.effectssdk.tsvb.pipeline/-segmentation-mode/index.md) = SegmentationMode.AUTO, background: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) = createBitmap(1, 1), blurPower: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, fpsListener: [FPSListener](../-f-p-s-listener/index.md)? = null): [ImagePipeline](../../com.effectssdk.tsvb.pipeline/-image-pipeline/index.md)

Create a lite [ImagePipeline](../../com.effectssdk.tsvb.pipeline/-image-pipeline/index.md) instance.

Same as [createImagePipeline](create-image-pipeline.md) without smart zoom, so [ImagePipeline.process](../../com.effectssdk.tsvb.pipeline/-image-pipeline/process.md) and every option but the zoom related ones work as usual. Color correction and beautification are not arguments here, they start off and are turned on later through [com.effectssdk.tsvb.pipeline.BasePipeline.setColorCorrectionMode](../../com.effectssdk.tsvb.pipeline/-base-pipeline/set-color-correction-mode.md) and [com.effectssdk.tsvb.pipeline.BasePipeline.enableBeautification](../../com.effectssdk.tsvb.pipeline/-base-pipeline/enable-beautification.md).

#### Return

[ImagePipeline](../../com.effectssdk.tsvb.pipeline/-image-pipeline/index.md) instance running the lite graph

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