package com.frangas.gastronomyoffrancais.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frangas.gastronomyoffrancais.adapter.SliderAdapter
import com.frangas.gastronomyoffrancais.adapter.SliderTransformer
import com.frangas.gastronomyoffrancais.databinding.ActivityPreviewBinding
import com.frangas.gastronomyoffrancais.model.listOfPhotos

class PreviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPreviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityPreviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.viewpager.apply {
            adapter = SliderAdapter(listOfPhotos())
            offscreenPageLimit = 4
            setPageTransformer(SliderTransformer(4))
        }

    }
}