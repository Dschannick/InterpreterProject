package com.example.interpreterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tw = findViewById<TextView>(R.id.mainText)
        tw.text = "set text  " + BuildConfig.TEXT_1


    }
}