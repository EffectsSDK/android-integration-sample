![Effects SDK logo](assets/Logo.png "a title")

# Android video effects SDK

Add real-time AI video enhancement that makes video meeting experience more effective and comfortable to your application in a few hours.

Introducing our powerful and advanced web SDK for video communication products. With our web SDK, you can now elevate your video
conferencing experience with features like background blur, virtual background, auto-framing or smart zoom, beautification, and automatic
color correction.

Our background blur feature helps you maintain your privacy and professionalism during video calls by blurring out the background behind
you. Virtual background takes it one step further by allowing you to replace your real background with a custom image or video of your
choice.

With our auto-framing or smart zoom feature, you no longer have to worry about staying in frame during your video calls. Our SDK
automatically adjusts the camera's field of view to keep you centered in the frame, even if you move around.

Our beautification feature enhances your appearance during video calls by smoothing out skin tones, removing blemishes, and adjusting
lighting to create a more polished look. This feature is perfect for those who want to boost their confidence and create a professional
appearance.

Finally, our automatic color correction feature adjusts the camera's color settings to improve the overall image quality, even in low-light
environments or with poor quality cameras.

Overall, our web SDK is the perfect solution for those looking to take their video conferencing experience to the next level. With advanced
features like background blur, virtual background, auto-framing or smart zoom, beautification, and automatic color correction, you can
create a professional and polished appearance during your video calls. Try our web SDK today and elevate your video conferencing experience.

## How to use

### Preparation

1. Add this dependency to your gradle file
    1. implementation 'com.google.flogger:flogger:0.6'
    2. implementation 'com.google.flogger:flogger-system-backend:0.6'
    3. implementation 'com.google.guava:guava:27.0.1-android'
2. Import AAR file by using android studio interface, or add it to your gradle script manually
3. Call EffectsSDK.initialize(context) method in your Application class (or Activity class) to load native library
4. Call EffectsSDK.createSDKFactory(context) to get SDKFactory instance

### Usage

1. Create an instance of (Image/Camera)PipelineBuilder
2. Create an instance of FrameFactory (if you use an ImagePipeline)
3. Set context for pipeline
4. Set mode for pipeline (remove, replace, blur, no effects)
5. Set additional parameters (background image, etc)
6. Set OnFrameAvailableListener to Pipeline instance (if you need to get Android Bitmap)
7. Set surface to pipeline (if you need to draw frame immediately)

CameraPipeline handles camera input automatically. You should call the startPipeline() method to run it. Use setOutputSurface() method to
attach a Surface object to the pipeline. You still can use onFrameAvailableListener to get Bitmap images from the pipeline.

### Code example

```
EffectsSDK.initialize(applicationContext)
private val sdkFactory = EffectsSDK.createSDKFactory()
private val pipeline = sdkFactory.createCameraPipelineBuilder()
            .setContext(activityLink)
            .setMode(ConfigMapper.map(sdkConfig.pipelineMode))
            .setBlurParams(sdkConfig.blurRadius, sdkConfig.blurQuality)
            .setBackground(sdkConfig.backgroundImage)
            .setGradingReference(sdkConfig.colorGradingReferenceImage)
            .setForegroundSize(sdkConfig.foregroundSize)
            .setSegmentationGap(sdkConfig.segmentationGap)
            .setFaceDetectionGap(sdkConfig.faceDetectionGap)
            .enableBeautification(sdkConfig.isBeautificationEnabled)
            .setColorCorrectionMode(ConfigMapper.map(sdkConfig.colorCorrectionMode))
            .setCamera(ConfigMapper.map(sdkConfig.camera))
            .setResolution(sdkConfig.resolution)
            .enableFPSCounter { view.onFPSCounterChanged(it) }
            .build()

pipeline.setOnFrameAvailableListener { bitmap ->
            //draw bitmap
}
        
pipeline.startPipeline()
```

### Color filter example

