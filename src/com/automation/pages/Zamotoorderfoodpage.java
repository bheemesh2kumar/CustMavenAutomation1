package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Zamotoorderfoodpage {

	public WebDriver driver;

	public Zamotoorderfoodpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@class='prompt input_box auto_detect_enabled']")
	public WebElement searchinginele;

	@FindBy(xpath = "//input[@class='prompt input_box']")
	public WebElement searchforele;

	@FindBy(xpath = "//input[@class='location prompt']")
	public WebElement deliverylocation;

	@FindBy(xpath = "//div[@class='results']//a/descendant::div[@class='title']")
	public List<WebElement> deliverylocationsuggestionvals;

	
	@FindBy(xpath = "//button[contains(text(),'Find Food')]")
	public WebElement Findfoodbutton;
}
