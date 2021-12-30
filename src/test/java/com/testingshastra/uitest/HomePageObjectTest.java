package com.testingshastra.uitest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.HttpsURLConnection;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.testingshastra.config.BaseClass;
import com.testingshastra.pageobject.JoinMeetingPage;

public class HomePageObjectTest extends BaseClass {

//	@Test
//	public void homePageTest() {
//		JoinMeetingPage jp = new JoinMeetingPage();
//		jp.clickOnJoinMeeting();
//
//		String expected = "Quick Join a Meeting";
//		String actual = jp.quickJoin();
//		Assert.assertTrue(actual.equalsIgnoreCase(expected));
//
//	}
//
//	@Test
//	public void printAllinfolinks() {
//		JoinMeetingPage jp = new JoinMeetingPage();
//		jp.getInfoLinks();
//
//	}
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
