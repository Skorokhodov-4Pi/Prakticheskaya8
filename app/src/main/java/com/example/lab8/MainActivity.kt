package com.example.lab8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rButton: Button = findViewById(R.id.red_button)
        val yButton: Button = findViewById(R.id.yellow_button)
        val gButton: Button = findViewById(R.id.green_button)
        val textView: TextView = findViewById(R.id.textView)
        val rLayout: ConstraintLayout = findViewById(R.id.root_layout)
        val btn20: Button = findViewById(R.id.button_20)
        val btn25: Button = findViewById(R.id.button_25)

        rButton.setOnClickListener{
            textView.setText(resources.getText(R.string.color_red))
            rLayout.setBackgroundColor(resources.getColor(R.color.red, null))
        }
        yButton.setOnClickListener{
            textView.setText(resources.getText(R.string.color_yellow))
            rLayout.setBackgroundColor(resources.getColor(R.color.yellow, null))
        }
        gButton.setOnClickListener{
            textView.setText(resources.getText(R.string.color_green))
            rLayout.setBackgroundColor(resources.getColor(R.color.green, null))
        }
        btn20.setOnClickListener{
            textView.textSize = 20F
        }
        btn25.setOnClickListener{
            textView.textSize = 25F
        }
    }
}