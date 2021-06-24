package com.dirror.lyricviewx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lyricViewX = findViewById<LyricViewX>(R.id.lyricViewX)

        lyricViewX.setDraggable(true, object : OnPlayClickListener {
            override fun onPlayClick(time: Long): Boolean {
                lyricViewX.updateTime(time)
                return true
            }
        })
    }


}