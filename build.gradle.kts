// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "7.3.0" apply false
}

tasks.register<Delete>("clean").configure {
    delete(rootProject.buildDir)
}