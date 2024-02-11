package com.example.counter.uiTests.pages

import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import com.example.counter.TestTags

class CartPage(private val composeTestRule: ComposeContentTestRule) {

    fun assertQuantity(expected: Int) {
        composeTestRule.onAllNodesWithTag(TestTags.cartItem).assertCountEquals(expected)
    }

    fun tapPurchase() {
        composeTestRule.onNodeWithTag(TestTags.cartPurchase).performClick()
        composeTestRule.onNodeWithTag(TestTags.cartPurchase).assertDoesNotExist()
    }
}
