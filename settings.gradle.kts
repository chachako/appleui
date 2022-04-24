/*
 * Copyright (c) 2022. RinOrz
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    https://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * To use the SF Symbols (icons) in Apple's design, you must also abide by
 * the terms:
 * 
 *    All SF Symbols shall be considered to be system-provided images as 
 *    defined in the Xcode and Apple SDKs license agreements and are subject 
 *    to the terms and conditions set forth therein:
 * 
 *       https://developer.apple.com/support/terms/
 * 
 *    You may not use SF Symbols — or glyphs that are substantially or 
 *    confusingly similar — in your app icons, logos, or any other 
 *    trademark-related use. Apple reserves the right to review and, in its 
 *    sole discretion, require modification or discontinuance of use of any 
 *    Symbol used in violation of the foregoing restrictions, and you agree 
 *    to promptly comply with any such request.
 * 
 * In addition, if you modified the project, your code file must contain the
 * URL of the original project: https://github.com/RinOrz/appleui
 */
rootProject.name = "appleui"

pluginManagement {
  repositories {
    maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    maven("https://s01.oss.sonatype.org/content/repositories/snapshots")
    google()
    mavenCentral()
    gradlePluginPortal()
  }
}

plugins {
  id("com.meowool.gradle.toolkit") version "0.1.1-SNAPSHOT"
}

buildscript {
  configurations.all {
    resolutionStrategy {
      cacheChangingModulesFor(2, TimeUnit.DAYS)
      eachDependency {
        // Force Kotlin's version for all dependencies
        if (requested.group == "org.jetbrains.kotlin") useVersion("1.6.10")
      }
    }
  }
}

gradleToolkitWithMeowoolSpec(spec = {
  licenseHeader = rootProject.projectDir.resolve("LICENSE").readLines().joinToString(
    separator = "\n",
    prefix = "/*\n",
    postfix = "\n */"
  ) { " * $it" }
})

importProjects(rootDir)

// Only set in the CI environment, waiting the issue to be fixed:
// https://youtrack.jetbrains.com/issue/KT-48291
extra["kotlin.mpp.enableGranularSourceSetsMetadata"] = true
