package com.example.interpreterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.rte.TestAccess
import com.test_pack.TestAccessCoreLib


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Yannick", TestAccess().testString + " X " + TestAccessCoreLib().testString)
        findViewById<TextView>(R.id.showTextField).text = TestAccess().testString + " X " + TestAccessCoreLib().testString
    }
}