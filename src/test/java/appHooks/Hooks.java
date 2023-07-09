package appHooks;

import java.io.ByteArrayInputStream;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.Scenario;

import dsutilities.ConfigReader;
import dsutilities.LoggerLoad;

public class Hooks {
	private static WebDriver driver;
	private static DriverFactory driverfactory;
	static Scenario scenario;

	@BeforeAll
	public static void before() throws Throwable {
		//Get browser Type from config file
		LoggerLoad.info("Loading Config file");
		ConfigReader.loadConfig();
		String browser = ConfigReader.getBrowserType();
		System.out.println("Config reader got the browser :"+browser);
		
		//Initialize driver from driver factory
		driverfactory = new DriverFactory();
		driver = driverfactory.initializeDrivers(browser);
		LoggerLoad.info("Initializing driver for : "+browser);
	
	}

	@Before
	public void scenario(Scenario scenario) {
		LoggerLoad.info("===============================================================================================");
		LoggerLoad.info(scenario.getSourceTagNames() +" : "+scenario.getName());
		LoggerLoad.info("-----------------------------------------------------------------------------------------------");
		
	}
	@AfterStep
	public void afterstep(Scenario scenario) {
		if (scenario.isFailed()) {
			LoggerLoad.error("Steps Failed , Taking Screenshot");
			final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);//
			scenario.attach(screenshot, "image/png", "My screenshot");
			
		
		}
	}

	@AfterAll
	public static void after() {
		LoggerLoad.info("Closing Driver");
		driverfactory.closeallDriver();
	}
}
//public class Hooks {
//	
//	private DriverFactory driverFactory;
//	private WebDriver driver;
//	private ConfigReader configReader;
//	Properties prop;
//	
//	@Before(order = 0)
//	public void getProperty() {
//		configReader = new ConfigReader();
//		prop = configReader.init_prop();
//	}
//	
//	@Before(order = 1)
//	public void launchbrowser() throws Exception {
//		
//		String browserType = prop.getProperty("browser");
//		System.out.println("BrowserType in Launch Browser:" + browserType);
//		driverFactory = new DriverFactory();
//		driver = driverFactory.init_driver(browserType);	
//	}
//	
//	
//	@After(order = 0)
//	public void quitBrowser() {
//		driver.quit();
//	}
//	@After(order = 1)
//	public void tearDown(Scenario scenario) {
//		if(scenario.isFailed()) {
//			//take screenshot
//			String screenshotName = scenario.getName().replaceAll(" ", "_");
//			byte[] srcPath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
//			
//			scenario.attach(srcPath, "image/png", screenshotName);
//		}
//	}
//	
//}