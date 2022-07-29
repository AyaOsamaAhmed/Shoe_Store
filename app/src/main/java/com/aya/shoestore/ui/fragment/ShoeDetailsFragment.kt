package com.aya.shoestore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.aya.shoestore.databinding.LoginFragmentBinding
import com.aya.shoestore.databinding.ShoeDetailsFragmentBinding
import com.aya.shoestore.ui.viewModel.ShoeDetailsViewModel
import com.aya.shoestore.ui.viewModel.ShoeListViewModel

class ShoeDetailsFragment : Fragment() {

    private lateinit var binding : ShoeDetailsFragmentBinding
    private lateinit var viewModel:ShoeDetailsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = ShoeDetailsFragmentBinding.inflate(inflater,container, false)
        viewModel = ViewModelProvider(this).get(ShoeDetailsViewModel::class.java)



        return binding.root
    }
}