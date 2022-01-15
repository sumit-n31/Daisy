package com.Daisy.TestCase;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.Daisy.UIKeywords.UIKeywords;
import com.Daisy.config.Application;
import com.Daisy.config.BaseClass;


public class TestcaseTC_001 extends BaseClass {

	UIKeywords u = UIKeywords.getInstance();
	Application ap = new Application();
	private static final Logger log = Logger.getLogger(TestcaseTC_001.class);

	@Test
	public void verifyLoginpage() {
		u.launchUrl(ap.getUrl());
		log.info("url is launch");

	}
	
	@Test
	public void m1() {
      System.out.println("Creating Conflict On GitHub");
	}
	
	

}