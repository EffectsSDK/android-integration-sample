//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setSharpeningStrength](set-sharpening-strength.md)

# setSharpeningStrength

[androidJvm]\
open fun [setSharpeningStrength](set-sharpening-strength.md)(strength: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))

Set sharpening strength.

Takes effect only while sharpening is enabled, see [enableSharpening](enable-sharpening.md). Defaults to 0.

#### Parameters

androidJvm

| | |
|---|---|
| strength | -     filter strength. Must be in 0.0 .. 1.0 |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-illegal-argument-exception/index.html) | if [strength](set-sharpening-strength.md) is outside 0.0 .. 1.0 |