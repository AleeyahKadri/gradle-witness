plugins {
    groovy
}

dependencies {
    implementation(gradleApi())
    implementation(localGroovy())
}

java {
    sourceCompatibility = JavaVersion.VERSION_1_7
    targetCompatibility = JavaVersion.VERSION_1_7
}
