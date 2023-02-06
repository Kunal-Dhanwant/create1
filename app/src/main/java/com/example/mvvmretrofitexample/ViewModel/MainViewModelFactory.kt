package com.example.mvvmretrofitexample.ViewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmretrofitexample.Repository.QuoteRepositry

class MainViewModelFactory(private val repositry: QuoteRepositry ):ViewModelProvider.Factory {


    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repositry) as T
    }

}