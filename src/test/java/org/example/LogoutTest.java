package org.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;

public class LogoutTest {

    @BeforeClass
    public void setup() {
        // Perform setup steps, e.g., launching the browser, navigating to the website, and login.
    }

    @BeforeMethod
    public void beforeTest() {
        // Initialize the state for this test, e.g., making sure the user is logged in.
    }

    @Test
    public void testLogout() {
        // Perform logout and verify redirection to the login page.
    }

    @AfterMethod
    public void afterTest() {
        // Cleanup or reset state after the test, e.g., verifying the user is logged out.
    }

    @AfterClass
    public void teardown() {
        // Perform teardown, e.g., closing the browser.
    }
}
