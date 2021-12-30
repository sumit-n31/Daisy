package com.testingshastra.keywords;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	public RemoteWebDriver driver = null;
	private static UIKeywords UIkeywords;
	static {
		UIkeywords = new UIKeywords();
	}

	private UIKeywords() {

	}

	public static UIKeywords getInstance() {
		return UIkeywords;
	}

	/**
	 * This method opens browser.
	 * <ul>
	 * <li>chrome</li>
	 * <li>firefox</li>
	 * <li>edge</li>
	 * </ul>
	 * 
	 * @author Sumit Naikwadi
	 * @param browserName
	 */
	public void openBrowser(String browserName) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
		}
		driver.manage().window().maximize();

	}

	/**
	 * This method helps to launch the url.
	 * 
	 * @author Sumit Naikwadi
	 * @param url
	 */

	public void launchUrl(String url) {
		driver.get(url);

	}

	public void quitBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public String getTitleofPage() {
		return driver.getTitle();

	}

	public RemoteWebDriver getDriver() {
		return driver;
	}

	public WebElement getWebElement(String locatorType, String locatorValue) {

		WebElement element = null;
		if (locatorType.equalsIgnoreCase("xpath")) {
			element = driver.findElement(By.xpath(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("css")) {
			element = driver.findElement(By.cssSelector(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("id")) {
			element = driver.findElement(By.id(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("name")) {
			element = driver.findElement(By.name(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("className")) {
			element = driver.findElement(By.className(locatorValue));
		}
		if (locatorType.equalsIgnoreCase("linkText")) {
			element = driver.findElement(By.linkText(locatorValue));
		}

		return element;

	}

	public void click(String locatorType, String locatorValue) {
		getWebElement(locatorType, locatorValue).click();
	}

	public void enterText(String object, String textToEnter) {
		String[] parts = object.split("##");
		getWebElement(parts[0], parts[1]).sendKeys(textToEnter);

	}

	public void enterText(String locator, String locatorvalue, String textToEnter) {
		getWebElement(locator, locatorvalue).sendKeys(textToEnter);

	}

	public String getCurrenturl() {
		return driver.getCurrentUrl();

	}

	public void swithToframe(int index) {
		driver.switchTo().frame(index);

	}

	public void switchTodefaultcontent() {
		driver.switchTo().defaultContent();

	}

	public Set<String> getWindowhandles() {
		return driver.getWindowHandles();

	}

	public void click(String object) {
		String[] parts = object.split("##");
		getWebElement(parts[0], parts[1]).click();

	}

}
