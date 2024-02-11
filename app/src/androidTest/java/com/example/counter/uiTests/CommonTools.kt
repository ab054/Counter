package com.example.counter.uiTests

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.ComposeContentTestRule

@OptIn(ExperimentalTestApi::class)
open class CommonTools(val composeTestRule: ComposeContentTestRule) {

    fun waitFor(tagName: String) {
        composeTestRule.waitUntilAtLeastOneExists(hasTestTag(tagName))
    }
}
