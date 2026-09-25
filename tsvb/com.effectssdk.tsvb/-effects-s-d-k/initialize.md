//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[EffectsSDK](index.md)/[initialize](initialize.md)

# initialize

[androidJvm]\
fun [initialize](initialize.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), customerId: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html), url: [URL](https://developer.android.com/reference/kotlin/java/net/URL.html)? = null, callback: (sdkStatus: [EffectsSDKStatus](../-effects-s-d-k-status/index.md)) -&gt; [Unit](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-unit/index.html))

Initialize Effects SDK against the license server.

The call returns immediately: the license is checked over the network and the native libraries are loaded on a background thread, and [callback](initialize.md) is invoked there once that finishes. Post to your own handler if you need the result on the main thread.

Nothing else in the SDK may be used until [callback](initialize.md) reports [EffectsSDKStatus.ACTIVE](../-effects-s-d-k-status/-a-c-t-i-v-e/index.md); [createSDKFactory](create-s-d-k-factory.md) throws until then.

#### Parameters

androidJvm

| | |
|---|---|
| context | current application context |
| customerId | your customer ID |
| url | license server URL. Pass null to use the Effects SDK server. |
| callback | receives the resulting [EffectsSDKStatus](../-effects-s-d-k-status/index.md), on a background thread |

[androidJvm]\
fun [initialize](initialize.md)(context: [Context](https://developer.android.com/reference/kotlin/android/content/Context.html), customerKey: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [EffectsSDKStatus](../-effects-s-d-k-status/index.md)

Initialize Effects SDK with a local license key.

Unlike the overload taking a customer ID, this validates the key offline and blocks until the native libraries are loaded, so keep it off the main thread.

#### Return

[EffectsSDKStatus](../-effects-s-d-k-status/index.md)

#### Parameters

androidJvm

| | |
|---|---|
| context | current application context |
| customerKey | your local customer key |