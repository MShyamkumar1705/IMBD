package com.Imbd.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Generic.Utility.iPathConstants;

public class IMBDHomePage {
	@FindBy(xpath="//input[@name='q']")
	private WebElement imbdSearch;
	
	@FindBy(xpath="(//a[.='Pushpa: The Rise - Part 1'])[1]")
	private WebElement puspha;
	
	public IMBDHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getImbdSearch() {
		return imbdSearch;
	}

	public WebElement getPuspha() {
		return puspha;
	}
public void enterPusphaPage() {
	imbdSearch.sendKeys(iPathConstants.movieName+Keys.ENTER);
	puspha.click();
}
}
