//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setColorGradingReferenceImage](set-color-grading-reference-image.md)

# setColorGradingReferenceImage

[androidJvm]\
open fun [setColorGradingReferenceImage](set-color-grading-reference-image.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html))

Set color grading reference image.

This image colors will be used for color filter generation. Works only if color correction set as COLOR_GRADING_MODE. See [setColorCorrectionMode](set-color-correction-mode.md) for details.

The bitmap should be [android.graphics.Bitmap.Config.ARGB_8888](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.Config.html#ARGB_8888), any other config is used anyway but logged as a warning. It is rescaled to 700x700 and only its colors matter, so its size and aspect ratio are irrelevant. Setting the same image twice is a no-op, the lut is not rebuilt.

#### Parameters

androidJvm

| | |
|---|---|
| bitmap | -     new color reference image |