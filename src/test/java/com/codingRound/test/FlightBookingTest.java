package com.codingRound.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codingRound.businessLib.FlightBookingPage;
import com.codingRound.commonUtils.BrowserDriver;

public class FlightBookingTest extends BrowserDriver {

    FlightBookingPage flightBookingPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
	// Calling the launchBrowser Method in Browser Driver class to
	// Initialize WebDriver
	BrowserDriver.launchBrowser();

	// Initialize the object of Business Library Class
	flightBookingPage = new FlightBookingPage();
    }

    @Test(enabled = true, description = "Checking Flight Booking Test Functionality")
    public void testThatResultsAppearForAOneWayJourneyTest() {
	flightBookingPage.testThatResultsAppearForAOneWayJourney();

    }

}
