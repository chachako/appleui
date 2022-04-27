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
@file:Suppress("NO_ACTUAL_FOR_EXPECT", "KDocUnresolvedReference", "SpellCheckingInspection")

package com.rinorz.appleui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * Color system that conforms to Apple's user interface design specifications.
 *
 * ## Suggestions
 *
 * Apple offers a range of dynamically adaptable standard colors for different platforms, so use
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
 * to release. Instead of trying to create custom colors that match the system colors, use the dynamic
 * system colors.
 *
 * ## References
 *
 * - [Human Interface Guidelines for iOS](https://developer.apple.com/design/human-interface-guidelines/ios/visual-design/color/)
 * - [Human Interface Guidelines for macOS](https://developer.apple.com/design/human-interface-guidelines/macos/visual-design/color/)
 * - [SwiftUI Color](https://developer.apple.com/documentation/swiftui/color)
 * - [Flutter Cupertino Colors](https://api.flutter.dev/flutter/cupertino/CupertinoColors-class.html)
 *
 * @param accent Initial value of [Colors.accent]
 * @param active Initial value of [Colors.active]
 * @param label Initial value of [Colors.label]
 * @param label2 Initial value of [Colors.label2]
 * @param label3 Initial value of [Colors.label3]
 * @param label4 Initial value of [Colors.label4]
 * @param placeholderText Initial value of [Colors.placeholderText]
 * @param link Initial value of [Colors.link]
 * @param fill Initial value of [Colors.fill]
 * @param fill2 Initial value of [Colors.fill2]
 * @param fill3 Initial value of [Colors.fill3]
 * @param fill4 Initial value of [Colors.fill4]
 * @param background Initial value of [Colors.background]
 * @param background2 Initial value of [Colors.background2]
 * @param background3 Initial value of [Colors.background3]
 * @param groupedBackground Initial value of [Colors.groupedBackground]
 * @param groupedBackground2 Initial value of [Colors.groupedBackground2]
 * @param groupedBackground3 Initial value of [Colors.groupedBackground3]
 * @param separator Initial value of [Colors.separator]
 * @param separatorOpaque Initial value of [Colors.separatorOpaque]
 * @param blue Initial value of [Colors.blue]
 * @param brown Initial value of [Colors.brown]
 * @param cyan Initial value of [Colors.cyan]
 * @param green Initial value of [Colors.green]
 * @param indigo Initial value of [Colors.indigo]
 * @param mint Initial value of [Colors.mint]
 * @param orange Initial value of [Colors.orange]
 * @param pink Initial value of [Colors.pink]
 * @param purple Initial value of [Colors.purple]
 * @param red Initial value of [Colors.red]
 * @param teal Initial value of [Colors.teal]
 * @param yellow Initial value of [Colors.yellow]
 * @param gray Initial value of [Colors.gray]
 * @param gray2 Initial value of [Colors.gray2]
 * @param gray3 Initial value of [Colors.gray3]
 * @param gray4 Initial value of [Colors.gray4]
 * @param gray5 Initial value of [Colors.gray5]
 * @param gray6 Initial value of [Colors.gray6]
 *
 * @author RinOrz
 */
@Stable
class Colors(
  accent: DynamicColor = DefaultColors.accent,
  active: DynamicColor = DefaultColors.active,
  label: DynamicColor = DefaultColors.label,
  label2: DynamicColor = DefaultColors.label2,
  label3: DynamicColor = DefaultColors.label3,
  label4: DynamicColor = DefaultColors.label4,
  placeholderText: DynamicColor = DefaultColors.placeholderText,
  link: DynamicColor = DefaultColors.link,
  fill: DynamicColor = DefaultColors.fill,
  fill2: DynamicColor = DefaultColors.fill2,
  fill3: DynamicColor = DefaultColors.fill3,
  fill4: DynamicColor = DefaultColors.fill4,
  background: DynamicColor = DefaultColors.background,
  background2: DynamicColor = DefaultColors.background2,
  background3: DynamicColor = DefaultColors.background3,
  groupedBackground: DynamicColor = DefaultColors.groupedBackground,
  groupedBackground2: DynamicColor = DefaultColors.groupedBackground2,
  groupedBackground3: DynamicColor = DefaultColors.groupedBackground3,
  separator: DynamicColor = DefaultColors.separator,
  separatorOpaque: DynamicColor = DefaultColors.separatorOpaque,
  blue: DynamicColor = DefaultColors.blue,
  brown: DynamicColor = DefaultColors.brown,
  cyan: DynamicColor = DefaultColors.cyan,
  green: DynamicColor = DefaultColors.green,
  indigo: DynamicColor = DefaultColors.indigo,
  mint: DynamicColor = DefaultColors.mint,
  orange: DynamicColor = DefaultColors.orange,
  pink: DynamicColor = DefaultColors.pink,
  purple: DynamicColor = DefaultColors.purple,
  red: DynamicColor = DefaultColors.red,
  teal: DynamicColor = DefaultColors.teal,
  yellow: DynamicColor = DefaultColors.yellow,
  gray: DynamicColor = DefaultColors.gray,
  gray2: DynamicColor = DefaultColors.gray2,
  gray3: DynamicColor = DefaultColors.gray3,
  gray4: DynamicColor = DefaultColors.gray4,
  gray5: DynamicColor = DefaultColors.gray5,
  gray6: DynamicColor = DefaultColors.gray6,
) {

  /**
   * A color that reflects the accent color of the application.
   *
   * This color is a broad theme color applied to components. Such as buttons, selected tabs and your
   * own chat bubbles.
   *
   * ![Button](https://raw.githubusercontent.com/rinorz/appleui/main/art/images/button_account_color.png)
   */
  var accent: DynamicColor by mutableStateOf(accent)
    internal set

  /**
   * A color that reflects the active color of the application.
   *
   * This color is usually used to indicate active accents such as the switch in its on state and some
   * accent buttons such as the call button and Apple Map's 'Go' button.
   *
   * ![Button](https://raw.githubusercontent.com/rinorz/appleui/main/art/images/button_account_color.png)
   */
  var active: DynamicColor by mutableStateOf(active)
    internal set

  /**
   * The color for text labels that contain primary content.
   *
   * Equivalent to [UIColor.label](https://developer.apple.com/documentation/uikit/uicolor/3173131-label).
   */
  var label: DynamicColor by mutableStateOf(label)
    internal set

  /**
   * The color for text labels that contain secondary content.
   *
   * This is used for the text of a label of lesser importance than a primary label, such as a label
   * used to represent a subheading or additional information.
   *
   * Equivalent to [UIColor.secondaryLabel](https://developer.apple.com/documentation/uikit/uicolor/3173136-secondarylabel).
   */
  var label2: DynamicColor by mutableStateOf(label2)
    internal set

  /**
   * The color for text labels that contain tertiary content.
   *
   * This is used for the text of a label of lesser importance than a secondary label such as a label
   * used to represent disabled text.
   *
   * Equivalent to [UIColor.tertiaryLabel](https://developer.apple.com/documentation/uikit/uicolor/3173153-tertiarylabel).
   */
  var label3: DynamicColor by mutableStateOf(label3)
    internal set

  /**
   * The color for text labels that contain quaternary content.
   *
   * This is used for the text of a label of lesser importance than a tertiary label such as watermark text.
   *
   * Equivalent to [UIColor.quaternaryLabel](https://developer.apple.com/documentation/uikit/uicolor/3173135-quaternarylabel).
   */
  var label4: DynamicColor by mutableStateOf(label4)
    internal set

  /**
   * The color for placeholder text in components.
   *
   * Equivalent to [UIColor.placeholderText](https://developer.apple.com/documentation/uikit/uicolor/3173134-placeholdertext).
   */
  var placeholderText: DynamicColor by mutableStateOf(placeholderText)
    internal set

  /**
   * The specified color for links.
   *
   * Equivalent to [UIColor.link](https://developer.apple.com/documentation/uikit/uicolor/3173132-link).
   */
  var link: DynamicColor by mutableStateOf(link)
    internal set

  /**
   * An overlay fill color for thin and small shapes, such as the track of a slider.
   *
   * The fill color incorporate transparency to allow the background color to show through.
   *
   * Equivalent to [UIColor.systemFill](https://developer.apple.com/documentation/uikit/uicolor/3255070-systemfill).
   */
  var fill: DynamicColor by mutableStateOf(fill)
    internal set

  /**
   * An overlay fill color for medium-size shapes, such as the background of a switch.
   *
   * The fill color incorporate transparency to allow the background color to show through.
   *
   * Equivalent to [UIColor.secondarySystemFill](https://developer.apple.com/documentation/uikit/uicolor/3255069-secondarysystemfill).
   */
  var fill2: DynamicColor by mutableStateOf(fill2)
    internal set

  /**
   * An overlay fill color for large shapes, such as input fields, search bars, or buttons.
   *
   * The fill color incorporate transparency to allow the background color to show through.
   *
   * Equivalent to [UIColor.tertiarySystemFill](https://developer.apple.com/documentation/uikit/uicolor/3255076-tertiarysystemfill).
   */
  var fill3: DynamicColor by mutableStateOf(fill3)
    internal set

  /**
   * An overlay fill color for large areas that contain complex content, such as an expanded table cell.
   *
   * The fill color incorporate transparency to allow the background color to show through.
   *
   * Equivalent to [UIColor.quaternarySystemFill](https://developer.apple.com/documentation/uikit/uicolor/3255068-quaternarysystemfill).
   */
  var fill4: DynamicColor by mutableStateOf(fill4)
    internal set

  /**
   * The color for the main background of your interface.
   *
   * Equivalent to [UIColor.systemBackground](https://developer.apple.com/documentation/uikit/uicolor/3173140-systembackground).
   */
  var background: DynamicColor by mutableStateOf(background)
    internal set

  /**
   * The color for content layered on top of the main background.
   *
   * Equivalent to [UIColor.secondarySystemBackground](https://developer.apple.com/documentation/uikit/uicolor/3173137-secondarysystembackground).
   */
  var background2: DynamicColor by mutableStateOf(background2)
    internal set

  /**
   * The color for content layered on top of secondary backgrounds.
   *
   * Equivalent to [UIColor.tertiarySystemBackground](https://developer.apple.com/documentation/uikit/uicolor/3173154-tertiarysystembackground).
   */
  var background3: DynamicColor by mutableStateOf(background3)
    internal set

  /**
   * The color for the main background of your grouped interface.
   *
   * Equivalent to [UIColor.systemGroupedBackground](https://developer.apple.com/documentation/uikit/uicolor/3173145-systemgroupedbackground).
   */
  var groupedBackground: DynamicColor by mutableStateOf(groupedBackground)
    internal set

  /**
   * The color for content layered on top of the main background of your grouped interface.
   *
   * Equivalent to [UIColor.secondarySystemGroupedBackground](https://developer.apple.com/documentation/uikit/uicolor/3173138-secondarysystemgroupedbackground).
   */
  var groupedBackground2: DynamicColor by mutableStateOf(groupedBackground2)
    internal set

  /**
   * The color for content layered on top of secondary backgrounds of your grouped interface.
   *
   * Equivalent to [UIColor.tertiarySystemGroupedBackground](https://developer.apple.com/documentation/uikit/uicolor/3173155-tertiarysystemgroupedbackground).
   */
  var groupedBackground3: DynamicColor by mutableStateOf(groupedBackground3)
    internal set

  /**
   * The color for thin borders or divider lines that allows some underlying content to be visible.
   *
   * This color may be partially transparent to allow the underlying content to show through.
   *
   * Equivalent to [UIColor.separator](https://developer.apple.com/documentation/uikit/uicolor/3173139-separator).
   */
  var separator: DynamicColor by mutableStateOf(separator)
    internal set

  /**
   * The color for borders or divider lines that hide any underlying content.
   *
   * This color is always opaque.
   *
   * Equivalent to [UIColor.opaqueSeparator](https://developer.apple.com/documentation/uikit/uicolor/3173133-opaqueseparator).
   */
  var separatorOpaque: DynamicColor by mutableStateOf(separatorOpaque)
    internal set

  /**
   * A context-dependent blue color suitable for use in UI elements.
   *
   * The difference between this color value and the [Color.Blue] is that this color is dynamically dependent
   * on the theme, whereas the value of [Color.Blue] is fixed.
   *
   * Equivalent to [Color.blue](https://developer.apple.com/documentation/swiftui/color/blue-7bh0t).
   */
  var blue: DynamicColor by mutableStateOf(blue)
    internal set

  /**
   * A context-dependent brown color suitable for use in UI elements.
   *
   * Equivalent to [Color.brown](https://developer.apple.com/documentation/swiftui/color/brown-4va5q).
   */
  var brown: DynamicColor by mutableStateOf(brown)
    internal set

  /**
   * A context-dependent cyan color suitable for use in UI elements.
   *
   * The difference between this color value and the [Color.Cyan] is that this color is dynamically dependent
   * on the theme, whereas the value of [Color.Cyan] is fixed.
   *
   * Equivalent to [Color.cyan](https://developer.apple.com/documentation/swiftui/color/cyan-7r2ra).
   */
  var cyan: DynamicColor by mutableStateOf(cyan)
    internal set

  /**
   * A context-dependent green color suitable for use in UI elements.
   *
   * The difference between this color value and the [Color.Green] is that this color is dynamically dependent
   * on the theme, whereas the value of [Color.Green] is fixed.
   *
   * Equivalent to [Color.green](https://developer.apple.com/documentation/swiftui/color/green-1xwhu).
   */
  var green: DynamicColor by mutableStateOf(green)
    internal set

  /**
   * A context-dependent indigo color suitable for use in UI elements.
   *
   * Equivalent to [Color.indigo](https://developer.apple.com/documentation/swiftui/color/indigo-9ijs7).
   */
  var indigo: DynamicColor by mutableStateOf(indigo)
    internal set

  /**
   * A context-dependent mint color suitable for use in UI elements.
   *
   * Equivalent to [Color.mint](https://developer.apple.com/documentation/swiftui/color/mint-whv5).
   */
  var mint: DynamicColor by mutableStateOf(mint)
    internal set

  /**
   * A context-dependent orange color suitable for use in UI elements.
   *
   * Equivalent to [Color.orange](https://developer.apple.com/documentation/swiftui/color/orange-2krz3).
   */
  var orange: DynamicColor by mutableStateOf(orange)
    internal set

  /**
   * A context-dependent pink color suitable for use in UI elements.
   *
   * Equivalent to [Color.pink](https://developer.apple.com/documentation/swiftui/color/pink-8xbba).
   */
  var pink: DynamicColor by mutableStateOf(pink)
    internal set

  /**
   * A context-dependent purple color suitable for use in UI elements.
   *
   * Equivalent to [Color.purple](https://developer.apple.com/documentation/swiftui/color/purple-82su7).
   */
  var purple: DynamicColor by mutableStateOf(purple)
    internal set

  /**
   * A context-dependent red color suitable for use in UI elements.
   *
   * The difference between this color value and the [Color.Red] is that this color is dynamically dependent
   * on the theme, whereas the value of [Color.Red] is fixed.
   *
   * Equivalent to [Color.red](https://developer.apple.com/documentation/swiftui/color/red-9b52j).
   */
  var red: DynamicColor by mutableStateOf(red)
    internal set

  /**
   * A context-dependent teal color suitable for use in UI elements.
   *
   * Equivalent to [Color.teal](https://developer.apple.com/documentation/swiftui/color/yellow-6cp3d).
   */
  var teal: DynamicColor by mutableStateOf(teal)
    internal set

  /**
   * A context-dependent yellow color suitable for use in UI elements.
   *
   * The difference between this color value and the [Color.Yellow] is that this color is dynamically dependent
   * on the theme, whereas the value of [Color.Yellow] is fixed.
   *
   * Equivalent to [Color.yellow](https://developer.apple.com/documentation/swiftui/color/yellow-6cp3d).
   */
  var yellow: DynamicColor by mutableStateOf(yellow)
    internal set

  /**
   * A context-dependent gray color suitable for use in UI elements.
   *
   * The difference between this color value and the [Color.Gray] is that this color is dynamically dependent
   * on the theme, whereas the value of [Color.Gray] is fixed.
   *
   * Equivalent to [Color.gray](https://developer.apple.com/documentation/uikit/uicolor/3173143-systemgray).
   */
  var gray: DynamicColor by mutableStateOf(gray)
    internal set

  /**
   * A context-dependent second-level gray color suitable for use in UI elements.
   *
   * In light theme, this color is slightly lighter than [gray]. In dark theme, this color is slightly darker
   * than [gray].
   *
   * Equivalent to [Color.gray2](https://developer.apple.com/documentation/uikit/uicolor/3255071-systemgray2).
   */
  var gray2: DynamicColor by mutableStateOf(gray2)
    internal set

  /**
   * A context-dependent third-level gray color suitable for use in UI elements.
   *
   * In light theme, this color is slightly lighter than [gray2]. In dark theme, this color is slightly darker
   * than [gray2].
   *
   * Equivalent to [Color.gray3](https://developer.apple.com/documentation/uikit/uicolor/3255072-systemgray3).
   */
  var gray3: DynamicColor by mutableStateOf(gray3)
    internal set

  /**
   * A context-dependent fourth-level gray color suitable for use in UI elements.
   *
   * In light theme, this color is slightly lighter than [gray3]. In dark theme, this color is slightly darker
   * than [gray3].
   *
   * Equivalent to [Color.gray4](https://developer.apple.com/documentation/uikit/uicolor/3255073-systemgray4).
   */
  var gray4: DynamicColor by mutableStateOf(gray4)
    internal set

  /**
   * A context-dependent fifth-level gray color suitable for use in UI elements.
   *
   * In light theme, this color is slightly lighter than [gray4]. In dark theme, this color is slightly darker
   * than [gray4].
   *
   * Equivalent to [Color.gray5](https://developer.apple.com/documentation/uikit/uicolor/3255074-systemgray5).
   */
  var gray5: DynamicColor by mutableStateOf(gray5)
    internal set

  /**
   * A context-dependent sixth-level gray color suitable for use in UI elements.
   *
   * In light theme, this color is slightly lighter than [gray5]. In dark theme, this color is slightly darker
   * than [gray5].
   *
   * Equivalent to [Color.gray6](https://developer.apple.com/documentation/uikit/uicolor/3255075-systemgray6).
   */
  var gray6: DynamicColor by mutableStateOf(gray6)
    internal set

  /**
   * Returns a copy of this [Colors] object, optionally overriding some values.
   */
  fun copy(
    accent: DynamicColor = this.accent,
    active: DynamicColor = this.active,
    label: DynamicColor = this.label,
    label2: DynamicColor = this.label2,
    label3: DynamicColor = this.label3,
    label4: DynamicColor = this.label4,
    placeholderText: DynamicColor = this.placeholderText,
    link: DynamicColor = this.link,
    fill: DynamicColor = this.fill,
    fill2: DynamicColor = this.fill2,
    fill3: DynamicColor = this.fill3,
    fill4: DynamicColor = this.fill4,
    background: DynamicColor = this.background,
    background2: DynamicColor = this.background2,
    background3: DynamicColor = this.background3,
    groupedBackground: DynamicColor = this.groupedBackground,
    groupedBackground2: DynamicColor = this.groupedBackground2,
    groupedBackground3: DynamicColor = this.groupedBackground3,
    separator: DynamicColor = this.separator,
    separatorOpaque: DynamicColor = this.separatorOpaque,
    blue: DynamicColor = this.blue,
    brown: DynamicColor = this.brown,
    cyan: DynamicColor = this.cyan,
    green: DynamicColor = this.green,
    indigo: DynamicColor = this.indigo,
    mint: DynamicColor = this.mint,
    orange: DynamicColor = this.orange,
    pink: DynamicColor = this.pink,
    purple: DynamicColor = this.purple,
    red: DynamicColor = this.red,
    teal: DynamicColor = this.teal,
    yellow: DynamicColor = this.yellow,
    gray: DynamicColor = this.gray,
    gray2: DynamicColor = this.gray2,
    gray3: DynamicColor = this.gray3,
    gray4: DynamicColor = this.gray4,
    gray5: DynamicColor = this.gray5,
    gray6: DynamicColor = this.gray6,
  ): Colors = Colors(
    accent,
    active,
    label,
    label2,
    label3,
    label4,
    placeholderText,
    link,
    fill,
    fill2,
    fill3,
    fill4,
    background,
    background2,
    background3,
    groupedBackground,
    groupedBackground2,
    groupedBackground3,
    separator,
    separatorOpaque,
    blue,
    brown,
    cyan,
    green,
    indigo,
    mint,
    orange,
    pink,
    purple,
    red,
    teal,
    yellow,
    gray,
    gray2,
    gray3,
    gray4,
    gray5,
    gray6
  )

  override fun toString(): String = """
    Colors(
      accent=$accent,
      active=$active,
      label=$label,
      label2=$label2,
      label3=$label3,
      label4=$label4,
      placeholderText=$placeholderText,
      link=$link,
      fill=$fill,
      fill2=$fill2,
      fill3=$fill3,
      fill4=$fill4,
      background=$background,
      background2=$background2,
      background3=$background3,
      groupedBackground=$groupedBackground,
      groupedBackground2=$groupedBackground2,
      groupedBackground3=$groupedBackground3,
      separator=$separator,
      separatorOpaque=$separatorOpaque,
      blue=$blue,
      brown=$brown,
      cyan=$cyan,
      green=$green,
      indigo=$indigo,
      mint=$mint,
      orange=$orange,
      pink=$pink,
      purple=$purple,
      red=$red,
      teal=$teal,
      yellow=$yellow,
      gray=$gray,
      gray2=$gray2,
      gray3=$gray3,
      gray4=$gray4,
      gray5=$gray5,
      gray6=$gray6
    )
  """.trimIndent()
}

/**
 * Default values for [Colors] in Apple's UI design on different platforms.
 *
 * @author RinOrz
 */
expect object DefaultColors {
  @Stable val accent: DynamicColor
  @Stable val active: DynamicColor
  @Stable val label: DynamicColor
  @Stable val label2: DynamicColor
  @Stable val label3: DynamicColor
  @Stable val label4: DynamicColor
  @Stable val placeholderText: DynamicColor
  @Stable val link: DynamicColor
  @Stable val fill: DynamicColor
  @Stable val fill2: DynamicColor
  @Stable val fill3: DynamicColor
  @Stable val fill4: DynamicColor
  @Stable val background: DynamicColor
  @Stable val background2: DynamicColor
  @Stable val background3: DynamicColor
  @Stable val groupedBackground: DynamicColor
  @Stable val groupedBackground2: DynamicColor
  @Stable val groupedBackground3: DynamicColor
  @Stable val separator: DynamicColor
  @Stable val separatorOpaque: DynamicColor
  @Stable val blue: DynamicColor
  @Stable val brown: DynamicColor
  @Stable val cyan: DynamicColor
  @Stable val green: DynamicColor
  @Stable val indigo: DynamicColor
  @Stable val mint: DynamicColor
  @Stable val orange: DynamicColor
  @Stable val pink: DynamicColor
  @Stable val purple: DynamicColor
  @Stable val red: DynamicColor
  @Stable val teal: DynamicColor
  @Stable val yellow: DynamicColor
  @Stable val gray: DynamicColor
  @Stable val gray2: DynamicColor
  @Stable val gray3: DynamicColor
  @Stable val gray4: DynamicColor
  @Stable val gray5: DynamicColor
  @Stable val gray6: DynamicColor
}

/**
 * Updates the internal values of the given [Colors] with values from the [other] [Colors]. This
 * allows efficiently updating a subset of [Colors], without recomposing every composable that
 * consumes values from [LocalColors].
 *
 * Because [Colors] is very wide-reaching, and used by many expensive composables in the hierarchy,
 * providing a new value to [LocalColors] causes every composable consuming [LocalColors] to recompose,
 * which is prohibitively expensive in cases such as animating one color in the theme. Instead, [Colors]
 * is internally backed by [androidx.compose.runtime.mutableStateOf], and this function mutates the
 * internal state of [this] to match values in [other]. This means that any changes will mutate the
 * internal state of [this], and only cause composables that are reading the specific changed value
 * to recompose.
 *
 * @author RinOrz
 */
internal fun Colors.updateFrom(other: Colors) = apply {
  accent = other.accent
  active = other.active
  label = other.label
  label2 = other.label2
  label3 = other.label3
  label4 = other.label4
  placeholderText = other.placeholderText
  link = other.link
  fill = other.fill
  fill2 = other.fill2
  fill3 = other.fill3
  fill4 = other.fill4
  background = other.background
  background2 = other.background2
  background3 = other.background3
  groupedBackground = other.groupedBackground
  groupedBackground2 = other.groupedBackground2
  groupedBackground3 = other.groupedBackground3
  separator = other.separator
  separatorOpaque = other.separatorOpaque
  blue = other.blue
  brown = other.brown
  cyan = other.cyan
  green = other.green
  indigo = other.indigo
  mint = other.mint
  orange = other.orange
  pink = other.pink
  purple = other.purple
  red = other.red
  teal = other.teal
  yellow = other.yellow
  gray = other.gray
  gray2 = other.gray2
  gray3 = other.gray3
  gray4 = other.gray4
  gray5 = other.gray5
  gray6 = other.gray6
}

/**
 * CompositionLocal used to pass [Colors] down the tree.
 *
 * Setting the value here is typically done as part of [AppleUiTheme], which will automatically handle
 * efficiently updating any changed colors without causing unnecessary recompositions, using
 * [Colors.updateFrom]. To retrieve the current value of this CompositionLocal, use [AppleUiTheme.colors].
 *
 * @author RinOrz
 */
internal val LocalColors: ProvidableCompositionLocal<Colors?> = staticCompositionLocalOf { null }

/**
 * Returns a new [Colors] object if this colors is `null`, otherwise it returns itself.
 */
@Composable
@ReadOnlyComposable
internal fun Colors?.orDefault(): Colors = this ?: Colors()
