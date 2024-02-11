package com.example.counter.uiTests.pages

import androidx.compose.ui.test.junit4.ComposeContentTestRule

class BasePage(private val composeTestRule: ComposeContentTestRule) {
    val purchasePage by lazy { PurchasePage(composeTestRule) }
    val addressPage by lazy { AddressPage(composeTestRule) }
    val cartPage by lazy { CartPage(composeTestRule) }
    val itemDetailsPage by lazy { ItemDetailsPage(composeTestRule) }
    val showcasePage by lazy { ShowcasePage(composeTestRule) }
    val loginPage by lazy { LoginPage(composeTestRule) }
}
