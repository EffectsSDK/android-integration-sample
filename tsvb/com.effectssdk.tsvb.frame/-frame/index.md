//[tsvb](../../../index.md)/[com.effectssdk.tsvb.frame](../index.md)/[Frame](index.md)

# Frame

[androidJvm]\
interface [~~Frame~~](index.md)---

### Deprecated

Use ImagePipeline.process() with a Bitmap directly.

---

Wrapper around a frame handed to a pipeline.

Superseded by [com.effectssdk.tsvb.pipeline.ImagePipeline.process](../../com.effectssdk.tsvb.pipeline/-image-pipeline/process.md) taking a bitmap. No implementation of this interface is reachable through the public API any more, so it cannot be instantiated.

## Functions

| Name | Summary |
|---|---|
| [frameFormat](frame-format.md) | [androidJvm]<br>abstract fun [frameFormat](frame-format.md)(): [ImageFormat](../-image-format/index.md) |
| [height](height.md) | [androidJvm]<br>abstract fun [height](height.md)(): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |
| [width](width.md) | [androidJvm]<br>abstract fun [width](width.md)(): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |