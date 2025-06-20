package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class flowerPlantsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flower_plants)

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
                R.id.ip1, "Sun Flower",
                Triple(
                    R.drawable.sunflw,
                    "LKR 6,200.00",
                    "The **snake plant** is a popular houseplant with tall, sword-like leaves. It is known for its air-purifying qualities, removing toxins like benzene and formaldehyde from the air. Snake plants require minimal care, needing water only when the soil is completely dry. However, they are mildly toxic to pets."
                )
            ),
            Triple(
                R.id.ip2, "Orchid",
                Triple(
                    R.drawable.orchid,
                    "LKR 5,000.00",
                    "Spider plants are low-maintenance and help remove toxins from the air. They thrive in indirect sunlight and require occasional watering."
                )
            ),
            Triple(
                R.id.ip3, "Rose",
                Triple(
                    R.drawable.rose,
                    "LKR 3,000.00",
                    "Aloe Vera is a medicinal plant known for its healing properties, especially for skin burns and wounds."
                )
            ),
            Triple(
                R.id.ip4, "Lavender",
                Triple(
                    R.drawable.lavender,
                    "LKR 3,000.00",
                    "Peace Lilies are elegant plants that bloom beautiful white flowers and improve indoor air quality."
                )
            ),
            Triple(
                R.id.ip5, "Hydrangeas",
                Triple(
                    R.drawable.hydrangeas,
                    "LKR 23,000.00",
                    "Bonsai trees symbolize harmony and patience. They require regular pruning and proper care."
                )
            ),
            Triple(
                R.id.ip6, "Gardenia",
                Triple(
                    R.drawable.gar_p,
                    "LKR 4,000.00",
                    "Pothos is an excellent plant for beginners and requires minimal care. It can grow in water or soil."
                )
            ),
            Triple(
                R.id.ip7, "Tulip",
                Triple(
                    R.drawable.tulip,
                    "LKR 1,200.00",
                    "Ficus trees are ornamental plants that thrive indoors and help purify the air."
                )
            ),
            Triple(
                R.id.ip8, "Peace Lily",
                Triple(
                    R.drawable.peace_p,
                    "LKR 2,000.00",
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
