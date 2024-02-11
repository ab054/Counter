package com.example.counter.uiTests.pages

import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithText
import com.example.counter.TestTags

class PurchasePage(private val composeTestRule: ComposeContentTestRule) {

    fun assertConfirmation() {
        composeTestRule.onNodeWithText("Purchase Confirmed").assertIsDisplayed()
        composeTestRule.onNodeWithText("Thank you for your purchase!").assertIsDisplayed()

    }

    fun assertPurchasedItems(expectedItems : List<String>) = expectedItems.forEach {
        composeTestRule.onNodeWithText(it).assertIsDisplayed()
    }

    fun assertQuantity(expected: Int) {
        composeTestRule.onAllNodesWithTag(TestTags.confirmationItems).assertCountEquals(expected)
    }

}
