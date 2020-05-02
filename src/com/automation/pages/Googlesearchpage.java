package com.automation.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Googlesearchpage {

	public WebDriver driver;

	public Googlesearchpage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//ul[@class='erkvQe']//li/descendant::div[@class='sbl1']/span")
	public List<WebElement> googlesuggestions;

	@FindBy(xpath = "//input[@class='gLFyf gsfi']")
	public WebElement googlesearch;
	
	
	
	
	
	//generic method to choose required suggestion
	
	
	
	public void selectdropdownval(List<WebElement> allvalues,String val)
	{
		
		for(WebElement ele:allvalues)
		{
			if(ele.getText().equals(val))
			{
				ele.click();
				break;
			}
		}
		
		
		
		
	}

}
