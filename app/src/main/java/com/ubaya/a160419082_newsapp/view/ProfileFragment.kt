package com.ubaya.a160419082_newsapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.ubaya.a160419082_newsapp.R
import com.ubaya.a160419082_newsapp.util.loadImage
import kotlinx.android.synthetic.main.fragment_profile.*
import kotlinx.android.synthetic.main.fragment_profile.view.*

class ProfileFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        txtNameProfile.setText("Herliansyah Bagus")
        txtEmailProfile.setText("bxxgsp@gmail.com")

        view.imageViewProfile.loadImage("https://upload.wikimedia.org/wikipedia/commons/e/e8/" +
                "Chris_Hemsworth_by_Gage_Skidmore_2_%28cropped%29.jpg",view.progressBarProfile)

        btnDetailProfile.setOnClickListener {
            val action = ProfileFragmentDirections.actionProfileDetail()
            Navigation.findNavController(it).navigate(action)
        }
    }
}