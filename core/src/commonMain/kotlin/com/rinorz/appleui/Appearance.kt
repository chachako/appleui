@file:Suppress("KDocUnresolvedReference", "SpellCheckingInspection", "NOTHING_TO_INLINE")

package com.rinorz.appleui

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.Stable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.staticCompositionLocalOf
import com.rinorz.appleui.Appearance.ColorScheme


/**
 * Provides the appearance of the theme in different environments.
 *
 * @author RinOrz
 */
@Stable
class Appearance(colorScheme: ColorScheme, visualLevel: VisualLevel, highContrast: Boolean) {

  /**
   * The [ColorScheme] corresponding to this appearance.
   *
   * @see Colors
   * @see DynamicColor
   * @see Appearance.Light
   * @see Appearance.Dark
   */
  var colorScheme: ColorScheme by mutableStateOf(colorScheme)
    internal set

  /**
   * The [VisualLevel] for this appearance content.
   *
   * @see DynamicColor
   */
  var visualLevel: VisualLevel by mutableStateOf(visualLevel)
    internal set

  /**
   * Whether to use high-contrast colors between the foreground and background of
   * the application.
   *
   * The default value of this property depends on the platform, for example, the user
   * sets the contrast by selecting the Increase Contrast option in `Accessibility > Display`
   * in "System Preferences" on **macOS**, or `Accessibility > Display & Text Size` in the
   * "Settings" app on **iOS**.
   *
   * For information about using color and contrast in your app, see
   * [Color and Contrast](https://developer.apple.com/design/human-interface-guidelines/accessibility/overview/color-and-contrast).
   */
  var highContrast: Boolean by mutableStateOf(highContrast)
    internal set

  /**
   * Returns a copy of this [Appearance] object, optionally overriding some values.
   */
  fun copy(
    colorScheme: ColorScheme = this.colorScheme,
    visualLevel: VisualLevel = this.visualLevel,
    highContrast: Boolean = this.highContrast,
  ) = Appearance(colorScheme, visualLevel, highContrast)

  override fun toString(): String =
    "Appearance(colorScheme=$colorScheme, visualLevel=$visualLevel, highContrast=$highContrast)"

  /**
   * The possible color schemes in different theme environments, corresponding to the
   * light and dark appearances.
   *
   * Equivalent to [SwiftUI](https://developer.apple.com/documentation/swiftui/colorscheme).
   *
   * @see AppleUiTheme
   * @author RinOrz
   */
  enum class ColorScheme {

    /**
     * The color scheme that corresponds to a light appearance.
     *
     * Equivalent to [ColorScheme.light](https://developer.apple.com/documentation/swiftui/colorscheme/light).
     */
    Light,

    /**
     * The color scheme that corresponds to a dark appearance, aka. dark mode.
     *
     * Equivalent to [ColorScheme.dark](https://developer.apple.com/documentation/swiftui/colorscheme/dark).
     */
    Dark,
  }

  /**
   * Constants that indicate the visual level for appearance content.
   *
   * Equivalent to [UIUserInterfaceLevel](https://developer.apple.com/documentation/uikit/uiuserinterfacelevel).
   *
   * @see AppleUiTheme
   * @author RinOrz
   */
  enum class VisualLevel {

    /**
     * The level for your window's main content.
     *
     * Equivalent to [UIUserInterfaceLevel.Base](https://developer.apple.com/documentation/uikit/uiuserinterfacelevel/base).
     */
    Base,

    /**
     * The level for content visually above your window's main content.
     *
     * In iOS's Dark Mode, the system uses two sets of background colors — called *base* and *elevated* —
     * to enhance the perception of depth when one dark interface is layered above another. The base colors
     * are darker, making background interfaces appear to recede, and the elevated colors are lighter,
     * making foreground interfaces appear to advance.
     * See [Dark Mode Colors](https://developer.apple.com/design/human-interface-guidelines/ios/visual-design/dark-mode#dark-mode-colors)
     * for more information.
     *
     * Equivalent to [UIUserInterfaceLevel.Elevated](https://developer.apple.com/documentation/uikit/uiuserinterfacelevel/elevated).
     */
    Elevated,
  }

