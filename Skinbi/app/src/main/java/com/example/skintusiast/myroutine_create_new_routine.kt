package com.example.skintusiast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class myroutine_create_new_routine : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myroutine_create_new_routine)
    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back13)

        toback.setOnClickListener {
            Intent(this, myroutine_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}