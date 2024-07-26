package com.example.meal_apk

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var handler: Handler
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = Handler(Looper.getMainLooper())
        handler.postDelayed({
            val intent = Intent(this@MainActivity, sign_in_page::class.java)
            startActivity(intent)
            finish()
        }, 3000)
    }
}