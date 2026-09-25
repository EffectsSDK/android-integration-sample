//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[OnFrameAvailableListener](index.md)/[onNewFrame](on-new-frame.md)

# onNewFrame

[androidJvm]\
abstract fun [onNewFrame](on-new-frame.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html), timestamp: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html))

This method will be called for each frame the pipeline produces, on the thread the pipeline processes frames on. Frames that come out of the graph with a zero width or height are dropped and not reported.

#### Parameters

androidJvm

| | |
|---|---|
| bitmap | -     output image |
| timestamp | -     timestamp the frame was processed with, in microseconds. For an [ImagePipeline](../-image-pipeline/index.md) this is the value handed to [ImagePipeline.process](../-image-pipeline/process.md), or a counter incremented per frame when the overload without a timestamp was used. |