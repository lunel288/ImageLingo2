package com.example.imagelingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
/**
 * Main activity.
 * This is just the start screen which leads to the main capture activity screen.
 * */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startbutton = findViewById<Button>(R.id.startButton)
        startbutton.setOnClickListener {

            val nextPage = Intent(this, CaptureActivity::class.java)
            startActivity(nextPage)
        }
    }
}