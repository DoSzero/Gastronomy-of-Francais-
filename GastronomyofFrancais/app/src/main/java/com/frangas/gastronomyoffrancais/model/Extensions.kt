package com.frangas.gastronomyoffrancais.model

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.frangas.gastronomyoffrancais.R
import com.squareup.picasso.Picasso

@BindingAdapter("android:src")
fun bindImageView(view: ImageView, img:Int) {
    Picasso.get().load(img).fit().centerCrop().into(view)
}

fun listOfPhotos(): List<SlideAboutPhoto> {
    val slideAboutPhotos = mutableListOf<SlideAboutPhoto>()

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.fra_cooking4,
            SlideName(
                "За последние 15 лет, французи начали пить на 15% меньше ",
            ),
            "Бургундия"
        )
    )

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.fra_cooking5,
            SlideName(
                "Более 250 молодых поворов попадают на кухни мишленовских ресторанов",
            ),
            "Прованс"
        )
    )

    slideAboutPhotos.add(
        SlideAboutPhoto(
            R.drawable.fra_cooking6,
            SlideName(
                "Ежегодно на мусорки франции отправляют 92 тони испортившейся пищи",
            ),
            "Париж"
        )
    )
    return slideAboutPhotos
}