package com.example.roomdb_pratice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.roomdb_pratice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var Binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(Binding.root)

        Binding.btnStart.setOnClickListener{
            val intent = Intent(this,HomeActivity::class.java)

            startActivity(intent)
        }

    }
}