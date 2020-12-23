package com.rifdahalf.furniture

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_furniture.view.*

class ListFurnitureAdapter (private val listFurniture: ArrayList<Furniture>) :
        RecyclerView.Adapter<ListFurnitureAdapter.ListViewHolder>(){

    class ListViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind (furniture: Furniture){
            with(itemView) {
                Glide.with(itemView.context).load(furniture.photo)
                    .apply(RequestOptions().override(60,60)).into(iv_list_furniture)
                tv_name_list.text = furniture.name
                tv_price_list.text = furniture.price
                tv_description_list.text = furniture.description
            }
        }

    }


    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ListFurnitureAdapter.ListViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_list_furniture, parent, false)
        return  ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListFurnitureAdapter.ListViewHolder, position: Int) {
        holder.bind(listFurniture[position])
    }

    override fun getItemCount(): Int = listFurniture.size

}