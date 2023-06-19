package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class myroutine_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myroutine)

        val tonewroutine = findViewById<Button>(R.id.btnnewroutine)

        tonewroutine.setOnClickListener {
            Intent(this, myroutine_create_new_routine::class.java).also {
                startActivity(it)
            }
        }
    }

    fun home(view: View) {
        val tohome = findViewById<ImageView>(R.id.routinehome)

        tohome.setOnClickListener {
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
    fun skin(view: View) {
        val toskin = findViewById<ImageView>(R.id.routineskin)

        toskin.setOnClickListener {
            Intent(this, My_Skin_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
    fun profile(view: View) {
        val toprofile = findViewById<ImageView>(R.id.routineprofile)

        toprofile.setOnClickListener {
            Intent(this, profile_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun setelah(view: View) {
        val tosetelah = findViewById<LinearLayout>(R.id.linearsetelah)

        tosetelah.setOnClickListener {
            Intent(this, myroutine_setelah_create_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}