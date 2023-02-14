package com.example.foodrunner

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Recycler


class ItemAdapter(
    private val context: Context,
    private val dataset: List<Menue>): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    class ItemViewHolder(private val view:View):RecyclerView.ViewHolder(view) {

        val textView1: TextView = view.findViewById(R.id.textViewProdTitle)
        val textView2:TextView = view.findViewById(R.id.textViewProdRes)
        val textView3:TextView = view.findViewById(R.id.textViewProdPrice)
        val imageView: ImageView = view.findViewById(R.id.imageViewProduct)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent , false)
        return ItemViewHolder(adapterLayout)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView1.text = context.resources.getString(item.stringResourceId1)
        holder.textView2.text = context.resources.getString(item.stringResourceId2)
        holder.textView3.text = context.resources.getString(item.stringResourceId3)
        holder.imageView.setImageResource(item.imageResourceId)
    }
}