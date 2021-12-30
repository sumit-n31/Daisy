package com.testingshastra.pageobject;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.testingshastra.config.BaseClass;
import com.testingshastra.keywords.UIKeywords;

public class JoinMeetingPage extends BaseClass {

	UIKeywords u = UIKeywords.getInstance();
	/**
	 * Approach 1 : This approach of page object model is most recommended, due to
	 * lazy proxy loading of web element. Hence chances of stale element exception
	 * are less.
	 */
	@FindBy(css = "div#navbarContent li:nth-child(1)")
	public WebElement joinmeetingtab;

	@FindBy(css = "h2.m-txt")
	public WebElement quickJoin;

	@FindBy(css = "div.row.footer-last-view-support div:nth-child(3)")
	public List<WebElement> InfoLinks;

	/**
	 * Approach 2 : This approach of page object model is not mostly recommended, as
	 * chances of stale element exception are less.
	 * 
	 */

//	public By JoinMeetingPage = By.cssSelector("div#navbarContent li:nth-child(1)");
//
//	public void clickOnJoinMeeting() {
//		u.getDriver().findElement(JoinMeetingPage).click();

	public JoinMeetingPage() {
		PageFactory.initElements(u.getDriver(), this);
	}

	public void clickOnJoinMeeting() {
		joinmeetingtab.click();

	}

	public String quickJoin() {
		return quickJoin.getText();

	}

	public void getInfoLinks() {
		Iterator<WebElement> itr = InfoLinks.iterator();
		while (itr.hasNext()) {

			System.out.println(itr.next().getText());
		}

	}

	public List<WebElement> getAlllinks() {
		return u.getDriver().findElements(By.tagName("a"));

	}

	@Test
	public void validateAlllinksofHomePage() throws MalformedURLException, IOException {
		JoinMeetingPage jp = new JoinMeetingPage();
		List<WebElement> links = jp.getAlllinks();
		Iterator<WebElement> itr = links.iterator();
		while (itr.hasNext()) {
			String link = itr.next().getAttribute("href");
			HttpsURLConnection con = (HttpsURLConnection) new URL(link).openConnection();
			int code = con.getResponseCode();
			System.out.println("Url :" + link + "Status code :" + code);
			Assert.assertFalse(code > 400, "Link is broken :" + link);

		}

	}
}