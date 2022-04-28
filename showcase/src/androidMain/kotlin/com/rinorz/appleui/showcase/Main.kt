package com.rinorz.appleui.showcase

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.rinorz.appleui.AppleUiTheme

/**
 * @author RinOrz
 */
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { AppleUiTheme {  } }
  }
}