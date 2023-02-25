package com.example.directtimer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import java.util.*
import kotlin.concurrent.timer

class SecondActivity : AppCompatActivity() {
    private var time = 0
    private var timerTask : Timer? = null
    private lateinit var secText : TextView
    private lateinit var milliText : TextView
    private lateinit var btnStop : ImageButton
    private lateinit var btnReturn : ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        btnStop.setOnClickListener {
            stopTimer()
        }
        btnReturn.setOnClickListener {
            finish()
        }


    }

    private fun stopTimer() {
        timerTask?.cancel()
    }

    private fun startTimer() {
        timerTask = timer(period = 10) {
            time++ // 0.01초마다 time을 1씩 증가
            val sec = time / 100    // 초 부분
            val milli = time % 100  // 밀리초 부분

            runOnUiThread {
                secText.text = "$sec"	  // TextView 세팅
                milliText.text = "$milli" // Textview 세팅
            }

        }
    } //--startTimer




}