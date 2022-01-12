package com.example.broadcastreciever

import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intentFilter = IntentFilter("com.heyitsbroadcast.myBroadcast")
        val broadCast = MyReceiver()
        registerReceiver(broadCast,intentFilter)
    }
}