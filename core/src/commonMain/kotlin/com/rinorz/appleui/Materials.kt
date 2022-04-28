package com.rinorz.appleui

import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue

/**
 * Material system that conforms to Apple's user interface design specifications.
 *
 * ## Important
 *
 * Note that this "material" is not [Material Design](https://material.io/), but a translucent effect
 * in the Apple's user interface design.
 *
 * ## Description
 *
 * Apple offers a range of materials (or blur effects) for creating translucent effects for different
 * platforms, each one with a designated purpose. For example, materials exist for matching the default
 * look of windows, menus, popovers, sidebars, title bars, and many others, which you can use to evoke a
 * sense of visual depth.
 *
 * ## Suggestions
 *
 * **Use the materials defined by the system.** To give people a consistent experience and ensure that your
 * interface looks great in all contexts, use dynamic system materials as intended whenever possible, as
 * these effects automatically adapt to the UI environment, such as the light and dark appearance.
 *
 * **Take advantage of the theme system-provided colors for text, fills, icons, and separators.** The
 * [AppleUiTheme] system-provided colors automatically make these items look great on translucent backgrounds.
 * For more information, see [DynamicColor].
 *
 * **Consider contrast and visual separation when choosing a material.** There’s no absolute rule for choosing
 * a material to combine with vibrancy effects. As you’re making this choice, consider that:
 *
 * - Thicker materials can provide better contrast for text and other elements with fine features.
 * - Translucency can help people retain their context by providing a visible reminder of the content that’s
 *   in the background.
 *
 * ## References
 *
 * - [Human Interface Guidelines for iOS](https://developer.apple.com/design/human-interface-guidelines/ios/visual-design/materials/)
 * - [Human Interface Guidelines for macOS](https://developer.apple.com/design/human-interface-guidelines/macos/visual-design/translucency#materials)
 * - [SwiftUI Material](https://developer.apple.com/documentation/swiftui/material)
 *
 * ![preview](https://raw.githubusercontent.com/rinorz/appleui/main/art/images/materials_overview.png)
 *
 * @author RinOrz
 */
@Stable
class Materials(
  ultraThin: Material,
  thin: Material,
  regular: Material,
  thick: Material,
  extraThick: Material,
  bar: Material,
) {

  /**
   * An adaptable blur effect that creates the appearance of an ultra-thin material.
   *
   * Equivalent to [Material.UltraThin](https://developer.apple.com/documentation/swiftui/material/ultrathin).
   */
  var ultraThin: Material by mutableStateOf(ultraThin)
    internal set

  /**
   * An adaptable blur effect that creates the appearance of a thin material.
   *
   * Equivalent to [Material.Thin](https://developer.apple.com/documentation/swiftui/material/thin).
   */
  var thin: Material by mutableStateOf(thin)
    internal set

  /**
   * An adaptable blur effect that creates the appearance of a material with normal thickness.
   *
   * Equivalent to [Material.Regular](https://developer.apple.com/documentation/swiftui/material/regular).
   */
  var regular: Material by mutableStateOf(regular)
    internal set

  /**
   * An adaptable blur effect that creates the appearance of a material that’s thicker than normal.
   *
   * Equivalent to [Material.Thick](https://developer.apple.com/documentation/swiftui/material/thick).
   */
  var thick: Material by mutableStateOf(thick)
    internal set

  /**
   * An adaptable blur effect that creates the appearance of a material that’s thicker than normal.
   *
   * Equivalent to [Material.ExtraThick](https://developer.apple.com/documentation/swiftui/material/extrathick).
   */
  var extraThick: Material by mutableStateOf(extraThick)
    internal set

  /**
   * An adaptable blur effect that creates the appearance of a material that’s matching the style of
   * system toolbars.
   *
   * Equivalent to [Material.Bar](https://developer.apple.com/documentation/swiftui/material/bar).
   */
  var bar: Material by mutableStateOf(bar)
    internal set
}