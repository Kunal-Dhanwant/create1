package com.example.mvvmretrofitexample.Repository

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.mvvmretrofitexample.api.QuoteAPI
import com.example.mvvmretrofitexample.model.QuoteList

class QuoteRepositry(private  val quoteAPI: QuoteAPI) {


    private  val quoteslivedata = MutableLiveData<QuoteList>()

        val quotes : LiveData<QuoteList>
          get() = quoteslivedata



    suspend fun  getQuotes(page :Int){

        val result = quoteAPI.getQuotes(page)

        if(result?.body()!=null){

            quoteslivedata.postValue(result.body())

        }
    }
}




