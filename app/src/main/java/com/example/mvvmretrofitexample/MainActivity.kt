package com.example.mvvmretrofitexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvmretrofitexample.Repository.QuoteRepositry
import com.example.mvvmretrofitexample.ViewModel.MainViewModel
import com.example.mvvmretrofitexample.ViewModel.MainViewModelFactory
import com.example.mvvmretrofitexample.api.QuoteAPI
import com.example.mvvmretrofitexample.api.RetroFitHelper

class MainActivity : AppCompatActivity() {
    lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val quoteAPI = RetroFitHelper.getInstance().create(QuoteAPI::class.java)
        val repositry = QuoteRepositry(quoteAPI)

        mainViewModel = ViewModelProvider(this,MainViewModelFactory(repositry)).get(MainViewModel::class.java)

        mainViewModel.quotes.observe(this, Observer {
            Log.d("kunal",it.results.toString())
        })


       // git remote set-url origin https://Kunal-Dhanwant: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@github.com/Kunal-Dhanwant/Conduit-Android-Kotlin.git

    }
}