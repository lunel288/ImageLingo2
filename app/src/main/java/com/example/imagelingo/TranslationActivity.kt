package com.example.imagelingo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
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
                txtTranslated.setText(mMyObjectsViewModel.getMaoriWord("Clock"))
                txtTranslatedSentence.setText(mMyObjectsViewModel.getMaoriWord("Clock"))


            } //else if (not found in database)
            //txtTranslated.setText(getString(R.string.maori_no_translation))

            val btnGoBack = findViewById<Button>(R.id.btnReturn)
            btnGoBack.setOnClickListener {

                val nextPage = Intent(this, CaptureActivity::class.java)
                startActivity(nextPage)
            }
            val btnTest = findViewById<Button>(R.id.btnReturn2)
            btnTest.setOnClickListener {
                var translation: String = "Maori: "
                translation += mMyObjectsViewModel.getMaoriWord(captured_image!!)
                var translatedSentence: String = "Maori Sentence: "
                translatedSentence += mMyObjectsViewModel.getMaoriSentence(captured_image)
                var untranslatedSentence: String = "English Sentence: "
                untranslatedSentence += mMyObjectsViewModel.getEnglishSentence(captured_image)
                txtTranslated.setText(translation)
                txtUntranslatedSentence.setText(untranslatedSentence)
                txtTranslatedSentence.setText(translatedSentence)
            }
        }
    }
