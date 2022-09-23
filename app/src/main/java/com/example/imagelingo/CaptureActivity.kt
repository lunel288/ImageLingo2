@file:Suppress("DEPRECATION")

package com.example.imagelingo

import android.app.Activity
import android.content.Intent
import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class CaptureActivity : AppCompatActivity(), View.OnClickListener {

    companion object {

        private const val REQUEST_IMAGE_CAPTURE = 42
        private const val MAX_FONT_SIZE = 96F
    }

    private lateinit var btnCapture: Button
    private lateinit var imageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_capture)

        imageView = findViewById(R.id.imageView)
        btnCapture = findViewById(R.id.btnCapture)

        btnCapture.setOnClickListener(this)

        val btnTranslate = findViewById<Button>(R.id.btnTranslate)


        btnTranslate.setOnClickListener {

            val nextPage = Intent(this, TranslationActivity::class.java)
            startActivity(nextPage)
        }
    }

    @Deprecated("Deprecated in Java")
    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == Activity.RESULT_OK) {
            val takenImage = data?.extras?.get("data") as Bitmap
            imageView.setImageBitmap(takenImage)
            //setViewAndDetect(takenImage)

        }
        super.onActivityResult(requestCode, resultCode, data)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btnCapture -> {
                val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)

                if(takePictureIntent.resolveActivity(this.packageManager) != null) {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE)
                } else{
                    Toast.makeText(this, "Unable to open camera", Toast.LENGTH_SHORT).show()
                }
            }
        }
        }
    }
