package com.nida.idn.myvegetables

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.item_list_vegetables.view.*

class List_VegetablesAdapter(private val listVegetables: ArrayList<Vegetables>) : RecyclerView.Adapter<List_VegetablesAdapter.ListViewHolder>() {
    class ListViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        fun bind(vegetables: Vegetables){
            with(itemView){
                Glide.with(itemView.context).load(vegetables.photo).apply(RequestOptions().override(60,60)).into(iv_list_vegetables)
                tv_name_list.text = vegetables.name
                tv_description_list.text = vegetables.description
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): List_VegetablesAdapter.ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list_vegetables, parent,false)
       return ListViewHolder(view)
    }

    override fun getItemCount(): Int = listVegetables.size

    override fun onBindViewHolder(holder: List_VegetablesAdapter.ListViewHolder, position: Int) {
       holder.bind(listVegetables[position])
    }
}