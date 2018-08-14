package com.codingRound.commonUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverCommonUtils extends BrowserDriver {

    // Method to set wait
    public void waitFor(int durationInMilliSeconds) {
	try {
	    Thread.sleep(durationInMilliSeconds);
	} catch (InterruptedException e) {
	    e.printStackTrace();
	}
    }

    // Method created to check presence of the element
    public boolean isElementPresent(By by) {
	try {
	    webDriver.findElement(by);
	    return true;
	} catch (NoSuchElementException e) {
	    return false;
	}
    }

    // Method Created to perform Mouse movement Actions.
    public void moveToElement(WebElement element) throws Exception {

	Actions action = new Actions(webDriver);
	action.moveToElement(element).perform();
    }

    // Method to click on Element using JavaScript Executor
    public void jsClick(WebElement element) throws Exception {

	JavascriptExecutor executor = (JavascriptExecutor) webDriver;
	executor.executeScript("arguments[0].click();", element);
    }

    // Method Created for explicit Wait of an element
    public void waitForElementDisplayed(WebElement element) throws Exception {

	WebDriverWait wait = new WebDriverWait(webDriver, 30);
	wait.until(ExpectedConditions.visibilityOf(element));
    }

    // Method Created to switch to a Frame.
    public void switchToFrame(WebElement element) throws Exception {
	webDriver.switchTo().frame(element);
    }

}
