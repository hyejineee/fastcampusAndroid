package com.hyejineee.bmiapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import kotlin.math.pow

@RunWith(AndroidJUnit4::class)
class CalculateBMITest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun calculateBMI(){
        onView(withId(R.id.edittextview_main_weight))
                .perform(typeText("50"))
                .check(matches(withText("50")))

        onView(withId(R.id.edittextview_main_height))
            .perform(typeText("171"), closeSoftKeyboard())
            .check(matches(withText("171")))

        onView(withId(R.id.button_main_calculatebmi))
            .perform(click())

        val bmi = 50/(171/100.0).pow(2)

        onView(withId(R.id.textview_result_bmivalue))
            .check(matches(withText(bmi.toString())))


    }
}