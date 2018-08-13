package com.codingRound.businessLib;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.codingRound.commonUtils.BrowserDriver;
import com.codingRound.commonUtils.WebDriverCommonUtils;
import com.codingRound.pageConstant.FlightBookingConstant;

public class FlightBookingPage extends BrowserDriver {

    public FlightBookingConstant flightBookingConstant;
    public WebDriverCommonUtils webDriverCommonUtils;

    public FlightBookingPage() {
	flightBookingConstant = PageFactory.initElements(webDriver,
		FlightBookingConstant.class);
	webDriverCommonUtils = new WebDriverCommonUtils();
    }

    public void testThatResultsAppearForAOneWayJourney() {

	webDriverCommonUtils.waitFor(2000);
	// flightBookingConstant.getTripType().click();

	flightBookingConstant.getFromField().clear();
	flightBookingConstant.getFromField().sendKeys("Bangalore");

	// wait for the auto complete options to appear for the origin
	webDriverCommonUtils.waitFor(2000);
	List<WebElement> originOptions = flightBookingConstant.getOriginField()
		.findElements(By.tagName("li"));
	originOptions.get(0).click();

	flightBookingConstant.getToField().clear();
	flightBookingConstant.getToField().sendKeys("Bangalore");

	// wait for the auto complete options to appear for the destination
	webDriverCommonUtils.waitFor(2000);

	// select the first item from the destination auto complete list
	List<WebElement> destinationOptions = flightBookingConstant
		.getDestinationField().findElements(By.tagName("li"));
	destinationOptions.get(0).click();

	flightBookingConstant.getDatePicker().click();

	// all fields filled in. Now click on search
	flightBookingConstant.getSearchBtn().click();

	webDriverCommonUtils.waitFor(2000);
	// verify that result appears for the provided journey search
	Assert.assertTrue(webDriverCommonUtils.isElementPresent(By
		.className("searchSummary")));
    }
}
