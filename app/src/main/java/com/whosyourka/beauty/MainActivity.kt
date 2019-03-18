package com.whosyourka.beauty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.whosyourka.beauty.pitureList.view.PitureListActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.tv_instrument_test).setOnClickListener {
            findViewById<TextView>(R.id.tv_msg).text = "instrument_test"
            startActivity(Intent( this,PitureListActivity::class.java))
        }
    }
}
