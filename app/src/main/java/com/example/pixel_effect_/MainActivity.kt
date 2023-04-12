package com.example.pixel_effect_

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animation = AnimationUtils.loadAnimation(this@MainActivity, R.anim.blink)
        findViewById<View>(R.id.Pixel).animation = animation

        Handler().postDelayed({
            startActivity(Intent(this@MainActivity,Home_Activity::class.java))
            finish()
        }, 4000)
    }
    }

