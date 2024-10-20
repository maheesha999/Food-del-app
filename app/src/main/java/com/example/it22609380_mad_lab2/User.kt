package com.example.it22609380_mad_lab2

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class User : AppCompatActivity() {

    lateinit var home1:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        home1=findViewById(R.id.home)

        home1.setOnClickListener{
            val Intent=Intent(this,Home::class.java)
            startActivity(Intent)
        }
    }
}