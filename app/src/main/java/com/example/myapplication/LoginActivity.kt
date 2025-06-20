package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val etEmail = findViewById<EditText>(R.id.et_email)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val tvSignUp = findViewById<TextView>(R.id.tvSignUp)
        val tvForgotPassword = findViewById<TextView>(R.id.tvForgotPassword)
        val btnGoogle = findViewById<ImageButton>(R.id.btnGoogle)
        val btnApple = findViewById<ImageButton>(R.id.btn_apple)

        // ✅ Login Button Click
        btnLogin.setOnClickListener {
            Toast.makeText(this, "Login Successful!", Toast.LENGTH_SHORT).show()

            // Navigate to DashboardActivity
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish() // Optional, to prevent returning to LoginActivity on back press
        }

        // ✅ Sign Up Button Click
        tvSignUp.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        // ✅ Forgot Password Click
        tvForgotPassword.setOnClickListener {
            val intent = Intent(this, ForgotActivity::class.java)
            startActivity(intent)
        }

        // ✅ Google Sign-In Click
        btnGoogle.setOnClickListener {
            Toast.makeText(this, "Google Sign-In Clicked", Toast.LENGTH_SHORT).show()
        }

        // ✅ Apple Sign-In Click
        btnApple.setOnClickListener {
            Toast.makeText(this, "Apple Sign-In Clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
