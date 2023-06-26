package com.example.skinbiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.util.Patterns
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.skinbiapp.databinding.ActivitySignupBinding
import com.google.firebase.auth.FirebaseAuth
import java.net.PasswordAuthentication
import java.util.regex.Pattern

class signup_activity : AppCompatActivity() {
    lateinit var editfullName: EditText
    lateinit var editEmail: EditText
    lateinit var password : EditText
    lateinit var binding: ActivitySignupBinding
    lateinit var auth : FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySignupBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        auth = FirebaseAuth.getInstance()

        binding.btnbcklogin.setOnClickListener {
            val intent = Intent(this, Signin_Activity::class.java)
            startActivity(intent)

        }

        binding. btnregiscamera.setOnClickListener {
            val email = binding.textView4.text.toString()
            val password = binding.textView25.text.toString()

            //validasi email tidak sesuai
            if (email.isEmpty()) {
                binding.textView4.error = "Email Harus Diisi"
                binding.textView4.requestFocus()
                return@setOnClickListener
            }

            //validasi email tidal valid
            if (!Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                binding.textView4.error = "Email Tidak Valid"
                binding.textView4.requestFocus()
                return@setOnClickListener
            }

            //validasi password tidak sesuai
            if (password.isEmpty()) {
                binding.textView25.error = "Password Harus Diisi"
                binding.textView25.requestFocus()
                return@setOnClickListener
            }

            //validasi panjang passsword
            if (password.length < 6){
                binding.textView25.error = "Password Minimal 6 Karakter"
                binding.textView25.requestFocus()
                return@setOnClickListener
            }
            
            RegisterFirebase(email,password)

        }



            val toregis = findViewById<Button>(R.id.btnregiscamera)

        editfullName = findViewById(R.id.textView3)
        editEmail = findViewById(R.id.textView4)
        password = findViewById(R.id.textView25)

        toregis.setOnClickListener {
            Intent(this, Camera_Register_Activity::class.java).also {
                startActivity(it)
            }
        }
    }

    private fun RegisterFirebase(email: String, password: String) {
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener(this){
                if (it.isSuccessful){

                    Toast.makeText(this, "Register Berhasi;", Toast.LENGTH_SHORT).show()
                    val intent = Intent(this,Signin_Activity::class.java)
                    startActivity(intent)

                }else{
                    Toast.makeText(this, "${it.exception?.message}", Toast.LENGTH_SHORT).show()
                }
            }


    }
}
