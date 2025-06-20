package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PlantDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_plant_detail)

        // Back button functionality
        val backButton: ImageView = findViewById(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Close this activity and go back
        }

        // Retrieve plant details from intent
        val plantName = intent.getStringExtra("PLANT_NAME")
        val plantImage = intent.getIntExtra("PLANT_IMAGE", 0)
        val plantPrice = intent.getStringExtra("PLANT_PRICE")
        val plantDescription = intent.getStringExtra("PLANT_DESCRIPTION")

        // Set plant details in UI components
        val plantNameTextView: TextView = findViewById(R.id.plant_name_text)
        val plantImageView: ImageView = findViewById(R.id.plantImageView)
        val plantPriceTextView: TextView = findViewById(R.id.plantPriceTextView)
        val plantDescriptionTextView: TextView = findViewById(R.id.plantDescriptionTestView)

        plantNameTextView.text = plantName
        plantImageView.setImageResource(plantImage)
        plantPriceTextView.text = plantPrice
        plantDescriptionTextView.text = plantDescription

        // Buy Now Button - Navigates to PaymentActivity
        val buyNowButton: Button = findViewById(R.id.btnBuy)
        buyNowButton.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            startActivity(intent)
        }

        val btncart: Button = findViewById(R.id.btncrt)
        btncart.setOnClickListener {
            Toast.makeText(this, "Added to cart", Toast.LENGTH_SHORT).show()
        }

    }
}
