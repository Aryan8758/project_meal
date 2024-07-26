package com.example.meal_apk

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class sign_in_page : AppCompatActivity() {
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