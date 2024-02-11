package com.example.counter.uiTests.pages

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import com.example.counter.TestTags

class ItemDetailsPage(private val composeTestRule: ComposeContentTestRule) {

    fun addToCart() {
        composeTestRule.onNodeWithTag(TestTags.addToCart).performClick()
    }

    fun assertSelected(expectedName: String) {
        composeTestRule.onNodeWithTag(TestTags.itemDetailsName).assertTextEquals(expectedName)
    }

}
