//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setBlurPower](set-blur-power.md)

# setBlurPower

[androidJvm]\
abstract fun [setBlurPower](set-blur-power.md)(power: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))

Set blur power for pipeline. A higher value reduces performance. Works only with [PipelineMode.BLUR](../-pipeline-mode/-b-l-u-r/index.md) mode

#### Parameters

androidJvm

| | |
|---|---|
| power | -     blur power. Should be in 0..1. |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-illegal-argument-exception/index.html) | if [power](set-blur-power.md) is outside 0..1 |