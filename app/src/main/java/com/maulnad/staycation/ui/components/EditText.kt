package com.maulnad.staycation.ui.components

import android.util.Log
import android.view.KeyEvent.KEYCODE_ENTER
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.*
import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.key.*
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.maulnad.staycation.R
import com.maulnad.staycation.ui.theme.BlueSecondary
import com.maulnad.staycation.ui.theme.Gray
import com.maulnad.staycation.ui.theme.White200

@ExperimentalComposeUiApi
@Composable
fun EditTextSearch() {
    var textFieldState by remember {
        mutableStateOf("")
    }

    val context = LocalContext.current

    TextField(
        value = textFieldState,
        placeholder = {
            Text(
                text = "Find your place",
                fontStyle = FontStyle(R.font.poppins_regular),
                color = Gray,
            )
        },
        onValueChange = {
            textFieldState = it
        },
        singleLine = true,
        leadingIcon = {
            Icon(
                painter = painterResource(id = R.drawable.ic_search),
                contentDescription = null,
                modifier = Modifier.size(20.dp)
            )
        },

        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 20.dp, horizontal = 20.dp)
            .onKeyEvent {
                if (it.key == Key.Enter) {
                    Toast
                        .makeText(context, "Mencari: $textFieldState", Toast.LENGTH_SHORT)
                        .show()
                }
                false
            },
        shape = RoundedCornerShape(20.dp),
        colors = TextFieldDefaults.textFieldColors(
            textColor = BlueSecondary,
            backgroundColor = White200,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent
        ),
        textStyle = TextStyle(
            fontSize = 14.sp,
            color = BlueSecondary,
            fontStyle = FontStyle(R.font.poppins_regular)
        ),
    )
}


@ExperimentalComposeUiApi
@Preview("Edit Text Search", showBackground = true)
@Composable
fun PreviewEditTextSearch() {
    EditTextSearch()
}

