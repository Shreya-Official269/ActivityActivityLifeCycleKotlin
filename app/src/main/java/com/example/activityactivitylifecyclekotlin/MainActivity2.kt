package com.example.activityactivitylifecyclekotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity2 : AppCompatActivity() {

    val TAG = "Main Activity2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        Log.d(TAG,"OnCreate")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG,"OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG,"OnStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG,"OnRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG,"OnDestroy")
    }

}