package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class IndoorPlantsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_indoor_plants)

        // Back button functionality
        val backButton: ImageView = findViewById(R.id.back_button)
        backButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            finish()
        }

        // Setting click listeners for plant items
        setupPlantClickListeners()
    }

    private fun setupPlantClickListeners() {
        val plantItems = listOf(
            Triple(
                R.id.ip1, "Snake Plant",
                Triple(
                    R.drawable.ip1,
                    "LKR 1,700.00",
                    "The **snake plant** is a popular houseplant with tall, sword-like leaves. It is known for its air-purifying qualities, removing toxins like benzene and formaldehyde from the air. Snake plants require minimal care, needing water only when the soil is completely dry. However, they are mildly toxic to pets."
                )
            ),
            Triple(
                R.id.ip2, "Spider Plant",
                Triple(
                    R.drawable.spider_p,
                    "LKR 1,500.00",
                    "Spider plants are low-maintenance and help remove toxins from the air. They thrive in indirect sunlight and require occasional watering."
                )
            ),
            Triple(
                R.id.ip3, "Aloe Vera",
                Triple(
                    R.drawable.alove_p,
                    "LKR 1,300.00",
                    "Aloe Vera is a medicinal plant known for its healing properties, especially for skin burns and wounds."
                )
            ),
            Triple(
                R.id.ip4, "Peace Lily",
                Triple(
                    R.drawable.peace_p,
                    "LKR 5,000.00",
                    "Peace Lilies are elegant plants that bloom beautiful white flowers and improve indoor air quality."
                )
            ),
            Triple(
                R.id.ip5, "Bonsai",
                Triple(
                    R.drawable.bonsai,
                    "LKR 25,000.00",
                    "Bonsai trees symbolize harmony and patience. They require regular pruning and proper care."
                )
            ),
            Triple(
                R.id.ip6, "Pothos",
                Triple(
                    R.drawable.pothos_p,
                    "LKR 1,500.00",
                    "Pothos is an excellent plant for beginners and requires minimal care. It can grow in water or soil."
                )
            ),
            Triple(
                R.id.ip7, "Ficus",
                Triple(
                    R.drawable.ficus_p,
                    "LKR 2,000.00",
                    "Ficus trees are ornamental plants that thrive indoors and help purify the air."
                )
            ),
            Triple(
                R.id.ip8, "Bic Plant",
                Triple(
                    R.drawable.bic_p,
                    "LKR 6,000.00",
                    "Bic plants are great for home decoration and require moderate watering."
                )
            )
        )

        for ((id, name, details) in plantItems) {
            val plantView: LinearLayout = findViewById(id)
            plantView.setOnClickListener {
                val intent = Intent(this, PlantDetailActivity::class.java).apply {
                    putExtra("PLANT_NAME", name)
                    putExtra("PLANT_IMAGE", details.first)
                    putExtra("PLANT_PRICE", details.second)
                    putExtra("PLANT_DESCRIPTION", details.third) // Corrected to pass description
                }
                startActivity(intent)
            }
        }
    }
}
