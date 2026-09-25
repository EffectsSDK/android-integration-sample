//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setZoomLevel](set-zoom-level.md)

# setZoomLevel

[androidJvm]\
open fun [setZoomLevel](set-zoom-level.md)(zoomLevel: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))

Set zoom level if need to crop frames around human face.

0 disables the zoom and the face detection that drives it, 100 crops in as far as the pipeline goes. Values outside that range are not rejected and produce a broken crop, so keep [zoomLevel](set-zoom-level.md) in 0..100.

#### Parameters

androidJvm

| | |
|---|---|
| zoomLevel | -     value in percentage, how much the face should occupy in the frame |

#### Throws

| | |
|---|---|
| [NotImplementedError](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-not-implemented-error/index.html) | on a lite pipeline, which has no smart zoom |