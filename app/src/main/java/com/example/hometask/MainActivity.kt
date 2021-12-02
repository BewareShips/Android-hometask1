package com.example.hometask

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val red = findViewById<Button>(R.id.button3);
        val blue = findViewById<Button>(R.id.button2);
        val green = findViewById<Button>(R.id.button1);

        red.setBackgroundColor(Color.RED);

        blue.setBackgroundColor(Color.BLUE);

        green.setBackgroundColor(Color.GREEN);

        red.setOnClickListener {
            Toast.makeText(this@MainActivity, "Red was clicked", Toast.LENGTH_SHORT).show()
        }

        blue.setOnClickListener {
            Toast.makeText(this@MainActivity, "blue was clicked", Toast.LENGTH_SHORT).show()
        }

        green.setOnClickListener {
            Toast.makeText(this@MainActivity, "green was clicked", Toast.LENGTH_SHORT).show()
        }


    }


}