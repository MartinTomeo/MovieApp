package com.example.movieapp.view


import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.databinding.ItemMovieBinding
import com.squareup.picasso.Picasso

class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val binding = ItemMovieBinding.bind(view)

    fun bind(image: String) {

        Picasso.get().load(image).into(binding.ivMovie)
    }

}