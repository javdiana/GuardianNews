package com.javdiana.guardiannews

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.javdiana.guardiannews.NewsAdapter.NewsHolder
import com.javdiana.guardiannews.model.News
import kotlinx.android.synthetic.main.item_news.view.*

class NewsAdapter(
    var news: List<News>
) : RecyclerView.Adapter<NewsHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsHolder {
        return NewsHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_news, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return news.size
    }

    override fun onBindViewHolder(holder: NewsHolder, position: Int) {
        holder.bind(news[position])
    }

    class NewsHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(news: News) {
            itemView.news.text = news.title
        }
    }
}