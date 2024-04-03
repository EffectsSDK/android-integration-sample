//[tsvb](../../../index.md)/[com.effectssdk.tsvb.models](../index.md)/[CubeImageFilter](index.md)

# CubeImageFilter

[androidJvm]\
data class [CubeImageFilter](index.md)(val filterSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, val filterData: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html) = IntArray(0))

CUBE filter object. Used for [com.effectssdk.tsvb.pipeline.ColorCorrectionMode.PRESET_MODE](../../com.effectssdk.tsvb.pipeline/-color-correction-mode/-p-r-e-s-e-t_-m-o-d-e/index.md)

## Constructors

| | |
|---|---|
| [CubeImageFilter](-cube-image-filter.md) | [androidJvm]<br>constructor(filterSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0, filterData: [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html) = IntArray(0)) |

## Properties

| Name | Summary |
|---|---|
| [filterData](filter-data.md) | [androidJvm]<br>val [filterData](filter-data.md): [IntArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int-array/index.html)<br>array of color values |
| [filterSize](filter-size.md) | [androidJvm]<br>val [filterSize](filter-size.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = 0<br>size (w*h*d*c) |

## Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | [androidJvm]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [hashCode](hash-code.md) | [androidJvm]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
