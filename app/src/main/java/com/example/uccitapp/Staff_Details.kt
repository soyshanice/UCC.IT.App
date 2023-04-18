package com.example.uccitapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Staff_Details : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff_details)
        val index: String? = this.intent.getStringExtra("listIndex")

        val name: TextView = findViewById(R.id.tvName)
        val email: TextView = findViewById(R.id.tvEmail)
        val position: TextView =findViewById(R.id.tvPosition)
        val number: TextView= findViewById(R.id.tvNumber)
        val photo: ImageView = findViewById(R.id.ivProfile)


        when(index){
            "0" -> {
                name.text = "ROSE, Natalie"
                email.text = "ithod@ucc.edu.jm"
                position.text ="IT HOD"
                number.text = "876 555-5566"
                photo.setImageResource(R.drawable.portrait___rose)
            }
            "1" -> {
                name.text = "CHANG, BRYANNA"
                email.text = "bchang@faculty.ucc.edu.jm"
                position.text ="Programme Officer/Adjunct Lecturer"
                number.text = "876 555-5566"
                photo.setImageResource(R.drawable.bryanna)
            }
            "2" -> {
                name.text = "OSBOURNE, OTIS"
                email.text = "itfaculty@ucc.edu.jm"
                position.text ="IT Lecturer/Assistant Programme Coordinator"
                number.text = "876 555-5566"
                photo.setImageResource(R.drawable.otis)
            }
            "3" -> {
                name.text = "BENNETT, WINSOME"
                email.text = "itprogrammeofficer@ucc.edu.jm"
                position.text ="Programme Coordinator "
                number.text = "876 555-5566"
                photo.setImageResource(R.drawable.winsome)
            }
            "4" -> {
                name.text = "REID, RICARDO"
                email.text = "itprogrammeofficer3@ucc.edu.jm"
                position.text ="Programme Officer"
                number.text = "876 555-5566"
                photo.setImageResource(R.drawable.ricardo)
            }
        }

        //Launches email client when email address is tapped
        email.setOnClickListener{
            val intent = Intent(Intent.ACTION_SENDTO, Uri.fromParts("mailto", email.toString(), null))
            intent.putExtra(Intent.EXTRA_EMAIL, email.toString())
            startActivity(intent)
        }
    }
    }
