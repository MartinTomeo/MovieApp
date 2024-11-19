package com.example.movieapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.movieapp.model.MovieResponse
import com.example.movieapp.model.RetrofitClient
import kotlinx.coroutines.launch


class MovieViewModel: ViewModel() {
    private val _movies = MutableLiveData<MovieResponse>()
    val movies: LiveData<MovieResponse> = _movies

    fun fetchMovie() {
            viewModelScope.launch {
                try {

                val response = RetrofitClient.api.getMovies()

                if (response.isSuccessful) {
                    _movies.value = response.body()
                }
                else {
                    // Handle error, e.g., log, show error message
                    Log.e("MovieViewModel", "Error fetching movies: ${response.code()}")
                }
            } catch (e: Exception) {
            // Handle network or other exceptions
            Log.e("MovieViewModel", "Error fetching movies", e)
        }
            }
    }
}