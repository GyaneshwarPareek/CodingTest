package com.codingRound.businessLib;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.codingRound.commonUtils.BrowserDriver;
import com.codingRound.commonUtils.WebDriverCommonUtils;
import com.codingRound.pageConstant.HotelBookingConstant;

public class HotelBookingPage extends BrowserDriver {

    public HotelBookingConstant hotelBookingConstant;
    public WebDriverCommonUtils webDriverCommonUtils;

    public HotelBookingPage() {
	hotelBookingConstant = PageFactory.initElements(webDriver,
		HotelBookingConstant.class);
	webDriverCommonUtils = new WebDriverCommonUtils();
    }

    public void shouldBeAbleToSearchForHotels() throws Exception {
	hotelBookingConstant.getHotelLink().click();
	webDriverCommonUtils.waitForElementDisplayed(hotelBookingConstant
		.getLocalityTextBox());
	hotelBookingConstant.getLocalityTextBox().sendKeys(
		"Indiranagar, Bangalore");
	new Select(hotelBookingConstant.getTravellerSelection())
		.selectByVisibleText("1 room, 2 adults");
	hotelBookingConstant.getSearchButton().click();
    }

}
