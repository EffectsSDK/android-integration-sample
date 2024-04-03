//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setSegmentationGap](set-segmentation-gap.md)

# setSegmentationGap

[androidJvm]\
abstract fun [setSegmentationGap](set-segmentation-gap.md)(gapSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

Set frame gap for segmentation. Default [gapSize](set-segmentation-gap.md) is 0, if [gapSize](set-segmentation-gap.md) 0, pipeline will skip [gapSize](set-segmentation-gap.md) frames and use cached segmentation mask. [gapSize](set-segmentation-gap.md) 0 improves performance.

#### Parameters

androidJvm

| |
|---|
| gapSize |
