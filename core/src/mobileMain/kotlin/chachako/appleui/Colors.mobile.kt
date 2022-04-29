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
@file:Suppress("unused")

package chachako.appleui

import androidx.compose.runtime.Stable
import androidx.compose.ui.graphics.Color

/**
 * Default values for [Colors] in Apple's UI design on mobile platforms.
 *
 * Inspired by [Flutter's Cupertino Colors](https://github.com/flutter/flutter/blob/master/packages/flutter/lib/src/cupertino/colors.dart).
 *
 * @author Chachako
 */
actual object DefaultColors {
  @Stable val accent: DynamicColor inline get() = blue

  @Stable val active: DynamicColor inline get() = green

  @Stable val label: DynamicColor = DynamicColor(
    light = Color(0, 0, 0),
    dark = Color(255, 255, 255),
  )

  @Stable val label2: DynamicColor = DynamicColor(
    light = Color(60, 60, 67, 153),
    dark = Color(235, 235, 245, 153),
    highContrastLight = Color(60, 60, 67, 173),
    highContrastDark = Color(235, 235, 245, 173),
    elevatedDark = Color(235, 235, 245, 153),
    highContrastElevatedDark = Color(235, 235, 245, 173),
  )

  @Stable val label3: DynamicColor = DynamicColor(
    light = Color(60, 60, 67, 76),
    dark = Color(235, 235, 245, 76),
    highContrastLight = Color(60, 60, 67, 96),
    highContrastDark = Color(235, 235, 245, 96),
    elevatedDark = Color(235, 235, 245, 76),
    highContrastElevatedDark = Color(235, 235, 245, 96),
  )

  @Stable val label4: DynamicColor = DynamicColor(
    light = Color(60, 60, 67, 45),
    dark = Color(235, 235, 245, 40),
    highContrastLight = Color(60, 60, 67, 66),
    highContrastDark = Color(235, 235, 245, 61),
    elevatedDark = Color(235, 235, 245, 40),
    highContrastElevatedDark = Color(235, 235, 245, 61),
  )

  @Stable val placeholderText: DynamicColor = DynamicColor(
    light = Color(60, 60, 67, 76),
    dark = Color(235, 235, 245, 76),
    highContrastLight = Color(60, 60, 67, 96),
    highContrastDark = Color(235, 235, 245, 96),
    elevatedDark = Color(235, 235, 245, 76),
    highContrastElevatedDark = Color(235, 235, 245, 96),
  )

  @Stable val link: DynamicColor = DynamicColor(
    light = Color(0, 122, 255),
    dark = Color(9, 132, 255),
  )

  @Stable val fill: DynamicColor = DynamicColor(
    light = Color(120, 120, 128, 51),
    dark = Color(120, 120, 128, 91),
    highContrastLight = Color(120, 120, 128, 71),
    highContrastDark = Color(120, 120, 128, 112),
    elevatedDark = Color(120, 120, 128, 91),
    highContrastElevatedDark = Color(120, 120, 128, 112),
  )

  @Stable val fill2: DynamicColor = DynamicColor(
    light = Color(120, 120, 128, 40),
    dark = Color(120, 120, 128, 81),
    highContrastLight = Color(120, 120, 128, 61),
    highContrastDark = Color(120, 120, 128, 102),
    elevatedDark = Color(120, 120, 128, 81),
    highContrastElevatedDark = Color(120, 120, 128, 102),
  )

  @Stable val fill3: DynamicColor = DynamicColor(
    light = Color(118, 118, 128, 30),
    dark = Color(118, 118, 128, 61),
    highContrastLight = Color(118, 118, 128, 51),
    highContrastDark = Color(118, 118, 128, 81),
    elevatedDark = Color(118, 118, 128, 61),
    highContrastElevatedDark = Color(118, 118, 128, 81),
  )

  @Stable val fill4: DynamicColor = DynamicColor(
    light = Color(116, 116, 128, 20),
    dark = Color(118, 118, 128, 45),
    highContrastLight = Color(116, 116, 128, 40),
    highContrastDark = Color(118, 118, 128, 66),
    elevatedDark = Color(118, 118, 128, 45),
    highContrastElevatedDark = Color(118, 118, 128, 66),
  )

  @Stable val background: DynamicColor = DynamicColor(
    light = Color(255, 255, 255),
    dark = Color(0, 0, 0),
    elevatedDark = Color(28, 28, 30),
    highContrastElevatedDark = Color(36, 36, 38),
  )

  @Stable val background2: DynamicColor = DynamicColor(
    light = Color(242, 242, 247),
    dark = Color(28, 28, 30),
    highContrastLight = Color(235, 235, 240),
    highContrastDark = Color(36, 36, 38),
    elevatedDark = Color(44, 44, 46),
    highContrastElevatedDark = Color(54, 54, 56),
  )

  @Stable val background3: DynamicColor = DynamicColor(
    light = Color(255, 255, 255),
    dark = Color(44, 44, 46),
    highContrastDark = Color(54, 54, 56),
    elevatedDark = Color(58, 58, 60),
    highContrastElevatedDark = Color(68, 68, 70),
  )

  @Stable val groupedBackground: DynamicColor = DynamicColor(
    light = Color(242, 242, 247),
    dark = Color(0, 0, 0),
    highContrastLight = Color(235, 235, 240),
    elevatedDark = Color(28, 28, 30),
    highContrastElevatedDark = Color(36, 36, 38),
  )

  @Stable val groupedBackground2: DynamicColor = DynamicColor(
    light = Color(255, 255, 255),
    dark = Color(28, 28, 30),
    highContrastLight = Color(255, 255, 255),
    elevatedDark = Color(44, 44, 46),
    highContrastElevatedDark = Color(54, 54, 56),
  )

  @Stable val groupedBackground3: DynamicColor = DynamicColor(
    light = Color(242, 242, 247),
    dark = Color(44, 44, 46),
    highContrastLight = Color(235, 235, 240),
    highContrastDark = Color(54, 54, 56),
    elevatedDark = Color(58, 58, 60),
    highContrastElevatedDark = Color(68, 68, 70),
  )

  @Stable val separator: DynamicColor = DynamicColor(
    light = Color(60, 60, 67, 73),
    dark = Color(84, 84, 88, 153),
    highContrastLight = Color(60, 60, 67, 94),
    highContrastDark = Color(84, 84, 88, 173),
    elevatedDark = Color(84, 84, 88, 153),
  )

  @Stable val separatorOpaque: DynamicColor = DynamicColor(
    light = Color(198, 198, 200),
    dark = Color(56, 56, 58),
  )

  @Stable val blue: DynamicColor = DynamicColor(
    light = Color(0, 122, 255),
    dark = Color(10, 132, 255),
    highContrastLight = Color(0, 64, 221),
    highContrastDark = Color(64, 156, 255),
  )

  @Stable val brown: DynamicColor = DynamicColor(
    light = Color(151, 122, 85),
    dark = Color(157, 129, 93),
    highContrastLight = Color(115, 91, 62),
    highContrastDark = Color(171, 139, 96),
  )

  @Stable val cyan: DynamicColor = DynamicColor(
    light = Color(54, 160, 224),
    dark = Color(96, 202, 253),
    highContrastLight = Color(21, 99, 152),
    highContrastDark = Color(106, 208, 253),
  )

  @Stable val green: DynamicColor = DynamicColor(
    light = Color(52, 199, 89),
    dark = Color(48, 209, 88),
    highContrastLight = Color(36, 138, 61),
    highContrastDark = Color(48, 219, 91),
  )

  @Stable val indigo: DynamicColor = DynamicColor(
    light = Color(88, 86, 214),
    dark = Color(94, 92, 230),
    highContrastLight = Color(54, 52, 163),
    highContrastDark = Color(125, 122, 255),
  )

  @Stable val mint: DynamicColor = DynamicColor(
    light = Color(26, 193, 182),
    dark = Color(93, 227, 222),
    highContrastLight = Color(22, 118, 112),
    highContrastDark = Color(93, 227, 222),
  )

  @Stable val orange: DynamicColor = DynamicColor(
    light = Color(255, 149, 0),
    dark = Color(255, 159, 10),
    highContrastLight = Color(201, 52, 0),
    highContrastDark = Color(255, 179, 64),
  )

  @Stable val pink: DynamicColor = DynamicColor(
    light = Color(255, 45, 85),
    dark = Color(255, 55, 95),
    highContrastLight = Color(211, 15, 69),
    highContrastDark = Color(255, 100, 130),
  )

  @Stable val purple: DynamicColor = DynamicColor(
    light = Color(175, 82, 222),
    dark = Color(191, 90, 242),
    highContrastLight = Color(137, 68, 171),
    highContrastDark = Color(218, 143, 255),
  )

  @Stable val red: DynamicColor = DynamicColor(
    light = Color(255, 59, 48),
    dark = Color(255, 69, 58),
    highContrastLight = Color(215, 0, 21),
    highContrastDark = Color(255, 105, 97),
  )

  @Stable val teal: DynamicColor = DynamicColor(
    light = Color(90, 200, 250),
    dark = Color(100, 210, 255),
    highContrastLight = Color(0, 113, 164),
    highContrastDark = Color(112, 215, 255),
  )

  @Stable val yellow: DynamicColor = DynamicColor(
    light = Color(255, 204, 0),
    dark = Color(255, 214, 10),
    highContrastLight = Color(160, 90, 0),
    highContrastDark = Color(255, 212, 38),
  )

  @Stable val gray: DynamicColor = DynamicColor(
    light = Color(142, 142, 147),
    dark = Color(142, 142, 147),
    highContrastLight = Color(108, 108, 112),
    highContrastDark = Color(174, 174, 178),
  )

  @Stable val gray2: DynamicColor = DynamicColor(
    light = Color(174, 174, 178),
    dark = Color(99, 99, 102),
    highContrastLight = Color(142, 142, 147),
    highContrastDark = Color(124, 124, 128),
  )

  @Stable val gray3: DynamicColor = DynamicColor(
    light = Color(199, 199, 204),
    dark = Color(72, 72, 74),
    highContrastLight = Color(174, 174, 178),
    highContrastDark = Color(84, 84, 86),
  )

  @Stable val gray4: DynamicColor = DynamicColor(
    light = Color(209, 209, 214),
    dark = Color(58, 58, 60),
    highContrastLight = Color(188, 188, 192),
    highContrastDark = Color(68, 68, 70),
  )

  @Stable val gray5: DynamicColor = DynamicColor(
    light = Color(229, 229, 234),
    dark = Color(44, 44, 46),
    highContrastLight = Color(216, 216, 220),
    highContrastDark = Color(54, 54, 56),
  )

  @Stable val gray6: DynamicColor = DynamicColor(
    light = Color(242, 242, 247),
    dark = Color(28, 28, 30),
    highContrastLight = Color(235, 235, 240),
    highContrastDark = Color(36, 36, 38),
  )
}