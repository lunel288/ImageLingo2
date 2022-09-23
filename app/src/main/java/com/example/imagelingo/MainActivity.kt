package com.example.imagelingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startbutton = findViewById<Button>(R.id.startButton);
        startbutton.setOnClickListener {

            val nextPage = Intent(this, CaptureActivity::class.java);
            startActivity(nextPage);
        }
    }
}