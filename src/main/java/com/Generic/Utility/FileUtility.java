package com.Generic.Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class FileUtility {

	public String getProperty(WebDriver driver,String key) throws Throwable {
		FileInputStream fis=new FileInputStream(iPathConstants.file);
		Properties p=new Properties();
		p.load(fis);
		String data = p.getProperty(key);
		return data;
	}
}
