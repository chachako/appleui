package com.rinorz.appleui

import androidx.compose.material.Colors
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.structuralEqualityPolicy
import androidx.compose.ui.graphics.Color

/**
 * Color system that conforms to iOS UI Design specifications.
 *
 * ## Suggestion
 *
 * iOS offers a range of standard colors for different platforms with dynamic adaptability, so use
 * these colors when choosing app tint colors that look great individually and in combination, on
 * both light and dark backgrounds.
 *
 * **Don’t hard-code system color values in your app.** In other UI design systems, you may be
 * used to using hard-coded color values, but in the Apple's UI design system, using the built-in
 * flexible color system is the best option.
 *
 * **Don’t redefine the semantic meanings of dynamic system colors.** To give people a consistent
 * experience and ensure that your interface looks great in all contexts, use dynamic system colors
 * as intended.
 *
 * **Don’t try to replicate dynamic system colors.** Dynamic system colors may fluctuate from release
 * to release, based on a variety of environmental variables. Instead of trying to create custom
 * colors that match the system colors, use the dynamic system colors.
 *
 * ## References
 *
 * - [Human Interface Guidelines](https://developer.apple.com/design/human-interface-guidelines/ios/visual-design/color/)
 * - [Flutter Cupertino Colors](https://api.flutter.dev/flutter/cupertino/CupertinoColors-class.html)
 *
 * @author RinOrz
 */
