package com.maulnad.staycation.ui.components

import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.ParagraphStyle
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maulnad.staycation.R
import com.maulnad.staycation.ui.theme.Blue
import com.maulnad.staycation.ui.theme.BlueSecondary

@Composable
fun JargonSection() {
    Column(
        modifier = Modifier.padding(start = 20.dp, top = 35.dp)
    ) {
        Text(
            buildAnnotatedString {
                withStyle(style = ParagraphStyle(lineHeight = 36.sp)) {
                    withStyle(
                        style = SpanStyle(
                            color = BlueSecondary,
                            fontWeight = FontWeight.Medium,
                            fontStyle = FontStyle(R.font.poppins_medium),
                            fontSize = 24.sp
                        )
                    ) {
                        append("Forget Busy,\nStart ")
                    }
                    withStyle(
                        style = SpanStyle(
                            color = Blue,
                            fontWeight = FontWeight.Medium,
                            fontStyle = FontStyle(R.font.poppins_medium),
                            fontSize = 24.sp
                        )
                    ) {
                        append("Vacation")
                    }
                }

            }
        )
    }
}

@Composable
fun RecommendForYouText() {
    Row(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 10.dp)
            .fillMaxWidth()
    ) {
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = BlueSecondary,
                        fontWeight = FontWeight.SemiBold,
                        fontStyle = FontStyle(R.font.poppins_semibold),
                        fontSize = 20.sp
                    )
                ) {
                    append("Recommended for you")
                }
            }
        )
    }
}

@Composable
fun MostPopularText() {
    val context = LocalContext.current

    Row(
        modifier = Modifier
            .padding(horizontal = 20.dp, vertical = 10.dp)
            .fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = BlueSecondary,
                        fontWeight = FontWeight.SemiBold,
                        fontStyle = FontStyle(R.font.poppins_semibold),
                        fontSize = 20.sp
                    )
                ) {
                    append("Most Popular")
                }
            }
        )
        Text(
            text = "See All",
            style = MaterialTheme.typography.h4.copy(
                color = Blue,
                fontSize = 12.sp,
                fontStyle = FontStyle(R.font.poppins_medium),
                fontWeight = FontWeight.Medium
            ),
            modifier = Modifier
                .clickable {
                    Toast.makeText(context, "Clicked See All", Toast.LENGTH_SHORT).show()
                }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMostPopularText() {
    MostPopularText()
}