package com.hyejineee.bmiapp

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class CalculateBMITest {

    @get:Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun enterWeightTest(){
        onView(withId(R.id.edittextview_main_weight))
                .perform(typeText("50"))
                .check(matches(withText("50")))
    }

    @Test
    fun enterHeightTest(){
        onView(withId(R.id.edittextview_main_height))
            .perform(typeText("171"))
            .check(matches(withText("171")))
    }
}