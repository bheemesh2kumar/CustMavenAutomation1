package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FixedDepositpage {

	public WebDriver driver;

	public FixedDepositpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='principal']")
	public WebElement prinicpalele;

	@FindBy(xpath = "//input[@id='interest']")
	public WebElement ratofintrest;

	@FindBy(xpath = "//input[@id='tenure']")
	public WebElement period;

	@FindBy(xpath = "//select[@id='tenurePeriod']")
	public WebElement daysdropdown;

	@FindBy(xpath = "//select[@id='frequency']")
	public WebElement frequencedropdown;

	@FindBy(xpath = "//div[@class='CTR PT15']/a[1]/img")
	public WebElement Calculatebutton;

	@FindBy(xpath = "//div[@class='PR20 PT5']/span[contains(text(),'Maturity Value Rs.')]")
	public WebElement Maturityvalue;

	@FindBy(xpath = "//ul[@class='headbotmmenus clearfix nav-tabs']//li[4]/a[@title='Markets']")
	public WebElement Marketsvaluelink;

}
