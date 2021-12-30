package com.testingshastra.uitest;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.testingshastra.config.Application;
import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;
import com.testingshastra.util.waitFor;

@Test
public class Homepagetest extends BaseClass {
	UIKeywords Keywords = UIKeywords.getInstance();
	String expected = "IJmeet";

	public void verifyHomePageTitle() {
		Application app = new Application();
		Keywords.launchUrl(Application.appUrl());
		WebElement ele = Keywords.getWebElement("css",
				"div.welcome-mirror-view.middle-mirror-viewwelcome.mt-4.px-2:nth-child(1)");
		waitFor.visibilityOfelement(ele, 10);
		String title = Keywords.getTitleofPage();
		Assert.assertEquals(title, expected);

	}

}
