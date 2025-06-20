package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView  // Add this import
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)


        // Navigate to IndoorPlantsActivity when Indoor Plants is clicked
        findViewById<LinearLayout>(R.id.indoorPlants).setOnClickListener {
            val intent = Intent(this, IndoorPlantsActivity::class.java)
            startActivity(intent)
        }
        // Navigate to OutdoorPlantsActivity
        findViewById<LinearLayout>(R.id.outdoorPlants).setOnClickListener {
            val intent = Intent(this, OutdoorPlantsActivity::class.java)
            startActivity(intent)
        }
        // Navigate to FlowerPlantsActivity
        findViewById<LinearLayout>(R.id.flowerPlants).setOnClickListener {
            val intent = Intent(this, flowerPlantsActivity::class.java)
            startActivity(intent)
        }
        // Navigate to DeskPlantsActivity
        findViewById<LinearLayout>(R.id.deskPlants).setOnClickListener {
            val intent = Intent(this, DeskPlantsActivity::class.java)
            startActivity(intent)
        }

        // Bottom Navigation Click Events
        findViewById<LinearLayout>(R.id.home_tab).setOnClickListener {
            Toast.makeText(this, "Home Clicked", Toast.LENGTH_SHORT).show()
        }

        findViewById<LinearLayout>(R.id.cart_tab).setOnClickListener {
            val intent = Intent(this, CartActivity::class.java)
            startActivity(intent)
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
