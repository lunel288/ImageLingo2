package com.example.imagelingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.imagelingo.data.MyObjectsViewModel

/**
 * Translation Activity:
 * In this class we take the object which was recognised in
 * Capture Activity, and display the translations necessary.
 */

class TranslationActivity : AppCompatActivity() {

    private lateinit var mMyObjectsViewModel : MyObjectsViewModel

    private lateinit var txtUntranslated: TextView
    private lateinit var txtTranslated: TextView
    private lateinit var txtUntranslatedSentence: TextView
    private lateinit var txtTranslatedSentence: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_translation)

        mMyObjectsViewModel = ViewModelProvider(this).get(MyObjectsViewModel::class.java)

        txtUntranslated = findViewById(R.id.txtUntranslated)
        txtTranslated = findViewById(R.id.txtTranslated)
        txtTranslatedSentence = findViewById(R.id.txtTranslatedSentence)
        txtUntranslatedSentence = findViewById(R.id.txtUntranslatedSentence)

        val captured_image = intent.getStringExtra("captured_image")
        val target_language = intent.getStringExtra("target_language")

        txtUntranslated.setText("English: " + captured_image)

        if (target_language == "Maori") {
            var translation: String = "Maori: "
            mMyObjectsViewModel.getMaoriWord(captured_image!!).observe(this, Observer { data ->
                translation += data
                txtTranslated.setText(translation)
            })

            var untranslatedSentence: String = "English Sentence: "
            mMyObjectsViewModel.getEnglishSentence(captured_image!!).observe(this, Observer { data ->
                untranslatedSentence += data
                txtUntranslatedSentence.setText(untranslatedSentence)
            })

            var translatedSentence: String = "Maori Sentence: "
            mMyObjectsViewModel.getMaoriSentence(captured_image!!).observe(this, Observer { data ->
                translatedSentence += data
                txtTranslatedSentence.setText(translatedSentence)
            })
        } //else if (other language - not available yet)
            //txtTranslated.setText(getString(R.string.maori_no_translation))

            val btnGoBack = findViewById<Button>(R.id.btnReturn)
            btnGoBack.setOnClickListener {

                val nextPage = Intent(this, CaptureActivity::class.java)
                startActivity(nextPage)
            }


        }
    }