|                                               |                                              |                                              |
|-----------------------------------------------|----------------------------------------------|----------------------------------------------|
| Original image                                | CS 1                                         | CS 2                                         |
| ![alt text](assets/origin.jpg "CS 1 example") | ![alt text](assets/CS_1.jpg "CS 1 example")  | ![alt text](assets/CS_2.jpg "CS 1 example")  |
| CS 3                                          | CS 4                                         | CS 5                                         |
| ![alt text](assets/CS_3.jpg "CS 1 example")   | ![alt text](assets/CS_4.jpg "CS 1 example")  | ![alt text](assets/CS_5.jpg "CS 1 example")  |
| CS 6                                          | CS 7                                         | CS 8                                         |
| ![alt text](assets/CS_6.jpg "CS 1 example")   | ![alt text](assets/CS_7.jpg "CS 1 example")  | ![alt text](assets/CS_8.jpg "CS 1 example")  |
| CS 9                                          | CS 10                                        | CS 11                                        |
| ![alt text](assets/CS_9.jpg "CS 1 example")   | ![alt text](assets/CS_10.jpg "CS 1 example") | ![alt text](assets/CS_17.jpg "CS 1 example") |
| CS 12                                         | CS 13                                        | CS 14                                        |
| ![alt text](assets/CS_12.jpg "CS 1 example")  | ![alt text](assets/CS_13.jpg "CS 1 example") | ![alt text](assets/CS_14.jpg "CS 1 example") |
| CS 15                                         | CS 16                                        | CS 17                                        |
| ![alt text](assets/CS_15.jpg "CS 1 example")  | ![alt text](assets/CS_16.jpg "CS 1 example") | ![alt text](assets/CS_17.jpg "CS 1 example") |
| CS 18                                         | CS 19                                        | CS 20                                        |
| ![alt text](assets/CS_18.jpg "CS 1 example")  | ![alt text](assets/CS_19.jpg "CS 1 example") | ![alt text](assets/CS_20.jpg "CS 1 example") |



## Class reference

### EffectsSDK

#### initialize

_fun initialize(context: Context)_

Call this method to Initialize EffectsSDK. Application context or activity could be passed as parameter.

| Parameter name | Parameter type | Description         |
|----------------|----------------|---------------------|
| context        | Context        | Application context |

#### createSDKFactory

_fun createSDKFactory()_

Create an SDK factory.

#### getVersionName

_fun getVersionName()_

Return SDK version name.

#### getCameraResolution

_fun getCameraResolution(context: Context, camera: Camera)_

Return list of available resolutions (descending order).

| Parameter name | Parameter type | Description                    |
|----------------|----------------|--------------------------------|
| context        | Context        | Application context            |
| camera         | Camera         | Front or back camera selection |

### FrameFactory

FrameFactory can be created by calling SDKFactory.createFrameFactory(). This class used for frame creation.

#### createARGB

_fun createARGB(bitmap: Bitmap)_

Create Frame from the ARGB android bitmap.

| Parameter name | Parameter type | Description                       |
|----------------|----------------|-----------------------------------|
| image          | Bitmap         | Android bitmap (ARGB_8888 format) |

#### createYUV420

_fun createYUV420(image: Image)_

Create Frame from the YUVImage.

| Parameter name | Parameter type | Description                                                |
|----------------|----------------|------------------------------------------------------------|
| image          | Image          | Instance of android.media.Image class (YUV_420_888 format) |

_**Another formats will be added in next versions**_

### Frame

#### frameFormat

_fun frameFormat()_

Return format of data.

#### width

_fun width()_

Return number of pixels in horizontal direction.

#### height

_fun height()_

Return number of pixels in vertical direction.

### PipelineBuilder

#### setContext

_fun setContext(act: Activity)_

Set android activity to pipeline.

| Parameter name | Parameter type | Description            |
|----------------|----------------|------------------------|
| act            | Activity       | Android activity link. |

#### setMode

_fun setMode(mode: PipelineMode)_

Set pipeline mode (remove, replace, blur, no effects).

| Parameter name | Parameter type | Description            |
|----------------|----------------|------------------------|
| mode           | PipelineMode   | Pipeline mode constant |

#### setSegmentationMode

_fun setSegmentationMode(mode: SegmentationMode)_

Set segmentation model (portrait/landscape/auto).

| Parameter name | Parameter type   | Description                 |
|----------------|------------------|-----------------------------|
| mode           | SegmentationMode | Selected segmentation model |

#### setBackground

_fun setBackground(bitmap: Bitmap)_

Set background image for replacement mode.

| Parameter name | Parameter type | Description                       |
|----------------|----------------|-----------------------------------|
| image          | Bitmap         | Android bitmap (ARGB_8888 format) |

#### setBlurParams

_fun setBlurParams(radius: Float, quality: Float)_

Set blur options. If one of this values are zero, the blur filter will not work.

| Parameter name | Parameter type | Description                                    |
|----------------|----------------|------------------------------------------------|
| radius         | Float          | Values in [0..1]. More - slower, but stronger. |
| quality        | Float          | Values in [0..1]. More - slower, but stronger. |

#### setForegroundSize

_fun setForegroundSize(size: Int)_

Set padding for segmentation mask.

| Parameter name | Parameter type | Description                      |
|----------------|----------------|----------------------------------|
| size           | Int            | Padding size. Values in [-4..4]. |

#### enableBeautification

_fun enableBeautification(isEnabled: Boolean)_

