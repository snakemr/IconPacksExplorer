import org.jetbrains.compose.desktop.application.dsl.TargetFormat

plugins {
    kotlin("jvm")
    id("org.jetbrains.compose")
    id("org.jetbrains.kotlin.plugin.compose") version "2.1.0"
}

group = "com.example"
version = "1.6.0"

repositories {
    mavenCentral()
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    google()
}

val extendedIcons by properties
val composeIcons by properties

dependencies {
    // Note, if you develop a library, you should use compose.desktop.common.
    // compose.desktop.currentOs should be used in launcher-sourceSet
    // (in a separate module for demo project and in testMain).
    // With compose.desktop.common you will also lose @Preview functionality
    implementation(compose.desktop.currentOs)
    implementation("org.jetbrains.compose.material:material-icons-extended-desktop:$extendedIcons")
    implementation("br.com.devsrsouza.compose.icons:simple-icons:$composeIcons")
    implementation("br.com.devsrsouza.compose.icons:feather:$composeIcons")
    implementation("br.com.devsrsouza.compose.icons:tabler-icons:$composeIcons")
    implementation("br.com.devsrsouza.compose.icons:eva-icons:$composeIcons")
    implementation("br.com.devsrsouza.compose.icons:font-awesome:$composeIcons")
    implementation("br.com.devsrsouza.compose.icons:octicons:$composeIcons")
    implementation("br.com.devsrsouza.compose.icons:linea:$composeIcons")
    implementation("br.com.devsrsouza.compose.icons:line-awesome:$composeIcons")
    implementation("br.com.devsrsouza.compose.icons:erikflowers-weather-icons:$composeIcons")
    implementation("br.com.devsrsouza.compose.icons:css-gg:$composeIcons")
}

compose.desktop {
    application {
        mainClass = "MainKt"

        nativeDistributions {
            targetFormats(TargetFormat.Dmg, TargetFormat.Msi, TargetFormat.Deb)
            packageName = "IconPacks"
            packageVersion = "1.0.0"
        }
    }
}
