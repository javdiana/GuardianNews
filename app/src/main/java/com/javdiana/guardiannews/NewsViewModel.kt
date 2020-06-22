package com.javdiana.guardiannews

import com.javdiana.guardiannews.model.News

class NewsViewModel {
    val news = ArrayList<News>()

    init {
        news.add(News("news1"))
        news.add(News("news2"))
        news.add(News("news3"))
        news.add(News("news4"))
        news.add(News("news5"))
        news.add(News("news6"))
    }

    fun getNews(): List<News>{
        return news
    }
}