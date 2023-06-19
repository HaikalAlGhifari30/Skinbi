package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HOME_your_skintype_3_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_your_skintype3)
        val toskin4 = findViewById<Button>(R.id.btnskintype3)

        toskin4.setOnClickListener{
            Intent(this, HOME_your_skintype_4_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back10)

        toback.setOnClickListener {
            Intent(this, HOME_your_skintype_2_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}
