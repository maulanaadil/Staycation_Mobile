package com.maulnad.staycation.ui.components

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberImagePainter
import com.maulnad.staycation.R
import com.maulnad.staycation.ui.theme.Blue
import com.maulnad.staycation.ui.theme.BlueSecondary

@Composable
fun ProfileBoxSection(name: String = "Evie") {
    val context = LocalContext.current
    Column() {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.clickable {
                Toast.makeText(context, "Hello $name", Toast.LENGTH_SHORT).show()
            }
        ) {
            Text(
                buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = BlueSecondary,
                            fontWeight = FontWeight.Medium,
                            fontStyle = FontStyle(R.font.poppins_medium),
                            fontSize = 14.sp,
                        ),
                    ) {
                        append("Hello, ")
                    }
                    withStyle(
                        style = SpanStyle(
                            color = Blue,
                            fontWeight = FontWeight.Medium,
                            fontStyle = FontStyle(R.font.poppins_medium),
                            fontSize = 14.sp
                        )
                    ) {
                        append(name)
                    }
                }
            )
            Spacer(
                modifier = Modifier
                    .padding(end = 10.dp)
            )
            Surface(
                modifier = Modifier
                    .size(30.dp)
                    .align(Alignment.CenterVertically),
                shape = CircleShape,
                color = MaterialTheme.colors.onSurface.copy(0.2f),
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = "Picture Profile",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                )
            }
        }
    }
}