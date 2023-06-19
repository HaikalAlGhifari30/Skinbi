package com.example.skintusiast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class signup_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val toregis = findViewById<Button>(R.id.btnregiscamera)

        toregis.setOnClickListener{
            Intent(this, Camera_Register_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}