package com.hyejineee.domain

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe
import org.junit.Test

import org.junit.Assert.*

//일단은 리팩터링을 통해서 구조를 변경하고 테스트 코드를 작성하면서 의도를 명확하게 하고
class BMICalculatorTest : DescribeSpec({

    describe("BMICalculator") {
        context("with weight and height values") {
            it("return bmi with 2nd decimal place") {
                val bmi = BMICalculator().calculate(
                    BodyInfo(
                        height = 171.0,
                        weight = 50.0
                    )
                )

                bmi shouldBe 17.09
            }
        }
    }
})