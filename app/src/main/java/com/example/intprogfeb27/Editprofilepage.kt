package com.example.intprogfeb27

import android.app.Activity
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class Editprofilepage : Activity() {
    private lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.editprofilepage)

        sharedPreferences = getSharedPreferences("TempProfile", MODE_PRIVATE)


        val backButton: ImageView = findViewById(R.id.backButton)
        val editName: EditText = findViewById(R.id.editProfileText)
        val editStatus: EditText = findViewById(R.id.statusEditText)
        val editEmail: EditText = findViewById(R.id.emailEditText)
        val editPhone: EditText = findViewById(R.id.phoneEditText)
        val editCountry: EditText = findViewById(R.id.countryEditText)
        val editProvince: EditText = findViewById(R.id.provinceEditText)
        val saveButton: Button = findViewById(R.id.saveButton)
        val cancelButton: Button = findViewById(R.id.cancelButton)


        editName.setText(sharedPreferences.getString("profileName", "Marshall D. Teach"))
        editStatus.setText(sharedPreferences.getString("profileStatus", "Commuter"))
        editEmail.setText(sharedPreferences.getString("profileEmail", "blackbeardPirateKing@gmail.com"))
        editPhone.setText(sharedPreferences.getString("profilePhone", "+63-929-555-4642"))
        editCountry.setText(sharedPreferences.getString("profileCountry", "Philippines"))
        editProvince.setText(sharedPreferences.getString("profileProvince", "Cebu"))


        backButton.setOnClickListener {
            finish()
        }


        saveButton.setOnClickListener {
            sharedPreferences.edit()
                .putString("profileName", editName.text.toString())
                .putString("profileStatus", editStatus.text.toString())
                .putString("profileEmail", editEmail.text.toString())
                .putString("profilePhone", editPhone.text.toString())
                .putString("profileCountry", editCountry.text.toString())
                .putString("profileProvince", editProvince.text.toString())
                .apply()

            finish()
        }


        cancelButton.setOnClickListener {
            editName.setText(sharedPreferences.getString("profileName", "Marshall D. Teach"))
            editStatus.setText(sharedPreferences.getString("profileStatus", "Commuter"))
            editEmail.setText(sharedPreferences.getString("profileEmail", "blackbeardPirateKing@gmail.com"))
            editPhone.setText(sharedPreferences.getString("profilePhone", "+63-929-555-4642"))
            editCountry.setText(sharedPreferences.getString("profileCountry", "Philippines"))
            editProvince.setText(sharedPreferences.getString("profileProvince", "Cebu"))
        }
    }
}
