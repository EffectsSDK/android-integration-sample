//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)

# BasePipeline

interface [BasePipeline](index.md)

Base pipeline interface.

Not every option exists in every pipeline. A method covering an option the pipeline does not have throws [NotImplementedError](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-not-implemented-error/index.html) instead of failing silently, and its own docs say which pipelines that is. Concretely: the zoom and face detection methods are absent from the lite pipelines, and [setOrientationChangeListener](set-orientation-change-listener.md) is absent from the image pipelines. Everything else works everywhere.

Values out of range are handled two ways, again stated per method: the older setters reject them with [IllegalArgumentException](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-illegal-argument-exception/index.html), while the ones taking a config object clamp them.

#### Inheritors

| |
|---|
| [CameraPipeline](../-camera-pipeline/index.md) |
| [ImagePipeline](../-image-pipeline/index.md) |

## Functions

| Name | Summary |
|---|---|
| [enableBeautification](enable-beautification.md) | [androidJvm]<br>open fun [enableBeautification](enable-beautification.md)(enable: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html))<br>Enable\disable beautification mode. |
| [enableNoiseSuppression](enable-noise-suppression.md) | [androidJvm]<br>open fun [enableNoiseSuppression](enable-noise-suppression.md)(enable: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html))<br>Enable\disable noise suppression. |
| [enablePortraitLighting](enable-portrait-lighting.md) | [androidJvm]<br>open fun [enablePortraitLighting](enable-portrait-lighting.md)(enable: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html))<br>Enable\disable portrait lighting. |
| [enableSharpening](enable-sharpening.md) | [androidJvm]<br>open fun [enableSharpening](enable-sharpening.md)(sharpnessEnabled: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html))<br>Enable\disable sharpening option. |
| [getBlurPower](get-blur-power.md) | [androidJvm]<br>abstract fun [getBlurPower](get-blur-power.md)(): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html)<br>Return current blur power. |
| [getColorCorrectionMode](get-color-correction-mode.md) | [androidJvm]<br>open fun [getColorCorrectionMode](get-color-correction-mode.md)(): [ColorCorrectionMode](../-color-correction-mode/index.md)<br>Return current color correction mode. |
| [getColorFilterStrength](get-color-filter-strength.md) | [androidJvm]<br>open fun [getColorFilterStrength](get-color-filter-strength.md)(): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html)<br>Return current color correction filter strength |
| [getFaceDetectionGap](get-face-detection-gap.md) | [androidJvm]<br>open fun [getFaceDetectionGap](get-face-detection-gap.md)(): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)<br>Return current face detection gap. |
| [getImageFilter](get-image-filter.md) | [androidJvm]<br>open fun [getImageFilter](get-image-filter.md)(): [CubeImageFilter](../../com.effectssdk.tsvb.models/-cube-image-filter/index.md)<br>Return current cube filter |
| [getMode](get-mode.md) | [androidJvm]<br>abstract fun [getMode](get-mode.md)(): [PipelineMode](../-pipeline-mode/index.md)<br>Return current pipeline mode. |
| [getSegmentationGap](get-segmentation-gap.md) | [androidJvm]<br>open fun [getSegmentationGap](get-segmentation-gap.md)(): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)<br>Return current segmentation gap. |
| [getSegmentationMode](get-segmentation-mode.md) | [androidJvm]<br>abstract fun [getSegmentationMode](get-segmentation-mode.md)(): [SegmentationMode](../-segmentation-mode/index.md)<br>Return current segmentation mode |
| [getSharpeningStrength](get-sharpening-strength.md) | [androidJvm]<br>open fun [getSharpeningStrength](get-sharpening-strength.md)(): [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html)<br>Return current sharpening strength. |
| [getZoomLevel](get-zoom-level.md) | [androidJvm]<br>open fun [getZoomLevel](get-zoom-level.md)(): [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html)<br>Return current zoom level. |
| [isBeautificationEnabled](is-beautification-enabled.md) | [androidJvm]<br>open fun [isBeautificationEnabled](is-beautification-enabled.md)(): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)<br>Return beautification option status. |
| [isFlippedX](is-flipped-x.md) | [androidJvm]<br>open fun [isFlippedX](is-flipped-x.md)(): [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html)<br>Return true if pipeline flip image by x axis. |
| [release](release.md) | [androidJvm]<br>abstract fun [release](release.md)()<br>Release pipeline. |
| [setBackground](set-background.md) | [androidJvm]<br>abstract fun [setBackground](set-background.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html))<br>Set background image for background replace option. |
| [setBeautificationPower](set-beautification-power.md) | [androidJvm]<br>open fun [setBeautificationPower](set-beautification-power.md)(power: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))<br>Set power for beautification filter. The strength of the effect: 0 leaves the frame untouched, 1 is the maximum smoothing. |
| [setBlurPower](set-blur-power.md) | [androidJvm]<br>abstract fun [setBlurPower](set-blur-power.md)(power: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))<br>Set blur power for pipeline. A higher value reduces performance. Works only with [PipelineMode.BLUR](../-pipeline-mode/-b-l-u-r/index.md) mode |
| [setColorCorrectionConfig](set-color-correction-config.md) | [androidJvm]<br>open fun [setColorCorrectionConfig](set-color-correction-config.md)(config: [ColorCorrectionConfig](../-color-correction-config/index.md))<br>Set color correction config. |
| [setColorCorrectionMode](set-color-correction-mode.md) | [androidJvm]<br>open fun [setColorCorrectionMode](set-color-correction-mode.md)(mode: [ColorCorrectionMode](../-color-correction-mode/index.md))<br>Set color correction mode. |
| [setColorCorrectionPeriod](set-color-correction-period.md) | [androidJvm]<br>open fun [setColorCorrectionPeriod](set-color-correction-period.md)(periodMs: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))<br>Set time between two analyses of the frame by the color corrector. |
| [setColorCorrectionPower](set-color-correction-power.md) | [androidJvm]<br>open fun [setColorCorrectionPower](set-color-correction-power.md)(power: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))<br>Set power of the automatic color correction. |
| [setColorFilterStrength](set-color-filter-strength.md) | [androidJvm]<br>open fun [setColorFilterStrength](set-color-filter-strength.md)(strength: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))<br>Set color filter strength. |
| [setColorGradingReferenceImage](set-color-grading-reference-image.md) | [androidJvm]<br>open fun [setColorGradingReferenceImage](set-color-grading-reference-image.md)(bitmap: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html))<br>Set color grading reference image. |
| [setFaceDetectionGap](set-face-detection-gap.md) | [androidJvm]<br>open fun [setFaceDetectionGap](set-face-detection-gap.md)(gapSize: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))<br>Set frame gap for face detection. Default [gapSize](set-face-detection-gap.md) is 0, if [gapSize](set-face-detection-gap.md) 0, pipeline will skip [gapSize](set-face-detection-gap.md) frames and use cached face position. [gapSize](set-face-detection-gap.md) 0 improves performance. |
| [setFlipX](set-flip-x.md) | [androidJvm]<br>open fun [setFlipX](set-flip-x.md)(horizontalFlip: [Boolean](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-boolean/index.html))<br>Set [horizontalFlip](set-flip-x.md) as true if you need flip image by x axis. |
| [setFPSListener](set-f-p-s-listener.md) | [androidJvm]<br>abstract fun [setFPSListener](set-f-p-s-listener.md)(listener: [FPSListener](../../com.effectssdk.tsvb/-f-p-s-listener/index.md)?)<br>Attach FPS counter to pipeline. |
| [setImageFilter](set-image-filter.md) | [androidJvm]<br>open fun [setImageFilter](set-image-filter.md)(filter: [CubeImageFilter](../../com.effectssdk.tsvb.models/-cube-image-filter/index.md))<br>Set custom cube image filter. |
| [setLowLightConfig](set-low-light-config.md) | [androidJvm]<br>open fun [setLowLightConfig](set-low-light-config.md)(config: [LowLightConfig](../-low-light-config/index.md))<br>Set low light effect config. |
| [setLowLightPower](set-low-light-power.md) | [androidJvm]<br>open fun [setLowLightPower](set-low-light-power.md)(power: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))<br>Set low light effect power. |
| [setMode](set-mode.md) | [androidJvm]<br>abstract fun [setMode](set-mode.md)(mode: [PipelineMode](../-pipeline-mode/index.md))<br>Set background mode for pipeline. |
| [setOnFrameAvailableListener](set-on-frame-available-listener.md) | [androidJvm]<br>abstract fun [setOnFrameAvailableListener](set-on-frame-available-listener.md)(listener: [OnFrameAvailableListener](../-on-frame-available-listener/index.md)?)<br>Attach onFrameAvailableListener to pipeline. |
| [setOrientationChangeListener](set-orientation-change-listener.md) | [androidJvm]<br>open fun [setOrientationChangeListener](set-orientation-change-listener.md)(listener: [OrientationChangeListener](../-orientation-change-listener/index.md)?)<br>Attach orientationChangeListener to pipeline. |
| [setOutputSurface](set-output-surface.md) | [androidJvm]<br>abstract fun [setOutputSurface](set-output-surface.md)(surface: [Surface](https://developer.android.com/reference/kotlin/android/view/Surface.html)?)<br>Set surface for frame rendering. Pass null to remove surface. |
| [setPortraitLightingOptions](set-portrait-lighting-options.md) | [androidJvm]<br>open fun [setPortraitLightingOptions](set-portrait-lighting-options.md)(options: [PortraitLightingOptions](../-portrait-lighting-options/index.md))<br>Set portrait lighting options. |
| [setSegmentationGap](set-segmentation-gap.md) | [androidJvm]<br>open fun [setSegmentationGap](set-segmentation-gap.md)(gapSize: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))<br>Set frame gap for segmentation. Default [gapSize](set-segmentation-gap.md) is 0, if [gapSize](set-segmentation-gap.md) 0, pipeline will skip [gapSize](set-segmentation-gap.md) frames and use cached segmentation mask. [gapSize](set-segmentation-gap.md) 0 improves performance. |
| [setSegmentationMode](set-segmentation-mode.md) | [androidJvm]<br>abstract fun [setSegmentationMode](set-segmentation-mode.md)(mode: [SegmentationMode](../-segmentation-mode/index.md))<br>Set segmentation mode. |
| [setSharpeningStrength](set-sharpening-strength.md) | [androidJvm]<br>open fun [setSharpeningStrength](set-sharpening-strength.md)(strength: [Float](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-float/index.html))<br>Set sharpening strength. |
| [setZoomLevel](set-zoom-level.md) | [androidJvm]<br>open fun [setZoomLevel](set-zoom-level.md)(zoomLevel: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))<br>Set zoom level if need to crop frames around human face. |
| [updateLowLightLut](update-low-light-lut.md) | [androidJvm]<br>open fun [~~updateLowLightLut~~](update-low-light-lut.md)()<br>Force low light lut update. |