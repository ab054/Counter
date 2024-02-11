package com.example.counter.uiTests.pages

import androidx.compose.ui.test.ExperimentalTestApi
import androidx.compose.ui.test.hasTestTag
import androidx.compose.ui.test.junit4.ComposeContentTestRule
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onFirst
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.performClick
import com.example.counter.TestTags
import com.example.counter.uiTests.CommonTools

@OptIn(ExperimentalTestApi::class)
class ShowcasePage(composeTestRule: ComposeContentTestRule) : CommonTools(composeTestRule){

    fun selectFirstItem() {
        waitFor(TestTags.list_item)
        composeTestRule.onAllNodesWithTag(TestTags.list_item).onFirst().performClick()
    }

    fun selectSecondItem() {
        composeTestRule.waitUntilAtLeastOneExists(hasTestTag(TestTags.list_item))
        composeTestRule.onAllNodesWithTag(TestTags.list_item)[1].performClick()
    }

    fun tapViewCart() {
        composeTestRule.onNodeWithTag(TestTags.viewCart).performClick()
    }
}
