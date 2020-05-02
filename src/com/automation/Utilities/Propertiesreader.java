package com.automation.Utilities;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;

public class Propertiesreader {

	Properties prop;

	public Propertiesreader() {

		File file = new File("./resources//config.properties");
		prop = new Properties();

		try {

			FileInputStream ip = new FileInputStream(file);
			prop.load(ip);
		} catch (Exception ex) {

			ex.printStackTrace();

		}

	}

	public String geturl() {
		return prop.getProperty("browser.url");
	}

	public String getdrivername() {
		return prop.getProperty("driver.name");
	}

	public String geturlname() {
		return prop.getProperty("url.name");
	}

	public String getusername() {
		return prop.getProperty("user.name");
	}

	public String getuserpwd() {
		return prop.getProperty("user.pwd");
	}

}
