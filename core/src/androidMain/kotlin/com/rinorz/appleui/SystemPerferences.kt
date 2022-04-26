package com.rinorz.appleui

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

/**
 * Returns `true` if the Android system's high contrast mode is enabled.
 *
 * This function is the default for [Appearance.highContrast] property, and see that
 * property for more information.
 *
 * Inspired by [Stack Overflow answer](https://stackoverflow.com/a/34413208).
 *
 * @author RinOrz
 */
@Composable
@ReadOnlyComposable
actual fun isSystemEnabledHighContrast(): Boolean = LocalContext.current.getSystemService(ACCESSIBILITY_SERVICE)?.let {
  runOrNull { isHighTextContrastEnabled?.invoke(it).castOrNull<Boolean>() }
} ?: false