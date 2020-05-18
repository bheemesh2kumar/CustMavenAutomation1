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

	@FindBy(xpath = "//a[@title='Zomato Gold partner ']")
	public WebElement ZomatoGoldpartnercheckbox;

	@FindBy(xpath = "//div[@class='ui prom-filter-box-text checkbox checked']/descendant::span[@class='bold  zgreen ']")
	public WebElement ZomatoGoldpartnercheckboxafterselected;

	@FindBy(xpath = "//div[@class='col-l-4 mtop pagination-number']/div")
	public WebElement paginationnumbers;

	@FindBy(xpath = "//div[@class='pr5']/i")
	public WebElement leftangleindisable;

	@FindBy(xpath = "//div[@class=' ui pagination menu small pagination-control res-menu-paginator']//a[@title='Go to Page 1' or @title='Go to Page 2' or @title='Go to Page 3'  or @title='Go to Page 3' or @title='Go to Page 4' or @title='Go to Page 5' or @title='Next 5 Pages']")
	public List<WebElement> gotopageslinks;

}
