// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    alias(libs.plugins.android.application) apply false
}
val defaultMinSdkVersion by extra(29)
val compileSdkVersion by extra(defaultMinSdkVersion)