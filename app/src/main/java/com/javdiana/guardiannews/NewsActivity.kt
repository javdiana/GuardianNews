package com.javdiana.guardiannews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class NewsActivity : AppCompatActivity() {
    val newsViewModel = NewsViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initAdapter()
    }

    fun initAdapter() {
        news.layoutManager = LinearLayoutManager(this)
        news.adapter = NewsAdapter(newsViewModel.getNews())
    }
}