package com.automation.StepDef;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.automation.Utilities.ApplicationSetup;
import com.automation.Utilities.CommonUtilities;
import com.automation.Utilities.Propertiesreader;
import com.automation.pages.Zamotofilterspage;
import com.automation.pages.Zamotoorderfoodpage;
import com.automation.pages.ZomatoBooktablepage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ZamotoStepDef {

	public Propertiesreader Propertiesreaderref;
	public ApplicationSetup ApplicationSetupref;
	public WebDriver driver;
	public Zamotofilterspage Zamotofilterspageref;
	public Zamotoorderfoodpage Zamotoorderfoodpageref;
	CommonUtilities CommonUtilitiesref;
	ZomatoBooktablepage ZomatoBooktablepageref;

	@Given("^user launches Zomato  application$")
	public void user_launches_Zomato_application() {

		Propertiesreaderref = new Propertiesreader();
		String url = Propertiesreaderref.geturl();
		ApplicationSetupref = new ApplicationSetup();
		driver = ApplicationSetupref.applicationlaunch(url);
		Zamotofilterspageref = new Zamotofilterspage(driver);

	}

	@When("^applicaton page title is \"([^\"]*)\"$")
	public void applicaton_page_title_is(String arg1) {

		// Assert.assertTrue(arg1.equals(driver.getTitle()));
		System.out.println("&&&&&&&&&&&&" + driver.getTitle());

	}

	@When("^user selects place locaton \"([^\"]*)\"$")
	public void user_selects_place_locaton(String arg1) {

		// Zamotofilterspageref = new Zamotofilterspage(driver);

		Zamotofilterspageref.palcetypelocationdropdown.click();

		// Zamotofilterspageref.palcetypelocationele.click();

		Zamotofilterspageref.palcetypepopularlocation.click();

	}

	@When("^user selects place of restaurants \"([^\"]*)\"$")
	public void user_selects_place_of_restaurants(String arg1) {

		Zamotofilterspageref.restarentlocation.sendKeys(arg1);
		Zamotofilterspageref.searchbutton.click();

	}

	@Then("^validate that if user is able to navigate to respective page$")
	public void validate_that_if_user_is_able_to_navigate_to_respective_page() {

		ApplicationSetupref.teardown();

	}

	@When("^user is navigated to Zamoto home page$")
	public void user_is_navigated_to_Zamoto_home_page() {
		Zamotofilterspageref = new Zamotofilterspage(driver);

		try {
			Zamotofilterspageref.zamotologimg.isDisplayed();
			System.out.println("user navigated to zamoto home page successfully");
		} catch (NoSuchElementException ex) {
			System.out.println("user is not navigated to zamoto home page");

		}
	}

	@When("^user clicks on OrderFood button$")
	public void user_clicks_on_OrderFood_button() {

		Zamotofilterspageref.orderfoodlink.click();
	}

	@When("^user provides searching location \"([^\"]*)\"$")
	public void user_provides_searching_location(String arg1) {

		Zamotoorderfoodpageref = new Zamotoorderfoodpage(driver);
		Zamotoorderfoodpageref.deliverylocation.sendKeys(arg1);

	}

	@When("^user selects value from suggestions \"([^\"]*)\"$")
	public void user_selects_value_from_suggestions(String arg1) {

		CommonUtilitiesref = new CommonUtilities();
		CommonUtilitiesref.selectvaluefromsuggestions(Zamotoorderfoodpageref.deliverylocationsuggestionvals, arg1);
		Zamotoorderfoodpageref.Findfoodbutton.click();

	}

	@When("^user provides restaurants name \"([^\"]*)\"$")
	public void user_provides_restaurants_name(String arg1) {
		// Zamotoorderfoodpageref.searchforele.sendKeys(arg1);
		ApplicationSetupref.teardown();

	}

	@When("^user finds Booktable option zomato web page$")
	public void user_finds_Booktable_option_zomato_web_page() {

		boolean flag = Zamotofilterspageref.bookatablelink.isDisplayed();

		Assert.assertTrue(flag, "user is not navigated home page");

	}

	@When("^user clicks on book a table page$")
	public void user_clicks_on_book_a_table_page() {

		Zamotofilterspageref.bookatablelink.click();

	}

	@When("^user should see Sort by lable is displayed at left on page$")
	public void user_should_see_Sort_by_lable_is_displayed_at_left_on_page() {

		ZomatoBooktablepageref = new ZomatoBooktablepage(driver);

		Assert.assertTrue(ZomatoBooktablepageref.sortbylable.isDisplayed(),
				"user is not navigated to table booking page");

	}

	@When("^user should see cost category items count under categorycount$")
	public void user_should_see_cost_category_items_count_under_categorycount(DataTable arg1) {

		for (Map<String, String> val : arg1.asMaps(String.class, String.class)) {
			String catexpval = val.get("categorycount");
			int catvalexpint = Integer.parseInt(catexpval);
			int actcatval = ZomatoBooktablepageref.sortbyelemetns.size();

			Assert.assertEquals(actcatval, catvalexpint, "sort by elements are not matched");

		}

	}

	@Then("^validate that if user is able to click all category items$")
	public void validate_that_if_user_is_able_to_click_all_category_items() {

		if (CommonUtilitiesref == null) {
			CommonUtilitiesref = new CommonUtilities();
		}

		int counter = 0;

		for (WebElement ele : ZomatoBooktablepageref.sortbyelemetns) {

			if (ele.isDisplayed()) {
				counter++;
			}
		}

		System.out.println("Total sort by items are" + "  " + counter + " " + "displayed");

		ApplicationSetupref.teardown();
	}

	@Then("^check if user can see Zomoto gold partner check box deselet by default$")
	public void check_if_user_can_see_Zomoto_gold_partner_check_box_deselet_by_default() {

		ZomatoBooktablepageref = new ZomatoBooktablepage(driver);

		Assert.assertTrue(!ZomatoBooktablepageref.ZomatoGoldpartnercheckbox.isSelected(),
				"zomototgoldpartnercheckbox is not selected by default");

	}

	@Then("^user clicks on Zomoto gold partner check box$")
	public void user_clicks_on_Zomoto_gold_partner_check_box() {

		ZomatoBooktablepageref.ZomatoGoldpartnercheckbox.click();

		Assert.assertTrue(ZomatoBooktablepageref.ZomatoGoldpartnercheckboxafterselected.isDisplayed(),
				"zomototgoldpartnercheckbox is not selected");

	}

	@Then("^validate that if user can see page number\"([^\"]*)\"$")
	public void validate_that_if_user_can_see_page_number(String arg1) {

		String pagenumbers = ZomatoBooktablepageref.paginationnumbers.getText();

		Assert.assertEquals(pagenumbers, arg1, "pagenation number is not displayed");

	}

	@Then("^validate that if user can see left angle icon disable format$")
	public void validate_that_if_user_can_see_left_angle_icon_disable_format() {

		String flag = ZomatoBooktablepageref.leftangleindisable.findElement(By.xpath("parent::div/parent::div"))
				.getAttribute("aria-hidden");
		System.out.println("*******************" + flag);

		Assert.assertTrue(flag.equals("true"));

	}

	@Then("^validate that if user can see all navigation numbers show data navigationnumbers when mouseover on numbers$")
	public void validate_that_if_user_can_see_all_navigation_numbers_show_data_navigationnumbers_when_mouseover_on_numbers(
			DataTable arg1) {

		int i = 0;

		for (Map<String, String> mapval : arg1.asMaps(String.class, String.class))

		{

			Assert.assertTrue(ZomatoBooktablepageref.gotopageslinks.get(i).getAttribute("title")
					.equals(mapval.get("navigationnumbers")));

			System.out.println(ZomatoBooktablepageref.gotopageslinks.get(i).getAttribute("title") + " "
					+ "is matched successsfully");

			i++;

		}

	}

	@Then("^validate that if user can see right angle icon enable format$")
	public void validate_that_if_user_can_see_right_angle_icon_enable_format() {

		ApplicationSetupref.teardown();

	}

}
