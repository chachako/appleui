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
@file:Suppress("KDocUnresolvedReference", "NAME_SHADOWING")

package chachako.appleui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

/**
 * A customizable theme for Apple-style user interface, which is usually the entry point for a
 * standard Apple's UI style application implemented on Jetpack Compose, can be nested and even mixed
 * with other UI themes (e.g. [MaterialTheme](https://developer.android.com/reference/kotlin/androidx/compose/material/MaterialTheme)).
 *
 * ## Disclaimer
 *
 * This composable function provides a [content] block in which the default styles of all appleui
 * components will be affected by the attributes of this theme.
 *
 * Although this composable function allows you to modify the default style of the components in the
 * [content], this does not mean that this is recommended, as there is no such concept as customization
 * in the Apple's UI design specification, so don't make very "exaggerated" changes to the style unless
 * specifically needed, as this may go against the design specification.
 *
 * ## Retrieve
 *
 * You can use the properties provided in the [AppleUiTheme] object to retrieve the
 * corresponding values of the current theme in the [content] block:
 *
 * ```
 * AppleUiTheme(colors = Colors(
 *   label = Color.Red.toDynamicColor(),
 *   background = Color.Green.toDynamicColor())
 * ) {
 *   // Retrieve label color in the current hierarchy
 *   assert(AppleUiTheme.colors.label == Color.Red.toDynamicColor())
 *   assert(AppleUiTheme.colors.label == Color.Red.toDynamicColor())
 *
 *   // Retrieve background color in the current hierarchy
 *   assert(AppleUiTheme.colors.background == Color.Green.toDynamicColor())
 *
 *   // Set different colors of theme for the child components
 *   AppleUiTheme(colors = AppleUiTheme.colors.copy(label = Color.Blue.toDynamicColor())) {
 *     // Retrieve the modified label color in the current hierarchy
 *     assert(AppleUiTheme.colors.label == Color.Blue.toDynamicColor())
 *     assert(AppleUiTheme.colors.label != Color.Red.toDynamicColor())
 *
 *     // Retrieve the unmodified background color in the current hierarchy
 *     assert(AppleUiTheme.colors.background == Color.Green.toDynamicColor())
 *   }
 * }
 * ```
 *
 * ## Reference
 *
 * [Human Interface Guidelines](https://developer.apple.com/design/human-interface-guidelines/)
 * [Flutter Cupertino Theme](https://api.flutter.dev/flutter/cupertino/CupertinoTheme-class.html)
 *
 * @param typography The [AppleUiTheme.typography] of the [content]. If this parameter is `null` then
 *   inherit the value provided via [CompositionLocalProvider] in the superstructure, or create a new
 *   [Typography] object if the superstructure is also not provided.
 *
 * @param colors The [AppleUiTheme.colors] of the [content]. If this parameter is `null` then inherit
 *   the value provided via [CompositionLocalProvider] in the superstructure, or create a new [Colors]
 *   object if the superstructure is also not provided.
 *
 * @param appearance The [AppleUiTheme.appearance] of the [content]. If this parameter is `null` then
 *   inherit the value provided via [CompositionLocalProvider] in the superstructure, or use the
 *   [Appearance.systemDefault] if the superstructure is also not provided.
 *
 * @param highContrast The [AppleUiTheme.highContrast] of the [content]. If this parameter is `null`
 *   then inherit the value provided via [CompositionLocalProvider] in the superstructure, or use the
 *   system setting if the superstructure is also not provided.
 *
 * @param content The block containing the components of this theme.
 *
 * @author Chachako
 */
@Composable
fun AppleUiTheme(
  typography: Typography? = null,
  colors: Colors? = null,
  appearance: Appearance? = null,
  highContrast: Boolean? = null,
  content: @Composable () -> Unit,
) {
  CompositionLocalProvider(
    LocalTypography provides typography.orDefault().let {
      // Explicitly remembering a new copy here so that we don't overwrite the values in the initial
      //   argument provided when updating.
      remember { it.copy() }.updateFrom(it)
    },
    LocalColors provides colors.orDefault().let {
      // Explicitly remembering a new copy here so that we don't overwrite the values in the initial
      //   argument provided when updating.
      remember { it.copy() }.updateFrom(it)
    },
    LocalAppearance provides appearance.orDefault(),
    LocalHighContrast provides highContrast.orSystemHighContrast(),
  ) { PlatformThemeContent(content) }
}

/**
 * Platform-specific content logic for [AppleUiTheme].
 *
 * @author Chachako
 */
@Composable
internal expect fun PlatformThemeContent(content: @Composable () -> Unit)

/**
 * The object class used to retrieve the state values of the current theme from any composable-hierarchy.
 *
 * @author Chachako
 */
object AppleUiTheme {

  /**
   * Retrieves the [Typography] of the current theme at the call site's position in the hierarchy.
   * If the [Typography] is not provided in the superstructure, the new [Typography] will be created.
   */
  val typography: Typography
    @Composable
    @ReadOnlyComposable
    get() = LocalTypography.current.orDefault()

