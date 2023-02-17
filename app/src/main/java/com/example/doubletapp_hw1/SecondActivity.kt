package com.example.doubletapp_hw1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

const val TAG_SECOND_ACT = "Second Activity"

class SecondActivity : AppCompatActivity() {
    companion object {
        const val COUNTER = "counter"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scond)
        Log.i(TAG_MAIN_ACT ,"onCreate invoked")
        val counterTextView = findViewById<TextView>(R.id.pow2_cfg_ch)
        val counter = intent.getIntExtra(COUNTER, 0)
        counterTextView.text = (counter*counter).toString()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG_SECOND_ACT,"onStart invoked")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG_SECOND_ACT,"onResume invoked")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG_SECOND_ACT,"onPause invoked")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG_SECOND_ACT,"onStop invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG_SECOND_ACT,"onDestroy invoked")
    }
}