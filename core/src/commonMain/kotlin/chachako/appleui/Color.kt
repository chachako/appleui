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
package chachako.appleui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color

/**
 * A color data that can automatically adapt to the current UI theme appearance.
 * To retrieve the corresponding color adapted to the current appearance, call [DynamicColor.current].
 *
 * For an introduction to a dynamic color, see [Colors] for more information.
 *
 * @author Chachako
 */
@Immutable
data class DynamicColor(
  val light: Color,
  val dark: Color = light,
  val elevatedLight: Color = light,
  val elevatedDark: Color = dark,
  val highContrastLight: Color = light,
  val highContrastDark: Color = dark,
  val highContrastElevatedLight: Color = elevatedLight,
  val highContrastElevatedDark: Color = elevatedDark
)

/**
 * Returns a color that adapts to the current theme appearance.
 *
 * The result is based on [AppleUiTheme.appearance], [AppleUiTheme.highContrast]
 * and [LocalVisualLevel].
 */
val DynamicColor.current: Color
  @Composable
  @ReadOnlyComposable
  get() = AppleUiTheme.run {
    when (appearance) {
      Appearance.Light -> when (LocalVisualLevel.current) {
        VisualLevel.Base -> if (highContrast) highContrastLight else light
        VisualLevel.Elevated -> if (highContrast) highContrastElevatedLight else elevatedLight
      }
      Appearance.Dark -> when (LocalVisualLevel.current) {
        VisualLevel.Base -> if (highContrast) highContrastDark else dark
        VisualLevel.Elevated -> if (highContrast) highContrastElevatedDark else elevatedDark
      }
    }
  }

/**
 * Converts a [Color] to a [DynamicColor] with given options. If the parameters are all defaults
 * then this is a **static** ~~dynamic~~ value and its color value will always be fixed.
 *
 * @author Chachako
 */
fun Color.toDynamicColor(
  light: Color = this,
  dark: Color = this,
  elevated: Color = dark,
  highContrastLight: Color = light,
  highContrastDark: Color = dark,
  highContrastElevated: Color = elevated,
): DynamicColor = DynamicColor(light, dark, elevated, highContrastLight, highContrastDark, highContrastElevated)
