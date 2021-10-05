package com.ubaya.a160419082_newsapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.ubaya.a160419082_newsapp.R
import com.ubaya.a160419082_newsapp.util.loadImage
import kotlinx.android.synthetic.main.fragment_news_detail.*
import kotlinx.android.synthetic.main.fragment_news_detail.view.*

class NewsDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_news_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(arguments!=null){
            val author = NewsDetailFragmentArgs.fromBundle(requireArguments()).author
            val title = NewsDetailFragmentArgs.fromBundle(requireArguments()).title
            val description = NewsDetailFragmentArgs.fromBundle(requireArguments()).description
            val url = NewsDetailFragmentArgs.fromBundle(requireArguments()).url
            txtAuthorDetail.text = "$author"
            txtTitleDetail.text = "$title"
            txtDescriptionDetail.text = "$description"
            view.imageViewDetail.loadImage(url,view.progressBarDetail)

        }
    }
}