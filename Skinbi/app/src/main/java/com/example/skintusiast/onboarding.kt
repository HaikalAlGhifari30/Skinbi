package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class onboarding : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        val tosignin = findViewById<Button>(R.id.btngetstar)

        tosignin.setOnClickListener{
            Intent(this, Signin_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}