package com.codingRound.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codingRound.businessLib.FlightBookingPage;
import com.codingRound.businessLib.HotelBookingPage;
import com.codingRound.businessLib.SigInPage;
import com.codingRound.commonUtils.BrowserDriver;

public class AutomationTest extends BrowserDriver {

    SigInPage sigInPage;
    HotelBookingPage hotelBookingPage;
    FlightBookingPage flightBookingPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
	// Calling the Initialize Method in Browser Driver class to Invoke
	// Browser
	BrowserDriver.initialize();

	// Initialize the object of Business Library Class
	sigInPage = new SigInPage();
	hotelBookingPage = new HotelBookingPage();
	flightBookingPage = new FlightBookingPage();
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() {
	webDriver.quit();
    }

    @Test(priority = 1, enabled = true, description = "Checking Sign In Test Functionality")
    public void shouldThrowAnErrorIfSignInDetailsAreMissingTest()
	    throws Exception {
	sigInPage.shouldThrowAnErrorIfSignInDetailsAreMissing();
    }

    @Test(priority = 2, enabled = true, description = "Checking Flight Booking Test Functionality")
    public void testThatResultsAppearForAOneWayJourneyTest() {
	flightBookingPage.testThatResultsAppearForAOneWayJourney();

    }

    @Test(priority = 3, enabled = true, description = "Checking Hotel Booking Test Functionality")
    public void shouldBeAbleToSearchForHotelsTest() {
	hotelBookingPage.shouldBeAbleToSearchForHotels();
    }

}
