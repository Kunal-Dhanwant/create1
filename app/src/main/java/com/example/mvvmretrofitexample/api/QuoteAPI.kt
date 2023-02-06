package com.example.mvvmretrofitexample.api

import android.graphics.pdf.PdfDocument
import com.example.mvvmretrofitexample.model.QuoteList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteAPI {


    @GET("/quotes")
    suspend fun getQuotes(@Query("page")page:Int):Response<QuoteList>

}