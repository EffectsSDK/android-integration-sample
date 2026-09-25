//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setBeautificationPower](set-beautification-power.md)

# setBeautificationPower

[androidJvm]\
open fun [setBeautificationPower](set-beautification-power.md)(power: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))

Set power for beautification filter. The strength of the effect: 0 leaves the frame untouched, 1 is the maximum smoothing.

Takes effect only while beautification is enabled, see [enableBeautification](enable-beautification.md).

#### Parameters

androidJvm

| | |
|---|---|
| power | -     filter power. Values outside 0..1 are clamped |