package com.example.music_app.Instrument

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.music_app.R
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.util.FitPolicy

class Daatuvarasev : AppCompatActivity() {
    private lateinit var pdfView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saaralevarase)
        pdfView = findViewById(R.id.pdfView1)
        displayPDFFromAsset("violin_pdf.pdf")  // Replace with your PDF file name
    }

    private fun displayPDFFromAsset(fileName: String) {
        try {
            pdfView.fromAsset(fileName)
                .pages(3)
                //  .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                //.onPageChange { _, _ -> /* Optional: perform actions on page change */ }
                //.onLoad { /* Optional: perform actions on PDF load */ }

                .pageFitPolicy(FitPolicy.WIDTH)
                .load()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}