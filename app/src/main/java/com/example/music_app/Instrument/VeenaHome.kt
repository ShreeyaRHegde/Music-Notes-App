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

class VeenaHome : AppCompatActivity() {

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
        setContentView(R.layout.activity_veena_home)
        

        sara = findViewById(R.id.s)
        hech = findViewById(R.id.t)
        tagu = findViewById(R.id.m)
        daata = findViewById(R.id.d)
        alan = findViewById(R.id.a)
        janti = findViewById(R.id.j)
        pigee = findViewById(R.id.p)
        varn = findViewById(R.id.v)
        makr = findViewById(R.id.mk)
        vikr = findViewById(R.id.vk)
        sagee = findViewById(R.id.sg)
        swara = findViewById(R.id.sw)

        sara1 = findViewById(R.id.ys)
        hech1 = findViewById(R.id.yt)
        tagu1 = findViewById(R.id.ym)
        daata1 = findViewById(R.id.yd)
        alan1 = findViewById(R.id.ya)
        janti1 = findViewById(R.id.yj)
        pigee1 = findViewById(R.id.yp)
        varn1 = findViewById(R.id.yv)
        makr1 = findViewById(R.id.ymk)
        vikr1 = findViewById(R.id.yvk)
        sagee1 = findViewById(R.id.ysg)
        swara1 = findViewById(R.id.ysw)



        val downloadButton: Button = findViewById(R.id.downloadbtn3)
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


        sara1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=xTy6E_scKpg") })
        hech1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=078Vt-pOUf0&list=PLSddYcQ2t-9cyMC3pTGrI2nx3-m5IK03_") })
        tagu1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=4OJtqEg_p28") })
        daata1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=zh4gfIsSgUk&list=PLSddYcQ2t-9cyMC3pTGrI2nx3-m5IK03_&index=2") })
        janti1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=DZ-vRVDk9CY") })
        pigee1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9cqz7lVq5Iq4Z0WgkEwBvnl") })
        sagee1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9cmm7eBNWT1EDN-ZZUsR1qV") })
        swara1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9fe-r2cc_06SUrgG4Yw65r8") })
        alan1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9eJP2k7hiXH0xwM0C_d03XP") })
        varn1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9eNR9unLxZtmmajIOGRuMD3") })
        makr1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9cAo3wl9i--YqKo6XPRraap") })
        vikr1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9dmOEE959vPIgTCFt6Fosk6") })

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






