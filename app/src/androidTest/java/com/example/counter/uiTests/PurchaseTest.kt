package com.example.counter.uiTests

import com.example.counter.uiTests.assets.TestUser
import org.junit.Test

class PurchaseTest : UiTestBase() {

    @Test
    fun testPurchaseFlow() {
        val expectedQuantity = 2

        // Step 1: Login with a user
        po.loginPage.loginWith(TestUser)

        // Step 2: User is now on Showcase Screen, open the first item from the list
        po.showcasePage.selectFirstItem()
        po.itemDetailsPage.assertSelected("Item 1")

        // Step 3: On the Item Screen, add this item to the cart
        po.itemDetailsPage.addToCart()

        // Step 4: Go back to Showcase Screen, add the second item into the cart
        po.showcasePage.selectSecondItem()
        po.itemDetailsPage.assertSelected("Item 2")
        po.itemDetailsPage.addToCart()

        // Step 5: Go to the Cart Screen and start the purchase flow
        po.showcasePage.tapViewCart()

        // Bonus: Assert the quantity of items in the cart
        po.cartPage.assertQuantity(expectedQuantity)

        // Step 6: On Address Screen, complete the address and continue to Confirm Purchase Screen
        po.cartPage.tapPurchase()
        po.addressPage.fillOutAddress(TestUser)
        po.addressPage.tapConfirm()

        // Step 7: On Confirm Purchase Screen, finish the purchase and verify it was successful
        po.purchasePage.assertPurchasedItems(listOf("Item 1 x 1", "Item 2 x 1"))
        po.purchasePage.assertQuantity(expectedQuantity)
        po.purchasePage.assertConfirmation()
    }
}
