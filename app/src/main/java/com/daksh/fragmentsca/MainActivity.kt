package com.daksh.fragmentsca

import TrafficLightFragment


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load the initial fragment
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, TrafficLightFragment())
            .commit()
    }
}
