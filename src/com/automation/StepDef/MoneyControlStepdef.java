package com.automation.StepDef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.automation.Utilities.ApplicationSetup;
import com.automation.Utilities.CommonUtilities;
import com.automation.Utilities.Propertiesreader;
import com.automation.pages.FixedDepositpage;
import com.automation.pages.Googlesearchpage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MoneyControlStepdef {
	public WebDriver driver;

	public FixedDepositpage FixedDepositpageref;
	public CommonUtilities CommonUtilitiesref;
	public Googlesearchpage Googlesearchpageref;

	@Given("^user is launched moneycontrol site$")
	public void user_is_launched_moneycontrol_site() {
		ApplicationSetup ApplicationSetupref = new ApplicationSetup();
		Propertiesreader Propertiesreaderref = new Propertiesreader();
		driver = ApplicationSetupref.applicationlaunch(Propertiesreaderref.geturl());
		// System.out.println(driver.getTitle());

	}

	@When("^user navigates fixed deposite calculator section\"([^\"]*)\"$")
	public void user_navigates_fixed_deposite_calculator_section(String arg1) {

		Assert.assertTrue(driver.getTitle().equals(arg1));

	}

	@When("^user provides \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void user_provides(String arg1, String arg2, String arg3, String arg4) {
		FixedDepositpageref = new FixedDepositpage(driver);
		CommonUtilitiesref = new CommonUtilities();

		FixedDepositpageref.prinicpalele.sendKeys(arg1);
		FixedDepositpageref.ratofintrest.sendKeys(arg2);
		FixedDepositpageref.period.sendKeys(arg3);
		CommonUtilitiesref.selectvalusingselect(FixedDepositpageref.daysdropdown, "month(s)");
		CommonUtilitiesref.selectvalusingselect(FixedDepositpageref.frequencedropdown, "Simple Interest");

	}

	@When("^user clicks on Calculate button$")
	public void user_clicks_on_Calculate_button() {
		FixedDepositpageref.Calculatebutton.click();
	}

	@Then("^validate that if user is populated with maturity result$")
	public void validate_that_if_user_is_populated_with_maturity_result() {
		CommonUtilitiesref.waitforelement(driver, 10, FixedDepositpageref.Maturityvalue);
		driver.quit();

	}

	// googlesearch page stepdefinations

	@Given("^user is launched google home page$")
	public void user_is_launched_google_home_page() {

		ApplicationSetup ApplicationSetupref = new ApplicationSetup();
		Propertiesreader Propertiesreaderref = new Propertiesreader();
		driver = ApplicationSetupref.applicationlaunch(Propertiesreaderref.geturl());
		// System.out.println(driver.getTitle());

	}

	@When("^page title is \"([^\"]*)\"$")
	public void page_title_is(String arg1) {

		Googlesearchpageref = new Googlesearchpage(driver);

		if (driver.getTitle().equals(arg1)) {
			Assert.assertTrue(true);
			System.out.println("user is on google page");
		}

	}

	@When("^User enters \"([^\"]*)\"$")
	public void user_enters(String arg1) {

		Googlesearchpageref.googlesearch.sendKeys(arg1);

	}

	@When("^user selects \"([^\"]*)\" from suggestions$")
	public void user_selects_from_suggestions(String arg1) {

		Googlesearchpageref.selectdropdownval(Googlesearchpageref.googlesuggestions, arg1);

		driver.quit();

	}

	@Then("^validate that if user navigates to respective home page \"([^\"]*)\"$")
	public void validate_that_if_user_navigates_to_respective_home_page(String arg1) {

	}

	@When("^user clicks on Market value link$")
	public void user_clicks_on_Market_value_link() {
		
		if(FixedDepositpageref==null)
		{
		
		FixedDepositpageref = new FixedDepositpage(driver);
		}

		FixedDepositpageref.Marketsvaluelink.click();
	}

	@When("^user navigates to Market page$")
	public void user_navigates_to_Market_page() {

		//System.out.println(driver.getTitle());
		driver.quit();

	}

}
