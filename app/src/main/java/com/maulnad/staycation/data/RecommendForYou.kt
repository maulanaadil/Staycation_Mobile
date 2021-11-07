package com.maulnad.staycation.data

import androidx.annotation.DrawableRes

data class RecommendForYou(
    val title: String,
    val city: String,
    val country: String,
    @DrawableRes
    val image: Int
)