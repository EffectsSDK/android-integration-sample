//[tsvb](../../../index.md)/[com.effectssdk.tsvb.frame.factory](../index.md)/[FrameFactory](index.md)

# FrameFactory

[androidJvm]\
interface [~~FrameFactory~~](index.md)---

### Deprecated

Use ImagePipeline.process() directly.

---

Frame factory interface.

Superseded by [com.effectssdk.tsvb.pipeline.ImagePipeline.process](../../com.effectssdk.tsvb.pipeline/-image-pipeline/process.md) taking a bitmap. No implementation is reachable through the public API any more, so an instance of this interface cannot be obtained.

## Functions

| Name | Summary |
|---|---|
| [createARGB](create-a-r-g-b.md) | [androidJvm]<br>abstract fun [~~createARGB~~](create-a-r-g-b.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html)): [Frame](../../com.effectssdk.tsvb.frame/-frame/index.md)<br>Convert ARGB_8888 bitmap to frame |
| [createYUV420](create-y-u-v420.md) | [androidJvm]<br>abstract fun [~~createYUV420~~](create-y-u-v420.md)(image: [Image](https://developer.android.com/reference/kotlin/android/media/Image.html)): [Frame](../../com.effectssdk.tsvb.frame/-frame/index.md)<br>Convert YUV image to frame |