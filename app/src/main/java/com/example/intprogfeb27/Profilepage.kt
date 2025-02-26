package com.example.intprogfeb27

import android.app.Activity
import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout

class Profilepage : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilepage)

        val homebutton: ImageView = findViewById(R.id.homebutton)
        homebutton.setOnClickListener {
            // Navigate to Landing Page
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
            finish() //
        }

        val devbutton: ImageView = findViewById(R.id.devbutton)
        devbutton.setOnClickListener {
            // Navigate to Landing Page
            val intent = Intent(this, Developerpage::class.java)
            startActivity(intent)
            finish() //
        }

        val settingbutton: ImageView = findViewById(R.id.settingbutton)
        settingbutton.setOnClickListener {
            // Navigate to Landing Page
            val intent = Intent(this, SettingsPage::class.java)
            startActivity(intent)
            finish() //
        }

        val buttony: Button = findViewById(R.id.buttony)
        buttony.setOnClickListener {
            // Navigate to Landing Page
            val intent = Intent(this, Editprofilepage::class.java)
            startActivity(intent)
            finish() //
        }


    }
}