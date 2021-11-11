package com.Daisy.Utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertiesfile {
	
	public static String getProperty(String fileName,String key) {
		String dir = System.getProperty("user.dir");
		FileInputStream fis;
		String value ="";
		
		try {
			fis = new FileInputStream(dir+fileName);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return value;
		

	}

}
