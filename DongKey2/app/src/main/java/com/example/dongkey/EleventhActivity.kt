package com.example.dongkey

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_eleventh.*

class EleventhActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eleventh)
        go_detail7.setOnClickListener {
            Log.d("go_detail7", "clicked")
            val intent = Intent(this, TwelvethActivity::class.java) //다음이어질 액티비티
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }

    }
}