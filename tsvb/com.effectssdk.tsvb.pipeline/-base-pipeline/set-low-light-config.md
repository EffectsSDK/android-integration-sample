//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setLowLightConfig](set-low-light-config.md)

# setLowLightConfig

[androidJvm]\
open fun [setLowLightConfig](set-low-light-config.md)(config: [LowLightConfig](../-low-light-config/index.md))

Set low light effect config.

Options see in [LowLightConfig](../-low-light-config/index.md). Every field of [config](set-low-light-config.md) is applied, so the fields you leave out fall back to their defaults instead of keeping their current values.

Works only if color correction is set to [ColorCorrectionMode.LOW_LIGHT_MODE](../-color-correction-mode/-l-o-w_-l-i-g-h-t_-m-o-d-e/index.md). See [setColorCorrectionMode](set-color-correction-mode.md).

#### Parameters

androidJvm

| | |
|---|---|
| config | -     low light config |