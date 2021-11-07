package com.maulnad.staycation.data

import androidx.annotation.DrawableRes

data class MostPopular(
    val title: String,
    val city: String,
    val country: String,
    val rate: Int,
    @DrawableRes
    val image: Int
)