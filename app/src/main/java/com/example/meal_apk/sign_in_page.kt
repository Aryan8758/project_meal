package com.example.meal_apk

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityMainBinding

class sign_in_page : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in_page)
        val login: TextView = findViewById(R.id.already_joined)
        login.setOnClickListener {
            val intent = Intent(this@sign_in_page, sign_up_page::class.java)
            startActivity(intent)
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
        }

    }
}