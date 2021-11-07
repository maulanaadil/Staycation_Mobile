package com.maulnad.staycation.ui.components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maulnad.staycation.data.RecommendForYou
import com.maulnad.staycation.ui.theme.White

@Composable
fun RecommendCardSection(
    items: List<RecommendForYou>
) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth(),
        contentPadding = PaddingValues(start = 20.dp, end = 20.dp, bottom = 10.dp)
    ) {
        items(items.size) {
            CardItemRecommend(item = items[it])
        }
    }

}


@Composable
fun CardItemRecommend(item: RecommendForYou) {
    val context = LocalContext.current
    Card(
        modifier = Modifier
            .size(width = 180.dp, height = 160.dp)
            .padding(end = 10.dp)
            .clickable {
                Toast
                    .makeText(context, "Clicked: ${item.title}", Toast.LENGTH_SHORT)
                    .show()
            },
        shape = RoundedCornerShape(15.dp),
        elevation = 10.dp,
    ) {
        Image(
            painter = painterResource(id = item.image),
            contentDescription = "Profile Picture",
            contentScale = ContentScale.Crop
        )
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp),
            verticalArrangement = Arrangement.Bottom

        ) {
            Text(
                text = item.title,
                style = MaterialTheme.typography.h5.copy(
                    fontSize = 14.sp
                ),
                color = White,
                modifier = Modifier
                    .padding()
            )
            Text(
                text = "${item.city}, ${item.country}",
                style = MaterialTheme.typography.h5.copy(
                    fontSize = 8.sp
                ),
                color = White,
                modifier = Modifier
                    .padding(bottom = 15.dp)
            )
        }
    }
}