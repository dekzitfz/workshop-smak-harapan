package com.pokemon

import android.content.Context
import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.pokemon_item.view.*


class PokemonAdapter(val data: List<Pokemon>): RecyclerView.Adapter<PokemonAdapter.PokemonVH>() {

    inner class PokemonVH(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PokemonVH =
        PokemonVH(LayoutInflater.from(parent.context).inflate(R.layout.pokemon_item, parent, false))

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: PokemonVH, position: Int) {
        val pokemon = data[position]
        holder.itemView.name.text = pokemon.name
        holder.itemView.image.setImageDrawable(getImage(holder.itemView.context, pokemon.image))
    }

    fun getImage(c: Context, imageName: String): Drawable? {
        return ContextCompat.getDrawable(c, c.resources.getIdentifier(imageName, "drawable", c.packageName))
    }

}