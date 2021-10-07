package com.ubaya.a160419082_newsapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.ubaya.a160419082_newsapp.R
import kotlinx.android.synthetic.main.fragment_add_news.*

class AddNewsFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_add_news, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnAddNews.setOnClickListener {
            val toast = Toast.makeText(context, "News added succesfully!", Toast.LENGTH_SHORT)
            toast.show()

            val action = AddNewsFragmentDirections.actionMyNews()
            Navigation.findNavController(it).navigate(action)
        }
    }
}