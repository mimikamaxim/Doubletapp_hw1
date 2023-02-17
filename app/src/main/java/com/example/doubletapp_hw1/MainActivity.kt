package com.example.doubletapp_hw1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.util.Log
import android.widget.Button
import android.widget.TextView

const val TAG_MAIN_ACT = "First Activity"

lateinit var counter: TextView

class MainActivity : AppCompatActivity() {
    companion object {
        const val COUNTER = "counter"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i(TAG_MAIN_ACT ,"onCreate invoked")
        counter = findViewById<TextView>(R.id.number_of_cfg_change)
        if (savedInstanceState != null){
            counter.text = savedInstanceState.getInt(COUNTER).toString()
        } else counter.text = "0"
        counter.text = (counter.text.toString().toInt()+1).toString()
        val btnStartSecondActivity = findViewById<Button>(R.id.start_second_activity)
        btnStartSecondActivity.setOnClickListener { startSecondActivity() }
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG_MAIN_ACT,"onStart invoked")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG_MAIN_ACT,"onResume invoked")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG_MAIN_ACT,"onPause invoked")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG_MAIN_ACT,"onStop invoked")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG_MAIN_ACT,"onDestroy invoked")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(COUNTER, counter.text.toString().toInt())
    }

    fun startSecondActivity () {
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra(SecondActivity.COUNTER, counter.text.toString().toInt())
        startActivity(intent)
    }
}