package com.rinorz.appleui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

/**
 * Returns `true` if the system's high contrast mode is enabled.
 *
 * This function is the default for [Appearance.highContrast] property, and see that
 * property for more information.
 *
 * @author RinOrz
 */
@Composable
@ReadOnlyComposable
expect fun isSystemEnabledHighContrast(): Boolean