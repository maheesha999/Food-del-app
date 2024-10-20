package com.example.it22609380_mad_lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signup : AppCompatActivity() {

    lateinit var signbtn:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        signbtn=findViewById(R.id.signbutton)

        signbtn.setOnClickListener{
            val Intent=Intent(this,Home::class.java)
            startActivity(Intent)
        }
    }
}