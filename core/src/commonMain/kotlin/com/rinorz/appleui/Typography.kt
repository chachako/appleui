@file:Suppress("GrazieInspection", "SpellCheckingInspection", "KDocUnresolvedReference")

package com.rinorz.appleui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.sp

/**
 * Typography system that conforms to Apple's user interface design specifications.
 *
 * ## Suggestions
 *
 * **Use built-in text styles whenever possible.** The built-in text styles in the typography system
 * let you express content in ways that are visually distinct, while retaining optimal legibility.
 * For example, use the [body] text style for primary content, and use the [footnote] and [caption]
 * text styles for labels and secondary content.
 *
 * **Emphasize important information.** Use font weight, size, and color to highlight the most
 * important information in your app.
 *
 * **Minimize the number of typefaces you use in your interface.** Mixing too many different typefaces
 * can make your app seem fragmented and sloppy.
 *
 * **Make sure custom fonts are legible.** Custom typefaces are supported on iOS, but may be tough to
 * read, especially if they have stylistic attributes that make letterforms hard to discern when displayed
 * at small sizes. Unless your app has a compelling need for a custom font — such as for branding purposes
 * or to create an immersive gaming experience — it’s usually best to stick with the system fonts. Consider
 * using a custom font for display text only; if you do use it for reading or interface text, make sure it’s
 * legible, even at small sizes.
 *
 * ## References
 *
 * - [Human Interface Guidelines for iOS](https://developer.apple.com/design/human-interface-guidelines/ios/visual-design/typography/)
 * - [Human Interface Guidelines for macOS](https://developer.apple.com/design/human-interface-guidelines/macos/visual-design/typography/)
 * - [SwiftUI Font](https://developer.apple.com/documentation/swiftui/font)
 *
 * @param largeTitle Initial value of [Typography.largeTitle]
 * @param title Initial value of [Typography.title]
 * @param title2 Initial value of [Typography.title2]
 * @param title3 Initial value of [Typography.title3]
 * @param headline Initial value of [Typography.headline]
 * @param subheadline Initial value of [Typography.subheadline]
 * @param body Initial value of [Typography.body]
 * @param callout Initial value of [Typography.callout]
 * @param footnote Initial value of [Typography.footnote]
 * @param caption Initial value of [Typography.caption]
 * @param caption2 Initial value of [Typography.caption2]
 *
 * @author RinOrz
 */
