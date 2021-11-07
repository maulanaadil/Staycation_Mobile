package com.maulnad.staycation.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maulnad.staycation.R
import com.maulnad.staycation.data.MostPopular
import com.maulnad.staycation.ui.theme.Gray
import com.maulnad.staycation.ui.theme.White

@Composable
fun MostPopularCardItem(item: MostPopular) {
    Card(
        modifier = Modifier
            .size(width = 380.dp, height = 97.dp)
            .padding(bottom = 10.dp, start = 20.dp),
        shape = RoundedCornerShape(10.dp),
        backgroundColor = White,
        elevation = 8.dp
    ) {
        Row() {
            Card(
                shape = RoundedCornerShape(10.dp),
                modifier = Modifier.size(width = 125.dp, height = 97.dp),
            ) {
                Image(
                    painter = painterResource(item.image),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.fillMaxSize(),
                    contentDescription = "Item Photo Card"
                )
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, top = 15.dp)
            ) {
                Text(
                    text = item.title, style = MaterialTheme.typography.h5.copy(
                        fontWeight = FontWeight.Normal,
                        fontStyle = FontStyle(R.font.poppins_regular),
                        color = Color.Black,
                        fontSize = 12.sp
                    )
                )
                Text(
                    text = "${item.city}, ${item.country}",
                    style = MaterialTheme.typography.h5.copy(
                        fontWeight = FontWeight.Light,
                        fontStyle = FontStyle(R.font.poppins_light),
                        fontSize = 10.sp,
                        color = Gray
                    )
                )

                LazyRow(
                    modifier = Modifier
                        .fillMaxSize()
                        .size(20.dp),
                    contentPadding = PaddingValues(top = 10.dp)
                ) {
                    items(item.rate) {
                        Star()
                    }
                }
            }
        }
    }
}

@Composable
fun Star() {
    Image(
        painter = painterResource(id = R.drawable.ic_star),
        contentDescription = "Item Star",
        modifier = Modifier
            .size(10.dp)
    )
}
