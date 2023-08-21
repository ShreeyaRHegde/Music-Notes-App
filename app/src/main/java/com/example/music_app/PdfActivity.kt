package com.example.music_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.music_app.Instrument.InstrumentActivity
import com.example.music_app.Vocal.VocalHomeActivity
import com.google.firebase.auth.FirebaseAuth

class PdfActivity : AppCompatActivity() {
    lateinit var insNote: ImageView
    lateinit var vocNote: ImageView
   // lateinit var logout: Button
    //private lateinit var Firebase: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdf)

        insNote = findViewById(R.id.imageView)
        insNote.setOnClickListener {
            startActivity(Intent(this, InstrumentActivity::class.java))
        }
            vocNote = findViewById(R.id.imageView2)
            vocNote.setOnClickListener {
                startActivity(Intent(this, VocalHomeActivity::class.java))
            }

     /*   logout=findViewById(R.id.logout)
        logout.setOnClickListener{
            Firebase.signOut()

                val intent = Intent(this,SignInActivity::class.java)
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
                startActivity(intent)
                finish()
            }*/

        }

    }
