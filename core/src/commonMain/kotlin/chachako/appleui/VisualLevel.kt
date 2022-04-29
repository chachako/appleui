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
@file:Suppress("NOTHING_TO_INLINE")

package chachako.appleui

import androidx.compose.runtime.CompositionLocal
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf

/**
 * Indicates the visual level at which the user interface content is presented.
 * In MaterialTheme, this is also known as "elevation".
 *
 * Equivalent to [UIUserInterfaceLevel](https://developer.apple.com/documentation/uikit/uiuserinterfacelevel).
 *
 * @see DynamicColor
 * @author Chachako
 */
enum class VisualLevel {

  /**
   * The default level for your window's main content.
   *
   * Equivalent to [UIUserInterfaceLevel.Base](https://developer.apple.com/documentation/uikit/uiuserinterfacelevel/base).
   */
  Base,

  /**
   * The level for content visually above your window's main content, this is typically used
   * for dark theme.
   *
   * ## Introduction
   *
   * In iOS's Dark Mode, the system uses two sets of background colors — called *base* and
   * *elevated* — to enhance the perception of depth when one dark interface is layered above
   * another. The base colors are darker, making background interfaces appear to recede, and
   * the elevated colors are lighter, making foreground interfaces appear to advance.
   *
   * See [Dark Mode Colors](https://developer.apple.com/design/human-interface-guidelines/ios/visual-design/dark-mode#dark-mode-colors)
   * for more information.
   *
   * Equivalent to [UIUserInterfaceLevel.Elevated](https://developer.apple.com/documentation/uikit/uiuserinterfacelevel/elevated).
   *
   * @see DynamicColor.elevatedLight
   * @see DynamicColor.elevatedDark
   */
  Elevated,
}

/**
 * A [CompositionLocal] instance containing the current visual level in the hierarchy.
 *
 * This is typically used to elevate the contrast of prominent components in dark theme,
 * see [VisualLevel] for more information.
 *
 * ## Description
 *
 * The [AppleUiTheme.colors] are all affected by this property, a process called adaptive,
 * see [DynamicColor.current] for more details.
 *
 * ## Example
 *
 * To change the visual level of a child components, use pass this property to
 * [CompositionLocalProvider] and provide the visual level value, for example:
 *
 * ```
 * AppleUiTheme(
 *   appearance = Appearance.Dark,
 *   colors = Colors(label = DynamicColor(
 *     dark = Color.Red.copy(alpha = 0.5f),
 *     elevatedDark = Color.Red,
 *   )),
 * ) {
 *   // The current theme's default visual level is now normal
 *   assert(LocalVisualLevel.current == VisualLevel.Base)
 *   assert(AppleUiTheme.colors.label == Color.Red.copy(alpha = 0.5f).toDynamicColor())
 *
 *   // Provide the new visual level in the lower hierarchy
 *   CompositionLocalProvider(LocalVisualLevel provides VisualLevel.Elevated) {
 *     Column {
 *       // The current theme's default visual level is now elevated
 *       assert(AppleUiTheme.visualLevel == VisualLevel.Elevated)
 *       assert(AppleUiTheme.colors.label == Color.Red.toDynamicColor())
 *
 *       // Your child components here
 *       ...
 *     }
 *   }
 * }
 * ```
 *
 * @author Chachako
 */
val LocalVisualLevel = compositionLocalOf { VisualLevel.Base }
