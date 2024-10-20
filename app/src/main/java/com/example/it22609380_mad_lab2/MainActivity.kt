package com.example.it22609380_mad_lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnsecond:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnsecond=findViewById(R.id.button)

        btnsecond.setOnClickListener {
            val Intent=Intent(this,Login::class.java)
            startActivity(Intent)
        }


    }
}