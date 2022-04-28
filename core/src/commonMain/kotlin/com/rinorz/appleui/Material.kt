package com.rinorz.appleui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable

/**
 * A material representation that conforms to Apple's design.
 *
 * For an introduction to a material, see [Materials] for more information.
 *
 * @see Materials
 * @author RinOrz
 */
expect sealed interface Material

/**
 * A material data that can automatically adapt to the current UI theme appearance.
 * To retrieve the corresponding material adapted to the current appearance, call [DynamicMaterial.current].
 *
 * For an introduction to a dynamic material, see [Materials] for more information.
 *
 * @author RinOrz
 */
@Immutable
data class DynamicMaterial(
  val light: Material,
  val dark: Material = light
)

/**
 * Returns a material that adapts to the current theme appearance.
 *
 * The result is based on [AppleUiTheme.appearance].
 */
val DynamicMaterial.current: Material
  @Composable
  @ReadOnlyComposable
  get() = when (AppleUiTheme.appearance) {
    Appearance.Light -> light
    Appearance.Dark -> dark
  }
