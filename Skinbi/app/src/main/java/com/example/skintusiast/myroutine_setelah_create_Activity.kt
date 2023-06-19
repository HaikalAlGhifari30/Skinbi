package com.example.skintusiast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class myroutine_setelah_create_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_myroutine_setelah_create)
    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back14)

        toback.setOnClickListener {
            Intent(this, myroutine_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}