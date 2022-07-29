package com.aya.shoestore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.aya.shoestore.R
import com.aya.shoestore.databinding.InstarctionFragmentBinding

class InstractionFragment : Fragment() {

    private lateinit var binding : InstarctionFragmentBinding

    private val navController by lazy {
        val navHostFragment =  activity?.supportFragmentManager
            ?.findFragmentById(R.id.nav_host_fragment_content_main) as NavHostFragment

        navHostFragment.navController
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = InstarctionFragmentBinding.inflate(inflater,container, false)



        binding.shoeList.setOnClickListener {
            navController.navigate(R.id.action_InstractionFragment_to_ShoeListFragment)
        }

        return binding.root
    }
}