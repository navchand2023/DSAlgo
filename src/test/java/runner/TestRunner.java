package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.junit.Cucumber;
	
//@RunWith(Cucumber.class) //Junit execution

	@CucumberOptions(
			//plugin = {"pretty", "html:target/nc.html"}, //reporting purpose
			//plugin = {"pretty","html:target/nc.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
			plugin = {"pretty","html:target/nc.html","json:target/cucumber.json", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
			monochrome=false,  //console output color
			//tags = "@TS_003", //tags from feature file
			features = {"src/test/resources/Features"}, //location of feature files
			glue={ "stepdefinition", "appHooks" }) 


	public class TestRunner extends AbstractTestNGCucumberTests{
		
		@Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
					
			return super.scenarios();
	    }


}