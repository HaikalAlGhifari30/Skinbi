package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HOME_your_skintype_2_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_your_skintype2)
        val toskin3 = findViewById<Button>(R.id.btnskintype2)

        toskin3.setOnClickListener{
            Intent(this, HOME_your_skintype_3_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back9)

        toback.setOnClickListener {
            Intent(this, HOME_your_skintype_1_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}