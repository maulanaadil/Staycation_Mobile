package com.maulnad.staycation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.ExperimentalComposeUiApi
import com.maulnad.staycation.ui.HomeScreen
import com.maulnad.staycation.ui.theme.StaycationTheme

class MainActivity : ComponentActivity() {

    @ExperimentalComposeUiApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StaycationTheme {
                HomeScreen()
            }
        }
    }
}