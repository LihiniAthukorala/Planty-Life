package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class EditProfileActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_profile)

        val saveButton: Button = findViewById(R.id.btnSave)
        val cancelButton: Button = findViewById(R.id.btnCancel)


        saveButton.setOnClickListener {
            Toast.makeText(this, "Save Changes ", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
        cancelButton.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
            finish()
        }
    }
}
