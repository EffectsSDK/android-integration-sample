//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[ColorCorrectionMode](index.md)

# ColorCorrectionMode

[androidJvm]\
enum [ColorCorrectionMode](index.md) : [Enum](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-enum/index.html)&lt;[ColorCorrectionMode](index.md)&gt; 

Available options for color correction.

[NO_FILTER_MODE](-n-o_-f-i-l-t-e-r_-m-o-d-e/index.md) - disable color correction. [COLOR_CORRECTION_MODE](-c-o-l-o-r_-c-o-r-r-e-c-t-i-o-n_-m-o-d-e/index.md) - improve colors automatically: white balance, exposure and local contrast. Tuned with [BasePipeline.setColorCorrectionConfig](../-base-pipeline/set-color-correction-config.md). [COLOR_GRADING_MODE](-c-o-l-o-r_-g-r-a-d-i-n-g_-m-o-d-e/index.md) - change colors by reference image. See [BasePipeline.setColorGradingReferenceImage](../-base-pipeline/set-color-grading-reference-image.md). [PRESET_MODE](-p-r-e-s-e-t_-m-o-d-e/index.md) - change colors according to your own filter. See [BasePipeline.setImageFilter](../-base-pipeline/set-image-filter.md) and [com.effectssdk.tsvb.LutProvider](../../com.effectssdk.tsvb/-lut-provider/index.md). [LOW_LIGHT_MODE](-l-o-w_-l-i-g-h-t_-m-o-d-e/index.md) - make the image lighter in low light. Tuned with [BasePipeline.setLowLightConfig](../-base-pipeline/set-low-light-config.md).

Only one mode is active at a time. Every mode but [NO_FILTER_MODE](-n-o_-f-i-l-t-e-r_-m-o-d-e/index.md) works by building a lut that [BasePipeline.setColorFilterStrength](../-base-pipeline/set-color-filter-strength.md) blends over the original frame, and that strength defaults to 0, so setting a mode alone changes nothing until the strength is raised. The local contrast pass of [COLOR_CORRECTION_MODE](-c-o-l-o-r_-c-o-r-r-e-c-t-i-o-n_-m-o-d-e/index.md) is the one part that sits outside the lut and follows [ColorCorrectionConfig.contrast](../-color-correction-config/contrast.md) and [ColorCorrectionConfig.power](../-color-correction-config/power.md) instead.

## Entries

| | |
|---|---|
| [NO_FILTER_MODE](-n-o_-f-i-l-t-e-r_-m-o-d-e/index.md) | [androidJvm]<br>[NO_FILTER_MODE](-n-o_-f-i-l-t-e-r_-m-o-d-e/index.md) |
| [COLOR_CORRECTION_MODE](-c-o-l-o-r_-c-o-r-r-e-c-t-i-o-n_-m-o-d-e/index.md) | [androidJvm]<br>[COLOR_CORRECTION_MODE](-c-o-l-o-r_-c-o-r-r-e-c-t-i-o-n_-m-o-d-e/index.md) |
| [COLOR_GRADING_MODE](-c-o-l-o-r_-g-r-a-d-i-n-g_-m-o-d-e/index.md) | [androidJvm]<br>[COLOR_GRADING_MODE](-c-o-l-o-r_-g-r-a-d-i-n-g_-m-o-d-e/index.md) |
| [PRESET_MODE](-p-r-e-s-e-t_-m-o-d-e/index.md) | [androidJvm]<br>[PRESET_MODE](-p-r-e-s-e-t_-m-o-d-e/index.md) |
| [LOW_LIGHT_MODE](-l-o-w_-l-i-g-h-t_-m-o-d-e/index.md) | [androidJvm]<br>[LOW_LIGHT_MODE](-l-o-w_-l-i-g-h-t_-m-o-d-e/index.md) |

## Properties

| Name | Summary |
|---|---|
| [code](code.md) | [androidJvm]<br>val [code](code.md): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |
| [entries](entries.md) | [androidJvm]<br>val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin.enums/-enum-entries/index.html)&lt;[ColorCorrectionMode](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |
| [name](../-segmentation-mode/-l-a-n-d-s-c-a-p-e/index.md#-372974862%2FProperties%2F-1825426144) | [androidJvm]<br>val [name](../-segmentation-mode/-l-a-n-d-s-c-a-p-e/index.md#-372974862%2FProperties%2F-1825426144): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html) |
| [ordinal](../-segmentation-mode/-l-a-n-d-s-c-a-p-e/index.md#-739389684%2FProperties%2F-1825426144) | [androidJvm]<br>val [ordinal](../-segmentation-mode/-l-a-n-d-s-c-a-p-e/index.md#-739389684%2FProperties%2F-1825426144): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html) |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | [androidJvm]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [ColorCorrectionMode](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [androidJvm]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-array/index.html)&lt;[ColorCorrectionMode](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |