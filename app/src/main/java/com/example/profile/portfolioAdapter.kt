package com.example.profile

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView


class portfolioAdapter(val requiredContext: Context, private val data:ArrayList<portfolio_data_class>):
    RecyclerView.Adapter<portfolioAdapter.exampleViewHolder>() {

    class exampleViewHolder(itemView: View) :RecyclerView.ViewHolder(itemView) {


        val title: TextView =itemView.findViewById(R.id.text_view_project_title)
        val description: TextView=itemView.findViewById(R.id.text_view_description)
        val picture: ImageView=itemView.findViewById(R.id.image_view_project_icon)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): exampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_project,parent,false)
        return exampleViewHolder((view))


    }

    override fun getItemCount(): Int {
        return this.data.size

    }

    override fun onBindViewHolder(holder: exampleViewHolder, position: Int) {

        val currentItem = data.getOrNull(position)
        if (currentItem != null) {
            holder.title.text = currentItem.name ?: "No Name"
            holder.description.text = currentItem.description ?: "No Description"
            holder.picture.setImageResource(currentItem.image)
        } else {
            Log.e("Adapter", "Item at position $position is null.")
        }


    }



}