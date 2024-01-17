plugins {
    id("com.android.application")
}

android {
    namespace = "com.example.app6_2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.app6_2"
        minSdk = 29
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")
    implementation ("com.squareup.okhttp3:okhttp:4.9.1") // 追加
    implementation ("com.google.code.gson:gson:2.2.4")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.1")
    implementation ("androidx.webkit:webkit:1.4.0")//HTML処理するために追加
    implementation ("androidx.swiperefreshlayout:swiperefreshlayout:1.1.0")//リロード処理に使用
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly ("org.junit.jupiter:junit-jupiter-engine:5.8.1")
    testImplementation ("org.mockito:mockito-core:5.9.0")



}