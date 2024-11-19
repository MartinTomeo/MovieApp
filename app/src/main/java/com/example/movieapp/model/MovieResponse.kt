package com.example.movieapp.model

import com.google.gson.annotations.SerializedName

class MovieResponse (
    @SerializedName("status") var status: String,
    @SerializedName("message") var images: List<String>
)