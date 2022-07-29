package com.aya.shoestore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.aya.shoestore.R
import com.aya.shoestore.databinding.LoginFragmentBinding

class LoginFragment : Fragment() {

    private lateinit var binding : LoginFragmentBinding

    private val navController by lazy {
        val navHostFragment =  activity?.supportFragmentManager
            ?.findFragmentById(R.id.nav_host_fragment_content_main) as NavHostFragment

        navHostFragment.navController
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = LoginFragmentBinding.inflate(inflater,container, false)


        binding.login.setOnClickListener {
            navController.navigate(R.id.action_LoginFragment_to_WelcomeFragment)
        }

        return binding.root
    }
}