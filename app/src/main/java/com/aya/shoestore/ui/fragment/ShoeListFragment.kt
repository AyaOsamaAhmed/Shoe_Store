package com.aya.shoestore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.aya.shoestore.databinding.ShoeListFragmentBinding
import com.google.android.material.snackbar.Snackbar

class ShoeListFragment : Fragment() {

    private lateinit var binding : ShoeListFragmentBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = ShoeListFragmentBinding.inflate(inflater,container, true)

        binding.fabDetails.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()

        }

        return binding.root
    }
}