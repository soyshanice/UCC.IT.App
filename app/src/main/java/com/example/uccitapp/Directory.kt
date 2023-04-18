package com.example.uccitapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class Directory : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_directory)

        val facultyList: Array<String> = resources.getStringArray(R.array.faculty)
        val adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, facultyList)

        val listView: ListView = findViewById(R.id.lvFaculty)

        listView.adapter = adapter


        listView.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(this, "Clicked item : "+position, Toast.LENGTH_SHORT).show()
            val intent = Intent(this, Staff_Details ::class.java);

            intent.putExtra("listIndex", position.toString());

            this.startActivity(intent);
        }

    }
}