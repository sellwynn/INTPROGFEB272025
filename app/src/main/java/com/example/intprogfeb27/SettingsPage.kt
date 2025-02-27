package com.example.intprogfeb27

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class SettingsPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settingspage)

        val imageView6: ImageView = findViewById(R.id.imageView6)
        imageView6.setOnClickListener {
            val intent = Intent(this, Developerpage::class.java)
            startActivity(intent)
            finish()
        }

        val imageView5: ImageView = findViewById(R.id.imageView5)
        imageView5.setOnClickListener {
            val intent = Intent(this, LandingPage::class.java)
            startActivity(intent)
            finish()
        }

        val imageView11: ImageView = findViewById(R.id.imageView11)
        imageView11.setOnClickListener {
            val intent = Intent(this, Profilepage::class.java)
            startActivity(intent)
            finish()
        }

        val editprofilebutton: LinearLayout = findViewById(R.id.editprofilebutton1)
        editprofilebutton.setOnClickListener {
            val intent = Intent(this, Editprofilepage::class.java)
            startActivity(intent)
            finish()
        }

        val aboutdev: LinearLayout = findViewById(R.id.abtdev)
        aboutdev.setOnClickListener {
            val intent = Intent(this, Developerpage::class.java)
            startActivity(intent)
            finish()
        }


        val logoutButton: LinearLayout = findViewById(R.id.logoutbutton)
        logoutButton.setOnClickListener {
            showLogoutConfirmation()
        }
    }

    private fun showLogoutConfirmation() {
        AlertDialog.Builder(this)
            .setTitle("Logout")
            .setMessage("Are you sure you want to logout?")
            .setPositiveButton("Logout") { _, _ ->
                val intent = Intent(this, MainActivity::class.java)
                intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
                startActivity(intent)
                finish()
            }
            .setNegativeButton("Cancel") { dialog, _ ->
                dialog.dismiss()
            }
            .show()
    }
}
