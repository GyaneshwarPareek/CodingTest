package com.codingRound.businessLib;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.codingRound.commonUtils.BrowserDriver;
import com.codingRound.commonUtils.WebDriverCommonUtils;
import com.codingRound.pageConstant.SignInConstant;

public class SigInPage extends BrowserDriver {

    public SignInConstant signInConstant;
    public WebDriverCommonUtils webDriverCommonUtils;

    public SigInPage() {
	signInConstant = PageFactory.initElements(BrowserDriver.webDriver,
		SignInConstant.class);
	webDriverCommonUtils = new WebDriverCommonUtils();
    }

    public void shouldThrowAnErrorIfSignInDetailsAreMissing() throws Exception {

	webDriverCommonUtils.waitFor(5000);
	webDriverCommonUtils.jsClick(signInConstant.getYourTripLink());
	signInConstant.getSignInLink().click();
	signInConstant.getSignInButton().click();
	String errors1 = signInConstant.getErrorMsg().getText();
	Assert.assertTrue(errors1
		.contains("There were errors in your submission"));
    }
}
