package factory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
//import dsutilities.Loggerload;

public class DriverFactory {

//public static WebDriver driver;
	public static WebDriver driver;// = new ChromeDriver();

public WebDriver initializeDrivers(String browser) {

if (browser.equalsIgnoreCase("firefox")) {
//Loggerload.info("Testing on firefox");
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();

} else if (browser.equalsIgnoreCase("chrome")) {
//Loggerload.info("Testing on chrome");
	//WebDriverManager.chromedriver().browserVersion("112.0").setup();//comment because Chrome is added in the usr/bin
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

} else if (browser.equalsIgnoreCase("safari")) {
//Loggerload.info("Testing on safari");
	WebDriverManager.safaridriver().setup();
	driver = new SafariDriver();

} else if (browser.equalsIgnoreCase("edge")) {
//Loggerload.info("Testing on Edge");
	WebDriverManager.edgedriver().setup();
	driver = new EdgeDriver();

}
// Set Page load timeout
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

	driver.manage().window().maximize();

	return driver;
}

public static WebDriver getdriver() {
	return driver;

}

public void closeallDriver() {
	driver.close();
}

}
//public class DriverFactory {
//public static WebDriver driver;
//
//public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
//public static WebDriverWait wait;
//
//public WebDriver init_driver (String browser) throws Exception {
//	
//	System.out.println("brower value is:" + browser);
//	if (browser.equalsIgnoreCase("chrome")) {
//		WebDriverManager.chromedriver().setup();
//		ChromeOptions co = new ChromeOptions();
//		co.addArguments("--remote-allow-origins=*");
//		driver = new ChromeDriver(co);
//		tlDriver.set(driver);
//	}
//	else if (browser.equalsIgnoreCase("firefox")) {
//		WebDriverManager.firefoxdriver().setup();
//		tlDriver.set(new FirefoxDriver());
//		// Firefox
//	}
//	else if (browser.equalsIgnoreCase("safari")) {
//		WebDriverManager.safaridriver().setup();
//		tlDriver.set(new SafariDriver());
//		// Safari
//	}
//	else {
//		System.out.println("Please pass the correct browser value:" + browser);
//	}
//	
//	//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	//driver.manage().window().maximize();
//	//return driver;
//	getDriver().manage().deleteAllCookies();
//	getDriver().manage().window().maximize();
//	System.out.println("init_driver - Driver Returned:" + getDriver());
//	return getDriver();
//}
//
//public static WebDriver getDriver() {
//	System.out.println("Driver Returned:" + tlDriver.get());
//	return tlDriver.get();
//}
//
//}

