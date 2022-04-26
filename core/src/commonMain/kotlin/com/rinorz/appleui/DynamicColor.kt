package com.rinorz.appleui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.graphics.Color

/**
 * A color data that can automatically adapt to the current UI theme appearance.
 *
 * @see Colors
 * @see Appearance
 * @author RinOrz
 */
@Immutable
data class DynamicColor(
  val light: Color,
  val dark: Color,
  val elevated: Color = dark,
  val highContrastLight: Color = light,
  val highContrastDark: Color = dark,
  val highContrastElevated: Color = elevated,
)

/**
 * Returns a color that adapts to the current theme appearance.
 *
 * ## Explains
 *
 * When the [AppleUiTheme.appearance]'s:
 *
 * - [Appearance.colorScheme] is [Appearance.Light]:
 *   returns [DynamicColor.light].
 *
 * - [Appearance.colorScheme] is [Appearance.Dark]:
 *   returns [DynamicColor.dark].
 *
 * - [Appearance.colorScheme] is [Appearance.Dark] and
 *   [Appearance.visualLevel] is [Appearance.VisualLevel.Elevated]:
 *   returns [DynamicColor.elevated].
 *
 * - [Appearance.colorScheme] is [Appearance.Light] and
 *   [Appearance.highContrast] is `true`:
 *   returns [DynamicColor.highContrastLight].
 *
 * - [Appearance.colorScheme] is [Appearance.Dark] and
 *   [Appearance.highContrast] is `true`:
 *   returns [DynamicColor.highContrastDark].
 *
 * - [Appearance.colorScheme] is [Appearance.Light], [Appearance.highContrast] is `true`, and
 *   [Appearance.visualLevel] is [Appearance.VisualLevel.Elevated]:
 *   returns [DynamicColor.highContrastElevated].
 */
val DynamicColor.current: Color
  @Composable
  @ReadOnlyComposable
  get() = AppleUiTheme.appearance.run {
    if (visualLevel == Appearance.VisualLevel.Elevated && isDark) return if (highContrast) highContrastElevated else elevated
    if (highContrast) return if (isDark) highContrastDark else highContrastLight
    return if (isDark) dark else light
  }