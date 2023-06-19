package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class HOME_your_skintype_done_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_your_done)

        val tohome = findViewById<Button>(R.id.btnskindone)
        tohome.setOnClickListener{
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back12)

        toback.setOnClickListener {
            Intent(this, HOME_your_skintype_4_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun retake(view: View) {
        val toback = findViewById<TextView>(R.id.retake)

        toback.setOnClickListener {
            Intent(this, HOME_your_skintype_1_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}