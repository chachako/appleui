package com.rinorz.appleui

import androidx.annotation.FloatRange
import androidx.compose.runtime.Immutable
import androidx.compose.ui.graphics.Color

/**
 * A material representation that conforms to Apple's design.
 *
 * For an introduction to a material, see [Materials] for more information.
 *
 * @see Materials
 * @author RinOrz
 */
actual sealed interface Material

/**
 * An available implementation of [Material] for blurring effect on the Android platform.
 *
 * @property blurAmount The blur amount.
 * @property saturation The saturation of the blur effect.
 * @property baseColors The overlay colors below the blur effect.
 * @author RinOrz
 */
@Immutable
data class BlurMaterial(
  val blurAmount: Float,
  @FloatRange(from = 0.0, to = 7.0)
  val saturation: Float,
  val baseColors: Array<Color>,
) : Material {
  override fun equals(other: Any?): Boolean = when (other) {
    (this === other) -> true
    is BlurMaterial -> this.blurAmount == other.blurAmount && this.baseColors.contentEquals(other.baseColors)
    else -> false
  }
  override fun hashCode(): Int = 31 * blurAmount.hashCode() + baseColors.contentHashCode()
}