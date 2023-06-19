package com.example.skintusiast

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HOME_skin_goal_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_skin_goal)
        val tohome = findViewById<Button>(R.id.btnskingoal)

        tohome.setOnClickListener{
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back7)

        toback.setOnClickListener {
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}