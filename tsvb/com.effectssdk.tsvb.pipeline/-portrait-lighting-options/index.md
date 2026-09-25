//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[PortraitLightingOptions](index.md)

# PortraitLightingOptions

[androidJvm]\
data class [PortraitLightingOptions](index.md)(val lightStrength: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.6f, val backgroundDarkness: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.4f)

Configuration for portrait lighting.

Works only if portrait lighting is enabled. See [BasePipeline.enablePortraitLighting](../-base-pipeline/enable-portrait-lighting.md).

Every field is applied on each call: the ones you do not pass take the default value declared here, not the value currently set on the pipeline. To change one field and keep the rest, hold on to your own instance and copy it.

## Constructors

| | |
|---|---|
| [PortraitLightingOptions](-portrait-lighting-options.md) | [androidJvm]<br>constructor(lightStrength: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.6f, backgroundDarkness: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.4f) |

## Properties

| Name | Summary |
|---|---|
| [backgroundDarkness](background-darkness.md) | [androidJvm]<br>val [backgroundDarkness](background-darkness.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.4f |
| [lightStrength](light-strength.md) | [androidJvm]<br>val [lightStrength](light-strength.md): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html) = 0.6f |