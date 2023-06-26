package com.example.skinbiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.Button
import android.widget.Toast
import com.example.skinbiapp.databinding.ActivitySigninBinding
import com.google.firebase.auth.FirebaseAuth

class Signin_Activity : AppCompatActivity() {

    lateinit var binding : ActivitySigninBinding
    lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivitySigninBinding.inflate(layoutInflater)
        setContentView(binding.root)

        auth = FirebaseAuth.getInstance()



        binding.btnregister.setOnClickListener {
            val intent = Intent(this, signup_activity::class.java )
            startActivity(intent)
        }

        val tologin = findViewById<Button>(R.id.btnregiscamera)
        val toregister = findViewById<Button>(R.id.btnregister)
        val tobacklogin = findViewById<Button>(R.id.btnbcklogin)

        tologin.setOnClickListener {
            Intent(this, Home_Activity::class.java).also {
                startActivity(it)
            }
        }

        toregister.setOnClickListener {
            Intent(this, signup_activity::class.java).also {
                startActivity(it)
            }
        }

        tobacklogin.setOnClickListener {
            Intent(this, Signin_Activity::class.java).also {
               startActivity(it)
            }
        }

        binding.btnregiscamera.setOnClickListener {
            val email = binding.textemailsign.text.toString()
            val password = binding.textpasssign.text.toString()

            //validasi email tidak sesuai
            if (email.isEmpty()) {
                binding.textemailsign.error = "Email Harus Diisi"
                binding.textemailsign.requestFocus()
                return@setOnClickListener
            }

            //validasi email tidal valid
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.textemailsign.error = "Email Tidak Valid"
                binding.textemailsign.requestFocus()
                return@setOnClickListener
            }

            //validasi password tidak sesuai
            if (password.isEmpty()) {
                binding.textpasssign.error = "Password Harus Diisi"
                binding.textpasssign.requestFocus()
                return@setOnClickListener
            }



            LoginFirebase(email,password)
        }
    }
    private fun LoginFirebase(email: String, password: String) {
        auth.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){
                    Toast.makeText(this, "Selamat Datang $email ", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,Signin_Activity::class.java)
                    startActivity(intent)

                }else{
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }


    }
}





