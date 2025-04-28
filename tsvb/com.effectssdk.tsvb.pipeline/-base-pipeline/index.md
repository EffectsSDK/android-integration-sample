//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)

# BasePipeline

interface [BasePipeline](index.md)

Base pipeline interface

#### Inheritors

| |
|---|
| [CameraPipeline](../-camera-pipeline/index.md) |
| [ImagePipeline](../-image-pipeline/index.md) |

## Functions

| Name | Summary |
|---|---|
| [enableBeautification](enable-beautification.md) | [androidJvm]<br>open fun [enableBeautification](enable-beautification.md)(enable: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html))<br>Enable\disable beautification mode. |
| [enableSharpening](enable-sharpening.md) | [androidJvm]<br>open fun [enableSharpening](enable-sharpening.md)(sharpnessEnabled: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html))<br>Enable sharpening option |
| [getBlurPower](get-blur-power.md) | [androidJvm]<br>abstract fun [getBlurPower](get-blur-power.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html)<br>Return current blur power. |
| [getColorCorrectionMode](get-color-correction-mode.md) | [androidJvm]<br>open fun [getColorCorrectionMode](get-color-correction-mode.md)(): [ColorCorrectionMode](../-color-correction-mode/index.md)<br>Return current color correction mode. |
| [getColorFilterStrength](get-color-filter-strength.md) | [androidJvm]<br>open fun [getColorFilterStrength](get-color-filter-strength.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html)<br>Return current color correction filter strength |
| [getFaceDetectionGap](get-face-detection-gap.md) | [androidJvm]<br>open fun [getFaceDetectionGap](get-face-detection-gap.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>Return current face detection gap. |
| [getForegroundSize](get-foreground-size.md) | [androidJvm]<br>abstract fun [getForegroundSize](get-foreground-size.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html)<br>Return current segmentation padding size. |
| [getImageFilter](get-image-filter.md) | [androidJvm]<br>open fun [getImageFilter](get-image-filter.md)(): [CubeImageFilter](../../com.effectssdk.tsvb.models/-cube-image-filter/index.md)<br>Return current cube filter |
| [getMode](get-mode.md) | [androidJvm]<br>abstract fun [getMode](get-mode.md)(): [PipelineMode](../-pipeline-mode/index.md)<br>Return current pipeline mode. |
| [getSegmentationGap](get-segmentation-gap.md) | [androidJvm]<br>open fun [getSegmentationGap](get-segmentation-gap.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>Return current segmentation gap. |
| [getSegmentationMode](get-segmentation-mode.md) | [androidJvm]<br>abstract fun [getSegmentationMode](get-segmentation-mode.md)(): [SegmentationMode](../-segmentation-mode/index.md)<br>Return current segmentation mode |
| [getSharpeningStrength](get-sharpening-strength.md) | [androidJvm]<br>open fun [getSharpeningStrength](get-sharpening-strength.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html)<br>Return current sharpening strength. |
| [getZoomLevel](get-zoom-level.md) | [androidJvm]<br>open fun [getZoomLevel](get-zoom-level.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html)<br>Return current zoom level. |
| [isBeautificationEnabled](is-beautification-enabled.md) | [androidJvm]<br>open fun [isBeautificationEnabled](is-beautification-enabled.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html)<br>Return beautification option status. |
| [isFlippedX](is-flipped-x.md) | [androidJvm]<br>open fun [isFlippedX](is-flipped-x.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html)<br>Return true if pipeline flip image by x axis. |
| [release](release.md) | [androidJvm]<br>abstract fun [release](release.md)()<br>Release pipeline. |
| [setBackground](set-background.md) | [androidJvm]<br>abstract fun [setBackground](set-background.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html))<br>Set background image for background replace option. |
| [setBeautificationPower](set-beautification-power.md) | [androidJvm]<br>open fun [setBeautificationPower](set-beautification-power.md)(power: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html))<br>Set power for beautification filter. A higher value reduces performance. |
| [setBlurPower](set-blur-power.md) | [androidJvm]<br>abstract fun [setBlurPower](set-blur-power.md)(power: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html))<br>Set blur power for pipeline. A higher value reduces performance. Works only with [PipelineMode.BLUR](../-pipeline-mode/-b-l-u-r/index.md) mode |
| [setColorCorrectionMode](set-color-correction-mode.md) | [androidJvm]<br>open fun [setColorCorrectionMode](set-color-correction-mode.md)(mode: [ColorCorrectionMode](../-color-correction-mode/index.md))<br>Set color correction mode. |
| [setColorFilterStrength](set-color-filter-strength.md) | [androidJvm]<br>open fun [setColorFilterStrength](set-color-filter-strength.md)(strength: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html))<br>Set color filter strength. |
| [setColorGradingReferenceImage](set-color-grading-reference-image.md) | [androidJvm]<br>open fun [setColorGradingReferenceImage](set-color-grading-reference-image.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html))<br>Set color grading reference image. |
| [setFaceDetectionGap](set-face-detection-gap.md) | [androidJvm]<br>open fun [setFaceDetectionGap](set-face-detection-gap.md)(gapSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html))<br>Set frame gap for face detection. Default [gapSize](set-face-detection-gap.md) is 0, if [gapSize](set-face-detection-gap.md) 0, pipeline will skip [gapSize](set-face-detection-gap.md) frames and use cached face position. [gapSize](set-face-detection-gap.md) 0 improves performance. |
| [setFlipX](set-flip-x.md) | [androidJvm]<br>open fun [setFlipX](set-flip-x.md)(horizontalFlip: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-boolean/index.html))<br>Set [horizontalFlip](set-flip-x.md) as true if you need flip image by x axis. |
| [setForegroundSize](set-foreground-size.md) | [androidJvm]<br>abstract fun [setForegroundSize](set-foreground-size.md)(size: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html))<br>This parameter used to add|remove padding for segmentation model. Default value is -1. Positive values add &quot;aura&quot; around human, negative values remove it. |
| [setImageFilter](set-image-filter.md) | [androidJvm]<br>open fun [setImageFilter](set-image-filter.md)(filter: [CubeImageFilter](../../com.effectssdk.tsvb.models/-cube-image-filter/index.md))<br>Set custom cube image filter. |
| [setMode](set-mode.md) | [androidJvm]<br>abstract fun [setMode](set-mode.md)(mode: [PipelineMode](../-pipeline-mode/index.md))<br>Set background mode for pipeline. |
| [setOnFrameAvailableListener](set-on-frame-available-listener.md) | [androidJvm]<br>abstract fun [setOnFrameAvailableListener](set-on-frame-available-listener.md)(listener: [OnFrameAvailableListener](../-on-frame-available-listener/index.md)?)<br>Attach onFrameAvailableListener to pipeline. |
| [setOrientationChangeListener](set-orientation-change-listener.md) | [androidJvm]<br>open fun [setOrientationChangeListener](set-orientation-change-listener.md)(listener: [OrientationChangeListener](../-orientation-change-listener/index.md)?)<br>Attach orientationChangeListener to pipeline. |
| [setOutputSurface](set-output-surface.md) | [androidJvm]<br>abstract fun [setOutputSurface](set-output-surface.md)(surface: [Surface](https://developer.android.com/reference/kotlin/android/view/Surface.html)?)<br>Set surface for frame rendering. Pass null to remove surface. |
| [setSegmentationGap](set-segmentation-gap.md) | [androidJvm]<br>open fun [setSegmentationGap](set-segmentation-gap.md)(gapSize: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html))<br>Set frame gap for segmentation. Default [gapSize](set-segmentation-gap.md) is 0, if [gapSize](set-segmentation-gap.md) 0, pipeline will skip [gapSize](set-segmentation-gap.md) frames and use cached segmentation mask. [gapSize](set-segmentation-gap.md) 0 improves performance. |
| [setSegmentationMode](set-segmentation-mode.md) | [androidJvm]<br>abstract fun [setSegmentationMode](set-segmentation-mode.md)(mode: [SegmentationMode](../-segmentation-mode/index.md))<br>Set segmentation mode. |
| [setSharpeningStrength](set-sharpening-strength.md) | [androidJvm]<br>open fun [setSharpeningStrength](set-sharpening-strength.md)(strength: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-float/index.html))<br>Set sharpening strength. |
| [setZoomLevel](set-zoom-level.md) | [androidJvm]<br>open fun [setZoomLevel](set-zoom-level.md)(zoomLevel: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-int/index.html))<br>Set zoom level if need to crop frames around human face. [zoomLevel](set-zoom-level.md) - value in percentage, how much the face should occupy in the frame. |
| [updateLowLightLut](update-low-light-lut.md) | [androidJvm]<br>open fun [updateLowLightLut](update-low-light-lut.md)()<br>Force low light lut update. |
