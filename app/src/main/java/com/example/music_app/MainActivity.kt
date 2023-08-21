package com.example.music_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        lateinit var start: Button
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        start=findViewById(R.id.startbtn)

        start.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
    }
}