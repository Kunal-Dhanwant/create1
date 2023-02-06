package com.example.mvvmretrofitexample.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetroFitHelper {

    private  val BASE_URL = "https://quotable.io"

    fun getInstance():Retrofit{

        return Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
    }
}