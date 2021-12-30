package com.testingshastra.config;

import org.testng.annotations.Parameters;

import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.config.Application;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;

public class BaseClass {
	UIKeywords ui = UIKeywords.getInstance();
	Application ap = new Application();

	@Parameters("browser")
	@BeforeMethod
	public void setUp(@Optional String browser) {
//		String x = ap.getBrowser();
//		ui.openBrowser(x);
		if (browser == null) {
			browser = Application.browserName();
		}
		ui.openBrowser(browser);
		String y = Application.appUrl();
		ui.launchUrl(y);
	}

	@AfterMethod
	public void closeBrowser() {
		ui.quitBrowser();
	}
	/**
	 * This will help to create inner class for Signup pop up to handle
	 */
//	private class Signup{
//		
//	}
//	
//	Signup signup(){
//		return new Signup();
//	}
}
