package com.maulnad.staycation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.ui.ExperimentalComposeUiApi
import com.maulnad.staycation.ui.HomeScreen
import com.maulnad.staycation.ui.theme.StaycationTheme
import com.maulnad.staycation.utils.DummyData.mostPopular
import com.maulnad.staycation.utils.DummyData.recommendForYou

class MainActivity : ComponentActivity() {

    @ExperimentalComposeUiApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StaycationTheme {
                HomeScreen(items1 = recommendForYou, items2 = mostPopular)
            }
        }
    }
}