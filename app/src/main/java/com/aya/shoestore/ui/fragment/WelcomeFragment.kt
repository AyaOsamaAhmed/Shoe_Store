package com.aya.shoestore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aya.shoestore.databinding.WelcomeScreenBinding

class WelcomeFragment : Fragment() {

    private lateinit var binding : WelcomeScreenBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = WelcomeScreenBinding.inflate(inflater,container, true)




        return binding.root
    }
}