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

@Composable
@ReadOnlyComposable
actual fun isSystemEnabledHighContrast(): Boolean = LocalContext.current.getSystemService(ACCESSIBILITY_SERVICE)?.let {
  runOrNull { isHighTextContrastEnabled?.invoke(it).castOrNull<Boolean>() }
} ?: false