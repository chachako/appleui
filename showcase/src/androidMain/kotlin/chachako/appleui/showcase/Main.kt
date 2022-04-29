package chachako.appleui.showcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import chachako.appleui.AppleUiTheme

/**
 * @author Chachako
 */
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { Main() }
  }
}

/**
 * App's UI entry point.
 *
 * @author Chachako
 */
@Composable
fun Main() = AppleUiTheme {

}