package com.example.counter.uiTests.pages

import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.example.counter.TestTags
import com.example.counter.uiTests.assets.TestUser

class AddressPage(private val composeTestRule: ComposeContentTestRule) {

    fun fillOutAddress(testUser: TestUser) {
        composeTestRule.onNodeWithTag(TestTags.shippingName).performTextInput(testUser.name)
        composeTestRule.onNodeWithTag(TestTags.shippingAddress).performTextInput(testUser.address)
        composeTestRule.onNodeWithTag(TestTags.shippingCity).performTextInput(testUser.city)
    }

    fun tapConfirm() {
        composeTestRule.onNodeWithTag(TestTags.shippingConfirm).performClick()
        composeTestRule.onNodeWithTag(TestTags.shippingConfirm).assertDoesNotExist()
    }

}
