package com.hyejineee.domain

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.junit.Test

import org.junit.Assert.*

class BMICalculatorTest : DescribeSpec({

    describe("calculate bmi") {
        context("with weight and height values in positive number") {
            it("return BMI result") {
                val bmi:BMI = BMICalculator().calculate(
                    BodyInfo(
                        height = 171.0,
                        weight = 50.0
                    )
                )

                bmi.bmi shouldBe 17.09
                bmi.obesity shouldBe "저체중"
            }
        }
    }
})