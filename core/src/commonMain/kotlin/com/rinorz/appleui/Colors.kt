package com.rinorz.appleui

import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.Stable
import androidx.compose.runtime.staticCompositionLocalOf
import com.rinorz.appleui.Colors.Companion.LightDefault

/**
 * Color system that conforms to Apple's UI Design specifications.
 *
 * ## Suggestion
 *
 * Apple offers a range of standard colors for different platforms with dynamic adaptability,
 * so use these colors when choosing app tint colors that look great individually and in
 * combination, on both light and dark backgrounds.
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
 * - [iOS Color Guidelines](https://developer.apple.com/design/human-interface-guidelines/ios/visual-design/color/)
 * - [macOS Color Guidelines](https://developer.apple.com/design/human-interface-guidelines/macos/visual-design/color/)
 *
 * @author RinOrz
 */
@Stable
expect class Colors {
  companion object {
    /**
     * The default [Colors] in the device's light color appearance.
     */
    val LightDefault: Colors
  }
}

/**
 * CompositionLocal used to pass [Colors] down the tree.
 *
 * Setting the value here is typically done as part of [AppleUiTheme],
 * which will automatically handle efficiently updating any changed colors
 * without causing unnecessary recompositions, using [Colors.updateColorsFrom].
 * To retrieve the current value of this CompositionLocal, use [AppleUiTheme.colors].
 */
internal expect val LocalColors: ProvidableCompositionLocal<Colors>
