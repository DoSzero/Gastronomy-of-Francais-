package com.frangas.gastronomyoffrancais.adapter

import androidx.recyclerview.widget.RecyclerView
import com.frangas.gastronomyoffrancais.databinding.CardCellBinding
import com.frangas.gastronomyoffrancais.interfaces.ClickListener
import com.frangas.gastronomyoffrancais.model.Info

class CardViewHolder(
    private val cardCellBinding: CardCellBinding,
    private val clickListener: ClickListener
) : RecyclerView.ViewHolder(cardCellBinding.root) {

    fun bindInformation(info: Info) {
        cardCellBinding.cover.setImageResource(info.cover)
        cardCellBinding.title.text = info.title
        cardCellBinding.author.text = info.subTitle

        cardCellBinding.cardView.setOnClickListener{
            clickListener.onClick(info)
        }
    }
}