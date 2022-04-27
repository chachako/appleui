@file:Suppress("KDocUnresolvedReference", "NAME_SHADOWING")

package com.rinorz.appleui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.remember

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
 * @param appearance The appearance of the [content]. If this parameter is `null` then inherit the value
 *   provided via [CompositionLocalProvider] in the upper structure, or use the [Appearance.systemDefault]
 *   if the upper structure is not provided.
 *
 * @param colors The colors of the [content]. If this parameter is `null` then inherit the value provided
 *   via [CompositionLocalProvider] in the upper structure, or create a new [Colors] object if the upper
 *   structure is not provided.
 *
 * @author RinOrz
 */
@Composable
fun AppleUiTheme(
  appearance: Appearance? = null,
  colors: Colors? = null,
  typography: Typography? = null,
  content: @Composable () -> Unit,
) {
  CompositionLocalProvider(

    LocalAppearance provides appearance.orDefault().let {
      // Explicitly remembering a new copy here so that we don't overwrite the values in the initial
      //   argument provided when updating.
      remember { it.copy() }.updateFrom(it)
    },

    LocalColors provides colors.orDefault().let {
      // Explicitly remembering a new copy here so that we don't overwrite the values in the initial
      //   argument provided when updating.
      remember { it.copy() }.updateFrom(it)
    },

    LocalTypography provides typography.orDefault().let {
      // Explicitly remembering a new copy here so that we don't overwrite the values in the initial
      //   argument provided when updating.
      remember { it.copy() }.updateFrom(it)
    },

    content = content,
  )
}

/**
 * The object class used to retrieve the state values of the current theme from any composable-hierarchy.
 *
 * @author RinOrz
 */
object AppleUiTheme {

  /**
   * Retrieves the [Appearance] of the current theme at the call site's position in the hierarchy.
   * If the [Appearance] is not provided in the hierarchy, the [Appearance.systemDefault] will be created.
   *
   * ## Description
   *
   * The [colors] are all affected by this property, a process called adaptive, see [DynamicColor]
   * for more details.
   *
   * ## Example
   * ```
   * AppleUiTheme(appearance = Appearance.Light) {
   *   // The default color scheme of the theme is light
   *   assert(AppleUiTheme.appearance == Appearance.Light)
   *
   *   // Provide the new appearance in the lower hierarchy
   *   Column {
   *     AppleUiTheme(appearance = Appearance.Dark) {
   *       // The default color scheme of the theme is now dark
   *       assert(AppleUiTheme.appearance == Appearance.Dark)
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
   * Retrieves the [Colors] of the current theme at the call site's position in the hierarchy.
   * If the [Colors] is not provided in the hierarchy, the new [Colors] will be created.
   *
   * ## Description
   *
   * The color values of this property are affected by the [appearance] property, a process called
   * adaptive, see [DynamicColor] for more details.
   *
   * ## Example
   * ```
   * AppleUiTheme(
   *   appearance = Appearance.Light,
   *   colors = Colors(
   *     label = DynamicColor(
   *       light = Color.Blue,
   *       dark = Color.Red,
   *     ),
   *   )
   * ) {
   *   // The default label color in the light theme is blue.
   *   assert(AppleUiTheme.appearance == Appearance.Light)
   *   assert(AppleUiTheme.colors.label == Color.Blue.toDynamicColor())
   *
   *   // Provide the new appearance in the lower hierarchy
   *   AppleUiTheme(appearance = Appearance.Dark) {
   *     Column {
   *       // The default label color in the dark theme is now red.
   *       assert(AppleUiTheme.appearance == Appearance.Dark)
   *       assert(AppleUiTheme.colors.label == Color.Red.toDynamicColor())
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
   * Retrieves the [Typography] of the current theme at the call site's position in the hierarchy.
   * If the [Typography] is not provided in the hierarchy, the new [Typography] will be created.
   */
  val typography: Typography
    @Composable
    @ReadOnlyComposable
    get() = LocalTypography.current.orDefault()
}

