package org.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;

public class RemoveFromCartTest {

    @BeforeClass
    public void setup() {
        // Perform setup steps, e.g., launching the browser, navigating to the website, and login (if needed).
    }

    @BeforeMethod
    public void beforeTest() {
        // Initialize the state for this test, e.g., adding items to the cart.
    }

    @Test
    public void testRemoveFromCart() {
        // Perform actions to remove items from the cart and verify the cart is empty.
    }

    @AfterMethod
    public void afterTest() {
        // Cleanup or reset state after the test, e.g., verifying the cart is empty.
    }

    @AfterClass
    public void teardown() {
        // Perform teardown, e.g., closing the browser.
    }
}
