package com.hyejineee.bmiapp

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class Kotest : FunSpec({
    test("String length should return the length of the string") {
        "sammy".length shouldBe 5
        "".length shouldBe 0
    }
})


