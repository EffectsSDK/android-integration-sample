//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[SegmentationMode](index.md)

# SegmentationMode

[androidJvm]\
enum [SegmentationMode](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)
&lt;[SegmentationMode](index.md)&gt;

Segmentation mode for [BasePipeline](../-base-pipeline/index.md)

[AUTO](-a-u-t-o/index.md) - select segmentation model by device orientation. [PORTRAIT](-p-o-r-t-r-a-i-t/index.md) - use portrait
segmentation model (input height width) [LANDSCAPE](-l-a-n-d-s-c-a-p-e/index.md) - use landscape segmentation model (input height < width)

## Entries

|                                          |                                                          |
|------------------------------------------|----------------------------------------------------------|
| [AUTO](-a-u-t-o/index.md)                | [androidJvm]<br>[AUTO](-a-u-t-o/index.md)                |
| [PORTRAIT](-p-o-r-t-r-a-i-t/index.md)    | [androidJvm]<br>[PORTRAIT](-p-o-r-t-r-a-i-t/index.md)    |
| [LANDSCAPE](-l-a-n-d-s-c-a-p-e/index.md) | [androidJvm]<br>[LANDSCAPE](-l-a-n-d-s-c-a-p-e/index.md) |

## Properties

| Name                                                                         | Summary                                                                                                                                                                                                                                                                               |
|------------------------------------------------------------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [entries](entries.md)                                                        | [androidJvm]<br>val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[SegmentationMode](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |
| [name](-l-a-n-d-s-c-a-p-e/index.md#-372974862%2FProperties%2F-1825426144)    | [androidJvm]<br>val [name](-l-a-n-d-s-c-a-p-e/index.md#-372974862%2FProperties%2F-1825426144): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)                                                                                                       |
| [ordinal](-l-a-n-d-s-c-a-p-e/index.md#-739389684%2FProperties%2F-1825426144) | [androidJvm]<br>val [ordinal](-l-a-n-d-s-c-a-p-e/index.md#-739389684%2FProperties%2F-1825426144): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)                                                                                                          |

## Functions

| Name                   | Summary                                                                                                                                                                                                                                                                                                                                                                               |
|------------------------|---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| [valueOf](value-of.md) | [androidJvm]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [SegmentationMode](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md)    | [androidJvm]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[SegmentationMode](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared.                                                                                                                          |
