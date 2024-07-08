package com.example.rwcyclerview.Utils

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.rwcyclerview.Adapter.ExampleAdaper
import com.example.rwcyclerview.Model.ExampleItem
import com.example.rwcyclerview.R
import com.example.rwcyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ExampleAdaper
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = genericList(100)
        adapter = ExampleAdaper(this,exampleList)
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)



        }
    private fun genericList(size:Int):MutableList<ExampleItem> {
        val list = mutableListOf<ExampleItem>()

        for(i in 0 until size){
            list.add(ExampleItem("Title $i","Description $i"))
        }
        return list

    }
}
