package com.codingRound.pageConstant;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HotelBookingConstant {

    @FindBy(linkText = "Hotels")
    private WebElement hotelLink;

    @FindBy(id = "Tags")
    private WebElement localityTextBox;

    @FindBy(id = "SearchHotelsButton")
    private WebElement searchButton;

    @FindBy(id = "travellersOnhome")
    private WebElement travellerSelection;

    public WebElement getHotelLink() {
	return hotelLink;
    }

    public WebElement getLocalityTextBox() {
	return localityTextBox;
    }

    public WebElement getSearchButton() {
	return searchButton;
    }

    public WebElement getTravellerSelection() {
	return travellerSelection;
    }
}
