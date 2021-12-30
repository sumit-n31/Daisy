package com.testingshastra.uitest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.apache.log4j.Logger;

import com.testingshastra.config.Application;
import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.util.Locators;
import com.testingshastra.util.waitFor;

public class Signuptest extends BaseClass {

	private static final Logger log = Logger.getLogger(Signuptest.class);

	UIKeywords Keywords = UIKeywords.getInstance();

	Application ap = new Application();

	@Test
	public void validFirstNameFieldForCorrectInput() {

		Keywords.launchUrl(Application.appUrl());

		log.info("Url is launched" + Application.appUrl());

		Keywords.click(Locators.SIGNUP_SIGNUP);

		log.info("Click on Register button.");

		Keywords.enterText(Locators.SIGNUP_FULLNAME, "Sumit Ramdas Naikwadi");

		Keywords.enterText(Locators.SIGNUP_COMPANYNAME, "Testing Shastra");

		Keywords.enterText(Locators.SIGNUP_EMAIL, "srn3112@gmail.com");

		Keywords.enterText(Locators.SIGNUP_MOBILE, "9511896427");

		Keywords.enterText(Locators.SIGNUP_PASS, "sumit@123A");

		Keywords.swithToframe(0);

		log.info("Switched to Frame.");

//		waitFor.elementTobeclickable(Keywords.getWebElement("css", "div.recaptcha-checkbox-border"), 10);

		Keywords.click(Locators.SIGNUP_ROBOT);

		Keywords.switchTodefaultcontent();

		Keywords.click(Locators.SIGNUP_SUBMIT);

		String actualurl = Keywords.getCurrenturl();

		Assert.assertTrue(actualurl.contains("register"));
	}

}
