package com.whosyourka.beauty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.tv_instrument_test).setOnClickListener {
            findViewById<TextView>(R.id.tv_msg).text = "instrument_test"
        }
    }
}
