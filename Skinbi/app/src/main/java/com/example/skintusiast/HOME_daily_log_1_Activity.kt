package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HOME_daily_log_1_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_daily_log1)
        val todaily1 = findViewById<Button>(R.id.btndaily1)

        todaily1.setOnClickListener{
            Intent(this, HOME_daily_log_2_Activity::class.java).also {
                startActivity(it)
            }
        }

    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back5)

        toback.setOnClickListener {
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}