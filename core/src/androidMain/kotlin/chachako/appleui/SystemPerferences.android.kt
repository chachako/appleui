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
package chachako.appleui

import android.content.Context.ACCESSIBILITY_SERVICE
import android.view.accessibility.AccessibilityManager
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalContext
import com.meowool.sweekt.LazyInit
import com.meowool.sweekt.castOrNull
import com.meowool.sweekt.runOrNull
import java.lang.reflect.Method

@LazyInit private var isHighTextContrastEnabled: Method? = runOrNull {
  AccessibilityManager::class.java
    .getDeclaredMethod("isHighTextContrastEnabled")
    .apply { isAccessible = true }
}

@Composable
@ReadOnlyComposable
actual fun isSystemEnabledHighContrast(): Boolean = LocalContext.current.getSystemService(ACCESSIBILITY_SERVICE)?.let {
  runOrNull { isHighTextContrastEnabled?.invoke(it).castOrNull<Boolean>() }
} ?: false
