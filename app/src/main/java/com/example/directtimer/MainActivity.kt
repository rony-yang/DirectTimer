package com.example.directtimer

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var timerGroup1 : Button
    lateinit var Btn1min : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        timerGroup1.setOnClickListener {
            var intent = Intent(applicationContext, SecondActivity::class.java)




        }
    }

} //--MainActivity



