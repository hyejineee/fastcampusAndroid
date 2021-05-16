package com.hyejineee.domain

import io.kotest.core.spec.style.DescribeSpec
import io.kotest.matchers.shouldBe

class ObesityMeterTest:DescribeSpec({
    describe("Obesity"){
        context("BMI값을 받았을 때"){
            it("비만도를 측정한다."){
                val obesity = ObesityMeter().measureObesity(17.234)

                obesity shouldBe ObesityMeter.Obesity.UnderWeight
            }
        }
    }
})