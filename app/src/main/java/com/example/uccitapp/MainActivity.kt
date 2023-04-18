package com.example.uccitapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import com.google.android.material.floatingactionbutton.FloatingActionButton


class MainActivity : AppCompatActivity() {
    lateinit var recyclerbtn : Button
    private val mail: String = "ithod@ucc.edu.jm"

    private val url: String  ="https://www.instagram.com/uccjamaica/?hl=en"
    private val fburl: String ="https://www.facebook.com/uccjamaica/"
    private val twitterurl: String ="https://twitter.com/UCCjamaica"
            override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val directory: ImageButton = findViewById(R.id.ibDirectory)
        directory.setOnClickListener {
            val intent = Intent(this, Directory::class.java)
            startActivity(intent)
        }
        val admission: ImageButton = findViewById(R.id.ibAdmission)
        admission.setOnClickListener {
                val intent = Intent(this, Admission::class.java)
                startActivity(intent)
            }
            recyclerbtn = findViewById(R.id.recyclerviewbtn)
            recyclerbtn.setOnClickListener {
                var i = Intent(this,userlist::class.java)
                startActivity(i)
                finish()


            }




                val web: ImageButton = findViewById(R.id.ibSocials)
                web.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.setData(Uri.parse(url))
                    startActivity(intent)
                }
                val fb: ImageButton = findViewById(R.id.ibfacebook)
                fb.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.setData(Uri.parse(fburl))
                    startActivity(intent)
                }
                val twitter: ImageButton = findViewById(R.id.ibtwitter)
                twitter.setOnClickListener {
                    val intent = Intent(Intent.ACTION_VIEW)
                    intent.setData(Uri.parse(twitterurl))
                    startActivity(intent)
                }


        val sendEmail: FloatingActionButton = findViewById(R.id.fabEmail)
        sendEmail.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", mail, null))
            intent.putExtra(Intent.EXTRA_EMAIL, mail)
            startActivity(intent)
        }
    }
}