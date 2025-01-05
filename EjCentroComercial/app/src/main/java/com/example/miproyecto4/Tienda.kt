package com.example.miproyecto4

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Tienda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tienda)

        val nombreTiendaTextView1 = findViewById<TextView>(R.id.nomTienda1)
        val descripcionTextView1 = findViewById<TextView>(R.id.descr1)
        nombreTiendaTextView1.text = getString(R.string.nombre_tienda1)
        descripcionTextView1.text = getString(R.string.descripcion_tienda1)

        val nombreTiendaTextView2 = findViewById<TextView>(R.id.nomTienda2)
        val descripcionTextView2 = findViewById<TextView>(R.id.descr2)
        nombreTiendaTextView2.text = getString(R.string.nombre_tienda2)
        descripcionTextView2.text = getString(R.string.descripcion_tienda2)

        val nombreTiendaTextView3 = findViewById<TextView>(R.id.nomTienda3)
        val descripcionTextView3 = findViewById<TextView>(R.id.descr3)
        nombreTiendaTextView3.text = getString(R.string.nombre_tienda3)
        descripcionTextView3.text = getString(R.string.descripcion_tienda3)

        val nombreTiendaTextView4 = findViewById<TextView>(R.id.nomTienda4)
        val descripcionTextView4 = findViewById<TextView>(R.id.descr4)
        nombreTiendaTextView4.text = getString(R.string.nombre_tienda4)
        descripcionTextView4.text = getString(R.string.descripcion_tienda4)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
