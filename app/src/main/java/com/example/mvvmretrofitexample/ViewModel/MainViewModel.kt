package com.example.mvvmretrofitexample.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mvvmretrofitexample.Repository.QuoteRepositry
import com.example.mvvmretrofitexample.model.QuoteList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainViewModel(private val repositry: QuoteRepositry):ViewModel() {


    init {
        viewModelScope.launch(Dispatchers.IO){
            repositry.getQuotes(1)
        }
    }

    val quotes:LiveData<QuoteList>
    get() = repositry.quotes
}