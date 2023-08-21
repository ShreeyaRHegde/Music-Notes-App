package com.example.music_app.Instrument

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.music_app.R
import com.github.barteksc.pdfviewer.PDFView
import com.github.barteksc.pdfviewer.util.FitPolicy

class Saralevarasev : AppCompatActivity() {
    private lateinit var pdfView: PDFView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saaralevarase)
        pdfView = findViewById(R.id.pdfView1)
        displayPDFFromAsset("violin_pdf.pdf")
    }

    private fun displayPDFFromAsset(fileName: String) {
        try {
            pdfView.fromAsset(fileName)
                .pages(0)
                .defaultPage(0)
                .enableSwipe(true)
                .swipeHorizontal(false)
                .enableDoubletap(true)
                .pageFitPolicy(FitPolicy.WIDTH)
                .load()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
}