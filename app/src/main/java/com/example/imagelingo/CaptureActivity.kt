package com.example.imagelingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CaptureActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture)

        val btnTranslate = findViewById<Button>(R.id.btnTranslate);
        btnTranslate.setOnClickListener {

            val nextPage = Intent(this, TranslationActivity::class.java);
            startActivity(nextPage);
        }
    }
}