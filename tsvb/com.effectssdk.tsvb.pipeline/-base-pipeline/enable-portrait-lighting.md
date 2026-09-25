//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[enablePortraitLighting](enable-portrait-lighting.md)

# enablePortraitLighting

[androidJvm]\
open fun [enablePortraitLighting](enable-portrait-lighting.md)(enable: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html))

Enable\disable portrait lighting.

Brightens the person and dims the background around them, as if a light were aimed at the subject. Needs segmentation, so it works on top of any background mode, including [PipelineMode.NO_EFFECT](../-pipeline-mode/-n-o_-e-f-f-e-c-t/index.md).

#### Parameters

androidJvm

| | |
|---|---|
| enable | -     set true if portrait lighting is required. |