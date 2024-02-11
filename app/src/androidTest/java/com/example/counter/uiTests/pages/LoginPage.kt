package com.example.counter.uiTests.pages

import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import com.example.counter.TestTags
import com.example.counter.uiTests.assets.TestUser

class LoginPage(private val composeTestRule: ComposeContentTestRule) {

    fun loginWith(testUser: TestUser) {
        composeTestRule.onNodeWithTag(TestTags.loginUsername).performTextInput(testUser.username)
        composeTestRule.onNodeWithTag(TestTags.loginPassword).performTextInput(testUser.password)
        composeTestRule.onNodeWithTag(TestTags.loginButton).performClick()
    }
}
