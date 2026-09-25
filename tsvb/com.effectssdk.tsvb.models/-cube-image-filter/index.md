//[tsvb](../../../index.md)/[com.effectssdk.tsvb.models](../index.md)/[CubeImageFilter](index.md)

# CubeImageFilter

[androidJvm]\
data class [CubeImageFilter](index.md)(val filterSize: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) = 0, val filterData: [IntArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int-array/index.html) = IntArray(0))

CUBE filter object. Used for [com.effectssdk.tsvb.pipeline.ColorCorrectionMode.PRESET_MODE](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/-p-r-e-s-e-t_-m-o-d-e/index.md)

Build one with [com.effectssdk.tsvb.LutProvider](../../com.effectssdk.tsvb/-lut-provider/index.md) rather than by hand. The default instance is empty and leaves the frame unchanged.

## Constructors

| | |
|---|---|
| [CubeImageFilter](-cube-image-filter.md) | [androidJvm]<br>constructor(filterSize: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) = 0, filterData: [IntArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int-array/index.html) = IntArray(0)) |

## Properties

| Name | Summary |
|---|---|
| [filterData](filter-data.md) | [androidJvm]<br>val [filterData](filter-data.md): [IntArray](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int-array/index.html)<br>color values, [filterSize](filter-size.md)^3 RGB triplets in the order a `.cube` file lists them (red varies fastest), each in 0..255. The array must hold exactly `filterSize * filterSize * filterSize * 3` entries: the pipeline reads that many without checking. |
| [filterSize](filter-size.md) | [androidJvm]<br>val [filterSize](filter-size.md): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) = 0<br>edge of the cube, the `LUT_3D_SIZE` of a `.cube` file (33 for example), not the length of [filterData](filter-data.md). 0 means no filter. |

## Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | [androidJvm]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | [androidJvm]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |