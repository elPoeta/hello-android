package com.github.elpoeta.helloworld

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.EditText
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myButton = findViewById<AppCompatButton>(R.id.myButton)
        val myText = findViewById<AppCompatEditText>(R.id.myText)

        myButton.setOnClickListener {
            val msg = myText.text.toString()
            if(msg.isNotEmpty()) {
                val intent = Intent(this, GreetingActivity::class.java)
                intent.putExtra("msg", msg)
                startActivity(intent)
            }


        }
    }
}