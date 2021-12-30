package com.testingshastra.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {
	public static String getProperty(String fileName, String key) {
		String dir = System.getProperty("user.dir");
		String value = "";
		FileInputStream fis;
		try {
			fis = new FileInputStream(dir + fileName);
			Properties prop = new Properties();
			prop.load(fis);
			value = prop.getProperty(key);
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;

	}

	public static String getObject(String key) {
		return getProperty("\\src\\test\\resources\\confing.properties", key);
	}
}
