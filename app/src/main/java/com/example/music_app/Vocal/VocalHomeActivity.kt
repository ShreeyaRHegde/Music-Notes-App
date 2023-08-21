package com.example.music_app.Vocal

import android.Manifest
import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.music_app.R
import android.view.View
import android.widget.Toast

import java.io.File
import java.io.FileOutputStream
import java.io.IOException

class VocalHomeActivity : AppCompatActivity() {
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
    //lateinit var downloadButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.example)
      //   downloadButton: Button = findViewById(R.id.downloadButton)
        sara = findViewById(R.id.button19)
        hech = findViewById(R.id.button22)
        tagu = findViewById(R.id.button24)
        daata = findViewById(R.id.button25)
        alan = findViewById(R.id.button26)
        janti = findViewById(R.id.button28)
       pigee = findViewById(R.id.button29)
        varn = findViewById(R.id.button44)
        makr = findViewById(R.id.button45)
        vikr = findViewById(R.id.button46)
        sagee = findViewById(R.id.button30)
        swara = findViewById(R.id.button33)
        laksgee = findViewById(R.id.button32)
        sara1 = findViewById(R.id.button21)
        hech1 = findViewById(R.id.button23)
        tagu1 = findViewById(R.id.button47)
        daata1 = findViewById(R.id.button48)
        alan1 = findViewById(R.id.button49)
        janti1 = findViewById(R.id.button27)
        pigee1 = findViewById(R.id.button51)
        varn1 = findViewById(R.id.button55)
        makr1 = findViewById(R.id.button56)
        vikr1 = findViewById(R.id.button57)
        sagee1 = findViewById(R.id.button52)
        swara1 = findViewById(R.id.button54)
        laksgee1 = findViewById(R.id.button53)


        val downloadButton: Button = findViewById(R.id.downloadbtn)
        downloadButton.setOnClickListener {
            handleDownloadButtonClick()
        }
        sara.setOnClickListener {
            startActivity(Intent(this, Saaralevarase::class.java))
        }

        hech.setOnClickListener {
            startActivity(Intent(this, Hechustaye::class.java))
        }

        tagu.setOnClickListener {
            startActivity(Intent(this, Tagusthayevarase::class.java))
        }

        daata.setOnClickListener {
            startActivity(Intent(this, Daatuvarase::class.java))
        }

        janti.setOnClickListener {
            startActivity(Intent(this, Jantivarase::class.java))
        }

        alan.setOnClickListener {
            startActivity(Intent(this, Alankara::class.java))
        }

        pigee.setOnClickListener {
            startActivity(Intent(this, PillariGeete::class.java))
        }

        varn.setOnClickListener {
            startActivity(Intent(this, Varna::class.java))
        }

        makr.setOnClickListener {
            startActivity(Intent(this, Madhyamakaala_kruthi::class.java))
        }

        vikr.setOnClickListener {
            startActivity(Intent(this, Vilambakaala_kruthi::class.java))
        }

        sagee.setOnClickListener {
            startActivity(Intent(this, SanchariGeethe::class.java))
        }

        swara.setOnClickListener {
            startActivity(Intent(this, Swarajathi::class.java))
        }

       laksgee.setOnClickListener {
            startActivity(Intent(this, LakshanaGeethe::class.java))
        }


        sara1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=-yUENqj56RY" ) })
        hech1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=h6Q3KUhEEEE&list=PLE_xBHMCfPspShvpV7E2QYKNUFZqP-dCR&index=10") })
        tagu1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=OQ1zgIM5cSA") })
        daata1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/watch?v=3_0DMrRwEUg&list=PLE_xBHMCfPspShvpV7E2QYKNUFZqP-dCR&index=9") })
        janti1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9dJVcfblMwV62B7XRXa9PSz") })
        pigee1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9dYVnEBulwGJKA0851Dt7nP") })
        sagee1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9fgDNo-ITLGR3Q01WKjXUeL") })
        swara1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9fsq7VC3ggdtqz5RrvnPahW") })
        laksgee1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9fjlrZZ_tXsWeRUPWtg0U8J") })
        alan1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9f5mN5-Zq0x5FL4KLLtL-HZ") })
        varn1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9fxW8Uqxdzpy-qiS07ROPhs") })
        makr1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9dYXNIE8BriLP6n6JZpku2u") })
        vikr1.setOnClickListener(View.OnClickListener { gotoUrl("https://www.youtube.com/playlist?list=PLSddYcQ2t-9d2oRKDIICW1WgYJaeFAxd9") })


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
        val assetFileName = "vocal_pdf.pdf"  // Replace with your actual PDF file name in the assets folder
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


