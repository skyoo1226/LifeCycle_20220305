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

    override fun onResume() {
        super.onResume()
        Log.d("메인","onResume 실행됨")
    }

    override fun onPause() {
        super.onPause()
        Log.d("메인화면","onPause 실행됨")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("메인화면","onDestroy 실행됨")
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