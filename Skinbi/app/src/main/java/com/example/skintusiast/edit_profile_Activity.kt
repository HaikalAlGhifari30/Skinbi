package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class edit_profile_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)
        val tosave = findViewById<Button>(R.id.btnsaveeditprofile)

        tosave.setOnClickListener {
            Intent(this, profile_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back15)

        toback.setOnClickListener {
            Intent(this, profile_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}