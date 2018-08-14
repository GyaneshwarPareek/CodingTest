package com.codingRound.pageConstant;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInConstant {

    @FindBy(xpath = "//a[@id='userAccountLink']/span[1]")
    private WebElement yourTripLink;

    @FindBy(id = "SignIn")
    private WebElement signInLink;

    @FindBy(xpath = "//*[@id='signInButton']")
    private WebElement signInButton;

    @FindBy(id = "modal_window")
    private WebElement frameSignInBtn;

    @FindBy(id = "errors1")
    private WebElement errorMsg;

    public WebElement getYourTripLink() {
	return yourTripLink;
    }

    public WebElement getSignInLink() {
	return signInLink;
    }

    public WebElement getSignInButton() {
	return signInButton;
    }

    public WebElement getErrorMsg() {
	return errorMsg;
    }

    public WebElement getFrameSignInBtn() {
	return frameSignInBtn;
    }

}
