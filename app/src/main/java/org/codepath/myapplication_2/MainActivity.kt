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

        val introImage = findViewById<ImageView>(R.id.samoyedImageView)
        introImage.setOnClickListener{
            Log.v("Hello image", "Image Clicked~")
            val mSnackbar: Snackbar =
                Snackbar.make(it, "Credit: u/yuzhouyuzhou7 from Reddit", Snackbar.LENGTH_LONG)
            mSnackbar.setAction("VISIT") {
                Log.v("Snackbar button", "Snackbar Button Clicked~")
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse("https://www.reddit.com/r/samoyeds/comments/w6o899/samoya_all_four_feet_off_the_ground/")
                startActivity(openURL)
            }
            mSnackbar.show()
        }

        val introButton = findViewById<Button>(R.id.introSayHelloButton)
        introButton.setOnClickListener{
            Log.v("Hello world", "Button Clicked~")
            Toast.makeText(this, "The Samoyed says hello!", Toast.LENGTH_LONG).show()
        }
    }
}