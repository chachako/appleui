package com.rinorz.appleui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.text.BasicText
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

/**
 * Customizable theme for Apple's UI Design, which is usually the entry point for a standard
 * Apple's UI-Style application implemented on Jetpack Compose, and can also be nested and
 * mixed with other UI themes (e.g. [MaterialTheme](https://developer.android.com/reference/kotlin/androidx/compose/material/MaterialTheme)).
 *
 * This composable function provides a [content] block in which the default styles of all
 * appleui components will be affected by the attributes of this theme.
 *
 * ## Disclaimer
 *
 * Although this theme allows you to modify the default style of the appleui components, this
 * does not mean that this is recommended, as there is no such concept as customization in the
 * Apple's UI design specification, so don't make very "exaggerated" changes to the theme style
 * unless specifically needed, as this may go against the design specification.
 *
 * ## Retrieve
 *
 * You can use the properties provided in the [AppleUiTheme] class to retrieve the
 * corresponding attributes of the current theme in the [content] block:
 *
 * ```
 * ```
 *
 * ## Reference
 *
 * [Human Interface Guidelines](https://developer.apple.com/design/human-interface-guidelines/)
 * [Flutter Cupertino Theme](https://api.flutter.dev/flutter/cupertino/CupertinoTheme-class.html)
 *
 * @author RinOrz
 */
@Composable
fun AppleUiTheme(
  colors: Colors
) {
  BasicText()
}