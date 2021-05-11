package com.hyejineee.bmiapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

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

            val bmiResult = BMICalculator().calculateBMI(
                height = heightEditText.text.toString().toDouble(),
                weight = weightEditText.text.toString().toDouble()
            )

            startActivity(
                Intent(this, BMIResultActivity::class.java).apply {
                    putExtra("bmiResult", bmiResult)
                }
            )
        }
    }

}