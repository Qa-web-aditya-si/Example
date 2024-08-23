package Utilities;


import java.io.FileInputStream;

import java.util.Properties;

public class ReadDataFromConfig {

	Properties properties;

	public ReadDataFromConfig()  {
		try {
		properties = new Properties();

		
			FileInputStream file = new FileInputStream("C:\\Users\\aditya.bhosle\\eclipse-workspace\\Regression\\Configuration\\config.properties");
			properties.load(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

	public String geturl() {
	String	value = properties.getProperty("base");
		return value;		

	}

}
