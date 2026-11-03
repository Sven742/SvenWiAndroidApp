package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Aantal ontvangen en tonen
        val aantal = intent.getIntExtra("AANTAL", 0)
        val tekst = findViewById<TextView>(R.id.textView21)
        tekst.text = "$aantal"

        val knop = findViewById<Button>(R.id.button7)
        knop.setOnClickListener {
            val volgendeIntent = Intent(this, MainActivity5::class.java)
            volgendeIntent.putExtra("AANTAL", aantal)
            startActivity(volgendeIntent)
        }

        val terug = findViewById<Button>(R.id.button6)
        terug.setOnClickListener {
            finish()
        }
    }
}