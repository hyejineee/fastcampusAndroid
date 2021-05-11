package com.hyejineee.bmiapp

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe


class BMICalculatorTest : DescribeSpec({
    val height = 171.0
    val weight = 50.0

    describe("calculateBMI"){
        val bmiCalculator = BMICalculator()
        context("with height=171 and weight=50"){
            val bmiResult = bmiCalculator.calculateBMI(height,weight)
            it("return 17.09927841045108"){
                bmiResult shouldBe 17.09927841045108
            }
        }
    }
})


