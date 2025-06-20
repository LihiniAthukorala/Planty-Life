package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val backButton: ImageView = findViewById(R.id.backButton)
        val editButton: Button = findViewById(R.id.btnEdit)
        val logoutButton: Button = findViewById(R.id.btnLogout)

        backButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }
        editButton.setOnClickListener {
            startActivity(Intent(this, EditProfileActivity::class.java))
            finish()
        }

        logoutButton.setOnClickListener {
            startActivity(Intent(this, LoginActivity::class.java))
            finish()
        }
        findViewById<LinearLayout>(R.id.home_tab).setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
        }

        findViewById<LinearLayout>(R.id.profile_tab).setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
        }

        findViewById<LinearLayout>(R.id.profile_tab).setOnClickListener {
            Toast.makeText(this, "Profile Clicked", Toast.LENGTH_SHORT).show()
        }
//        findViewById<LinearLayout>(R.id.settings_tab).setOnClickListener {
//            val intent = Intent(this, SettingsActivity::class.java)
//            startActivity(intent)
//        }
    }
}
