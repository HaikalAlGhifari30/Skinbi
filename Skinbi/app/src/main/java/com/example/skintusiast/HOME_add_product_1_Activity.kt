package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class HOME_add_product_1_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_add_product1)


        val toaddproduct2 = findViewById<Button>(R.id.btnaddproduk1)

        toaddproduct2.setOnClickListener{
            Intent(this, HOME_add_product_2_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    @SuppressLint("WrongViewCast")
    fun desciption(view: View) {
        val todesc = findViewById<ImageView>(R.id.wardah)

        todesc.setOnClickListener{
            Intent(this, HOME_add_product_desciption::class.java).also {
                startActivity(it)
            }
        }
    }

    @SuppressLint("WrongViewCast")
    fun back(view: View) {
        val toback = findViewById<ImageView>(R.id.back)

        toback.setOnClickListener{
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }}
}