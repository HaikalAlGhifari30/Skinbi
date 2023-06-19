package com.example.skintusiast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class My_Skin_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_skin)
    }

    fun myskinhome(view: View) {
        val tohome = findViewById<ImageView>(R.id.myskinhome)

        tohome.setOnClickListener {
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
    fun myskinprofile(view: View) {
        val toprofile = findViewById<ImageView>(R.id.myskinprofile)

        toprofile.setOnClickListener {
            Intent(this, profile_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
    fun routine(view: View) {
        val toroutine = findViewById<ImageView>(R.id.myskinroutine)

        toroutine.setOnClickListener {
            Intent(this, myroutine_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}