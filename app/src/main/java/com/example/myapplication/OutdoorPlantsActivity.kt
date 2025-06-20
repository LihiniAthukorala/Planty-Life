package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class OutdoorPlantsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_outdoor_plants)

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
                R.id.ip1, "Croton Plant",
                Triple(
                    R.drawable.croton_p,
                    "LKR 7 500.00",
                    "The **snake plant** is a popular houseplant with tall, sword-like leaves. It is known for its air-purifying qualities, removing toxins like benzene and formaldehyde from the air. Snake plants require minimal care, needing water only when the soil is completely dry. However, they are mildly toxic to pets."
                )
            ),
            Triple(
                R.id.ip2, "Coleus Plant",
                Triple(
                    R.drawable.col_p,
                    "LKR 6 500.00",
                    "Spider plants are low-maintenance and help remove toxins from the air. They thrive in indirect sunlight and require occasional watering."
                )
            ),
            Triple(
                R.id.ip3, "Bromeliad Plant",
                Triple(
                    R.drawable.bro_p,
                    "LKR 10 300.00",
                    "Aloe Vera is a medicinal plant known for its healing properties, especially for skin burns and wounds."
                )
            ),
            Triple(
                R.id.ip4, "Foxtail fern",
                Triple(
                    R.drawable.fox_p,
                    "LKR 6,000.00",
                    "Peace Lilies are elegant plants that bloom beautiful white flowers and improve indoor air quality."
                )
            ),
            Triple(
                R.id.ip5, "creeping jenny",
                Triple(
                    R.drawable.creeping_p,
                    "LKR 1,500.00",
                    "Bonsai trees symbolize harmony and patience. They require regular pruning and proper care."
                )
            ),
            Triple(
                R.id.ip6, "Bamboo",
                Triple(
                    R.drawable.bamboo_p,
                    "LKR 8,500.00",
                    "Pothos is an excellent plant for beginners and requires minimal care. It can grow in water or soil."
                )
            ),
            Triple(
                R.id.ip7, "Gardenia",
                Triple(
                    R.drawable.gar_p,
                    "LKR 2,000.00",
                    "Ficus trees are ornamental plants that thrive indoors and help purify the air."
                )
            ),
            Triple(
                R.id.ip8, "Boxwood Plant",
                Triple(
                    R.drawable.bon_p,
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
