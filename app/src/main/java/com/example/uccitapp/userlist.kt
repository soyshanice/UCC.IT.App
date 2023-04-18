package com.example.uccitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.firebase.database.*

class userlist : AppCompatActivity() {

    private lateinit var dbref : DatabaseReference
    private lateinit var userRecyclerview : RecyclerView
    private lateinit var userArrayList : ArrayList<Courses>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userlist)

        userRecyclerview = findViewById(R.id.userList)
        userRecyclerview.layoutManager = LinearLayoutManager(this)
        userRecyclerview.setHasFixedSize(true)

        userArrayList = arrayListOf<Courses>()



        getUserData()
    }

private fun getUserData() {

    dbref = FirebaseDatabase.getInstance().getReference("Courses")

    dbref.addValueEventListener(object : ValueEventListener {

        override fun onDataChange(snapshot: DataSnapshot) {

            if (snapshot.exists()){

                for (userSnapshot in snapshot.children){

                    val user = userSnapshot.getValue(Courses::class.java)

                    if (!userArrayList.contains(user)) {
                        userArrayList.add(user!!)
                    }


                }
                userRecyclerview.adapter = Adapter(userArrayList)


            }

        }

        override fun onCancelled(error: DatabaseError) {
            Toast.makeText(this@userlist,error.toString(),Toast.LENGTH_SHORT).show()
        }


    })

}


}