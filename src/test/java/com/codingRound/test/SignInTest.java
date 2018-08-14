package com.codingRound.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codingRound.businessLib.SigInPage;
import com.codingRound.commonUtils.BrowserDriver;

public class SignInTest extends BrowserDriver {

    SigInPage sigInPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
	// Calling the launchBrowser Method in Browser Driver class to
	// Initialize WebDriver
	BrowserDriver.launchBrowser();

	// Initialize the object of Sign In Page Business Library Class
	sigInPage = new SigInPage();
    }

    @Test(enabled = true, description = "Checking Sign In Test Functionality")
    public void c() throws Exception {
	sigInPage.shouldThrowAnErrorIfSignInDetailsAreMissing();
    }
}
