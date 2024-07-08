package com.example.rwcyclerview.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.rwcyclerview.Model.ExampleItem
import com.example.rwcyclerview.R



class ExampleAdaper(val context: Context,val element:MutableList<ExampleItem>)
    : RecyclerView.Adapter<ExampleAdaper.ExampleViewHolder>() {




    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ExampleViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return ExampleViewHolder(view)

    }

    override fun onBindViewHolder(holder:ExampleViewHolder, position: Int) {
       val currentItem = element[position]
        holder.title.text = currentItem.tittle
        holder.desc.text = currentItem.decs
    }

    override fun getItemCount(): Int {
        return element.size
    }

    inner class ExampleViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.tv1)
        val desc: TextView = view.findViewById(R.id.tv2)
    }
}