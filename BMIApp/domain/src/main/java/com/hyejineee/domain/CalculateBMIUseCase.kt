package com.hyejineee.domain

import android.util.Log

open class CalculateBMIUseCase(
    private val bmiCalculator: BMICalculator = BMICalculator(),
    private val obesityMeter: ObesityMeter = ObesityMeter(),
    private val output: Output,
    private val input : Input
    ) {


    fun execute(){
        val bodyInfo = input.enterBodyInfo()

        val bmi = bmiCalculator.calculate(bodyInfo)
        val obesity = obesityMeter.measureObesity(bmi)

        output.showResult(BMI(bmi, obesity))
    }

    interface Output{
        fun showResult(bmiResult:BMI)
    }

    interface Input{
        fun enterBodyInfo() : BodyInfo
    }
}
