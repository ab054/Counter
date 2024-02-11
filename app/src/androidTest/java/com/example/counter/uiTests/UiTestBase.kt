package com.example.counter.uiTests

import android.view.View
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.test.espresso.Espresso
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.counter.MainContent
import com.example.counter.uiTests.pages.BasePage
import org.hamcrest.Matcher
import org.junit.Before
import org.junit.Rule
import java.util.concurrent.TimeoutException

open class UiTestBase {

    @get:Rule
    val composeTestRule = createComposeRule()
    val po: BasePage by lazy { BasePage(composeTestRule) }


    @Before
    fun beforeTest(){
        composeTestRule.setContent {
            MainContent()
        }
    }

    fun waitFor(viewMatcher: Matcher<View>, timeoutMillis: Long = 5000L) {
        val startTime = System.currentTimeMillis()
        while (System.currentTimeMillis() < startTime + timeoutMillis) {
            try {
                Espresso.onView(viewMatcher).check(ViewAssertions.matches(isDisplayed()))
                return
            } catch (e: Exception) {
                // View not found yet, continue waiting
            }
            Thread.sleep(100) // Poll every 100 milliseconds
        }
        throw TimeoutException("Timed out waiting for view with matcher: $viewMatcher")
    }
}
