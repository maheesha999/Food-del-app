package com.example.it22609380_mad_lab2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class SalmiPizza : AppCompatActivity() {

    lateinit var backpizza:ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_salmi_pizza)

        backpizza=findViewById(R.id.imageView26)

        backpizza.setOnClickListener{
            val Intent=Intent(this,Pizza::class.java)
            startActivity(Intent)
        }
    }
}