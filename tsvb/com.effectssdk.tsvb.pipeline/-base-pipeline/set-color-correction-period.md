//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setColorCorrectionPeriod](set-color-correction-period.md)

# setColorCorrectionPeriod

[androidJvm]\
open fun [setColorCorrectionPeriod](set-color-correction-period.md)(periodMs: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))

Set time between two analyses of the frame by the color corrector.

Changes only the analysis period and leaves the rest of the color correction config alone.

#### Parameters

androidJvm

| | |
|---|---|
| periodMs | -     milliseconds between analyses. Values outside 0..5000 are clamped |