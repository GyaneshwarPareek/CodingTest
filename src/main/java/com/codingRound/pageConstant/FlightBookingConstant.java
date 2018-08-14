package com.codingRound.pageConstant;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

public class FlightBookingConstant {

    @FindBy(id = "OneWay")
    private WebElement tripType;

    @FindBy(id = "FromTag")
    private WebElement fromField;

    @FindBy(id = "ui-id-1")
    private WebElement originField;

    @FindAll(@FindBy(tagName = "li"))
    private List<WebElement> tagName;

    @FindBy(id = "ToTag")
    private WebElement toField;

    @FindBy(id = "ui-id-2")
    private WebElement destinationField;

    @FindBy(id = "SearchBtn")
    private WebElement searchBtn;

    @FindBy(className = "searchSummary")
    private WebElement searchSummary;

    @FindBy(xpath = "//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[3]/td[7]/a")
    private WebElement datePicker;

    public WebElement getTripType() {
	return tripType;
    }

    public WebElement getFromField() {
	return fromField;
    }

    public WebElement getOriginField() {
	return originField;
    }

    public List<WebElement> getTagName() {
	return tagName;
    }

    public WebElement getToField() {
	return toField;
    }

    public WebElement getDestinationField() {
	return destinationField;
    }

    public WebElement getSearchBtn() {
	return searchBtn;
    }

    public WebElement getSearchSummary() {
	return searchSummary;
    }

    public WebElement getDatePicker() {
	return datePicker;
    }

}
