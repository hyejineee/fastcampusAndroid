package com.hyejineee.domain

import java.lang.Math.pow
import kotlin.math.floor
import kotlin.math.pow

class BMICalculator {
    fun calculate(bodyInfo: BodyInfo): Double = withDecimalPlace(
        calculateBMI(
            height = bodyInfo.height,
            weight = bodyInfo.weight
        )
    )

    private fun calculateBMI(height: Double, weight: Double) = weight / ((height / 100.0).pow(2))

    private fun withDecimalPlace(value: Double, n: Int=2): Double {
        val decimalPlace = 10.0.pow(n)
        return floor(value * decimalPlace) / decimalPlace
    }
}