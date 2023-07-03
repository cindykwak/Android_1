package com.example.roomdb_pratice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roomDb = AppDatabase.getInstance(this)

        if (roomDb != null){
            roomDb.userDao().updateByUserId(1,"Tiger")


            val userList = roomDb.userDao().selectAll()
            Log.d("DB","UserList : ${userList}")
        }
    }
}