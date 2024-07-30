package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)

//        setContentView(R.layout.activity_main)
//        val name: TextView = findViewById(R.id.name)
//        val lastname: TextView = findViewById(R.id.lastname)
//        val email: TextView = findViewById(R.id.email)
//        val submit: Button = findViewById(R.id.submit)
//        val data: CheckBox = findViewById(R.id.data)
//
//        val text: TextView = findViewById(R.id.textView6)
//
//        submit.setOnClickListener{
//
//            if (name.text.isEmpty() || lastname.text.isEmpty() || email.text.isEmpty()) {
//                text.text = "Please change the empty fields"
//                return@setOnClickListener
//            }
//
//            if (!data.isChecked) {
//                text.text = "Terms and conditions"
//                return@setOnClickListener
//            }
//
//            text.text = "${name.text} ${lastname.text}"
//        }

    }
}
