package com.example.dongkey

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_fourth.*


class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        init()
    }


    fun init() {

        han1.setOnCheckedChangeListener { buttonview, isChecked ->
            if (isChecked) {
                han1.setButtonDrawable(R.drawable.one3)

            } else {
                han1.setButtonDrawable(R.drawable.one4)
            }
        }
        han2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                han2.setButtonDrawable(R.drawable.two3)
            } else {
                han2.setButtonDrawable(R.drawable.two4)
            }
        }
        han3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                han3.setButtonDrawable(R.drawable.three3)
            } else {
                han3.setButtonDrawable(R.drawable.three4)
            }
        }
        han4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                han4.setButtonDrawable(R.drawable.four3)
            } else {
                han4.setButtonDrawable(R.drawable.four4)
            }
        }
        han5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                han5.setButtonDrawable(R.drawable.five3)
            } else {
                han5.setButtonDrawable(R.drawable.five4)
            }
        }

        chi1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                chi1.setButtonDrawable(R.drawable.one3)
            } else {
                chi1.setButtonDrawable(R.drawable.one4)
            }
        }
        chi2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                chi2.setButtonDrawable(R.drawable.two3)
            } else {
                chi2.setButtonDrawable(R.drawable.two4)
            }

        }
        chi3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                chi3.setButtonDrawable(R.drawable.three3)
            } else {
                chi3.setButtonDrawable(R.drawable.three4)
            }
        }
        chi4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                chi4.setButtonDrawable(R.drawable.four3)
            } else {
                chi4.setButtonDrawable(R.drawable.four4)
            }
        }
        chi5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                chi5.setButtonDrawable(R.drawable.five3)
            } else {
                chi5.setButtonDrawable(R.drawable.five4)
            }
        }
        edu1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                edu1.setButtonDrawable(R.drawable.one3)
            } else {
                edu1.setButtonDrawable(R.drawable.one4)
            }
        }
        edu2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                edu2.setButtonDrawable(R.drawable.two3)
            } else {
                edu2.setButtonDrawable(R.drawable.two4)
            }

        }
        edu3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                edu3.setButtonDrawable(R.drawable.three3)
            } else {
                edu3.setButtonDrawable(R.drawable.three4)
            }
        }
        edu4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                edu4.setButtonDrawable(R.drawable.four3)
            } else {
                edu4.setButtonDrawable(R.drawable.four4)
            }
        }
        edu5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                edu5.setButtonDrawable(R.drawable.five3)
            } else {
                edu5.setButtonDrawable(R.drawable.five4)
            }
        }
        hos1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                hos1.setButtonDrawable(R.drawable.one3)
            } else {
                hos1.setButtonDrawable(R.drawable.one4)
            }
        }
        hos2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                hos2.setButtonDrawable(R.drawable.two3)
            } else {
                hos2.setButtonDrawable(R.drawable.two4)
            }

        }
        hos3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                hos3.setButtonDrawable(R.drawable.three3)
            } else {
                hos3.setButtonDrawable(R.drawable.three4)
            }
        }
        hos4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                hos4.setButtonDrawable(R.drawable.four3)
            } else {
                hos4.setButtonDrawable(R.drawable.four4)
            }
        }
        hos5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                hos5.setButtonDrawable(R.drawable.five3)
            } else {
                hos5.setButtonDrawable(R.drawable.five4)
            }
        }
        noin1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                noin1.setButtonDrawable(R.drawable.one3)
            } else {
                noin1.setButtonDrawable(R.drawable.one4)
            }
        }
        noin2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                noin2.setButtonDrawable(R.drawable.two3)
            } else {
                noin2.setButtonDrawable(R.drawable.two4)
            }

        }
        noin3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                noin3.setButtonDrawable(R.drawable.three3)
            } else {
                noin3.setButtonDrawable(R.drawable.three4)
            }
        }
        noin4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                noin4.setButtonDrawable(R.drawable.four3)
            } else {
                noin4.setButtonDrawable(R.drawable.four4)
            }
        }
        noin5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                noin5.setButtonDrawable(R.drawable.five3)
            } else {
                noin5.setButtonDrawable(R.drawable.five4)
            }
        }
        shop1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                shop1.setButtonDrawable(R.drawable.one3)
            } else {
                shop1.setButtonDrawable(R.drawable.one4)
            }
        }
        shop2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                shop2.setButtonDrawable(R.drawable.two3)
            } else {
                shop2.setButtonDrawable(R.drawable.two4)
            }

        }
        shop3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                shop3.setButtonDrawable(R.drawable.three3)
            } else {
                shop3.setButtonDrawable(R.drawable.three4)
            }
        }
        shop4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                shop4.setButtonDrawable(R.drawable.four3)
            } else {
                shop4.setButtonDrawable(R.drawable.four4)
            }
        }
        shop5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                shop5.setButtonDrawable(R.drawable.five3)
            } else {
                shop5.setButtonDrawable(R.drawable.five4)
            }
        }
        trans1.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                trans1.setButtonDrawable(R.drawable.one3)
            } else {
                trans1.setButtonDrawable(R.drawable.one4)
            }
        }
        trans2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                trans2.setButtonDrawable(R.drawable.two3)
            } else {
                trans2.setButtonDrawable(R.drawable.two4)
            }

        }
        trans3.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                trans3.setButtonDrawable(R.drawable.three3)
            } else {
                trans3.setButtonDrawable(R.drawable.three4)
            }
        }
        trans4.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                trans4.setButtonDrawable(R.drawable.four3)
            } else {
                trans4.setButtonDrawable(R.drawable.four4)
            }
        }
        trans5.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                trans5.setButtonDrawable(R.drawable.five3)
            } else {
                trans5.setButtonDrawable(R.drawable.five4)
            }
        }

        nextButton_2.setOnClickListener {
            Log.d("nextButton_2", "clicked")
            val intent = Intent(this, FifthActivity::class.java) //다음이어질 액티비티
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()
        }
    }
}