package com.example.myapplication

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity(), View.OnClickListener {
    lateinit var etCiudad:EditText
    lateinit var btAdicionar:Button
    lateinit var btEliminar:Button
    lateinit var lvCiudad:ListView

    lateinit var adapterCiudades: ArrayAdapter<String>
    lateinit var listCiudad:MutableList<String>
    lateinit var sCiudad:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)


        btAdicionar= findViewById(R.id.butnAdicionar)
        etCiudad= findViewById(R.id.editTextCiudad)
        lvCiudad= findViewById(R.id.LvCiudades)
        btAdicionar.setOnClickListener(this)
        btEliminar= findViewById(R.id.delete)

        listCiudad= arrayListOf(
            "Bogota",
            "Cali",
            "Medellin",
        )

        adapterCiudades= ArrayAdapter(this, android.R.layout.simple_list_item_1, listCiudad)
        adapterCiudades.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        lvCiudad.adapter=adapterCiudades

        var selectedView: View? = null

        lvCiudad.setOnItemClickListener { parent, view, position, id ->
            sCiudad = listCiudad[position]

            selectedView?.setBackgroundColor(Color.TRANSPARENT)
            view.setBackgroundColor(Color.parseColor("#FFC107"))
            selectedView = view
        }

        btEliminar.setOnClickListener {
            listCiudad.remove(sCiudad)
            adapterCiudades.notifyDataSetChanged()
        }

        btAdicionar.setOnClickListener {
            sCiudad= etCiudad.text.toString()

            if (sCiudad.isEmpty()){
                etCiudad.error="Debe ingresar una ciudad"
                return@setOnClickListener
            } else if (listCiudad.contains(sCiudad)){
                etCiudad.error="La ciudad ya existe"
                return@setOnClickListener
            }

            listCiudad.add(sCiudad)
            adapterCiudades.notifyDataSetChanged()
        }



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

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}
