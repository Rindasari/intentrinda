package com.example.intentrinda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MoveWithDataActivity : AppCompatActivity() {
    private lateinit var tvDataReceved: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_move_with_data)

        tvDataReceved = findViewById(R.id.tv_data_receved)
        DataReceved()
    }

    private fun DataReceved() {
        val bundle = intent.extras
        val nama = bundle?.getString("Nama")
        val alamat = bundle?.getString("Alamat")

        tvDataReceved.text = nama + " " + alamat

    }
}