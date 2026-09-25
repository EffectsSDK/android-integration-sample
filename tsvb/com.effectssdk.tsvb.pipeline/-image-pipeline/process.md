//[tsvb](../../../index.md)/[com.effectssdk.tsvb.pipeline](../index.md)/[ImagePipeline](index.md)/[process](process.md)

# process

[androidJvm]\
abstract fun [process](process.md)(frame: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html))

Process [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html).

The result is delivered to the output surface and to the [OnFrameAvailableListener](../-on-frame-available-listener/index.md), see [BasePipeline.setOutputSurface](../-base-pipeline/set-output-surface.md) and [BasePipeline.setOnFrameAvailableListener](../-base-pipeline/set-on-frame-available-listener.md).

#### Parameters

androidJvm

| | |
|---|---|
| frame | -     image to process |

[androidJvm]\
abstract fun [process](process.md)(frame: [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html), timestamp: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html))

Process [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) with timestamp.

#### Parameters

androidJvm

| | |
|---|---|
| frame | -     image to process |
| timestamp | -     frame timestamp, in microseconds |

[androidJvm]\
open fun [~~process~~](process.md)(frame: [Frame](../../com.effectssdk.tsvb.frame/-frame/index.md))

---

### Deprecated

Use methods for bitmap/image instance directly

---

Process a [Frame](../../com.effectssdk.tsvb.frame/-frame/index.md).

Use [process](process.md) with a [Bitmap](https://developer.android.com/reference/kotlin/android/graphics/Bitmap.html) instead: [Frame](../../com.effectssdk.tsvb.frame/-frame/index.md) cannot be built through the public API any more.

#### Parameters

androidJvm

| | |
|---|---|
| frame | -     frame to process |

[androidJvm]\
open fun [~~process~~](process.md)(frame: [Image](https://developer.android.com/reference/kotlin/android/media/Image.html))

---

### Deprecated

Use methods for bitmap/image instance directly

---

Process [Image](https://developer.android.com/reference/kotlin/android/media/Image.html).

#### Parameters

androidJvm

| | |
|---|---|
| frame | -     image to process |

[androidJvm]\
open fun [~~process~~](process.md)(frame: [Image](https://developer.android.com/reference/kotlin/android/media/Image.html), timestamp: [Long](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-long/index.html))

---

### Deprecated

Use methods for bitmap/image instance directly

---

Process [Image](https://developer.android.com/reference/kotlin/android/media/Image.html) with timestamp.

#### Parameters

androidJvm

| | |
|---|---|
| frame | -     image to process |
| timestamp | -     frame timestamp, in microseconds |