  companion object {

    /**
     * The color scheme that corresponds to a light appearance.
     *
     * This is just an alias of [ColorScheme.Light].
     */
    val Light: ColorScheme inline get() = ColorScheme.Light

    /**
     * The color scheme that corresponds to a dark appearance, aka. dark mode.
     *
     * This is just an alias of [ColorScheme.Dark].
     */
    val Dark: ColorScheme inline get() = ColorScheme.Dark

    /**
     * Returns the system's default appearance.
     *
     * ## Disclaimer
     *
     * This function depends on the system, and if the system does not provide a boolean value for
     * light or dark mode, the result of this function is undefined.
     *
     * @see isSystemInDarkTheme
     */
    @Composable
    @ReadOnlyComposable
    fun systemDefault(): Appearance = Appearance(
      colorScheme = if (isSystemInDarkTheme()) ColorScheme.Dark else ColorScheme.Light,
      highContrast = isSystemEnabledHighContrast(),
      visualLevel = VisualLevel.Base,
    )
  }
}

/**
 * Returns a boolean value indicating whether this appearance is light.
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
val Appearance.isLight: Boolean inline get() = colorScheme == Appearance.Light

/**
 * Returns a boolean value indicating whether this appearance is dark.
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
val Appearance.isDark: Boolean inline get() = colorScheme == Appearance.Dark

/**
 * A container that allows the visual level of [content] to be elevated.
 *
 * See [Appearance.visualLevel] for more information.
 *
 * @param visualLevel The level to be passed down.
 *
 * @see Appearance.VisualLevel
 * @see DynamicColor
 *
 * @author RinOrz
 */
@Composable
fun ElevatableContent(
  visualLevel: Appearance.VisualLevel = Appearance.VisualLevel.Elevated,
  content: @Composable () -> Unit,
) = CompositionLocalProvider(
  LocalAppearance provides AppleUiTheme.appearance.copy(visualLevel = visualLevel),
  content = content
)

/**
 * Updates the internal values of the given [Appearance] with values from the [other] [Appearance].
 * This allows efficiently updating a subset of [Appearance], without recomposing every composable
 * that consumes values from [LocalAppearance].
 *
 * Because [Appearance] is very wide-reaching, and used by many expensive composables in the hierarchy,
 * providing a new value to [LocalAppearance] causes every composable consuming [LocalAppearance] to
 * recompose, which is prohibitively expensive in some cases. Instead, [Appearance] is internally backed
 * by [androidx.compose.runtime.mutableStateOf], and this function mutates the internal state of [this]
 * to match values in [other]. This means that any changes will mutate the internal state of [this], and
 * only cause composables that are reading the specific changed value to recompose.
 *
 * @author RinOrz
 */
@Composable
@ReadOnlyComposable
internal fun Appearance.updateFrom(other: Appearance) = apply {
  colorScheme = other.colorScheme
  visualLevel = other.visualLevel
  highContrast = other.highContrast
}

/**
 * CompositionLocal used to pass [Appearance] down the tree.
 *
 * Setting the value here is typically done as part of [AppleUiTheme], which will automatically
 * handle efficiently updating any changed data without causing unnecessary recompositions,
 * using [Appearance.updateFrom].
 *
 * To retrieve the current value of this CompositionLocal, use [AppleUiTheme.appearance].
 *
 * @author RinOrz
 */
internal val LocalAppearance: ProvidableCompositionLocal<Appearance?> = staticCompositionLocalOf { null }

/**
 * Returns the [systemDefault] if this appearance is `null`, otherwise it returns itself.
 */
@Composable
@ReadOnlyComposable
internal inline fun Appearance?.orDefault(): Appearance = this ?: Appearance.systemDefault()