package com.example.profile

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class rcvAdapter(val requiredContext: Context,private val data:ArrayList<data_class1>):
    RecyclerView.Adapter<rcvAdapter.exampleViewHolder>() {

    class exampleViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {

        val name: TextView=itemView.findViewById(R.id.text_view_item_1)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): exampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rcv_items,parent,false)
        return exampleViewHolder((view))


    }

    override fun getItemCount(): Int {
        return data.size

    }

    override fun onBindViewHolder(holder: exampleViewHolder, position: Int) {

        holder.name.text=data[position].name

    }
}