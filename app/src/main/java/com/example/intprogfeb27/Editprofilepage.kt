package com.example.intprogfeb27

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Editprofilepage : AppCompatActivity() {
    private lateinit var profileImage: ImageView
    private lateinit var nameInput: EditText
    private lateinit var phoneEdit: EditText
    private lateinit var statusEdit: EditText
    private lateinit var emailInput: EditText
    private lateinit var countryInput: EditText
    private lateinit var provInput: EditText
    private lateinit var saveButton: Button
    private var selectedImageUri: Uri? = null // Temporary image storage


    companion object {
        private const val PICK_IMAGE = 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.editprofilepage)

        profileImage = findViewById(R.id.profileImage)
        nameInput = findViewById(R.id.nameEdit)
        statusEdit = findViewById(R.id.statusEditText)
        emailInput = findViewById(R.id.emailEditText)
        phoneEdit = findViewById(R.id.phoneEditText)
        countryInput = findViewById(R.id.countryEditText)
        provInput = findViewById(R.id.provinceEditText)
        saveButton = findViewById(R.id.saveButton)



        profileImage.setOnClickListener {
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            startActivityForResult(intent, PICK_IMAGE)
        }

        saveButton.setOnClickListener {
            val tempName = nameInput.text.toString()
            val tempEmail = emailInput.text.toString()
            val tempPhone = phoneEdit.text.toString()
            val tempProv = provInput.text.toString()
            val tempCountry = countryInput.text.toString()
            val tempStatus = statusEdit.text.toString()

            val location = "$tempProv, $tempCountry"
            val intent = Intent(this, Profilepage::class.java).apply {
                putExtra("Name", tempName)
                putExtra("Email", tempEmail)
                putExtra("Phone", tempPhone)
                putExtra("Location", location)
                putExtra("Status", tempStatus)
                putExtra("Image_Uri", selectedImageUri?.toString())
            }
            startActivity(intent)
        }


        val backButton: ImageView= findViewById(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
            finish()
        }
        val cancelButton: Button = findViewById(R.id.cancelButton)
        cancelButton.setOnClickListener {
            val intent = Intent(this, Profilepage::class.java)
            startActivity(intent)
            finish()
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if(requestCode == PICK_IMAGE && resultCode == Activity.RESULT_OK && data != null)
        {

            selectedImageUri = data.data
            profileImage.setImageURI(selectedImageUri)
        }
    }
}