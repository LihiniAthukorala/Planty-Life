package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PaymentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)

        // Back Button
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Closes PaymentActivity and returns to previous screen
        }

        // Confirm Order Button
        val confirmOrderButton: Button = findViewById(R.id.btnConfirmOrder)
        confirmOrderButton.setOnClickListener {
            Toast.makeText(this, "Order Confirmed!", Toast.LENGTH_SHORT).show()
            val intent = Intent(this, ConfirmActivity::class.java)
            startActivity(intent)
        }

    }
}
