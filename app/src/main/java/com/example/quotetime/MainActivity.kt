package com.example.quotetime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val motivateButton = findViewById<Button>(R.id.btnMotivate)
        motivateButton.setOnClickListener {
            startActivity(Intent(this, MotivateActivity::class.java))
        }
        val inspireButton = findViewById<Button>(R.id.btnInspire)
        inspireButton.setOnClickListener {
            startActivity(Intent(this, InspireActivity::class.java))
        }
    }
}