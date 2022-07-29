package com.aya.shoestore.ui.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aya.shoestore.domain.model.ShoeListModel

class ShoeDetailsViewModel : ViewModel() {

     var requestListMutableList = MutableLiveData<Any>()
      var ShoeList : ArrayList<ShoeListModel> = arrayListOf()


    val image = "https://d5nunyagcicgy.cloudfront.net/external_assets/hero_examples/hair_beach_v391182663/original.jpeg"
    init{
        locatDataShoeList()
    }

    fun locatDataShoeList(){
        repeat(10){ i->
            val data = ShoeListModel( image , "Title $i")
            ShoeList.add(data)
        }
        requestListMutableList.value = ShoeList
    }

}