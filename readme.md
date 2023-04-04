![Effects SDK logo](assets/Logo.png "a title")

# Android video effects SDK

## How to use

### Preparation

1. Add this dependency to your gradle file
    1. implementation 'com.google.flogger:flogger:0.6'
    2. implementation 'com.google.flogger:flogger-system-backend:0.6'
    3. implementation 'com.google.guava:guava:27.0.1-android'
2. Import AAR file by using android studio interface, or add it to your gradle script manually
3. Call VBSDK.initialize(context) method in your Application class (or Activity class) to load native library
4. Call VBSDK.createSDKFactory(context) to get SDKFactory instance

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

## Class reference

### VBSDK

#### initialize

_fun initialize(context: Context)_

Call this method to Initialize VBSDK. Application context or activity could be passed as parameter.

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
| frame          | Frame          | VBSDK frame. |

### OnFrameAvailableListener

Use this interface to get Bitmap objects from the pipeline.

#### onNewFrame

_fun onNewFrame(bitmap: Bitmap)_

Results of pipeline work will be available here as android bitmap.

| Parameter name | Parameter type | Description                           |
|----------------|----------------|---------------------------------------|
| bitmap         | Bitmap         | ARGB android bitmap with all effects. |