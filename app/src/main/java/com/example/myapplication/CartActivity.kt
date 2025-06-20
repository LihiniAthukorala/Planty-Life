package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class CartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart)

        val backButton: ImageView = findViewById(R.id.backButton)

        backButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
        findViewById<LinearLayout>(R.id.home_tab).setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        findViewById<LinearLayout>(R.id.profile_tab).setOnClickListener {
            Toast.makeText(this, "Cart Clicked", Toast.LENGTH_SHORT).show()

        }

        findViewById<LinearLayout>(R.id.profile_tab).setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
//        findViewById<LinearLayout>(R.id.settings_tab).setOnClickListener {
//            val intent = Intent(this, SettingsActivity::class.java)
//            startActivity(intent)
//        }
    }
}
