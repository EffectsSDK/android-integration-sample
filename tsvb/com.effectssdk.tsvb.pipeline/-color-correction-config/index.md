//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[ColorCorrectionConfig](index.md)

# ColorCorrectionConfig

[androidJvm]\
data class [ColorCorrectionConfig](index.md)(val autoMode: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) = true, val power: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 1.0f, val whiteBalance: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, val exposure: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, val temperature: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, val tint: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, val vibrance: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, val contrast: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, val updatePeriodMs: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 200.0f)

Configuration for the color correction effect.

Works only if color correction is set to [ColorCorrectionMode.COLOR_CORRECTION_MODE](../-color-correction-mode/-c-o-l-o-r_-c-o-r-r-e-c-t-i-o-n_-m-o-d-e/index.md). See [BasePipeline.setColorCorrectionMode](../-base-pipeline/set-color-correction-mode.md).

Every field is applied on each call: the ones you do not pass take the default value declared here, not the value currently set on the pipeline. To change one field and keep the rest, hold on to your own instance and copy it.

## Constructors

| | |
|---|---|
| [ColorCorrectionConfig](-color-correction-config.md) | [androidJvm]<br>constructor(autoMode: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) = true, power: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 1.0f, whiteBalance: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, exposure: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, temperature: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, tint: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, vibrance: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, contrast: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f, updatePeriodMs: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 200.0f) |

## Properties

| Name | Summary |
|---|---|
| [autoMode](auto-mode.md) | [androidJvm]<br>val [autoMode](auto-mode.md): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html) = true |
| [contrast](contrast.md) | [androidJvm]<br>val [contrast](contrast.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f |
| [exposure](exposure.md) | [androidJvm]<br>val [exposure](exposure.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f |
| [power](power.md) | [androidJvm]<br>val [power](power.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 1.0f |
| [temperature](temperature.md) | [androidJvm]<br>val [temperature](temperature.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f |
| [tint](tint.md) | [androidJvm]<br>val [tint](tint.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f |
| [updatePeriodMs](update-period-ms.md) | [androidJvm]<br>val [updatePeriodMs](update-period-ms.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 200.0f |
| [vibrance](vibrance.md) | [androidJvm]<br>val [vibrance](vibrance.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f |
| [whiteBalance](white-balance.md) | [androidJvm]<br>val [whiteBalance](white-balance.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.0f |