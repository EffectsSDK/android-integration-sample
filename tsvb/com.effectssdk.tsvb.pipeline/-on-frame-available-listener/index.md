//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[OnFrameAvailableListener](index.md)

# OnFrameAvailableListener

[androidJvm]\
fun interface [OnFrameAvailableListener](index.md)

Listener for processing pipeline output

Attach it to [BasePipeline](../-base-pipeline/index.md) instance and process frames.

## Functions

| Name | Summary |
|---|---|
| [onNewFrame](on-new-frame.md) | [androidJvm]<br>abstract fun [onNewFrame](on-new-frame.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html), timestamp: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))<br>This method will be called for each pipeline frame |
