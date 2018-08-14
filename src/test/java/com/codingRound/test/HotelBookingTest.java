package com.codingRound.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.codingRound.businessLib.HotelBookingPage;
import com.codingRound.commonUtils.BrowserDriver;

public class HotelBookingTest extends BrowserDriver {

    HotelBookingPage hotelBookingPage;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
	// Calling the launchBrowser Method in Browser Driver class to
	// Initialize WebDriver
	BrowserDriver.launchBrowser();

	// Initialize the object of Business Library Class
	hotelBookingPage = new HotelBookingPage();
    }

    @Test(enabled = true, description = "Checking Hotel Booking Test Functionality")
    public void shouldBeAbleToSearchForHotelsTest() throws Exception {
	hotelBookingPage.shouldBeAbleToSearchForHotels();
    }

}
