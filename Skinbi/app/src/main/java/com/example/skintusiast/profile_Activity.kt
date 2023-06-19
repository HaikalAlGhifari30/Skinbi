package com.example.skintusiast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class profile_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
        val toedit = findViewById<Button>(R.id.btneditprofile)

        toedit.setOnClickListener {
            Intent(this, edit_profile_Activity::class.java).also {
                startActivity(it)
            }
        }

        val tologin = findViewById<Button>(R.id.btnlogout)

        tologin.setOnClickListener {
            Intent(this, Signin_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun profilehome(view: View) {
        val tohome = findViewById<ImageView>(R.id.profilehome)

        tohome.setOnClickListener {
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
    fun profileskin(view: View) {
        val toskin = findViewById<ImageView>(R.id.profileskin)

        toskin.setOnClickListener {
            Intent(this, My_Skin_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
    fun profileroutine(view: View) {
        val toroutine = findViewById<ImageView>(R.id.profileroutine)

        toroutine.setOnClickListener {
            Intent(this, myroutine_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}