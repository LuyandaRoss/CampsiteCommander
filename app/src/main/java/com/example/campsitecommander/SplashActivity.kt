package com.example.campsitecommander

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

@SuppressLint("CustomSplashScreen")
class SplashActivity : AppCompatActivity() {
    @SuppressLint("MissingSuperCall")
    override fun
            onCreate(savedInstanceState: Bundle?) {
                super.onCreate(savedInstanceState)
        SetContentView(R.layout.activity_splash)
        //3 Seconds to main
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
    }



