package com.Imbd.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.Generic.Utility.WebdriverUtility;
import com.Generic.Utility.iPathConstants;

public class BaseClassImbd {
	public WebdriverUtility wLib=new WebdriverUtility();

	@BeforeMethod
	public void launchBrowser(WebDriver driver) {
		driver=new ChromeDriver();
		driver.get(iPathConstants.file);
		wLib.maximizePage(driver);
		wLib.imPlicitWait(driver);
	}
	@AfterMethod
	
	public void closeBrowser(WebDriver driver) {
		driver.close();
	}
}
