package com.hyejineee.bmiapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.hyejineee.domain.BMI
import com.hyejineee.domain.BodyInfo
import com.hyejineee.domain.CalculateBMIUseCase

class MainActivity : AppCompatActivity(), CalculateBMIUseCase.Output, CalculateBMIUseCase.Input {

    lateinit var weightEditText: EditText
    lateinit var heightEditText: EditText
    lateinit var calculateBMIButton: Button

    private val calculateBMIUsecase = CalculateBMIUseCase(input = this, output = this)

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
            calculateBMIUsecase.execute()
        }
    }

    override fun showResult(bmiResult: BMI) {
        startActivity(
            Intent(this, BMIResultActivity::class.java).apply {

            }
        )
    }

    override fun enterBodyInfo(): BodyInfo {
        val height = heightEditText.text.toString().toDouble()
        val weight = weightEditText.text.toString().toDouble()

        return BodyInfo(height= height, weight = weight)
    }

}