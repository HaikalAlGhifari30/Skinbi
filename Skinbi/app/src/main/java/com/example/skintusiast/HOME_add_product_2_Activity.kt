package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HOME_add_product_2_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_add_product2)
        val toadd3 = findViewById<Button>(R.id.btnaddproduct2)

        toadd3.setOnClickListener{
            Intent(this, HOME_add_product_3_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back3)

        toback.setOnClickListener {
            Intent(this, HOME_add_product_1_Activity::class.java).also {
                startActivity(it)
            }
        }}
}