package com.hyejineee.bmiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var weightEditText: EditText
    lateinit var heightEditText: EditText
    lateinit var calculateBMIButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        weightEditText = findViewById(R.id.edittextview_main_weight)
        heightEditText = findViewById(R.id.edittextview_main_height)
        calculateBMIButton = findViewById(R.id.button_main_calculatebmi)


        setCalculateButtonClickListener()
    }

    private fun setCalculateButtonClickListener() {
        calculateBMIButton.setOnClickListener {

            startActivity(
                Intent(this, BMIResultActivity::class.java).apply {
                    putExtra("bmiResult", bmiResult)
                }
            )
        }
    }

}