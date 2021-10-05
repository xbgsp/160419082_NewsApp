package com.ubaya.a160419082_newsapp.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ubaya.a160419082_newsapp.R
import com.ubaya.a160419082_newsapp.model.MyNews
import com.ubaya.a160419082_newsapp.util.loadImage
import kotlinx.android.synthetic.main.mynews_list_item.view.*

class MyNewsAdapter(val myNewsList:ArrayList<MyNews>): RecyclerView.Adapter<MyNewsAdapter.MyNewsViewHolder>() {
    class MyNewsViewHolder(val view: View) : RecyclerView.ViewHolder(view)

    fun updateMyNewsList(newBookList:List<MyNews>){
        myNewsList.clear()
        myNewsList.addAll(newBookList)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyNewsViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.mynews_list_item,parent,false)

        return MyNewsViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyNewsViewHolder, position: Int) {
        holder.view.txtAuthorMyNews.text = myNewsList[position].author
        holder.view.txtTitleMyNews.text = myNewsList[position].title
        holder.view.txtDescriptionMyNews.text = myNewsList[position].description
        holder.view.imageViewMyNews.loadImage(myNewsList[position].url,holder.view.progressBarMyNews)

    }

    override fun getItemCount(): Int {
        return myNewsList.size
    }
}