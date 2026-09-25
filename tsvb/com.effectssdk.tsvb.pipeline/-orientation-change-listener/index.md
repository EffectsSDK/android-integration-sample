//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[OrientationChangeListener](index.md)

# OrientationChangeListener

[androidJvm]\
fun interface [OrientationChangeListener](index.md)

Pipeline image orientation listener.

Only reports anything while the pipeline runs [SegmentationMode.AUTO](../-segmentation-mode/-a-u-t-o/index.md), which is the mode that follows the device. A fixed [SegmentationMode.PORTRAIT](../-segmentation-mode/-p-o-r-t-r-a-i-t/index.md) or [SegmentationMode.LANDSCAPE](../-segmentation-mode/-l-a-n-d-s-c-a-p-e/index.md) pins the model and the frame rotation, so the listener is never called.

## Functions

| Name | Summary |
|---|---|
| [onOrientationChanged](on-orientation-changed.md) | [androidJvm]<br>abstract fun [onOrientationChanged](on-orientation-changed.md)(deviceOrientation: [DeviceOrientation](../-device-orientation/index.md), rotation: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))<br>This method will be called on each orientation change. |