Enable\disable beautification mode.

| Parameter name | Parameter type | Description                                                                  |
|----------------|----------------|------------------------------------------------------------------------------|
| isEnabled      | Boolean        | Set true if you need to activate the beautification feature, else set false. |

#### setColorCorrectionMode

_fun setColorCorrectionMode(mode: ColorCorrectionMode)_

Enable\disable color correction mode. Awailable modes: NO_FILTER_MODE, COLOR_CORRECTION (with neural network), COLOR_GRADING(map color cheme
between two images), PRESET_MODE(pre-defined filters).

| Parameter name | Parameter type      | Description                                     |
|----------------|---------------------|-------------------------------------------------|
| mode           | ColorCorrectionMode | Type of color correction algorithm for pipeline |

#### enableFpsCounter

_fun enableFpsCounter(listener: FPSListener)_

Set fps callback.

| Parameter name | Parameter type | Description                                                                       |
|----------------|----------------|-----------------------------------------------------------------------------------|
| listener       | FPSListener    | The callback method has a fps value in parameters, you can handle it as you want. |

#### setSegmentationGap

_fun setSegmentationGap(gapSize: Int)_

Set the number of frames for the model to skip. For example, if this parameter is 3, the segmentation model will process every 4th frame.

| Parameter name | Parameter type | Description              |
|----------------|----------------|--------------------------|
| gapSize        | Int            | Number of frames to skip |

#### setFaceDetectionGap

_fun setFaceDetectionGap(gapSize: Int)_

Set the number of frames for the model to skip. For example, if this parameter is 3, the face detection model will process every 4th frame.

| Parameter name | Parameter type | Description              |
|----------------|----------------|--------------------------|
| gapSize        | Int            | Number of frames to skip |

#### setCamera

_fun setCamera()_

Set camera for pipeline.

| Parameter name | Parameter type | Description                              |
|----------------|----------------|------------------------------------------|
| cam            | Camera         | Select front or back camera for pipeline |

#### setResolution

_fun setResolution()_

Set camera resolution for pipeline

| Parameter name | Parameter type | Description       |
|----------------|----------------|-------------------|
| res            | Size           | Camera resolution |

#### build

_fun build()_

Create an ImagePipeline instance.

### BasePipeline

This interface contains common methods for both pipelines.

#### getMode

_fun getMode()_

Return current pipeline mode.

#### getBlurRadius

_fun getBlurRadius()_

Return current blur radius value.

#### getBlurQuality

_fun getBlurQuality()_

Return current blur quality value.

#### getForegroundSize

_fun getForegroundSize()_

Return current segmentation padding size.

#### getSegmentationGap

_fun getSegmentationGap()_

Return current number of skipped frames for segmentation.

#### getFaceDetectionGap

_fun getFaceDetectionGap()_

Return current number of skipped frames for face detection.

#### isFlippedX

_fun isFlippedX()_

Return true if frames are flipped by the X axis.

#### getZoomLevel

_fun getZoomLevel()_

Return current zoom level (face size in percent).

#### getSegmentationMode

_fun getSegmentationMode()_

Return used segmentation model(portrait/landscape/auto).

#### isBeautificationEnabled

_fun isBeautificationEnabled()_

Return true if the beautification filter is enabled.

#### setOutputSurface

_fun setOutputSurface(surface: Surface)_

Set surface for frame draw.

| Parameter name | Parameter type | Description      |
|----------------|----------------|------------------|
| surface        | Surface        | Surface instance |

##### setFlipX

_fun setFlipX(horizontalFlip: Bool)_

Flip frames by X axis.

| Parameter name | Parameter type | Description                                       |
|----------------|----------------|---------------------------------------------------|
| horizontalFlip | Boolean        | True, if you need flip by X axis and false if not |

#### setOnFrameAvailableListener

_fun setOnFrameAvailableListener(listener: OnFrameAvailableListener)_

Set frame callback.

| Parameter name | Parameter type           | Description                  |
|----------------|--------------------------|------------------------------|
| listener       | OnFrameAvailableListener | Callback interface instance. |

#### setMode

_fun setMode(mode: PipelineMode)_

Set pipeline mode (remove, replace, blur, no effects).

| Parameter name | Parameter type | Description            |
|----------------|----------------|------------------------|
| mode           | PipelineMode   | Pipeline mode constant |

#### setZoomLevel

_fun setZoomLevel(zoomLevel: Int)_

Set size of face in percent. If the size of the face is already more than this value, do nothing.

| Parameter name | Parameter type | Description          |
|----------------|----------------|----------------------|
| zoomLevel      | Int            | Face size in percent |

#### setBlurRadius

