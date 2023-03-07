package com.example.mylgrowth.data.service

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET("/movies")
    fun getMovies(): Call<Void>

    @GET("/movie/{id}")
    fun getMovieById(@Path("movieId") movieId: String): Call<Void>
}