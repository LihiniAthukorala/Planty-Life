package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_pw)

        val etEmail = findViewById<EditText>(R.id.et_email)
        val btnSendReset = findViewById<Button>(R.id.btn_send_reset)
        val tvReturnToLogin = findViewById<TextView>(R.id.tv_return_to_login)

        // Send Reset Link Button Click Listener
        btnSendReset.setOnClickListener {
            val email = etEmail.text.toString().trim()
            if (email.isEmpty()) {
                Toast.makeText(this, "Please enter your email", Toast.LENGTH_SHORT).show()
            } else {
                // TODO: Add Firebase or backend logic to send reset link
                Toast.makeText(this, "Reset link sent to $email", Toast.LENGTH_SHORT).show()
            }
        }

        // Navigate to Login Screen
        tvReturnToLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}
