package com.aya.shoestore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aya.shoestore.databinding.LoginFragmentBinding
import com.aya.shoestore.databinding.ShoeDetailsFragmentBinding

class ShoeDetailsFragment : Fragment() {

    private lateinit var binding : ShoeDetailsFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ShoeDetailsFragmentBinding.inflate(inflater,container, true)


        return binding.root
    }
}