package com.example.dongkey

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_third.*


class ThirdActivity : AppCompatActivity() {
    lateinit var user_name:String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)


        nextButton_1.setOnClickListener {
            if(nameEditText.text.toString().length >0){
                user_name = nameEditText.text.toString()
                Toast.makeText(this,"${user_name}를 입력하셨습니다.",Toast.LENGTH_SHORT).show()
                val intent2 = Intent(this,FourthActivity::class.java) //다음이어질 액티비티
                startActivity(intent2)
                overridePendingTransition(0, 0)
                finish()
            }else{
                Toast.makeText(this,"다른 구를 입력해주세요",Toast.LENGTH_SHORT).show()
            }
        }
    }

}