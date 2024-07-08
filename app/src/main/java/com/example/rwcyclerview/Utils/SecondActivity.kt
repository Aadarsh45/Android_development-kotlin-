package com.example.rwcyclerview.Utils

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.rwcyclerview.Model.Constants
import com.example.rwcyclerview.R

class SecondActivity : AppCompatActivity() {
    private lateinit var tittleTextView: TextView
    private lateinit var descTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         setContentView(R.layout.activity_second)
        tittleTextView = findViewById(R.id.tittleTextView)
        descTextView = findViewById(R.id.descTextView)

        val data = intent.extras
        data.let {
            tittleTextView.text = it?.getString(Constants.Key_tittle)
            descTextView.text = it?.getString(Constants.Key_value)

        }
    }
}