@Stable
actual class Colors(
  accountColor: DynamicColor,
  labelColors: QuadrupleColors,
  fillColors: QuadrupleColors,
  standardColors: StandardColors,
  placeholderText: DynamicColor,
  backgroundColors: TripleColors,
  groupedBackgroundColors: TripleColors,
  separator: DynamicColor,
  opaqueSeparator: DynamicColor,
  link: DynamicColor,
) {

  /**
   * A color that reflects the accent color of the application.
   *
   * The accent color is a broad theme color applied to components. Such as buttons, selected tabs and
   * your own chat bubbles.
   *
   * ![Button](https://raw.githubusercontent.com/rinorz/appleui/main/art/images/button_account_color.png)
   */
  var accountColor: DynamicColor by mutableStateOf(accountColor, structuralEqualityPolicy())
    internal set

  /**
   * A color group that reflects the text label colors of the application.
   *
   * Equivalent to [Label Colors](https://developer.apple.com/documentation/uikit/uicolor/ui_element_colors#label-colors).
   *
   * ## Explains
   *
   * - [QuadrupleColors.primary] is a color for text labels that contain primary content.
   * - [QuadrupleColors.secondary] is a color for text labels that contain secondary content.
   * - [QuadrupleColors.tertiary] is a color for text labels that contain tertiary content.
   * - [QuadrupleColors.quaternary] is a color for text labels that contain quaternary content.
   */
  var labelColors: QuadrupleColors by mutableStateOf(labelColors, structuralEqualityPolicy())
    internal set

  /**
   * A color group that reflects the fill colors of the application.
   *
   * Equivalent to [Fill Colors](https://developer.apple.com/documentation/uikit/uicolor/ui_element_colors#fill-colors).
   *
   * ## Explains
   *
   * - [QuadrupleColors.primary] is an overlay fill color for thin and small shapes.
   * - [QuadrupleColors.secondary] is an overlay fill color for medium-size shapes.
   * - [QuadrupleColors.tertiary] is an overlay fill color for large shapes.
   * - [QuadrupleColors.quaternary] is an overlay fill color for large areas that contain complex content.
   */
  var fillColors: QuadrupleColors by mutableStateOf(fillColors, structuralEqualityPolicy())
    internal set

  /**
   * A color group that reflects the standard colors of the application.
   *
   * Equivalent to [Standard Colors](https://developer.apple.com/documentation/uikit/uicolor/standard_colors).
   */
  var standardColors: StandardColors by mutableStateOf(standardColors, structuralEqualityPolicy())
    internal set

  /**
   * The color for placeholder text in components.
   *
   * Equivalent to [UIColor.placeholderText](https://developer.apple.com/documentation/uikit/uicolor/3173134-placeholdertext).
   */
  var placeholderText: DynamicColor by mutableStateOf(placeholderText, structuralEqualityPolicy())
    internal set

  /**
   * A color group that reflects the standard background colors of the application.
   *
   * Equivalent to [Standard Content Background Colors](https://developer.apple.com/documentation/uikit/uicolor/ui_element_colors#standard-content-background-colors).
   *
   * ## Explains
   *
   * - [TripleColors.primary] is a color for the main background of your interface.
   * - [TripleColors.secondary] is a color for content layered on top of the main background.
   * - [TripleColors.tertiary] is a color for content layered on top of secondary backgrounds.
   */
  var backgroundColors: TripleColors by mutableStateOf(backgroundColors, structuralEqualityPolicy())
    internal set

  /**
   * A color group that reflects the grouped background colors of the application.
   *
   * Equivalent to [Grouped Content Background Colors](https://developer.apple.com/documentation/uikit/uicolor/ui_element_colors#grouped-content-background-colors).
   *
   * ## Explains
   *
   * - [TripleColors.primary] is a color for the main background of your grouped interface.
   *
   * - [TripleColors.secondary] is a color for content layered on top of the main background of your
   *   grouped interface.
   *
   * - [TripleColors.tertiary] is a color for content layered on top of secondary backgrounds of your
   *   grouped interface.
   */
  var groupedBackgroundColors: TripleColors by mutableStateOf(groupedBackgroundColors, structuralEqualityPolicy())
    internal set

  /**
   * The color for thin borders or divider lines that allows some underlying content to be visible.
   *
   * Equivalent to [UIColor.separator](https://developer.apple.com/documentation/uikit/uicolor/3173139-separator).
   */
  var separator: DynamicColor by mutableStateOf(separator, structuralEqualityPolicy())
    internal set

  /**
   * The color for borders or divider lines that hide any underlying content.
   *
   * Equivalent to [UIColor.opaqueSeparator](https://developer.apple.com/documentation/uikit/uicolor/3173133-opaqueseparator).
   */
  var opaqueSeparator: DynamicColor by mutableStateOf(opaqueSeparator, structuralEqualityPolicy())
    internal set

  /**
   * The color for links.
   *
   * Equivalent to [UIColor.link](https://developer.apple.com/documentation/uikit/uicolor/3173132-link).
   */
  var link: DynamicColor by mutableStateOf(link, structuralEqualityPolicy())
    internal set

  /**
   * Represents a color group with three different levels of color data.
   *
   * @param primary for the overall view.
   * @param secondary for grouping content or elements within the overall view.
   * @param tertiary for grouping content or elements within secondary elements.
   *
   * @author RinOrz
   */
  @Immutable
  data class TripleColors(
    val primary: DynamicColor,
    val secondary: DynamicColor,
    val tertiary: DynamicColor,
  )

  /**
   * Represents a color group with four different levels of color data.
   *
   * @param primary for the overall view.
   * @param secondary for grouping content or elements within the overall view.
   * @param tertiary for grouping content or elements within secondary elements.
   * @param quaternary for grouping content or elements within tertiary elements.
   *
   * @author RinOrz
   */
  @Immutable
  data class QuadrupleColors(
    val primary: DynamicColor,
    val secondary: DynamicColor,
    val tertiary: DynamicColor,
    val quaternary: DynamicColor,
  )

  /**
   * Provides standard dynamic color objects for specific shades, such as red, blue, green, black,
   * white, and more.
   *
   * The difference between these color values and the ones provided in [Color.Companion] is that
   * these colors are dynamic, while the ones in [Color.Companion] are fixed, in other words, these
   * colors automatically adapt to the UI environment.
   *
   * Equivalent to [Standard Colors](https://developer.apple.com/documentation/uikit/uicolor/standard_colors).
   *
   * @param red A red color that automatically adapts to the current UI environment.
   * @param orange An orange color that automatically adapts to the current UI environment.
   * @param yellow A yellow color that automatically adapts to the current UI environment.
   * @param green A green color that automatically adapts to the current UI environment.
   * @param mint A mint color that automatically adapts to the current UI environment.
   * @param teal A teal color that automatically adapts to the current UI environment.
   * @param cyan A cyan color that automatically adapts to the current UI environment.
   * @param blue A blue color that automatically adapts to the current UI environment.
   * @param purple A purple color that automatically adapts to the current UI environment.
   * @param pink A pink color that automatically adapts to the current UI environment.
   * @param brown A brown color that automatically adapts to the current UI environment.
   *
   * @param gray A standard base gray color that adapts to the current UI environment.
   * @param gray2 A second-level shade of gray that adapts to the current UI environment.
   * @param gray3 A third-level shade of gray that adapts to the current UI environment.
   * @param gray4 A fourth-level shade of gray that adapts to the current UI environment.
   * @param gray5 A fifth-level shade of gray that adapts to the current UI environment.
   * @param gray6 A sixth-level shade of gray that adapts to the current UI environment.
   *
   * @author RinOrz
   */
  @Immutable
  data class StandardColors(
    val red: DynamicColor,
    val orange: DynamicColor,
    val yellow: DynamicColor,
    val green: DynamicColor,
    val mint: DynamicColor,
    val teal: DynamicColor,
    val cyan: DynamicColor,
    val blue: DynamicColor,
    val indigo: DynamicColor,
    val purple: DynamicColor,
    val pink: DynamicColor,
    val brown: DynamicColor,

    val gray: DynamicColor,
    val gray2: DynamicColor,
    val gray3: DynamicColor,
    val gray4: DynamicColor,
    val gray5: DynamicColor,
    val gray6: DynamicColor,
  )

  actual companion object {
    /**
     * The default [Colors] in the device's light color appearance.
     */
    actual val LightDefault: Colors
      get() = TODO("Not yet implemented")
  }
}

/**
 * A color data that will automatically adapt to the current UI environment.
 *
 * @see Colors
 * @author RinOrz
 */
@Immutable data class DynamicColor(
  val default: Color,
  val elevated: Color,
  val highContrast: Color,
  val highContrastElevated: Color,
)