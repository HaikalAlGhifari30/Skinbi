package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class HOME_add_product_desciption : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_add_product_desciption)
    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back2)

        toback.setOnClickListener {
            Intent(this, HOME_add_product_1_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}