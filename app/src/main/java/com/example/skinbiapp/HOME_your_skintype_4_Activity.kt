package com.example.skinbiapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HOME_your_skintype_4_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_your_skintype4)
        val toskindone = findViewById<Button>(R.id.btnskintype4)

        toskindone.setOnClickListener {
            Intent(this, HOME_your_skintype_done_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun back() {
        val toback = findViewById<ImageView>(R.id.back11)

        toback.setOnClickListener {
            Intent(this, HOME_your_skintype_3_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}
