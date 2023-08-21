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

class MrudangaHome : AppCompatActivity() {

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
        setContentView(R.layout.activity_mrudanga_home)


        sara = findViewById(R.id.s2)
        hech = findViewById(R.id.t2)
        tagu = findViewById(R.id.m2)
        daata = findViewById(R.id.d2)
        alan = findViewById(R.id.a2)
        janti = findViewById(R.id.j2)
        pigee = findViewById(R.id.p2)
        varn = findViewById(R.id.v2)
        makr = findViewById(R.id.mk2)
        vikr = findViewById(R.id.vk2)
        sagee = findViewById(R.id.sg2)
        swara = findViewById(R.id.sw2)
       // laksgee = findViewById(R.id.l2)
        sara1 = findViewById(R.id.ys2)
        hech1 = findViewById(R.id.yt2)
        tagu1 = findViewById(R.id.ym2)
        daata1 = findViewById(R.id.yd2)
        alan1 = findViewById(R.id.ya2)
        janti1 = findViewById(R.id.yj2)
        pigee1 = findViewById(R.id.yp2)
        varn1 = findViewById(R.id.yv2)
        makr1 = findViewById(R.id.ymk2)
        vikr1 = findViewById(R.id.yvk2)
        sagee1 = findViewById(R.id.ysg2)
        swara1 = findViewById(R.id.ysw2)
       // laksgee1 = findViewById(R.id.yl2)


        val downloadButton: Button = findViewById(R.id.downloadbtn4)
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
            startActivity(Intent(this, Madhyamakaala_kruthi::class.java))
        }

        vikr.setOnClickListener {
            startActivity(Intent(this, Vilambakaala_kruthi::class.java))
        }

        sagee.setOnClickListener {
            startActivity(Intent(this, Lakshanageethe::class.java))
        }

        swara.setOnClickListener {
            startActivity(Intent(this, Swarajathi::class.java))
        }



        sara1.setOnClickListener(View.OnClickListener { gotoUrl(" https://www.youtube.com/watch?v=EpD0LYmhQkI&list=PLlqPj6VEwbXKOfZUaJxkVzi6-_7vX9x-_&index=5") })
        hech1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=biXasK3X2EI&list=PLlqPj6VEwbXKOfZUaJxkVzi6-_7vX9x-_&index=4") })
        tagu1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=6ayHRGp2SBE&list=PLlqPj6VEwbXKOfZUaJxkVzi6-_7vX9x-_&index=1&pp=iAQB") })
        daata1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=Jl8oH4GW14c") })
        janti1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=HDGboI0I7uM") })
        pigee1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=YJmlRPpXlvg&pp=ygUcbWFsYWhhcmkgZ2VldGhlIGluIG1yaWRhbmdhbQ%3D%3D") })
        sagee1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=je4GCS_846c&pp=ygUabW9oYW5hIGdlZXRoZSBpbiBtcmlkYW5nYW0%3D") })
        swara1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=rBs6jZv3xa8&pp=ygUgYmlsYWhhcmkgc3dhcmFqYXRoaSBpbiBtcmlkYW5nYW0%3D") })
        alan1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=KezwrgiosQU&list=PLlqPj6VEwbXKOfZUaJxkVzi6-_7vX9x-_&index=5&pp=iAQB") })
        varn1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=BA1b8nUc-wk") })
        makr1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=pHQvpSoXvIM&list=PLlqPj6VEwbXKOfZUaJxkVzi6-_7vX9x-_&index=7&pp=iAQB") })
        vikr1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=Fr7zxdTW458&list=PLlqPj6VEwbXKOfZUaJxkVzi6-_7vX9x-_&index=19") })

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






