package com.hyejineee.domain

import kotlin.math.floor
import kotlin.math.pow

class BMICalculator {
    fun calculate(bodyInfo: BodyInfo): BMI {

        val bmi: Double = floor(bodyInfo.weight / ((bodyInfo.height / 100.0).pow(2)) * 100) / 100

        val obesity = when (bmi) {
            in 0.0..18.5 -> "저체중"
            in 18.6..23.0 -> "정상 체중"
            in 23.0..25.0 -> "과체중"
            in 26.0..30.0 -> "경도 비만"
            in 31.0..35.0 -> "중정도 비만"
            else -> "고도 비만"
        }

        return BMI(bmi = bmi, obesity = obesity)
    }


}