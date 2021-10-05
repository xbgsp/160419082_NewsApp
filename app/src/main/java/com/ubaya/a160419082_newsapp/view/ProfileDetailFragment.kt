package com.ubaya.a160419082_newsapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.snackbar.Snackbar
import com.ubaya.a160419082_newsapp.R
import com.ubaya.a160419082_newsapp.util.loadImage
import kotlinx.android.synthetic.main.fragment_profile.view.*
import kotlinx.android.synthetic.main.fragment_profile_detail.*
import kotlinx.android.synthetic.main.fragment_profile_detail.view.*

class ProfileDetailFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txtNameDetail.setText("Herliansyah Bagus")
        txtEmailDetail.setText("bxxgsp@gmail.com")
        txtPhoneNumberDetail.setText("0858-0508-4879")

        view.imageViewProfileDetail.loadImage("https://upload.wikimedia.org/wikipedia/commons" +
                "/e/e8/Chris_Hemsworth_by_Gage_Skidmore_2_%28cropped%29.jpg",view.progressBarProfileDetail)
    }
}