//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[LutProvider](index.md)/[loadCubeLut](load-cube-lut.md)

# loadCubeLut

[androidJvm]\
fun [loadCubeLut](load-cube-lut.md)(assetPath: [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)): [CubeImageFilter](../../com.effectssdk.tsvb.models/-cube-image-filter/index.md)

Load a 3D LUT from the assets.

Reads a `.cube` file: `TITLE`, `DOMAIN_MIN` and `DOMAIN_MAX` lines, comments starting with `#` and blank lines are skipped, `LUT_3D_SIZE` gives the cube edge, and the remaining lines are the RGB triplets. Values are expected in the default `0..1` domain and are scaled to `0..255`; a file declaring another domain is read as if it were `0..1`.

A bad LUT is reported rather than swallowed, so every returned filter is usable as is. The call reads the whole file, so keep it off the main thread.

#### Return

the parsed filter, never empty

#### Parameters

androidJvm

| | |
|---|---|
| assetPath | path of the `.cube` file inside the assets directory |

#### Throws

| | |
|---|---|
| [FileNotFoundException](https://developer.android.com/reference/kotlin/java/io/FileNotFoundException.html) | if there is no such asset |
| [IOException](https://developer.android.com/reference/kotlin/java/io/IOException.html) | if the asset cannot be read |
| [IllegalArgumentException](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-illegal-argument-exception/index.html) | if the file is not a usable 3D LUT: no `LUT_3D_SIZE`, a 1D LUT, a malformed data line, or a number of entries that does not match `LUT_3D_SIZE` |