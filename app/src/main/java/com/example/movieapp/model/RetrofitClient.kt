package com.example.movieapp.model


import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitClient {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://dog.ceo/api/breed/hound/images")
        .addConverterFactory(GsonConverterFactory.create())
        .build()


    val api: ApiService = retrofit.create(ApiService::class.java)
}