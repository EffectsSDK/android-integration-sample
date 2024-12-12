//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[BasePipeline](index.md)/[setOutputSurface](set-output-surface.md)

# setOutputSurface

[androidJvm]\
abstract fun [setOutputSurface](set-output-surface.md)(surface: [Surface](https://developer.android.com/reference/kotlin/android/view/Surface.html)?)

Set surface for frame rendering. Pass null to remove surface.

WARNING!

If you use SurfaceView object for frame preview, you should ensure that holder.isCreating() value is false before surface will be attached to pipeline. The application could be locked on some devices, if this value is true.

#### Parameters

androidJvm

| |
|---|
| surface |
