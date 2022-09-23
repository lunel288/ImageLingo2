package com.example.imagelingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

/**
 * Translation Activity:
 * In this class we take the object which was recognised in
 * Capture Activity, and display the translations necessary.
 */

class TranslationActivity : AppCompatActivity() {

    private val wordList = listOf<String>("Pen", "Laptop", "Clock")
    private val translationList = listOf<String>("Pene", "Rorohiko", "Karaka")

    private lateinit var txtUntranslated: TextView
    private lateinit var txtTranslated: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translation)

        txtUntranslated = findViewById(R.id.txtUntranslated)
        txtTranslated = findViewById(R.id.txtTranslated)

        val captured_image = intent.getStringExtra("captured_image")



        txtUntranslated.setText("English: " + captured_image)

        for (i in 0..(translationList.size - 1)) {
            if (captured_image == wordList[i]) {
                txtTranslated.setText("Maori: ${translationList[i]}" )
                break
            }
            else{
                txtTranslated.setText(getString(R.string.maori_no_translation))
            }

            val btnGoBack = findViewById<Button>(R.id.btnReturn)
            btnGoBack.setOnClickListener {

                val nextPage = Intent(this, CaptureActivity::class.java)
                startActivity(nextPage)
            }
        }
    }
}