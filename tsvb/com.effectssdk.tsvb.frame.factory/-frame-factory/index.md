//[tsvb](../../../index.md)/[com.effectssdk.tsvb.frame.factory](../index.md)/[FrameFactory](index.md)

# FrameFactory

[androidJvm]\
interface [~~FrameFactory~~](index.md)---

### Deprecated

Use ImagePipeline.process() directly.

---

Frame factory interface

## Functions

| Name                               | Summary                                                                                                                                                                                                                                                        |
|------------------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [createARGB](create-a-r-g-b.md)    | [androidJvm]<br>abstract fun [~~createARGB~~](create-a-r-g-b.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html)): [Frame](../../com.effectssdk.tsvb.frame/-frame/index.md)<br>Convert ARGB_8888 bitmap to frame |
| [createYUV420](create-y-u-v420.md) | [androidJvm]<br>abstract fun [~~createYUV420~~](create-y-u-v420.md)(image: [Image](https://developer.android.com/reference/kotlin/android/media/Image.html)): [Frame](../../com.effectssdk.tsvb.frame/-frame/index.md)<br>Convert YUV image to frame           |
