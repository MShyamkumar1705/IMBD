package com.Imbd.PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement searchTab;
	
	@FindBy(xpath="//h3[.='IMDb: Ratings, Reviews, and Where to Watch the Best Movies ...']")
	private WebElement imbd;
	
	public GooglePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchBox() {
		return searchTab;
	}

	public WebElement getImbd() {
		return imbd;
	}
	
public void searchBox() {
	searchTab.sendKeys("imbd"+Keys.ENTER);
	imbd.click();
	
}
}
