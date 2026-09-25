//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setOrientationChangeListener](set-orientation-change-listener.md)

# setOrientationChangeListener

[androidJvm]\
open fun [setOrientationChangeListener](set-orientation-change-listener.md)(listener: [OrientationChangeListener](../-orientation-change-listener/index.md)?)

Attach orientationChangeListener to pipeline.

Set this listener if you need to process orientation changes. It only reports anything under [SegmentationMode.AUTO](../-segmentation-mode/-a-u-t-o/index.md), see [OrientationChangeListener](../-orientation-change-listener/index.md).

#### Parameters

androidJvm

| | |
|---|---|
| listener | -     [OrientationChangeListener](../-orientation-change-listener/index.md) instance. |

#### Throws

| | |
|---|---|
| [NotImplementedError](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-not-implemented-error/index.html) | on an image pipeline, which takes its frames from the caller rather than from the device camera |