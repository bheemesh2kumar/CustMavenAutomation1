package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zamotofilterspage {

	public WebDriver driver;

	public Zamotofilterspage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//span[@class='right location-dropdown']/i")
	public WebElement palcetypelocationdropdown;

	@FindBy(xpath = "//ul[@id='location-recent']//li[2]")
	public WebElement palcetypelocationele;

	@FindBy(xpath = "//ul[@id='location-popular']//li[contains(text(),'Popular Locations')]//following-sibling::li[2]")
	public WebElement palcetypepopularlocation;

	@FindBy(xpath = "//input[@id='keywords_input']")
	public WebElement restarentlocation;

	@FindBy(xpath = "//div[@id='search_button']")
	public WebElement searchbutton;

	@FindBy(xpath = "//div[@class='logo--home']/a/img")
	public WebElement zamotologimg;

	@FindBy(xpath = "//a[@id='header-order-food-btn']")
	public WebElement orderfoodlink;

	@FindBy(xpath = "//span[contains(text(),'Book a Table')]")
	public WebElement bookatablelink;

}
