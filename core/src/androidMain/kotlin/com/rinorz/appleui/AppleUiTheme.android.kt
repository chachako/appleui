package com.rinorz.appleui

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.core.view.WindowCompat
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.meowool.sweekt.window
import com.rinorz.appleui.internal.DisposableSideEffect


/**
 * Platform-specific content logic for [AppleUiTheme].
 *
 * @author RinOrz
 */
@Composable
internal actual fun PlatformThemeContent(content: @Composable () -> Unit) {
  val context = LocalContext.current
  val useDarkIcons = AppleUiTheme.isLight
  val systemUiController = rememberSystemUiController()

  // Update every time the appearance changes.
  DisposableSideEffect(useDarkIcons) {
    // In Apple's UI theme we update all the default colors of system bars to transparent,
    //   and use dark icons if we're in light theme.
    systemUiController.setSystemBarsColor(
      color = Color.Transparent,
      darkIcons = useDarkIcons
    )
  }

  // Set only once to expand the content to the status bar.
  DisposableSideEffect {
    WindowCompat.setDecorFitsSystemWindows(context.window, false)
  }

  content()
}