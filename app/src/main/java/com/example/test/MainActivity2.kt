package com.example.test

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {


    private var tellerMargherita = 0
    private var tellerPepperoni = 0
    private var tellerHawaii = 0
    private var tellerPaddenstoel = 0
    private var tellerStuffedCrust = 0
    private var tellerPerfectPepperoni = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)




        val btnPlusMarg = findViewById<Button>(R.id.button10)
        btnPlusMarg.setOnClickListener { tellerMargherita++ }


        val btnPlusPep = findViewById<Button>(R.id.button11)
        btnPlusPep.setOnClickListener { tellerPepperoni++ }


        val btnPlusHawaii = findViewById<Button>(R.id.button)
        btnPlusHawaii.setOnClickListener { tellerHawaii++ }


        val btnPlusPad = findViewById<Button>(R.id.button9)
        btnPlusPad.setOnClickListener { tellerPaddenstoel++ }


        val btnPlusStuffed = findViewById<Button>(R.id.button13)
        btnPlusStuffed.setOnClickListener { tellerStuffedCrust++ }


        val btnPlusPerfPep = findViewById<Button>(R.id.button14)
        btnPlusPerfPep.setOnClickListener { tellerPerfectPepperoni++ }



        val btnBestellen = findViewById<Button>(R.id.button18)
        btnBestellen.setOnClickListener {
            val intent = Intent(this, MainActivity4::class.java)


            intent.putExtra("BESTELLING_MARGHERITA", tellerMargherita)
            intent.putExtra("BESTELLING_PEPPERONI", tellerPepperoni)
            intent.putExtra("BESTELLING_HAWAII", tellerHawaii)
            intent.putExtra("BESTELLING_PADDENSTOEL", tellerPaddenstoel)
            intent.putExtra("BESTELLING_STUFFED", tellerStuffedCrust)
            intent.putExtra("BESTELLING_PERFECT_PEP", tellerPerfectPepperoni)

            startActivity(intent)
        }


        val terug = findViewById<Button>(R.id.button3)
        terug.setOnClickListener { finish() }
    }
}