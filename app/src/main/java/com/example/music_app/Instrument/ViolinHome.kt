package com.example.music_app.Instrument

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.example.music_app.R
import com.example.music_app.Vocal.*
import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class ViolinHome : AppCompatActivity() {

    private val DOWNLOAD_DIRECTORY = "my_downloads"

    private fun createDownloadDirectory(): File {
        val root = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS)
        val directory = File(root, DOWNLOAD_DIRECTORY)
        if (!directory.exists()) {
            directory.mkdirs()
        }
        return directory
    }

    lateinit var sara: Button
    lateinit var hech: Button
    lateinit var tagu: Button
    lateinit var janti: Button
    lateinit var pigee: Button
    lateinit var varn: Button
    lateinit var alan: Button
    lateinit var daata: Button
    lateinit var makr: Button
    lateinit var vikr: Button
    lateinit var sagee: Button
    lateinit var swara: Button
    lateinit var laksgee: Button
    lateinit var sara1: Button
    lateinit var hech1: Button
    lateinit var tagu1: Button
    lateinit var janti1: Button
    lateinit var pigee1: Button
    lateinit var varn1: Button
    lateinit var alan1: Button
    lateinit var daata1: Button
    lateinit var makr1: Button
    lateinit var vikr1: Button
    lateinit var sagee1: Button
    lateinit var swara1: Button
    lateinit var laksgee1: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_violin_home)


        sara = findViewById(R.id.s1)
        hech = findViewById(R.id.t1)
        tagu = findViewById(R.id.m1)
        daata = findViewById(R.id.d1)
        alan = findViewById(R.id.a1)
        janti = findViewById(R.id.j1)
        pigee = findViewById(R.id.p1)
        varn = findViewById(R.id.v1)
        makr = findViewById(R.id.mk1)
        sagee = findViewById(R.id.sg1)
        swara = findViewById(R.id.sw1)
        laksgee = findViewById(R.id.l1)
        sara1 = findViewById(R.id.ys1)
        hech1 = findViewById(R.id.yt1)
        tagu1 = findViewById(R.id.ym1)
        daata1 = findViewById(R.id.yd1)
        alan1 = findViewById(R.id.ya1)
        janti1 = findViewById(R.id.yj1)
        pigee1 = findViewById(R.id.yp1)
        varn1 = findViewById(R.id.yv1)
        makr1 = findViewById(R.id.ymk1)
        sagee1 = findViewById(R.id.ysg1)
        swara1 = findViewById(R.id.ysw1)
        laksgee1 = findViewById(R.id.yl1)


        val downloadButton: Button = findViewById(R.id.downloadbtn2)
        downloadButton.setOnClickListener {
            handleDownloadButtonClick()
        }

        sara.setOnClickListener {
            startActivity(Intent(this, Saralevarasev::class.java))
        }

        hech.setOnClickListener {
            startActivity(Intent(this, Hechustyavarasev::class.java))
        }

        tagu.setOnClickListener {
            startActivity(Intent(this, Tagustyavarasev::class.java))
        }

        daata.setOnClickListener {
            startActivity(Intent(this, Daatuvarasev::class.java))
        }

        janti.setOnClickListener {
            startActivity(Intent(this, Jantivarasev::class.java))
        }

        alan.setOnClickListener {
            startActivity(Intent(this, Alankarav::class.java))
        }

        pigee.setOnClickListener {
            startActivity(Intent(this, Geethev::class.java))
        }

        varn.setOnClickListener {
            startActivity(Intent(this, Varnav::class.java))
        }

        makr.setOnClickListener {
            startActivity(Intent(this, Kruthiv::class.java))
        }


        sagee.setOnClickListener {
            startActivity(Intent(this, Lakshanageethe::class.java))
        }

        swara.setOnClickListener {
            startActivity(Intent(this, Swarajathiv::class.java))
        }

        laksgee.setOnClickListener {
            startActivity(Intent(this, Jathiswarav::class.java))
        }


        sara1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9eFJ7pLhT_DjpVdQOEVEiqP") })
        hech1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9fxdD_s6fnjcPMj6oYttDzQ") })
        tagu1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9cVLFHDpRuYKRhZ_w58BrKQ") })
        daata1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9cy9sHjb4RHqh6TvTDVAhTg") })
        janti1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9fxMMjALM0IuVzx3cGvmoHT") })
        pigee1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9d2__AnRcrelQwJ45CX7dxI") })
        sagee1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLVrVX9oCPy1u__PgtoSts8qR4WIqNeB5_") })
        swara1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLVrVX9oCPy1tGqQhkvx1vy4PxDUjyC9U2") })
        laksgee1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLVrVX9oCPy1v2CwcfY8FlDf04KPEP_lCD") })
        alan1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9d5_Sl1Kwxbqdhw_gAu7L2k") })
        varn1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLVrVX9oCPy1sW9YadGlrnSmMduyrZiLeR") })
        makr1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLVrVX9oCPy1u2wQfRZtdyW4E9QszC-o8-") })


    }






    private fun gotoUrl(s: String) {
        val uri = Uri.parse(s)
        startActivity(Intent(Intent.ACTION_VIEW, uri))
    }
    private fun copyFileFromAssets(assetFileName: String, outputFile: File) {
        val inputStream = assets.open(assetFileName)
        val outputStream = FileOutputStream(outputFile)

        val buffer = ByteArray(4 * 1024)
        var read: Int

        while (inputStream.read(buffer).also { read = it } != -1) {
            outputStream.write(buffer, 0, read)
        }

        outputStream.flush()
        outputStream.close()
        inputStream.close()
    }


    private fun handleDownloadButtonClick() {
        val assetFileName = "violin_pdf.pdf"  // Replace with your actual PDF file name in the assets folder
        val outputDirectory = createDownloadDirectory()
        val outputFile = File(outputDirectory, assetFileName)

        if (!outputFile.exists()) {
            try {
                copyFileFromAssets(assetFileName, outputFile)
                Toast.makeText(this, "PDF downloaded successfully!", Toast.LENGTH_SHORT).show()
            } catch (e: IOException) {
                e.printStackTrace()
                Toast.makeText(this, "Failed to download PDF", Toast.LENGTH_SHORT).show()
            }
        } else {
            Toast.makeText(this, "PDF file already downloaded", Toast.LENGTH_SHORT).show()
        }
    }



}




