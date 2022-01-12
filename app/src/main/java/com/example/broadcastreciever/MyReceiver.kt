package com.example.broadcastreciever

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.broadcastreciever.databinding.ActivityMainBinding

class MyReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        // This method is called when the BroadcastReceiver is receiving an Intent broadcast.

        val bundle = intent.getStringExtra("key").toString()
        Toast.makeText(context,"received $bundle",Toast.LENGTH_SHORT).show()

    }
}