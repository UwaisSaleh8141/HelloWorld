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
        val myButton = findViewById<Button>(R.id.button)

        // get reference to text view
        var myTextView = findViewById<TextView>(R.id.textView)

        // set on-click listener
        myButton.setOnClickListener {
            timesClicked++ //Or timesClicked += 1
            myTextView.text = timesClicked.toString()
            Toast.makeText(this@MainActivity, getString(R.string.good_morning), Toast.LENGTH_SHORT).show()
        }
    }
}