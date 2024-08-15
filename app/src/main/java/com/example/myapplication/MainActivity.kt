package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name: TextView = findViewById(R.id.name)
        val lastname: TextView = findViewById(R.id.lastname)
        val email: TextView = findViewById(R.id.email)
        val submit: Button = findViewById(R.id.submitResponse)
        val text: TextView = findViewById(R.id.textView6)

        submit.setOnClickListener {

            // Crear el Intent para iniciar ResponseActivity
            val intent = Intent(this, ResponseActivity::class.java)

            // Pasar la variable 'name' a la siguiente actividad
            intent.putExtra("NAME", name.text.toString())
            intent.putExtra("LASTNAME", lastname.text.toString())
            intent.putExtra("EMAIL", email.text.toString())

            startActivity(intent)
        }
    }
}
