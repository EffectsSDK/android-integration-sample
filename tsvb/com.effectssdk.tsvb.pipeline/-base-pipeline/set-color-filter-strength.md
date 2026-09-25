//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setColorFilterStrength](set-color-filter-strength.md)

# setColorFilterStrength

[androidJvm]\
open fun [setColorFilterStrength](set-color-filter-strength.md)(strength: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))

Set color filter strength.

Blends the color correction result over the original frame, so 0 disables whichever [ColorCorrectionMode](../-color-correction-mode/index.md) is set. Defaults to 0.

Works only if color correction options enabled. See [setColorCorrectionMode](set-color-correction-mode.md).

#### Parameters

androidJvm

| | |
|---|---|
| strength | -     filter strength. Must be in 0..1 |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-illegal-argument-exception/index.html) | if [strength](set-color-filter-strength.md) is outside 0..1 |