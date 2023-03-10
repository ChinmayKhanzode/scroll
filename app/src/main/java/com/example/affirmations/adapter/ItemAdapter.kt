package com.example.affirmations.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.R
import com.example.affirmations.model.Affrimation


class ItemAdapter(private val context : Context,
                  private val dataset : List<Affrimation>
                  ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{


    class ItemViewHolder(private val view : View) : RecyclerView.ViewHolder(view)
    {
        val txtview :TextView = view.findViewById(R.id.item_title)
        val imgview:ImageView =view.findViewById(R.id.item_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {

        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item,parent,false)
        return ItemViewHolder(adapterLayout)

    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

        val item = dataset[position]
        holder.imgview.setImageResource(item.imageResourceId)
        holder.txtview.text = context.resources.getString(item.stringResourceId)

    }

    override fun getItemCount(): Int {

        return dataset.size
    }


}