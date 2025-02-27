package com.example.intprogfeb27

import android.app.Activity
import android.content.Intent
import android.media.Image
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Profilepage : AppCompatActivity() {

    private lateinit var displayProfileImage: ImageView
    private lateinit var displayName: TextView
    private lateinit var displayEmail: TextView
    private lateinit var displayNumber: TextView
    private lateinit var displayStatus: TextView
    private lateinit var displayLocation: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profilepage)

        displayProfileImage = findViewById(R.id.profile_image)
        displayName = findViewById(R.id.profileTextView)
        displayStatus = findViewById(R.id.profile_role)
        displayNumber = findViewById(R.id.profile_phone)
        displayEmail = findViewById(R.id.profile_email)
        displayLocation = findViewById(R.id.profile_location)

        val name: String? = intent.getStringExtra("Name") ?:"Marshall D. Teach"
        val email: String? = intent.getStringExtra("Email") ?:"blackbeardPirateKing@gmail.com"
        val phone: String? = intent.getStringExtra("Phone") ?:"+63-929-555-4642"
        val status: String? = intent.getStringExtra("Status") ?:"Commuter"
        val location: String? = intent.getStringExtra("Location") ?: "Cebu, Philippines"
        val imageUriString = intent.getStringExtra("Image_Uri")
        displayName.text = "Name: $name"
        displayEmail.text = "Email: $email"
        displayStatus.text = "$status"
        displayNumber.text = "$phone"
        displayLocation.text = "$location"

        if(!imageUriString.isNullOrEmpty()){
            val imageUri = Uri.parse(imageUriString)

            displayProfileImage.setImageURI(imageUri)
        }

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