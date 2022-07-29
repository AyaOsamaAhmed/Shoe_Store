package com.aya.shoestore.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.NavHostFragment
import com.aya.shoestore.R
import com.aya.shoestore.databinding.ShoeListFragmentBinding
import com.aya.shoestore.domain.model.ShoeListModel
import com.aya.shoestore.ui.adapter.ShoeListAdapter
import com.aya.shoestore.ui.viewModel.ShoeListViewModel
import com.google.android.material.snackbar.Snackbar

class ShoeListFragment : Fragment() {

    private lateinit var binding : ShoeListFragmentBinding
    private lateinit var viewModel : ShoeListViewModel

    private lateinit var adapter : ShoeListAdapter

    private val navController by lazy {
        val navHostFragment =  activity?.supportFragmentManager
            ?.findFragmentById(R.id.nav_host_fragment_content_main) as NavHostFragment

        navHostFragment.navController
    }

    val image = "https://d5nunyagcicgy.cloudfront.net/external_assets/hero_examples/hair_beach_v391182663/original.jpeg"


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = ShoeListFragmentBinding.inflate(inflater,container, false)
        viewModel = ViewModelProvider(this).get(ShoeListViewModel::class.java)


        var arg = arguments?.let { ShoeListFragmentArgs.fromBundle(it) }



        viewModel.requestListMutableList.observe(viewLifecycleOwner, Observer {
            val data = it as ArrayList<ShoeListModel>
            if(! arg?.name.equals("empty"))
                data.add(ShoeListModel(image , arg?.name!!,arg.company!! ,arg.size!! , arg.desc!!  ))
            adapter = ShoeListAdapter(data)
            binding.recycler.adapter = adapter
        })

        binding.fabDetails.setOnClickListener { view ->
          //  Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show()
            navController.navigate(R.id.action_ShoeListFragment_to_ShoeDetailsFragment)

        }

        return binding.root
    }


}