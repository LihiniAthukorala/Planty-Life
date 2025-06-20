package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class OnboardingActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        val btnNext1 = findViewById<Button>(R.id.btn_next_1)
        btnNext1.setOnClickListener {
            setContentView(R.layout.activity_onboarding2)


            val btnNext2 = findViewById<Button>(R.id.btn_next_2)


            btnNext2.setOnClickListener {
                setContentView(R.layout.activity_onboarding3)

                val btnGetStarted = findViewById<Button>(R.id.btnGetStarted)

                btnGetStarted.setOnClickListener {
                    startActivity(Intent(this, LoginActivity::class.java))
                    finish()
                }
            }
        }
    }
}
