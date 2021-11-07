package com.maulnad.staycation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maulnad.staycation.DummyData.recommendForYou
import com.maulnad.staycation.R
import com.maulnad.staycation.ui.components.*
import com.maulnad.staycation.ui.theme.White

@ExperimentalComposeUiApi
@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .background(White)
            .fillMaxSize()
    ) {
        Column {
            HeaderSection()
            BodySection()
        }
    }
}

@ExperimentalComposeUiApi
@Composable
private fun HeaderSection() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 25.dp, top = 25.dp)
    ) {
        Image(
            imageVector = ImageVector.vectorResource(id = R.drawable.ic_hamburger_menu),
            contentDescription = "Button Hamburger Menu"
        )
        ProfileBoxSection()
    }
    JargonSection()
    EditTextSearch()
}

@Composable
private fun BodySection() {
    RecommendForYouText()
    RecommendCardSection(items = recommendForYou)
    MostPopularText()
}

@ExperimentalComposeUiApi
@Preview(name = "HomeScreen", showSystemUi = true, showBackground = true)
@Composable
private fun PreviewHomeScreen() {
    HomeScreen()
}