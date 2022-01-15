package com.Daisy.config;

import com.Daisy.Utils.Propertiesfile;

public class Application {
	private static final String filepath = "\\src\\main\\resources\\Application.properties";

	public String getUrl() {
		return Propertiesfile.getProperty(filepath, "url");
	}
}
