package com.Daisy.UIKeywords;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIKeywords {
	public RemoteWebDriver driver = null;

	private static UIKeywords ui;
	static {
		ui = new UIKeywords();
	}

	private UIKeywords() {

	}

	public static UIKeywords getInstance() {
		return ui;
	}

	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Documents\\Jars\\chromedriver.exe");
		driver = new ChromeDriver();

	}

	public void launchUrl(String url) {
		driver.get(url);

	}

	public void closeBrowser() {
		driver.quit();

	}

}
