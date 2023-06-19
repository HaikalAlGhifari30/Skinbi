package com.example.skintusiast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Register_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val tocameraregis = findViewById<Button>(R.id.btnnext)

        tocameraregis.setOnClickListener{
            Intent(this, Camera_Register_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}