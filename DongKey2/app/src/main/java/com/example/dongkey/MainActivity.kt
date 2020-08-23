package com.example.dongkey

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*


class MainActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT:Long = 1500 // 1 sec
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Handler().postDelayed({
            // This method will be executed once the timer is over
            // Start your app main activity

            startActivity(Intent(this, SecondActivity::class.java))

            // close this activity
            finish()
        }, SPLASH_TIME_OUT)

    }


}
