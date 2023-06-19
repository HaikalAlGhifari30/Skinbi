package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HOME_daily_log_2_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_daily_log2)
        val tohome = findViewById<Button>(R.id.btndaily2)

        tohome.setOnClickListener{
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back6)

        toback.setOnClickListener {
            Intent(this, HOME_daily_log_1_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}