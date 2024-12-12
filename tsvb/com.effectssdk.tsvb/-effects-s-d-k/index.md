//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[EffectsSDK](index.md)

# EffectsSDK

[androidJvm]\
object [EffectsSDK](index.md)

## Functions

| Name | Summary |
|---|---|
| [createSDKFactory](create-s-d-k-factory.md) | [androidJvm]<br>fun [createSDKFactory](create-s-d-k-factory.md)(): [SDKFactory](../-s-d-k-factory/index.md)<br>Create factory for SDK objects. |
| [getCameraResolution](get-camera-resolution.md) | [androidJvm]<br>fun [getCameraResolution](get-camera-resolution.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), camera: [Camera](../-camera/index.md)): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Size](https://developer.android.com/reference/kotlin/android/util/Size.html)&gt;<br>Return available resolutions for selected camera |
| [getSdkStatus](get-sdk-status.md) | [androidJvm]<br>fun [getSdkStatus](get-sdk-status.md)(): [EffectsSDKStatus](../-effects-s-d-k-status/index.md)<br>Get sdk status. Available values:[EffectsSDKStatus](../-effects-s-d-k-status/index.md) |
| [getVersionName](get-version-name.md) | [androidJvm]<br>fun [getVersionName](get-version-name.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Get current SDK version code |
| [initialize](initialize.md) | [androidJvm]<br>fun [initialize](initialize.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), customerId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), url: [URL](https://developer.android.com/reference/kotlin/java/net/URL.html)? = null, callback: (sdkStatus: [EffectsSDKStatus](../-effects-s-d-k-status/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>Initialize Effects SDK. |
