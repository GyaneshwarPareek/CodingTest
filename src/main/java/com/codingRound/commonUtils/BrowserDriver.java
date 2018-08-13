package com.codingRound.commonUtils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.javafx.PlatformUtil;

public class BrowserDriver {

    public static Properties config;
    public static WebDriver webDriver;
    public final static String CONFIG_PROPERTIES = "//gradle//wrapper//gradle-wrapper.properties";

    public static void setDriverPath() throws Exception {
	if (PlatformUtil.isMac()) {
	    System.setProperty("webdriver.chrome.driver", "chromedriver");
	}
	if (PlatformUtil.isWindows()) {
	    System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	}
	if (PlatformUtil.isLinux()) {
	    System.setProperty("webdriver.chrome.driver", "chromedriver_linux");
	}
    }

    // This method is used to initialize the WebDriver object
    public static void initialize() throws Exception {

	if (webDriver == null) {
	    config = new Properties();
	    FileInputStream fn = new FileInputStream(
		    System.getProperty("user.dir") + CONFIG_PROPERTIES);
	    config.load(fn);
	    if (config.getProperty("browserType").equals("chrome")) {
		setDriverPath();
		webDriver = new ChromeDriver();
		webDriver.get(config.getProperty("webSiteURL"));
	    }
	    webDriver.manage().window().maximize();
	    webDriver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	}
    }
}
