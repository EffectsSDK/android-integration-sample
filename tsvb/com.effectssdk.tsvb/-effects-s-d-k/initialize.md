//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[EffectsSDK](index.md)/[initialize](initialize.md)

# initialize

[androidJvm]\
fun [initialize](initialize.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), customerId: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html), url: [URL](https://developer.android.com/reference/kotlin/java/net/URL.html)? = null, callback: (sdkStatus: [EffectsSDKStatus](../-effects-s-d-k-status/index.md)) -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-unit/index.html))

Initialize Effects SDK.

#### Return

#### Parameters

androidJvm

| | |
|---|---|
| context | current application context |
| customerId | your customer ID |
| url | license server URL |

[androidJvm]\
fun [initialize](initialize.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), customerKey: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin-stdlib/kotlin/-string/index.html)): [EffectsSDKStatus](../-effects-s-d-k-status/index.md)

Initialize Effects SDK.

#### Return

[EffectsSDKStatus](../-effects-s-d-k-status/index.md)

#### Parameters

androidJvm

| | |
|---|---|
| context | current application context |
| customerKey | your local customer key |
