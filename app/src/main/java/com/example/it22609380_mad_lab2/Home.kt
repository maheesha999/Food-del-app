package com.example.it22609380_mad_lab2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class Home :AppCompatActivity(){

      lateinit var user:ImageView
    lateinit var pizza:ImageView


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

       user=findViewById(R.id.profile)

        user.setOnClickListener{
            val Intent=Intent(this,User::class.java)
            startActivity(Intent)
        }

        pizza=findViewById(R.id.imageView10)

        pizza.setOnClickListener{
            val Intent=Intent(this,Pizza::class.java)
            startActivity(Intent)
        }
    }
}