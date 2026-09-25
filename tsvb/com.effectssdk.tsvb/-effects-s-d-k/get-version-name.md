//[tsvb](../../../index.md)/[com.effectssdk.tsvb](../index.md)/[EffectsSDK](index.md)/[getVersionName](get-version-name.md)

# getVersionName

[androidJvm]\
fun [getVersionName](get-version-name.md)(): [String](https://kotlinlang.org/api/core/kotlin-stdlib/kotlin/-string/index.html)

Get current SDK version.

The build number is appended to the released version name, so the string is finer grained than the Maven coordinate of the artifact: &quot;1.2.3.45678&quot; for version 1.2.3. Report it as is when filing an issue.

#### Return

sdk version string