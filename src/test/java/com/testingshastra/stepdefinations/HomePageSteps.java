package com.testingshastra.stepdefinations;

import org.testng.Assert;

import com.testingshastra.config.Application;
import com.testingshastra.keywords.UIKeywords;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	UIKeywords ui = UIKeywords.getInstance();
	Application ap = new Application();

	/**
	 * This apporach of @Before & @After helps to repeat steps before each scenario.
	 * 
	 */
	@Before("@First,@Second")
	public void setUp() {
		String browser = Application.browserName();
		ui.openBrowser(browser);
		String y = Application.appUrl();
		ui.launchUrl(y);
	}

	@After("@First,@Second")
	public void tearDown() {
		ui.getDriver().quit();

	}

	/**
	 * This is regular approach by using @Given, @When keywod for writting feature
	 * file.
	 */

	@Given("The chrome browser is launch")
	public void the_chrome_browser_is_launch() {
		String browser = Application.browserName();
		ui.openBrowser(browser);

	}

	@When("The url is launch")
	public void the_url_is_launch() {
		String y = Application.appUrl();
		ui.launchUrl(y);
	}

	@Then("verify the title of homepage is {string}")
	public void verify_the_title_of_homepage(String expectedTitle) {
		String actual = ui.getDriver().getTitle();
		Assert.assertEquals(actual, expectedTitle);
	}

	@Given("The chrome browser is launched")
	public void the_chrome_browser_is_launched() {
		String browser = Application.browserName();
		ui.openBrowser(browser);
		String y = Application.appUrl();
		ui.launchUrl(y);

	}

	@When("The url is launched")
	public void the_url_is_launched() {
		String y = Application.appUrl();
		ui.launchUrl(y);
	}

	@Then("verify the url of homepage is {string}")
	public void verify_the_url_of_homepage(String expectedUrl) {
		String actualurl = ui.getDriver().getCurrentUrl();
		Assert.assertEquals(actualurl, expectedUrl);
	}

}
