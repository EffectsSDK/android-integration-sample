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

Overall, our SDK is the perfect solution for those looking to take their video conferencing experience to the next level. With advanced
features like background blur, virtual background, auto-framing or smart zoom, beautification, and automatic color correction, you can
create a professional and polished appearance during your video calls. Try our web SDK today and elevate your video conferencing experience.

[Class reference](index.md)

## How to use

### Obtaining Effects SDK Customer ID

To receive a new trial Customer ID please fill in the contact form on effectssdk.ai website.

### Preparation

1. Get your own customer ID
2. Add this dependency to your gradle file
    1. implementation 'com.google.flogger:flogger:$version'
    2. implementation 'com.google.flogger:flogger-system-backend:$version'
    3. implementation 'com.google.guava:guava:$version'
3. Optional:
    1. implementation 'com.google.code.findbugs:jsr305:3.0.2' 
4. Add camerax dependency (if camera pipeline required)
    1. implementation "androidx.camera:camera-core:$androidXCameraVersion"
    2. implementation "androidx.camera:camera-camera2:$androidXCameraVersion"
    3. implementation "androidx.camera:camera-lifecycle:$androidXCameraVersion"
5. Import AAR file by using android studio interface, or add it to your gradle script manually
6. Call EffectsSDK.initialize(context, CUSTOMER_ID) method in your Application class (or Activity class) to load native library
7. Call EffectsSDK.createSDKFactory(context) to get SDKFactory instance


### Usage

1. Call sdkFactory.createPipeline() method (for image/camera pipeline)
2. Set context for pipeline
3. Set mode for pipeline (remove, replace, blur, no effects)
4. Set additional parameters (background image, etc)
5. Set OnFrameAvailableListener to Pipeline instance (if you need to get Android Bitmap)
6. Set surface to pipeline (if you need to draw frame immediately)

CameraPipeline handles camera input automatically. You should call the startPipeline() method to run it. Use setOutputSurface() method to
attach a Surface object to the pipeline. You still can use onFrameAvailableListener to get Bitmap images from the pipeline.

### Code example

#### SDK initialization

```kotlin
class YourApplicationClass : Application() {
    private val YOUR_CUSTOMER_ID = "customer_id"
    override fun onCreate() { 
        super.onCreate()
        EffectsSDK.initialize(applicationContext, YOUR_CUSTOMER_ID) { sdkStatus -> 
            when (sdkStatus) {
                EffectsSDKStatus.ACTIVE -> TODO()
                EffectsSDKStatus.INACTIVE -> TODO()
                EffectsSDKStatus.EXPIRED -> TODO()
                EffectsSDKStatus.UNAVAILABLE -> TODO()
            }
        }
    }
}
```

#### SDK usage

```kotlin

private val sdkFactory = EffectsSDK.createSDKFactory()

private val pipeline = sdkFactory.createImagePipeline(
	context = context,
	mode = PipelineMode.BLUR,
	blurPower = blurPower,
	// Additional parameters
)

pipeline.setOnFrameAvailableListener { bitmap, timestamp ->
	//handle pipeline output here
}
```


#### Lite pipelines

If you need only basic functions (like remove\replace\blur background), you can use lite pipeline instances.
```kotlin

private val sdkFactory = EffectsSDK.createSDKFactory()

private val pipeline = sdkFactory.createLiteCameraPipeline(
	context,
	PipelineMode.REMOVE
)
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



## Migration to 2.11.x

### Add customer id to your SDK initialize() call

```kotlin
EffectsSDK.initialize(context, YOUR_CUSTOMER_ID) { status ->
   when (status) {
      EffectsSDKStatus.ACTIVE -> TODO()
      EffectsSDKStatus.INACTIVE -> TODO()
      EffectsSDKStatus.EXPIRED -> TODO()
      EffectsSDKStatus.UNAVAILABLE -> TODO()
   }
}
```

### Add internet permission
```manifest
<manifest

 <uses-permission android:name = "android.permission.INTERNET" />
 <uses-permission android:name = "android.permission.CAMERA" />
 ...
</manifest>


```
