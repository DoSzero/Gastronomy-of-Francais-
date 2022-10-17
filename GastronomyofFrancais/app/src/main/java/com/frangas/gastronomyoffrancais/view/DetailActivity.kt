package com.frangas.gastronomyoffrancais.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.frangas.gastronomyoffrancais.databinding.ActivityDetailBinding
import com.frangas.gastronomyoffrancais.model.ConstantsForInfo.INFO_ID_EXTRA
import com.frangas.gastronomyoffrancais.model.ConstantsForInfo.infoList
import com.frangas.gastronomyoffrancais.model.Info


class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val infoID = intent.getIntExtra(INFO_ID_EXTRA, -1)
        val info = infoFromID(infoID)

        if(info != null) {
            binding.cover.setImageResource(info.cover)
            binding.title.text = info.title
            binding.description.text = info.description
            binding.author.text = info.subTitle
        }

        binding.btnBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        binding.btnAbout.setOnClickListener {
            val intent = Intent(this, PreviewActivity::class.java)
            startActivity(intent)
        }

    }

    private fun infoFromID(infoID: Int): Info? {
        for(info in infoList) {
            if(info.id == infoID)
                return info
        }
        return null
    }

}