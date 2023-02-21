package com.Imbd.PageObject;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.Generic.Utility.WebdriverUtility;

public class FetchMovie {
	
		@FindBy(xpath="//section[@data-testid='Details']")
		private WebElement fetch;

		@FindBy(xpath="//span[.='Details']")
		private WebElement details;
		
		@FindBy(xpath="//ul[@class='ipc-metadata-list ipc-metadata-list--dividers-all ipc-metadata-list--base']/parent::div[1]")
		private WebElement down;
		
		@FindBy(xpath="//a[.='December 17, 2021 (United States)']")
		private WebElement releaseDate;
		
		@FindBy(xpath="//a[.='India']")
		private WebElement origin;
		
public FetchMovie(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

public WebElement getFetch() {
	return fetch;
}

public WebElement getDown() {
	return down;
}

public WebElement getDetails() {
	return details;
}


public WebElement getReleaseDate() {
	return releaseDate;
}

public WebElement getOrigin() {
	return origin;
}

public void validate(WebDriver driver) {
	WebdriverUtility wLib=new WebdriverUtility();
	int y = details.getLocation().getY();
	JavascriptExecutor js=(JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,"+y+")");
	String dateText = releaseDate.getText();
	System.out.println("Release Date:" +dateText);
	String originText = origin.getText();
	System.out.println("Country origin:" +originText);
	driver.close();

	
	
	
}
}
