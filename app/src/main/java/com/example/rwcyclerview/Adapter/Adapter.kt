package com.example.rwcyclerview.Adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.rwcyclerview.Model.Constants
import com.example.rwcyclerview.Model.ExampleItem
import com.example.rwcyclerview.R
import com.example.rwcyclerview.Utils.SecondActivity


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

        //implement of set on click listener
        init{
            view.setOnClickListener{
                val pos = adapterPosition
                val element = element[pos]
                Toast.makeText(context,element.tittle,Toast.LENGTH_SHORT).show()

                //INTENT
                val intent = Intent(context, SecondActivity::class.java)
                intent.putExtra(Constants.Key_tittle,element.tittle)
                intent.putExtra(Constants.Key_value,element.decs)
                context.startActivity(intent)


            }
        }
    }
}