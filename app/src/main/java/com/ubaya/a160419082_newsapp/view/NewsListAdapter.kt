package com.ubaya.a160419082_newsapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.ubaya.a160419082_newsapp.R
import com.ubaya.a160419082_newsapp.model.News
import com.ubaya.a160419082_newsapp.util.loadImage
import kotlinx.android.synthetic.main.news_list_item.view.*

class   NewsListAdapter(val newsList:ArrayList<News>): RecyclerView.Adapter<NewsListAdapter.NewsViewHolder>() {
    class NewsViewHolder(val view: View):RecyclerView.ViewHolder(view)

    fun updateNewsList(newNewsList:List<News>){
        newsList.clear()
        newsList.addAll(newNewsList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.news_list_item,parent,false)
        return NewsViewHolder(v)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        holder.view.txtAuthor.text = newsList[position].author
        holder.view.txtTitle.text = newsList[position].title
        holder.view.imageView.loadImage(newsList[position].url,holder.view.progressBarItem)

        holder.view.btnDetail.setOnClickListener {
            val author = newsList[position].author
            val title = newsList[position].title
            val description = newsList[position].description
            val url = newsList[position].url
            val action = NewsListFragmentDirections.actionNewsDetail(author.toString(),title.toString(),description.toString(),url.toString())
            Navigation.findNavController(it).navigate(action)
        }

    }

    override fun getItemCount(): Int {
        return newsList.size
    }
}