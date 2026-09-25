//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[updateLowLightLut](update-low-light-lut.md)

# updateLowLightLut

[androidJvm]\
open fun [~~updateLowLightLut~~](update-low-light-lut.md)()

---

### Deprecated

The low light lut is re-analysed automatically while LOW_LIGHT_MODE is set. 

---

Force low light lut update.

The lut follows the scene brightness on its own: while [ColorCorrectionMode.LOW_LIGHT_MODE](../-color-correction-mode/-l-o-w_-l-i-g-h-t_-m-o-d-e/index.md) is set, the frame is re-analysed every 500 ms and the exposure eases towards the new value over roughly a second. This method only asks for that analysis to happen right away instead of at the next period, which the pipeline no longer needs to be told to do.

It does not make the change instant either: only the analysis is immediate, the exposure still eases in.

Works only if color correction is set to [ColorCorrectionMode.LOW_LIGHT_MODE](../-color-correction-mode/-l-o-w_-l-i-g-h-t_-m-o-d-e/index.md). See [setColorCorrectionMode](set-color-correction-mode.md).