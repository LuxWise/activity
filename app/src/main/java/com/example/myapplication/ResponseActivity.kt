package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class ResponseActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_response)

        // Obtener las variables pasadas desde MainActivity
        val name = intent.getStringExtra("NAME")
        val lastname = intent.getStringExtra("LASTNAME")
        val email = intent.getStringExtra("EMAIL")

        val nameResponse = findViewById<TextView>(R.id.NameResponse)
        val lastnameResponse = findViewById<TextView>(R.id.LastnameResponse)
        val emailResponse = findViewById<TextView>(R.id.EmailResponse)
        val submitResponse = findViewById<Button>(R.id.submitResponse)

        nameResponse.text = name
        lastnameResponse.text = lastname
        emailResponse.text = email

        submitResponse.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }



    }
}