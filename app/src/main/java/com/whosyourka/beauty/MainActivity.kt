package com.whosyourka.beauty

import android.animation.ValueAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.TranslateAnimation
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.whosyourka.beauty.pitureList.view.PitureListActivity

class MainActivity : AppCompatActivity() {
    private lateinit var btnTest: Button
    private lateinit var btnMsg: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnMsg = findViewById<Button>(R.id.tv_msg)
        btnMsg.setOnClickListener {
            TranslateAnimation(0F,100F,0F,0F).apply {
                duration = 1000
                btnMsg.startAnimation(this)
            }
        }
        btnTest = findViewById<Button>(R.id.tv_instrument_test)
        btnTest.setOnClickListener {
            ValueAnimator.ofInt(0, 100).apply {
                duration = 1000
                addUpdateListener {
                    btnTest.translationX= (it.animatedValue as Int).toFloat()
                }
                start()
            }
        }

    }
}
