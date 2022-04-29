package chachako.appleui.internal

import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.DisposableEffectScope
import androidx.compose.runtime.NonRestartableComposable

/**
 * @author Chachako
 */
@Composable
@NonRestartableComposable
fun DisposableSideEffect(key1: Any? = true, effect: DisposableEffectScope.() -> Unit) {
  DisposableEffect(key1) {
    effect()
    onDispose { }
  }
}
