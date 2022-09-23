package com.example.imagelingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class TranslationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translation)

        val btnGoBack = findViewById<Button>(R.id.btnReturn);
        btnGoBack.setOnClickListener {

            val nextPage = Intent(this, CaptureActivity::class.java);
            startActivity(nextPage);
        }
    }
}