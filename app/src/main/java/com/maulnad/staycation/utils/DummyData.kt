package com.maulnad.staycation.utils

import com.maulnad.staycation.R
import com.maulnad.staycation.data.MostPopular
import com.maulnad.staycation.data.RecommendForYou

object DummyData {
    val recommendForYou: List<RecommendForYou> = listOf(
        RecommendForYou(
            "Green Aguire",
            "Bandung",
            "Indonesia",
            R.drawable.recommend_1
        ),
        RecommendForYou(
            "Priscilla Serneo",
            "Bali",
            "Indonesia",
            R.drawable.recommend_2
        ),
        RecommendForYou(
            "Sugin Charles",
            "Bogor",
            "Indonesia",
            R.drawable.recommend_3
        ),
        RecommendForYou(
            "Lorenzo Creato",
            "Jakarta",
            "Indonesia",
            R.drawable.recommend_4
        ),
    )

    val mostPopular: List<MostPopular> = listOf(
        MostPopular(
            "Ralph Kayden",
            "Bali",
            "Indonesia",
            4,
            R.drawable.recommend_1,
        ),
        MostPopular(
            "John Farnander",
            "Yogyakarta",
            "Indonesia",
            3,
            R.drawable.recommend_2,
        ),
        MostPopular(
            "Avi Werde",
            "Semarang",
            "Indonesia",
            4,
            R.drawable.recommend_3,
        ),
        MostPopular(
            "Jannis Lucas",
            "Bogor",
            "Indonesia",
            5,
            R.drawable.recommend_4,
        ),
    )
}