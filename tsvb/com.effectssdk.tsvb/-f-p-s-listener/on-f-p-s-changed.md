//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[FPSListener](index.md)/[onFPSChanged](on-f-p-s-changed.md)

# onFPSChanged

[androidJvm]\
abstract fun [onFPSChanged](on-f-p-s-changed.md)(framesPerSecond: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))

Reports the number of frames the pipeline produced since the previous report, at most once per second and never on a schedule of its own: the count is emitted while delivering a frame, so a pipeline that stops producing frames stops reporting instead of reporting 0. The first value after a pipeline starts covers less than a full second.

#### Parameters

androidJvm

| | |
|---|---|
| framesPerSecond | current pipeline fps |