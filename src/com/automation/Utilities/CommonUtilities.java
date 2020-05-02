package com.automation.Utilities;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonUtilities {

	public void selectvalusingselect(WebElement element, String val) {
		new Select(element).selectByVisibleText(val);
	}

	public void waitforelement(WebDriver driver, int timeout, WebElement ele) {
		new WebDriverWait(driver, timeout).until(ExpectedConditions.visibilityOf(ele));
	}

	public void selectvaluefromsuggestions(List<WebElement> eles, String expvalue) {

		for (WebElement ele : eles) {
			if (ele.getText().equalsIgnoreCase(expvalue)) {
				ele.click();
				break;
			}
		}

	}

}
