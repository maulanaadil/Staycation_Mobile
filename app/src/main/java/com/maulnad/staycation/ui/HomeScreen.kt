package com.maulnad.staycation.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.maulnad.staycation.R
import com.maulnad.staycation.data.MostPopular
import com.maulnad.staycation.data.RecommendForYou
import com.maulnad.staycation.ui.components.*
import com.maulnad.staycation.ui.theme.White
import com.maulnad.staycation.utils.DummyData.mostPopular
import com.maulnad.staycation.utils.DummyData.recommendForYou

@ExperimentalComposeUiApi
@Composable
fun HomeScreen(
    items1: List<RecommendForYou>,
    items2: List<MostPopular>
) {
    Column(
        modifier = Modifier
            .background(White)
            .fillMaxSize()
    ) {
        LazyColumn() {
            item {
                HeaderSection()
            }

            item {
                RecommendForYouText()
            }

            item {
                LazyRow(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentPadding = PaddingValues(start = 20.dp, end = 20.dp, bottom = 10.dp)
                ) {
                    items(items1.size) {
                        CardItemRecommend(item = items1[it])
                    }
                }
            }

            item {
                MostPopularText()
            }

            items(items2.size) {
                MostPopularCardItem(item = items2[it])
            }
            item {
                Spacer(modifier = Modifier.padding(bottom = 50.dp))
            }
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

@ExperimentalComposeUiApi
@Preview(name = "HomeScreen", showSystemUi = true, showBackground = true)
@Composable
private fun PreviewHomeScreen() {
    HomeScreen(items1 = recommendForYou, items2 = mostPopular)
}