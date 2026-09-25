//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[FPSListener](index.md)

# FPSListener

[androidJvm]\
fun interface [FPSListener](index.md)

Listener for monitoring pipeline performance.

Attach it to a pipeline to follow how many frames per second it produces.

## Functions

| Name | Summary |
|---|---|
| [onFPSChanged](on-f-p-s-changed.md) | [androidJvm]<br>abstract fun [onFPSChanged](on-f-p-s-changed.md)(framesPerSecond: [Int](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-int/index.html))<br>Reports the number of frames the pipeline produced since the previous report, at most once per second and never on a schedule of its own: the count is emitted while delivering a frame, so a pipeline that stops producing frames stops reporting instead of reporting 0. The first value after a pipeline starts covers less than a full second. |