@Stable
class Typography(
  largeTitle: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProDisplay,
    fontWeight = AppleFontWeight.Regular,
    fontSize = 34.sp,
    letterSpacing = 0.37.sp,
  ),
  title: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProDisplay,
    fontWeight = AppleFontWeight.Regular,
    fontSize = 28.sp,
    letterSpacing = 0.36.sp,
  ),
  title2: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProDisplay,
    fontWeight = AppleFontWeight.Regular,
    fontSize = 22.sp,
    letterSpacing = 0.35.sp,
  ),
  title3: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProDisplay,
    fontWeight = AppleFontWeight.Regular,
    fontSize = 20.sp,
    letterSpacing = 0.38.sp,
  ),
  headline: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProText,
    fontWeight = AppleFontWeight.Semibold,
    fontSize = 17.sp,
    letterSpacing = (-0.41).sp,
  ),
  subheadline: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProText,
    fontWeight = AppleFontWeight.Regular,
    fontSize = 15.sp,
    letterSpacing = (-0.24).sp,
  ),
  body: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProText,
    fontWeight = AppleFontWeight.Regular,
    fontSize = 17.sp,
    letterSpacing = (-0.41).sp,
  ),
  callout: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProText,
    fontWeight = AppleFontWeight.Regular,
    fontSize = 16.sp,
    letterSpacing = (-0.32).sp,
  ),
  footnote: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProText,
    fontWeight = AppleFontWeight.Regular,
    fontSize = 13.sp,
    letterSpacing = (-0.08).sp,
  ),
  caption: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProText,
    fontWeight = AppleFontWeight.Regular,
    fontSize = 12.sp,
  ),
  caption2: TextStyle = TextStyle(
    fontFamily = AppleFontFamily.SFProText,
    fontWeight = AppleFontWeight.Regular,
    fontSize = 11.sp,
    letterSpacing = 0.07.sp,
  ),
) {

  /**
   * The font style for large titles.
   *
   * Equivalent to [Font.TextStyle.largeTitle](https://developer.apple.com/documentation/swiftui/font/textstyle/largetitle).
   */
  var largeTitle: TextStyle by mutableStateOf(largeTitle)
    internal set

  /**
   * The font style for first level hierarchical headings.
   *
   * Equivalent to [Font.TextStyle.title](https://developer.apple.com/documentation/swiftui/font/textstyle/title).
   */
  var title: TextStyle by mutableStateOf(title)
    internal set

  /**
   * The font style for second level hierarchical headings.
   *
   * Equivalent to [Font.TextStyle.title2](https://developer.apple.com/documentation/swiftui/font/textstyle/title2).
   */
  var title2: TextStyle by mutableStateOf(title2)
    internal set

  /**
   * The font style for third level hierarchical headings.
   *
   * Equivalent to [Font.TextStyle.title3](https://developer.apple.com/documentation/swiftui/font/textstyle/title3).
   */
  var title3: TextStyle by mutableStateOf(title3)
    internal set

  /**
   * The font style for headings.
   *
   * Equivalent to [Font.TextStyle.headline](https://developer.apple.com/documentation/swiftui/font/textstyle/headline).
   */
  var headline: TextStyle by mutableStateOf(headline)
    internal set

  /**
   * The font style for subheadings.
   *
   * Equivalent to [Font.TextStyle.subheadline](https://developer.apple.com/documentation/swiftui/font/textstyle/subheadline).
   */
  var subheadline: TextStyle by mutableStateOf(subheadline)
    internal set

  /**
   * The font style for body text.
   *
   * Equivalent to [Font.TextStyle.body](https://developer.apple.com/documentation/swiftui/font/textstyle/body).
   */
  var body: TextStyle by mutableStateOf(body)
    internal set

  /**
   * The font style for callouts.
   *
   * Equivalent to [Font.TextStyle.callout](https://developer.apple.com/documentation/swiftui/font/textstyle/callout).
   */
  var callout: TextStyle by mutableStateOf(callout)
    internal set

  /**
   * The font style for footnotes.
   *
   * Equivalent to [Font.TextStyle.footnote](https://developer.apple.com/documentation/swiftui/font/textstyle/footnote).
   */
  var footnote: TextStyle by mutableStateOf(footnote)
    internal set

  /**
   * The font style for standard captions.
   *
   * Equivalent to [Font.TextStyle.caption](https://developer.apple.com/documentation/swiftui/font/textstyle/caption).
   */
  var caption: TextStyle by mutableStateOf(caption)
    internal set

  /**
   * The font style for alternate captions.
   *
   * Equivalent to [Font.TextStyle.caption2](https://developer.apple.com/documentation/swiftui/font/textstyle/caption2).
   */
  var caption2: TextStyle by mutableStateOf(caption2)
    internal set

  /**
   * Returns a copy of this [Typography] object, optionally overriding some values.
   */
  fun copy(
    largeTitle: TextStyle = this.largeTitle,
    title: TextStyle = this.title,
    title2: TextStyle = this.title2,
    title3: TextStyle = this.title3,
    headline: TextStyle = this.headline,
    subheadline: TextStyle = this.subheadline,
    body: TextStyle = this.body,
    callout: TextStyle = this.callout,
    footnote: TextStyle = this.footnote,
    caption: TextStyle = this.caption,
    caption2: TextStyle = this.caption2
  ) = Typography(largeTitle, title, title2, title3, headline, subheadline, body, callout, footnote, caption, caption2)

  override fun toString(): String = """
    Typography(
      largeTitle: $largeTitle,
      title: $title,
      title2: $title2,
      title3: $title3,
      headline: $headline,
      subheadline: $subheadline,
      body: $body,
      callout: $callout,
      footnote: $footnote,
      caption: $caption,
      caption2: $caption2
    )
  """.trimIndent()
}

/**
 * Updates the internal values of the given [Typography] with values from the [other] [Typography].
 * This allows efficiently updating a subset of [Typography], without recomposing every composable
 * that consumes values from [LocalTypography].
 *
 * Because [Typography] is very wide-reaching, and used by many expensive composables in the hierarchy,
 * providing a new value to [LocalTypography] causes every composable consuming [LocalTypography] to
 * recompose, which is prohibitively expensive in cases such as animating one color in the theme.
 * Instead, [Typography] is internally backed by [androidx.compose.runtime.mutableStateOf], and this
 * function mutates the internal state of [this] to match values in [other]. This means that any changes
 * will mutate the internal state of [this], and only cause composables that are reading the specific
 * changed value to recompose.
 *
 * @author RinOrz
 */
internal fun Typography.updateFrom(other: Typography) = apply {
  largeTitle = other.largeTitle
  title = other.title
  title2 = other.title2
  title3 = other.title3
  headline = other.headline
  subheadline = other.subheadline
  body = other.body
  callout = other.callout
  footnote = other.footnote
  caption = other.caption
  caption2 = other.caption2
}

/**
 * CompositionLocal used to pass [Typography] down the tree.
 *
 * Setting the value here is typically done as part of [AppleUiTheme], which will automatically handle
 * efficiently updating any changed colors without causing unnecessary recompositions, using
 * [Typography.updateFrom]. To retrieve the current value of this CompositionLocal, use [AppleUiTheme.typography].
 *
 * @author RinOrz
 */
internal val LocalTypography: ProvidableCompositionLocal<Typography?> = staticCompositionLocalOf { null }

/**
 * Returns a new [Typography] object if this typography is `null`, otherwise it returns itself.
 */
@Composable
@ReadOnlyComposable
internal fun Typography?.orDefault(): Typography = this ?: Typography()