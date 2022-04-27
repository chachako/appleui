@file:Suppress("NO_ACTUAL_FOR_EXPECT", "FunctionName")

package com.rinorz.appleui

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight

/**
 * This object provides the generic font weight corresponding to the Apple's font definition.
 *
 * ![SF Pro definition](https://raw.githubusercontent.com/rinorz/appleui/main/art/images/sf_pro_weight.png)
 *
 * @author RinOrz
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
 * @author RinOrz
 */
expect object AppleFontFamily {

  /**
   * The "SF Pro Display" font family for type at large display sizes.
   *
   * The detailed difference with [SFProText] can be seen in the image below:
   *
   * ![Display vs Text](https://raw.githubusercontent.com/rinorz/appleui/main/art/images/display_vs_text_font_family.png)
   */
  @Stable
  val SFProDisplay: FontFamily

  /**
   * The "SF Pro Text" font family that is more readable than [SFProDisplay].
   *
   * The detailed difference with [SFProDisplay] can be seen in the image below:
   *
   * ![Display vs Text](https://raw.githubusercontent.com/rinorz/appleui/main/art/images/display_vs_text_font_family.png)
   */
  @Stable
  val SFProText: FontFamily
}