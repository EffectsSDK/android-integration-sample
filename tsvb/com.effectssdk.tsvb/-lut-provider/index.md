//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[LutProvider](index.md)

# LutProvider

class [LutProvider](index.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html))

Loads Adobe Cube (`.cube`) 3D LUT files from the application assets.

The result is a [CubeImageFilter](../../com.effectssdk.tsvb.models/-cube-image-filter/index.md) ready for [com.effectssdk.tsvb.pipeline.BasePipeline.setImageFilter](../../com.effectssdk.tsvb.pipeline/-base-pipeline/set-image-filter.md), which takes effect while color correction is set to [com.effectssdk.tsvb.pipeline.ColorCorrectionMode.PRESET_MODE](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/-p-r-e-s-e-t_-m-o-d-e/index.md).

```kotlin
val filter = LutProvider(context).loadCubeLut("luts/warm.cube")
pipeline.setColorCorrectionMode(ColorCorrectionMode.PRESET_MODE)
pipeline.setImageFilter(filter)
```

#### Parameters

androidJvm

| | |
|---|---|
| context | any context, only the asset manager is used and no reference to the context is kept beyond this object. |

## Constructors

| | |
|---|---|
| [LutProvider](-lut-provider.md) | [androidJvm]<br>constructor(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html)) |

## Functions

| Name | Summary |
|---|---|
| [loadCubeLut](load-cube-lut.md) | [androidJvm]<br>fun [loadCubeLut](load-cube-lut.md)(assetPath: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [CubeImageFilter](../../com.effectssdk.tsvb.models/-cube-image-filter/index.md)<br>Load a 3D LUT from the assets. |