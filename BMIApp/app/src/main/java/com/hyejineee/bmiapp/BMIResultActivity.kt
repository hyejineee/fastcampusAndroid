package com.hyejineee.bmiapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BMIResultActivity : AppCompatActivity() {
    lateinit var bmiValueText:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val bmiResult = intent.getDoubleExtra("bmiResult", 0.0)

        bmiValueText = findViewById(R.id.textview_result_bmivalue)
        bmiValueText.text = bmiResult.toString()

    }
}