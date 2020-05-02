package com.automation.TestRunner;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.api.testng.CucumberFeatureWrapper;

@CucumberOptions(
		features = "./features", 
		glue = { "com.automation.StepDef" },
		plugin = { "pretty",
		"html:test-output" },
		monochrome = true, 
		dryRun = false,
		tags= {"@studentinfo"}

)

public class TestRunner {

	public TestNGCucumberRunner TestNgcucumberRunner;

	@BeforeClass(alwaysRun = true)
	public void setup() {

		TestNgcucumberRunner = new TestNGCucumberRunner(this.getClass());

	}

	@Test(dataProvider = "features")
	public void testmethod(CucumberFeatureWrapper CucumberFeatureWrapper) {
		TestNgcucumberRunner.runCucumber(CucumberFeatureWrapper.getCucumberFeature());
	}

	@DataProvider()
	public Object[][] features() {
		return TestNgcucumberRunner.provideFeatures();
	}

	@AfterClass(alwaysRun = true)
	public void teardown() {
		TestNgcucumberRunner.finish();
	}

}
