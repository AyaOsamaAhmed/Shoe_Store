package com.aya.shoestore.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.aya.shoestore.R
import com.aya.shoestore.BR
import com.aya.shoestore.databinding.ShoeItemBinding
import com.aya.shoestore.domain.model.ShoeListModel

class ShoeListAdapter (
    private var list: ArrayList<ShoeListModel>

        ) : RecyclerView.Adapter<ShoeListAdapter.ViewHolderShoeList>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderShoeList {
        val binding: ShoeItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.shoe_item, parent, false
        )
        return ViewHolderShoeList(binding)
    }

    override fun onBindViewHolder(holder: ViewHolderShoeList, position: Int) {
        val model = list[position]
        holder.bind(model)

    }

    override fun getItemCount(): Int {
        return if (list.size > 0) list.size else 0
    }

    class ViewHolderShoeList(binding: ShoeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        var itemRowBinding: ShoeItemBinding = binding
        fun bind(data: ShoeListModel) {
            itemRowBinding.setVariable(BR.model, data)
            itemRowBinding.executePendingBindings()
        }
    }
}