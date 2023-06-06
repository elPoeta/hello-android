package com.github.elpoeta.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)
        val greet = findViewById<TextView>(R.id.greet)
        val msg = intent.extras?.getString("msg").orEmpty();
        greet.text = "Hello, $msg"
    }
}