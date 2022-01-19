package com.example.interpreterproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.rte.Rte
import com.example.rte.RteApplication
import com.example.rte.TestAccess
import com.test_pack.TestAccessCoreLib
import com.test_pack.TestApplicationBuilder
import com.test_pack.Writer


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Yannick",
              TestAccess().testString + " X " + TestAccessCoreLib().testString)
        findViewById<TextView>(R.id.showTextField).text = TestAccess().testString + " X " + TestAccessCoreLib().testString
        var writer: Writer = object : Writer {
            override fun write(text: String) {
                findViewById<TextView>(R.id.showTextField).text = text
            }
        }
        Rte().run(TestApplicationBuilder(writer).build())
    }
}