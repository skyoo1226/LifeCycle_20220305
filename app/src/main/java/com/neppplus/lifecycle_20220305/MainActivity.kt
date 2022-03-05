package com.neppplus.lifecycle_20220305

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

        fun setupEvents()  {

            btnMove.setOnClickListener {

                val myIntent = Intent(this, OtherActivity::class.java)
                startActivity(myIntent)

            }
        }

        fun setValues() {
            Log.d("메인화면", "onCreate 실행됨")

        }


    }
}