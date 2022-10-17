package com.frangas.gastronomyoffrancais.model

import com.frangas.gastronomyoffrancais.model.ConstantsForInfo.infoList

data class Info (
    var cover: Int,
    var subTitle: String,
    var title: String,
    var description: String,
    val id: Int? = infoList.size
)