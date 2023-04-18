package com.example.uccitapp

import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter(private val userlist: ArrayList<Courses>) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.user_item,
            parent, false);
        return MyViewHolder(itemView)

    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentitem = userlist[position]

        holder.CourseCode.text = currentitem.CourseCode
        holder.CourseName.text = currentitem.CourseName
        holder.Credits.text = currentitem.Credits
        holder.Coursedescription.text = currentitem.Description
        holder.prerequisites.text = currentitem.Prerequisites

    }

    override fun getItemCount(): Int {
        return userlist.size
    }

    class MyViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {

        val CourseCode: TextView = itemView.findViewById(R.id.tvCourseCode)
        val CourseName: TextView = itemView.findViewById(R.id.tvCourseName)
        val Credits: TextView = itemView.findViewById(R.id.tvcredits)
        val Coursedescription: TextView = itemView.findViewById(R.id.tvcoursedescription)
        val prerequisites: TextView = itemView.findViewById(R.id.tvprerequisites)

    }

}

