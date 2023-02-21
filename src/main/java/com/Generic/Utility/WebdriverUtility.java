package com.Generic.Utility;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility {
	
	public void maximizePage(WebDriver driver) {
		driver.manage().window().maximize();
	}
	
	public void imPlicitWait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	public void scrollingBar(WebDriver driver,int y) {
		JavascriptExecutor jLib=(JavascriptExecutor)driver;
		jLib.executeScript("window.scrollBy(0,"+y+")");
	}
	
	public void getOption(WebElement element) {
		Select s=new Select(element);
		List<WebElement> allOption = s.getOptions();
		for(WebElement option:allOption) {
			String text=option.getText();
			System.out.println(text);
		
	}

	}
}