  /**
   * Retrieves the [Colors] of the current theme at the call site's position in the hierarchy.
   * If the [Colors] is not provided in the superstructure, the new [Colors] will be created.
   *
   * ## Description
   *
   * The color values of this property are affected by [appearance], [highContrast] and [LocalVisualLevel]
   * properties, a process called adaptive, see [DynamicColor.current] for more details.
   *
   * ## Example
   * ```
   * AppleUiTheme(
   *   appearance = Appearance.Light,
   *   colors = Colors(
   *     label = DynamicColor(
   *       light = Color.Blue,
   *       dark = Color.Red,
   *       elevatedDark = Color.Green,
   *     ),
   *   )
   * ) {
   *   // The default label color in light themes at normal visual level is blue
   *   assert(AppleUiTheme.appearance == Appearance.Light)
   *   assert(AppleUiTheme.visualLevel == VisualLevel.Base)
   *   assert(AppleUiTheme.colors.label == Color.Blue.toDynamicColor())
   *
   *   // Provide a theme with dark appearance in the lower hierarchy
   *   AppleUiTheme(appearance = Appearance.Dark) {
   *     Column {
   *       // The label color in dark themes at normal visual level is now red
   *       assert(AppleUiTheme.appearance == Appearance.Dark)
   *       assert(AppleUiTheme.visualLevel == VisualLevel.Base)
   *       assert(AppleUiTheme.colors.label == Color.Red.toDynamicColor())
   *
   *       // Provide the elevated visual level in the lower hierarchy
   *       CompositionLocalProvider(LocalVisualLevel provides VisualLevel.Elevated) {
   *         // The label color in dark themes at elevated visual level is now green
   *         assert(AppleUiTheme.appearance == Appearance.Dark)
   *         assert(AppleUiTheme.visualLevel == VisualLevel.Elevated)
   *         assert(AppleUiTheme.colors.label == Color.Green.toDynamicColor())
   *       }
   *     }
   *   }
   * }
   * ```
   */
  val colors: Colors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current.orDefault()

  /**
   * Retrieves the [Appearance] of the current theme at the call site's position in the hierarchy.
   * If the [Appearance] is not provided in the superstructure, the [Appearance.systemDefault] will
   * be returned.
   *
   * ## Description
   *
   * The [colors] are all affected by this property, a process called adaptive, see [DynamicColor.current]
   * for more details.
   *
   * ## Example
   * ```
   * AppleUiTheme(
   *   appearance = Appearance.Light,
   *   colors = Colors(label = DynamicColor(
   *     light = Color.Blue,
   *     dark = Color.Red,
   *   )),
   * ) {
   *   // The current theme's default color scheme is light
   *   assert(AppleUiTheme.appearance == Appearance.Light)
   *   assert(AppleUiTheme.colors.label == Color.Blue.toDynamicColor())
   *
   *   // Provide a theme with new appearance in the lower hierarchy
   *   AppleUiTheme(appearance = Appearance.Dark) {
   *     Column {
   *       // The current theme's default color scheme is now dark
   *       assert(AppleUiTheme.appearance == Appearance.Dark)
   *       assert(AppleUiTheme.colors.label == Color.Red.toDynamicColor())
   *     }
   *   }
   * }
   * ```
   */
  val appearance: Appearance
    @Composable
    @ReadOnlyComposable
    get() = LocalAppearance.current.orDefault()

  /**
   * Retrieves whether the current theme has taken high contrast at the call site's position
   * in the hierarchy. If high contrast is not explicitly set in the superstructure, this value
   * will always be the default.
   *
   * ## Important
   *
   * The default value of this property depends on the platform, for example, the user sets the
   * contrast by selecting the "Increase Contrast" option in `Accessibility > Display` in the
   * "System Preferences" on **macOS**, or in `Accessibility > Display & Text Size` in the
   * "Settings" app on **iOS**.
   *
   * For information about using color and contrast in your application's theme, see
   * [Color and Contrast](https://developer.apple.com/design/human-interface-guidelines/accessibility/overview/color-and-contrast).
   *
   * ## Description
   *
   * The [colors] are all affected by this property, a process called adaptive, see [DynamicColor.current]
   * for more details.
   *
   * ## Example
   * ```
   * AppleUiTheme(
   *   highContrast = true,
   *   colors = Colors(
   *     label = DynamicColor(
   *       light = Color.Blue,
   *       highContrastLight = Color.Red,
   *     )
   *   ),
   *   appearance = Appearance.Light,
   * ) {
   *   // The current theme's default color scheme is now high contrast
   *   assert(AppleUiTheme.highContrast == true)
   *   assert(AppleUiTheme.colors.label == Color.Red.toDynamicColor())
   *
   *   // Provide a theme with default contrast in the lower hierarchy
   *   AppleUiTheme(highContrast = false) {
   *     // The current theme's default color scheme is now default contrast
   *     assert(AppleUiTheme.highContrast == false)
   *     assert(AppleUiTheme.colors.label == Color.Blue.toDynamicColor())
   *   }
   * }
   * ```
   */
  val highContrast: Boolean
    @Composable
    @ReadOnlyComposable
    get() = LocalHighContrast.current.orSystemHighContrast()
}

/**
 * Returns a boolean value indicating whether this theme's [appearance] is light.
 *
 * ## Example
 *
 * ```
 * AppleUiTheme(appearance = Appearance.Light) {
 *   assert(AppleUiTheme.appearance.isLight == true)
 * }
 * ```
 *
 * @see ColorScheme.Light
 */
val AppleUiTheme.isLight: Boolean
  @Composable
  @ReadOnlyComposable
  inline get() = appearance == Appearance.Light

/**
 * Returns a boolean value indicating whether this theme's [appearance] is dark.
 *
 * ## Example
 *
 * ```
 * AppleUiTheme(appearance = Appearance.Dark) {
 *   assert(AppleUiTheme.appearance.isDark == true)
 * }
 * ```
 *
 * @see ColorScheme.Dark
 */
val AppleUiTheme.isDark: Boolean
  @Composable
  @ReadOnlyComposable
  inline get() = appearance == Appearance.Dark
