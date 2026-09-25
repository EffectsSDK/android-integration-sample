//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setColorCorrectionConfig](set-color-correction-config.md)

# setColorCorrectionConfig

[androidJvm]\
open fun [setColorCorrectionConfig](set-color-correction-config.md)(config: [ColorCorrectionConfig](../-color-correction-config/index.md))

Set color correction config.

Options see in [ColorCorrectionConfig](../-color-correction-config/index.md). Every field of [config](set-color-correction-config.md) is applied, so the fields you leave out fall back to their defaults instead of keeping their current values.

Works only if color correction is set to [ColorCorrectionMode.COLOR_CORRECTION_MODE](../-color-correction-mode/-c-o-l-o-r_-c-o-r-r-e-c-t-i-o-n_-m-o-d-e/index.md). See [setColorCorrectionMode](set-color-correction-mode.md).

#### Parameters

androidJvm

| | |
|---|---|
| config | -     color correction config |