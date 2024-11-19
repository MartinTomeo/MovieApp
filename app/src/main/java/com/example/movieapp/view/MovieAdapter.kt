package com.example.movieapp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.movieapp.R

class MovieAdapter(private val images: List<String>) : RecyclerView.Adapter<MovieViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return MovieViewHolder(layoutInflater.inflate(R.layout.item_movie, parent, false))
    }
    override fun getItemCount(): Int = images.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        val item = images[position]
        holder.bind(item)
    }


}