_fun setBlurRadius(radius: Float)_

Change the blur radius.

| Parameter name | Parameter type | Description                                    |
|----------------|----------------|------------------------------------------------|
| radius         | Float          | Values in [0..1]. More - slower, but stronger. |

#### setBlurQuality

_fun setBlurQuality(quality: Float)_

Change the blur quality.

| Parameter name | Parameter type | Description                                    |
|----------------|----------------|------------------------------------------------|
| quality        | Float          | Values in [0..1]. More - slower, but stronger. |

#### setForegroundSize

_fun setForegroundSize(size: Int)_

Set padding for segmentation mask.

| Parameter name | Parameter type | Description                      |
|----------------|----------------|----------------------------------|
| size           | Int            | Padding size. Values in [-4..4]. |

#### setSegmentationGap

_fun setSegmentationGap(gapSize: Int)_

Set the number of frames for the model to skip. For example, if this parameter is 3, the segmentation model will process every 4th frame.

| Parameter name | Parameter type | Description              |
|----------------|----------------|--------------------------|
| gapSize        | Int            | Number of frames to skip |

#### setFaceDetectionGap

_fun setFaceDetectionGap(gapSize: Int)_

Set the number of frames for the model to skip. For example, if this parameter is 3, the face detection model will process every 4th frame.

| Parameter name | Parameter type | Description              |
|----------------|----------------|--------------------------|
| gapSize        | Int            | Number of frames to skip |

#### enableBeautification

_fun enableBeautification(isEnabled: Boolean)_

Enable\disable beautification mode.

| Parameter name | Parameter type | Description                                                                  |
|----------------|----------------|------------------------------------------------------------------------------|
| isEnabled      | Boolean        | Set true if you need to activate the beautification feature, else set false. |

#### setColorCorrectionMode

_fun setColorCorrectionMode(mode: ColorCorrectionMode)_

Enable\disable color correction mode. Awailable modes: NO_FILTER_MODE, COLOR_CORRECTION (with neural network), COLOR_GRADING(map color cheme
between two images), PRESET_MODE(pre-defined filters).

| Parameter name | Parameter type      | Description                                     |
|----------------|---------------------|-------------------------------------------------|
| mode           | ColorCorrectionMode | Type of color correction algorhitm for pipeline |

#### setColorGradingReferenceImage

_fun setColorGradingReferenceImage(bitmap: Bitmap)_

Set reference image for color grading mode

| Parameter name | Parameter type | Description            |
|----------------|----------------|------------------------|
| bitmap         | Bitmap         | Reference image bitmap |

#### setImageFilter

_fun setImageFilter(filter: ImageFilterPreset)_

Set pre-defined filter for color correction

| Parameter name | Parameter type    | Description   |
|----------------|-------------------|---------------|
| filter         | ImageFilterPreset | Lut for image |

#### setBeautificationPower

_fun setBeautificationPower(power: Int)_

Set beautification power value.

| Parameter name | Parameter type | Description         |
|----------------|----------------|---------------------|
| power          | Int            | Value from [0..100] |

#### setBackground

_fun setBackground(bitmap: Bitmap)_

Set background image for replacement mode.

| Parameter name | Parameter type | Description                       |
|----------------|----------------|-----------------------------------|
| image          | Bitmap         | Android bitmap (ARGB_8888 format) |

#### setSegmentationMode

_fun setSegmentationMode(mode: SegmentationMode)_

Set segmentation model (portrait/landscape/auto).

| Parameter name | Parameter type   | Description                 |
|----------------|------------------|-----------------------------|
| mode           | SegmentationMode | Selected segmentation model |

#### release

fun release()

Close pipeline and release memory.

### CameraPipeline

This pipeline is used for camera input processing.

#### startPipeline

_fun startPipeline()_

Run pipeline. Camera instance will be started after this call

#### setResolution

_fun setResolution()_

Set camera resolution for pipeline

| Parameter name | Parameter type | Description       |
|----------------|----------------|-------------------|
| res            | Size           | Camera resolution |

### ImagePipeline

This pipeline is used for bitmap input processing (from any source).

#### process

_fun process(frame: Frame)_

Pass frame to the pipeline.

| Parameter name | Parameter type | Description  |
|----------------|----------------|--------------|
| frame          | Frame          | EffectsSDK frame. |

### OnFrameAvailableListener

Use this interface to get Bitmap objects from the pipeline.

#### onNewFrame

_fun onNewFrame(bitmap: Bitmap)_

Results of pipeline work will be available here as android bitmap.

| Parameter name | Parameter type | Description                           |
|----------------|----------------|---------------------------------------|
| bitmap         | Bitmap         | ARGB android bitmap with all effects. |