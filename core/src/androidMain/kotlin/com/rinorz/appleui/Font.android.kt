package com.rinorz.appleui

import androidx.compose.runtime.Stable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import com.rinorz.appleui.R

/**
 * This object provides some of Apple's font type families, which are default for iOS, iPadOS, macOS
 * and tvOS systems.
 *
 * See [Apple Fonts](https://developer.apple.com/fonts/) for more information.
 *
 * @author RinOrz
 */
actual object AppleFontFamily {

  /**
   * The "San Francisco Pro Display" font family for type at large display sizes.
   *
   * The detailed difference with [SFProText] can be seen in the image below:
   *
   * ![Display vs Text](https://raw.githubusercontent.com/rinorz/appleui/main/art/images/display_vs_text_font_family.png)
   */
  @Stable
  val SFProDisplay: FontFamily = FontFamily(
    Font(R.font.sf_pro_display_ultralight, AppleFontWeight.UltraLight, FontStyle.Normal),
    Font(R.font.sf_pro_display_ultralightitalic, AppleFontWeight.UltraLight, FontStyle.Italic),
    Font(R.font.sf_pro_display_thin, AppleFontWeight.Thin, FontStyle.Normal),
    Font(R.font.sf_pro_display_thinitalic, AppleFontWeight.Thin, FontStyle.Italic),
    Font(R.font.sf_pro_display_light, AppleFontWeight.Light, FontStyle.Normal),
    Font(R.font.sf_pro_display_lightitalic, AppleFontWeight.Light, FontStyle.Italic),
    Font(R.font.sf_pro_display_regular, AppleFontWeight.Regular, FontStyle.Normal),
    Font(R.font.sf_pro_display_regularitalic, AppleFontWeight.Regular, FontStyle.Italic),
    Font(R.font.sf_pro_display_medium, AppleFontWeight.Medium, FontStyle.Normal),
    Font(R.font.sf_pro_display_mediumitalic, AppleFontWeight.Medium, FontStyle.Italic),
    Font(R.font.sf_pro_display_semibold, AppleFontWeight.Semibold, FontStyle.Normal),
    Font(R.font.sf_pro_display_semibolditalic, AppleFontWeight.Semibold, FontStyle.Italic),
    Font(R.font.sf_pro_display_bold, AppleFontWeight.Bold, FontStyle.Normal),
    Font(R.font.sf_pro_display_bolditalic, AppleFontWeight.Bold, FontStyle.Italic),
    Font(R.font.sf_pro_display_heavy, AppleFontWeight.Heavy, FontStyle.Normal),
    Font(R.font.sf_pro_display_heavyitalic, AppleFontWeight.Heavy, FontStyle.Italic),
    Font(R.font.sf_pro_display_black, AppleFontWeight.Black, FontStyle.Normal),
    Font(R.font.sf_pro_display_blackitalic, AppleFontWeight.Black, FontStyle.Italic),
  )

  /**
   * The "San Francisco Pro Text" font family that is more readable than [SFProDisplay].
   *
   * The detailed difference with [SFProDisplay] can be seen in the image below:
   *
   * ![Display vs Text](https://raw.githubusercontent.com/rinorz/appleui/main/art/images/display_vs_text_font_family.png)
   */
  @Stable
  val SFProText: FontFamily = FontFamily(
    Font(R.font.sf_pro_text_ultralight, AppleFontWeight.UltraLight, FontStyle.Normal),
    Font(R.font.sf_pro_text_ultralightitalic, AppleFontWeight.UltraLight, FontStyle.Italic),
    Font(R.font.sf_pro_text_thin, AppleFontWeight.Thin, FontStyle.Normal),
    Font(R.font.sf_pro_text_thinitalic, AppleFontWeight.Thin, FontStyle.Italic),
    Font(R.font.sf_pro_text_light, AppleFontWeight.Light, FontStyle.Normal),
    Font(R.font.sf_pro_text_lightitalic, AppleFontWeight.Light, FontStyle.Italic),
    Font(R.font.sf_pro_text_regular, AppleFontWeight.Regular, FontStyle.Normal),
    Font(R.font.sf_pro_text_regularitalic, AppleFontWeight.Regular, FontStyle.Italic),
    Font(R.font.sf_pro_text_medium, AppleFontWeight.Medium, FontStyle.Normal),
    Font(R.font.sf_pro_text_mediumitalic, AppleFontWeight.Medium, FontStyle.Italic),
    Font(R.font.sf_pro_text_semibold, AppleFontWeight.Semibold, FontStyle.Normal),
    Font(R.font.sf_pro_text_semibolditalic, AppleFontWeight.Semibold, FontStyle.Italic),
    Font(R.font.sf_pro_text_bold, AppleFontWeight.Bold, FontStyle.Normal),
    Font(R.font.sf_pro_text_bolditalic, AppleFontWeight.Bold, FontStyle.Italic),
    Font(R.font.sf_pro_text_heavy, AppleFontWeight.Heavy, FontStyle.Normal),
    Font(R.font.sf_pro_text_heavyitalic, AppleFontWeight.Heavy, FontStyle.Italic),
    Font(R.font.sf_pro_text_black, AppleFontWeight.Black, FontStyle.Normal),
    Font(R.font.sf_pro_text_blackitalic, AppleFontWeight.Black, FontStyle.Italic),
  )
}