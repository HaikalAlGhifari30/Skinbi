package com.example.skintusiast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Signin_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val tologin = findViewById<Button>(R.id.btnregiscamera)
        val toregister = findViewById<Button>(R.id.btnregister)

        tologin.setOnClickListener{
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }

        toregister.setOnClickListener{
            Intent(this, signup_activity::class.java).also {
                startActivity(it)
            }
        }
    }
}