package com.Daisy.config;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.Daisy.UIKeywords.UIKeywords;

public class BaseClass {

	UIKeywords u = UIKeywords.getInstance();
	private static final Logger log = Logger.getLogger(BaseClass.class);


	@BeforeMethod
	public void setUp() {
		u.openBrowser();
		log.info("Browser open.");
        System.out.println("For creating conflict");
	}

	@AfterMethod
	public void tearDown() {
		u.closeBrowser();
		log.info("Browser Close.");

	}

}
