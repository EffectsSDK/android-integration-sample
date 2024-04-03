//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setFaceDetectionGap](set-face-detection-gap.md)

# setFaceDetectionGap

[androidJvm]\
abstract fun [setFaceDetectionGap](set-face-detection-gap.md)(gapSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

Set frame gap for face detection. Default [gapSize](set-face-detection-gap.md) is 0, if [gapSize](set-face-detection-gap.md) 0, pipeline will skip [gapSize](set-face-detection-gap.md) frames and use cached face position. [gapSize](set-face-detection-gap.md) 0 improves performance.

#### Parameters

androidJvm

| |
|---|
| gapSize |
