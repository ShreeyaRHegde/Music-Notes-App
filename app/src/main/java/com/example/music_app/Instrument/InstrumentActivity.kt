package com.example.music_app.Instrument

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.example.music_app.MainActivity
import com.example.music_app.R

class InstrumentActivity : AppCompatActivity() {

    lateinit var violNote: ImageView
    lateinit var veenaNote: ImageView
    lateinit var mruNote: ImageView

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instrument)

        violNote = findViewById(R.id.imageView5)
        violNote.setOnClickListener {
            startActivity(Intent(this, ViolinHome::class.java))
        }
        mruNote = findViewById(R.id.imageView6)
        mruNote.setOnClickListener {
            startActivity(Intent(this, MrudangaHome::class.java))
        }
        veenaNote = findViewById(R.id.imageView7)
        veenaNote.setOnClickListener {
            startActivity(Intent(this, VeenaHome::class.java))
        }

    }
}