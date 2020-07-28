plugins {
    id("multiplatform-common")
}

kotlin {
    sourceSets {
        val commonMain by getting {
            dependencies {
                api(Coroutines.common)
            }
        }

        val jvmMain by getting {
            dependencies {
                api(Coroutines.core)
            }
        }

        val jsMain by getting {
            dependencies {
                api(Coroutines.js)
            }
        }

        val nativeMain by getting {
            dependencies {
                api(Coroutines.native)
            }
        }
    }
}
