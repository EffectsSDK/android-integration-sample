//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[LowLightConfig](index.md)

# LowLightConfig

[androidJvm]\
data class [LowLightConfig](index.md)(val power: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.8f)

Configuration for the low light effect.

Works only if color correction is set to [ColorCorrectionMode.LOW_LIGHT_MODE](../-color-correction-mode/-l-o-w_-l-i-g-h-t_-m-o-d-e/index.md). See [BasePipeline.setColorCorrectionMode](../-base-pipeline/set-color-correction-mode.md).

Every field is applied on each call: the ones you do not pass take the default value declared here, not the value currently set on the pipeline. To change one field and keep the rest, hold on to your own instance and copy it.

## Constructors

| | |
|---|---|
| [LowLightConfig](-low-light-config.md) | [androidJvm]<br>constructor(power: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.8f) |

## Properties

| Name | Summary |
|---|---|
| [power](power.md) | [androidJvm]<br>val [power](power.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.8f |