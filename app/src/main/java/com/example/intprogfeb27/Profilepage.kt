package com.example.intprogfeb27

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class Profilepage : Activity() {
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilepage)

        sharedPreferences = getSharedPreferences("TempProfile", MODE_PRIVATE)

        val homebutton: ImageView = findViewById(R.id.homebutton)
        homebutton.setOnClickListener {
            startActivity(Intent(this, LandingPage::class.java))
        }

        val devbutton: ImageView = findViewById(R.id.devbutton)
        devbutton.setOnClickListener {
            startActivity(Intent(this, Developerpage::class.java))
        }

        val settingbutton: ImageView = findViewById(R.id.settingbutton)
        settingbutton.setOnClickListener {
            startActivity(Intent(this, SettingsPage::class.java))
        }

        val buttony: Button = findViewById(R.id.buttony)
        buttony.setOnClickListener {
            startActivity(Intent(this, Editprofilepage::class.java))
        }

        loadProfileData()
    }

    override fun onResume() {
        super.onResume()
        loadProfileData()
    }

    private fun loadProfileData() {
        val profileTextView: TextView = findViewById(R.id.profileTextView)
        val profileRole: TextView = findViewById(R.id.profile_role)
        val profileEmail: TextView = findViewById(R.id.profile_email)
        val profilePhone: TextView = findViewById(R.id.profile_phone)
        val profileLocation: TextView = findViewById(R.id.profile_location)

        profileTextView.text = sharedPreferences.getString("profileName", "Marshall D. Teach")
        profileRole.text = sharedPreferences.getString("profileStatus", "Commuter")
        profileEmail.text = sharedPreferences.getString("profileEmail", "blackbeardPirateKing@gmail.com")
        profilePhone.text = sharedPreferences.getString("profilePhone", "+63-929-555-4642")

        val country = sharedPreferences.getString("profileCountry", "Philippines")
        val province = sharedPreferences.getString("profileProvince", "Cebu")
        profileLocation.text = "$province, $country"
    }
}
