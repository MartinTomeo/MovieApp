package com.example.movieapp

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.movieapp.databinding.ActivityMainBinding
import com.example.movieapp.view.MovieAdapter
import com.example.movieapp.viewmodel.MovieViewModel

class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding
        private lateinit var adapter: MovieAdapter
        private val moviesViewModel: MovieViewModel by viewModels()

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityMainBinding.inflate(layoutInflater)
            setContentView(binding.root)
            adapter = MovieAdapter(emptyList())
            binding.rvMovies.layoutManager = LinearLayoutManager(this)
            binding.rvMovies.adapter = adapter

            moviesViewModel.movies.observe(this){movies ->
                adapter = MovieAdapter(movies.images)
            }


        }



}

