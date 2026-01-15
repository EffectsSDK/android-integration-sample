![Effects SDK logo](assets/Logo.png "Logo")

# Android video effects SDK

Add real-time AI video enhancement that makes video meeting experience more effective and comfortable to your application in a few hours.

Introducing our powerful and advanced android SDK for video communication products. With our android SDK, you can now elevate your video
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
create a professional and polished appearance during your video calls. Try our android SDK today and elevate your video conferencing experience.

## How to use

### Obtaining Effects SDK Customer ID

To receive a new trial Customer ID please fill in the contact form on [effectssdk.ai](https://effectssdk.ai/cp/registration) website.

### Setting up the Effects SDK dependency

Add this line to your build.gradle file (please check the actual version [here](https://github.com/EffectsSDK/android-integration-sample/releases))

```kts
implementation("ai.effectssdk:video:+")
```

or include it as local aar if you use some specific version (you can find archive
with aar and demo app [here](https://github.com/EffectsSDK/android-integration-sample/releases)).

### Add Effects SDK dependencies

These libraries are used by EffectsSDK:

```kts
implementation("com.google.flogger:flogger:0.9")
implementation("com.google.flogger:flogger-system-backend:0.9")
implementation("com.google.guava:guava:33.4.8-android")
```

Also, add the CameraX dependency (if the CameraPipeline is required):

```kts
implementation("androidx.camera:camera-core:1.4.2")
implementation("androidx.camera:camera-camera2:1.4.2")
implementation("androidx.camera:camera-lifecycle:1.4.2")
```

### Initialize Effects SDK

Add the internet permission to your application manifest:

```manifest
<manifest
 <uses-permission android:name = "android.permission.INTERNET" />
 ...
</manifest>
```

Then you can initialize EffectsSDK by using our (or your own) license server.

```kotlin
fun initEffectsSdk(context: Context, yourCustomerId: String) {
	EffectsSDK.initialize(context, yourCustomerId) { sdkStatus: EffectsSDKStatus ->
		when (sdkStatus) {
			//Effects SDK initialized successfully
			EffectsSDKStatus.ACTIVE -> TODO()
			// Effects SDK is not initialized
			EffectsSDKStatus.INACTIVE -> TODO()
			//Effects SDK license expired
			EffectsSDKStatus.EXPIRED -> TODO()
			//Effects SDK is not available on this device
			EffectsSDKStatus.UNAVAILABLE -> TODO()
		}
	}
}
```

Or you can use a local key:

```kotlin
fun initializeEffectsSdkLocally(context: Context, localCustomerKey: String) {
	val status = EffectsSDK.initialize(context, localCustomerKey)
	when (status) {
		EffectsSDKStatus.ACTIVE -> TODO()
		EffectsSDKStatus.INACTIVE -> TODO()
		EffectsSDKStatus.EXPIRED -> TODO()
		EffectsSDKStatus.UNAVAILABLE -> TODO()
	}
}
```

### How to create and use a Pipeline instance

Call EffectsSDK.createSDKFactory() to get an SDKFactory instance.

```kotlin
val sdkFactory = EffectsSDK.createSDKFactory()
```

Add the camera permission to your application manifest:

```manifest
<manifest
 <uses-permission android:name = "android.permission.CAMERA" />
 ...
</manifest>
```

Then create and start a CameraPipeline instance. CameraPipeline processes camera input 
automatically, but you need to call the startPipeline() method to run it and stopPipeline() to stop frame processing.

```kotlin
val pipeline = sdkFactory.createCameraPipeline(
	context = context,
	mode = PipelineMode.BLUR,
	blurPower = 0.7f
	// Additional parameters
)

pipeline.startPipeline()
//    ...
pipeline.stopPipeline()
```

Or, if you need to process frames from any other sources, you can use ImagePipeline.

```kotlin
val pipeline = sdkFactory.createImagePipeline(
	context = context,
	mode = PipelineMode.REPLACE,
	background = getBitmap("someResourceName"),
)

pipeline.process(input)
```

### How to process pipeline output

You can render output frames to a Surface instance directly:

```kotlin
pipeline.setOutputSurface(youSurfaceInstance)
```

or you can use an OnFrameAvailableListener for bitmap processing.

```kotlin
pipeline.setOnFrameAvailableListener { bitmap: Bitmap, timestamp: Long ->
	//Process frames here
}
```

### How to release pipeline

The release() method stops frame processing and releases all allocated resources.
The pipeline cannot be used for any frame processing operations after this call.

```kotlin
pipeline.release()
```

### Lite pipeline

If you only need basic functions (like remove/replace/blur background), you can use lite pipeline instances.

```kotlin
val pipeline = sdkFactory.createLiteCameraPipeline(
	context = context,
	blurPower = 0.75f,
	pipelineMode = PipelineMode.BLUR
)
```

## Documentation

- [Class reference](index.md)
- [CameraPipeline usage example](sample/CameraPipelineFragment.kt)
- [ImagePipeline usage example](sample/ImagePipelineFragment.kt)
- [Video recording example](sample/VideoRecordFragment.kt)
- [Developer portal registration](https://effectssdk.ai/cp/registration)

## Migration to 2.11.x

### Add customer id to your EffectsSDK.initialize() call

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