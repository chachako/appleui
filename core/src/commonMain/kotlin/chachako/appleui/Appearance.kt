/*
 * Copyright (c) 2022. Chachako
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
 * URL of the original project: https://github.com/chachako/appleui
 */
@file:Suppress("KDocUnresolvedReference", "SpellCheckingInspection", "NOTHING_TO_INLINE")

package chachako.appleui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf

/**
 * The possible appearance in different theme environments.
 *
 * Equivalent to [SwiftUI](https://developer.apple.com/documentation/swiftui/colorscheme).
 *
 * @see AppleUiTheme
 * @author Chachako
 */
enum class Appearance {

  /**
   * The color scheme that corresponds to a light appearance.
   *
   * Equivalent to [ColorScheme.light](https://developer.apple.com/documentation/swiftui/colorscheme/light).
   */
  Light,

  /**
   * The color scheme that corresponds to a dark appearance, aka. dark mode.
   *
   * Equivalent to [ColorScheme.dark](https://developer.apple.com/documentation/swiftui/colorscheme/dark).
   */
  Dark;

  companion object {

    /**
     * Returns the system's default appearance.
     *
     * ## Disclaimer
     *
     * This function depends on the system, and if the system does not provide a boolean value for
     * light or dark mode, the result of this function is undefined.
     *
     * @see isSystemInDarkTheme
     */
    @Composable
    @ReadOnlyComposable
    fun systemDefault(): Appearance = if (isSystemInDarkTheme()) Appearance.Dark else Appearance.Light
  }
}

/**
 * A [CompositionLocal] instance containing the current [Appearance] in the hierarchy.
 *
 * @author Chachako
 */
internal val LocalAppearance: ProvidableCompositionLocal<Appearance?> = staticCompositionLocalOf { null }

/**
 * Returns the [systemDefault] if this appearance is `null`, otherwise it returns itself.
 */
@Composable
@ReadOnlyComposable
internal inline fun Appearance?.orDefault(): Appearance = this ?: Appearance.systemDefault()
