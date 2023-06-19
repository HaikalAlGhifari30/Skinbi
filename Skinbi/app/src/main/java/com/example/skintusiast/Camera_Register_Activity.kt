package com.example.skintusiast

import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView

private var request_code : Int = 123
class Camera_Register_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_camera_register)

        val tohome= findViewById<Button>(R.id.btndone)

        tohome.setOnClickListener{
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    fun photo(view: View) {
        val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
        if(intent.resolveActivity(packageManager) != null){
            startActivityForResult(intent, request_code)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == request_code && resultCode == RESULT_OK){
            val imageskin : ImageView = findViewById(R.id.image)
            val bitmap = data?.extras?.get("data") as Bitmap
            imageskin.setImageBitmap(bitmap)
        }
    }
}

