package org.codepath.myapplication_2

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val introImage = findViewById<ImageView>(R.id.myIntroImageView)
        introImage.setOnClickListener{
            Log.v("Hello image", "Image Clicked~")
            val mSnackbar: Snackbar =
                Snackbar.make(it, getString(R.string.intro_image_snackbar_msg), Snackbar.LENGTH_LONG)
            mSnackbar.setAction("VISIT") {
                Log.v("Snackbar button", "Snackbar Button Clicked~")
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse(getString(R.string.intro_image_url))
                startActivity(openURL)
            }
            mSnackbar.show()
        }

        val introButton = findViewById<Button>(R.id.introSayHelloButton)
        introButton.setOnClickListener{
            Log.v("Hello world", "Button Clicked~")
            Toast.makeText(this, getString(R.string.intro_toast_button_msg), Toast.LENGTH_LONG).show()
        }
    }
}