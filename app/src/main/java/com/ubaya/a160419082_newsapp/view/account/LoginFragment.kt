package com.ubaya.a160419082_newsapp.view.account

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.ubaya.a160419082_newsapp.R
import com.ubaya.a160419082_newsapp.util.loadImage
import kotlinx.android.synthetic.main.fragment_login.*
import kotlinx.android.synthetic.main.fragment_login.view.*
import kotlinx.android.synthetic.main.fragment_profile.view.*

class LoginFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.imageViewLoginPage.loadImage("https://as1.ftcdn.net/v2/jpg/00/88/43/58/1000_" +
                "F_88435847_HhglbcoGP5qOX3DfudP3hN5z95eTrHqz.jpg",view.progressBarLoginPage)

        btnLogin.setOnClickListener {
            val toast = Toast.makeText(context, "Logged in, enjoy the app!", Toast.LENGTH_SHORT)
            toast.show()

            val login = LoginFragmentDirections.actionNewsList()
            Navigation.findNavController(it).navigate(login)
        }

        btnRegisterOnLoginPage.setOnClickListener {
            val register = LoginFragmentDirections.actionRegister()
            Navigation.findNavController(it).navigate(register)
        }
    }
}