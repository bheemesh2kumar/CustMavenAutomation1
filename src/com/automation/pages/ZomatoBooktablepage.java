package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ZomatoBooktablepage {

	WebDriver driver;

	public ZomatoBooktablepage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@title='Sort by']")
	public WebElement sortbylable;

	@FindBy(xpath = "//div[@class='filter-padding search-filter-tab pt0 pb0']//a/div/span/span")
	public List<WebElement> sortbyelemetns;

	
	
	
}
