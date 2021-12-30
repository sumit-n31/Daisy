package com.testingshastra.config;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.ResourceBundle.Control;

import com.testingshastra.util.Propertiesfile;

public class Application {
//	private static final String FILEPATH = "\\src\\main\\resources\\application.properties";
//
//	public String getUrl() {
//		return Propertiesfile.getProperty(FILEPATH, "daisy.qa.app.url");
//
//	}
//
//	public String getBrowser() {
//		return Propertiesfile.getProperty(FILEPATH, "browser");
//
//	}
	public static String appUrl() {
//		ResourceBundle.Control rbc = ResourceBundle.Control.getControl(Control.FORMAT_DEFAULT);
		ResourceBundle rb = ResourceBundle.getBundle("application");
		String daisy = rb.getString("daisy.qa.app.url");
		return daisy;

	}

	public static String browserName() {
//		ResourceBundle.Control rbc = ResourceBundle.Control.getControl(Control.FORMAT_DEFAULT);
		ResourceBundle rb = ResourceBundle.getBundle("application");
//		ResourceBundle rb = ResourceBundle.getBundle("applicaton");
		String broswer = rb.getString("browser");
		return broswer;
	}

//	public static void main(String[] args) {
//		Application.appUrl();
//		Application.browserName();
//
//	}

}
