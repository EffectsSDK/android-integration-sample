//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setFaceDetectionGap](set-face-detection-gap.md)

# setFaceDetectionGap

[androidJvm]\
open fun [setFaceDetectionGap](set-face-detection-gap.md)(gapSize: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))

Set frame gap for face detection. Default [gapSize](set-face-detection-gap.md) is 0, if [gapSize](set-face-detection-gap.md) 0, pipeline will skip [gapSize](set-face-detection-gap.md) frames and use cached face position. [gapSize](set-face-detection-gap.md) 0 improves performance.

Face detection only feeds smart zoom, so this changes nothing while the zoom level is 0.

#### Parameters

androidJvm

| | |
|---|---|
| gapSize | -     number of frames to skip between two face detections |

#### Throws

| | |
|---|---|
| [NotImplementedError](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-not-implemented-error/index.html) | on a lite pipeline, which runs no face detection model |