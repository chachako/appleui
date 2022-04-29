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
@file:Suppress("NO_ACTUAL_FOR_EXPECT", "FunctionName")

package chachako.appleui

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

/**
 * This object provides the generic font weight corresponding to the Apple's font definition.
 *
 * ![SF Pro definition](https://raw.githubusercontent.com/chachako/appleui/main/art/images/sf_pro_weight.png)
 *
 * @author Chachako
 */
object AppleFontWeight {
  inline val UltraLight: FontWeight get() = FontWeight.W100
  inline val Thin: FontWeight get() = FontWeight.W200
  inline val Light: FontWeight get() = FontWeight.W300
  inline val Regular: FontWeight get() = FontWeight.W400
  inline val Medium: FontWeight get() = FontWeight.W500
  inline val Semibold: FontWeight get() = FontWeight.W600
  inline val Bold: FontWeight get() = FontWeight.W700
  inline val Heavy: FontWeight get() = FontWeight.W800
  inline val Black: FontWeight get() = FontWeight.W900
}

/**
 * This object provides some of Apple's font type families, which are default for iOS, iPadOS, macOS
 * and tvOS systems.
 *
 * See [Apple Fonts](https://developer.apple.com/fonts/) for more information.
 *
 * @author Chachako
 */
expect object AppleFontFamily {

  /**
   * The "SF Pro Display" font family for type at large display sizes.
   *
   * The detailed difference with [SFProText] can be seen in the image below:
   *
   * ![Display vs Text](https://raw.githubusercontent.com/chachako/appleui/main/art/images/display_vs_text_font_family.png)
   */
  @Stable
  val SFProDisplay: FontFamily

  /**
   * The "SF Pro Text" font family that is more readable than [SFProDisplay].
   *
   * The detailed difference with [SFProDisplay] can be seen in the image below:
   *
   * ![Display vs Text](https://raw.githubusercontent.com/chachako/appleui/main/art/images/display_vs_text_font_family.png)
   */
  @Stable
  val SFProText: FontFamily
}
