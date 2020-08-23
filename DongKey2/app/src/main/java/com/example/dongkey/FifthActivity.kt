package com.example.dongkey

import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fifth.*

class FifthActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        detail0.setOnClickListener{
            Log.d("detail0","clicked")
            val intent = Intent(this,SixthActivity::class.java) //다음이어질 액티비티
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish() }

    }

}
