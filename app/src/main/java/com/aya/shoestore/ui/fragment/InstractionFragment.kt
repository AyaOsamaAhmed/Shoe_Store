package com.aya.shoestore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aya.shoestore.databinding.InstarctionFragmentBinding

class InstractionFragment : Fragment() {

    private lateinit var binding : InstarctionFragmentBinding


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = InstarctionFragmentBinding.inflate(inflater,container, false)




        return binding.root
    }
}