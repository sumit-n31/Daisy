package com.testingshastra.util;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testingshastra.keywords.UIKeywords;

public class waitFor {
	private final static WebDriverWait wait;
	static {
		wait = new WebDriverWait(UIKeywords.getInstance().driver,Duration.ofSeconds(10));
		wait.pollingEvery(Duration.ofMillis(500));
		
	}
	
	public static void visibilityOfelement(WebElement element, int duration) {
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void stalenessOfelement(WebElement element, int duration) {
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.stalenessOf(element));

	}
	
	public static void elementTobeclickable(WebElement element, int duration) {
		wait.withTimeout(Duration.ofSeconds(duration));
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.elementToBeClickable(element));

	}

}
