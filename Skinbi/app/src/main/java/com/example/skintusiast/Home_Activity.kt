package com.example.skintusiast

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class Home_Activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val toskingoal = findViewById<Button>(R.id.btnhomeskingoal)

        toskingoal.setOnClickListener{
            Intent(this, HOME_skin_goal_Activity::class.java).also {
                startActivity(it)
            }
        }

        val toskintype = findViewById<Button>(R.id.btnhomeskintype)

        toskintype.setOnClickListener{
            Intent(this, HOME_your_skintype_1_Activity::class.java).also {
                startActivity(it)
            }
        }

        val todailylog = findViewById<Button>(R.id.btnhomedailylog)

        todailylog.setOnClickListener{
            Intent(this, HOME_daily_log_1_Activity::class.java).also {
                startActivity(it)
            }
        }

        val toaddproduct = findViewById<Button>(R.id.btnhomeaddproduct)

        toaddproduct.setOnClickListener{
            Intent(this, HOME_add_product_1_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun skin(view: View) {
        val toskin = findViewById<ImageView>(R.id.homeskin)

        toskin.setOnClickListener {
            Intent(this, My_Skin_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
    fun routine(view: View) {
        val toroutine = findViewById<ImageView>(R.id.homeroutine)

        toroutine.setOnClickListener {
            Intent(this, myroutine_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
    fun profile(view: View) {
        val toprofile = findViewById<ImageView>(R.id.homeprofile)

        toprofile.setOnClickListener {
            Intent(this, profile_Activity::class.java).also {
                startActivity(it)
            }
        }
    }
}