package com.casper.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var timesClicked = 0

        // get reference to button
        val myButton = findViewById(R.id.button) as Button

        // get reference to text view
        var myTextView = findViewById(R.id.textView) as TextView

        // set on-click listener
        myButton.setOnClickListener {
            timesClicked++
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, "Good Morning!", Toast.LENGTH_SHORT).show()
        }
    }
}