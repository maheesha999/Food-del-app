package com.example.it22609380_mad_lab2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class Pizza : AppCompatActivity() {

    lateinit var salami:CardView
    lateinit var homeback:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pizza)

        salami=findViewById(R.id.view1)

        salami.setOnClickListener{

            val Intent=Intent(this,SalmiPizza::class.java)
            startActivity(Intent)
        }

        homeback=findViewById(R.id.imageView22)

        homeback.setOnClickListener{
            val Intent=Intent(this,Home::class.java)
            startActivity(Intent)
        }
    }
}