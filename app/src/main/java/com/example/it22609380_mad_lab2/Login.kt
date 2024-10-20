package com.example.it22609380_mad_lab2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Login : AppCompatActivity() {

lateinit var signacc:TextView
lateinit var btnlogin:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        signacc=findViewById(R.id.textView5)

        signacc.setOnClickListener{
            val Intent=Intent(this,Signup::class.java)
            startActivity(Intent)

        }

        btnlogin=findViewById(R.id.logbutton)

        btnlogin.setOnClickListener{
            val Intent=Intent(this,Home::class.java)
            startActivity(Intent)
        }
    }
}