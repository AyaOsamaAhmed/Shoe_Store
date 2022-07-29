package com.aya.shoestore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.NavHostFragment
import com.aya.shoestore.R
import com.aya.shoestore.databinding.ShoeDetailsFragmentBinding

class ShoeDetailsFragment : Fragment() {

    private lateinit var binding : ShoeDetailsFragmentBinding

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

        binding = ShoeDetailsFragmentBinding.inflate(inflater,container, false)


        binding.cancle.setOnClickListener {
        navController.navigate(R.id.action_ShoeDetailsFragment_to_ShoeListFragment)
        }

        binding.save.setOnClickListener {
            val name = binding.name.text.toString()
            val company = binding.company.text.toString()
            val size = binding.size.text.toString()
            val desc = binding.desc.text.toString()
            navController.navigate(ShoeDetailsFragmentDirections.actionShoeDetailsFragmentToShoeListFragment(name,company,size, desc))
        }

        return binding.root
    }
}