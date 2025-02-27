package com.example.intprogfeb27

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class Developerpage : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.developerpage)

        val settingsbutton: ImageView = findViewById(R.id.settingsbutton)
        settingsbutton.setOnClickListener {
            val intent = Intent(this, SettingsPage::class.java)
            startActivity(intent)
            finish()
        }
        val imagehome: ImageView = findViewById(R.id.homebutton)
        imagehome.setOnClickListener {
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
            finish()
        }
        val profilebutton: ImageView = findViewById(R.id.profilebutton)
        profilebutton.setOnClickListener {
            val intent = Intent(this, Profilepage::class.java)
            startActivity(intent)
            finish()
        }


    }
}