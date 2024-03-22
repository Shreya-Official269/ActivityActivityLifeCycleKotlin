package com.example.activityactivitylifecyclekotlin

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.google.android.material.tabs.TabLayout.TabGravity

class MainActivity : AppCompatActivity() {

    val TAG = "Main Activity"
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG,"OnCreate")

        button = findViewById(R.id.button)
        button.setOnClickListener(View.OnClickListener { startActivity(Intent(this,MainActivity2::class.java)) })


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