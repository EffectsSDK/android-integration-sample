//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[enableNoiseSuppression](enable-noise-suppression.md)

# enableNoiseSuppression

[androidJvm]\
open fun [enableNoiseSuppression](enable-noise-suppression.md)(enable: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html))

Enable\disable noise suppression.

Freezes sensor noise by blending every frame with the previous result, weaker where the scene moves.

Independent of [setColorCorrectionMode](set-color-correction-mode.md): it runs before the colors are touched, so the noise is gone before low light or color correction amplifies it.

#### Parameters

androidJvm

| | |
|---|---|
| enable | -     set true if noise suppression is required. |