package org.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;

public class PurchaseProductTest {

    @BeforeClass
    public void setup() {
        // Perform setup steps, e.g., launching the browser, navigating to the website, and login (if needed).
    }

    @BeforeMethod
    public void beforeTest() {
        // Initialize the state for this test, e.g., clearing the cart, starting from the home page, etc.
    }

    @Test
    public void testPurchaseProduct() {
        // Perform actions to purchase a product and verify the "Thank you for your purchase" page.
    }

    @AfterMethod
    public void afterTest() {
        // Cleanup or reset state after the test, e.g., removing added items from the cart.
    }

    @AfterClass
    public void teardown() {
        // Perform teardown, e.g., closing the browser.
    }
}
