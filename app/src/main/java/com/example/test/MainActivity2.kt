package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val count = findViewById<TextView>(R.id.Aantal)
        val btnOmhoog = findViewById<Button>(R.id.button10)
        val btnOmlaag = findViewById<Button>(R.id.button385)
        val volgende = findViewById<Button>(R.id.button18)
        val terug = findViewById<Button>(R.id.button3)
        var aantal = 0

        btnOmhoog.setOnClickListener {
            aantal++
            count.text = "$aantal"
        }

        btnOmlaag.setOnClickListener {
            if (aantal > 0) aantal--
            count.text = "$aantal"
        }

        volgende.setOnClickListener {
            val volgendeIntent = Intent(this, MainActivity3::class.java)
            volgendeIntent.putExtra("AANTAL", aantal)
            startActivity(volgendeIntent)
        }

        terug.setOnClickListener {
            finish()
        }
    }
}