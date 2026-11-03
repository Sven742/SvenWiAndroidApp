package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Aantal ontvangen (wordt niet getoond, alleen doorgegeven)
        val aantal = intent.getIntExtra("AANTAL", 0)

        val knop = findViewById<Button>(R.id.button4)
        knop.setOnClickListener {
            val volgendeIntent = Intent(this, MainActivity4::class.java)
            volgendeIntent.putExtra("AANTAL", aantal)
            startActivity(volgendeIntent)
        }

        val terug = findViewById<Button>(R.id.button5)
        terug.setOnClickListener {
            finish()
        }
    }
}