package com.example.intprogfeb27

import android.app.Activity
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class LandingPage : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.landingpage)

        val imageView6: ImageView = findViewById(R.id.imageView6)
        imageView6.setOnClickListener {
            val intent = Intent(this, Developerpage::class.java)
            startActivity(intent)
            finish()
        }
        val imageView11: ImageView = findViewById(R.id.imageView11)
        imageView11.setOnClickListener {
            val intent = Intent(this, Profilepage::class.java)
            startActivity(intent)
            finish()
        }
        val imageView10: ImageView = findViewById(R.id.imageView10)
        imageView10.setOnClickListener {
            val intent = Intent(this, SettingsPage::class.java)
            startActivity(intent)
            finish()
        }



    }
}