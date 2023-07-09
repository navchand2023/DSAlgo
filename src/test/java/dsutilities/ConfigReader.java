package dsutilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	private static Properties properties;
	private final static String propertyFilePath = "./src/test/resources/Properties/config.properties";
	

	
	 // This method is used to load the properties from config.properties file
	

	
	public static void loadConfig() throws Throwable {

		try {
			FileInputStream fis;
			fis = new FileInputStream(propertyFilePath);
			properties = new Properties();
			try {
				properties.load(fis);
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
		}
	}

	public static String getBrowserType() {
		String browser = properties.getProperty("browser");
		LoggerLoad.info("Get property BrowserType");
		if (browser != null)
			return browser;
		else
			throw new RuntimeException("browser not specified in the Configuration.properties file.");
	}

	public static String getApplicationUrl() {
		String url = properties.getProperty("url");
		if (url != null)
			return url;
		else
			throw new RuntimeException("url not specified in the Configuration.properties file.");
	}

	public static String getHomePageURL() {
		String homeurl = properties.getProperty("homepage");
		if (homeurl != null)
			return homeurl;
		else
			throw new RuntimeException("Homeurl not specified in the Configuration.properties file.");
	}
	// Register
		public static String getRegisterPageURL() {
			String url = properties.getProperty("registerurl");
			if (url != null)
				return url;
			else
				throw new RuntimeException("url not specified in the Configuration.properties file.");
		}


	// Signin
	public static String getLoginPage() {
		String loginurl = properties.getProperty("loginpage");
		if (loginurl != null)
			return loginurl;
		else
			throw new RuntimeException("Login page url not specified in the Configuration.properties file.");
	}

	public static String getexcelfilepath() {
		String excelfilepath = System.getProperty("user.dir")+properties.getProperty("excelpath");
		if (excelfilepath != null)
			return excelfilepath;
		else
			throw new RuntimeException("Excel file path not specified in the Configuration.properties file.");
	}
	
	
	// Queue
	public static String getQueueUrl() {
		String queueurl = properties.getProperty("queuepageurl");
		if (queueurl != null)
			return queueurl;
		else
			throw new RuntimeException("queue url is not specified in the Configuration.properties file.");
	}

	public static String getPracticeQUrl() {
		String practicequrl = properties.getProperty("practicequrl");
		if (practicequrl != null)
			return practicequrl;
		else
			throw new RuntimeException(
					"Queue Practice Questions url is not specified in the Configuration.properties file.");
	}

	public static String getImpOfQPythonUrl() {
		String impofqpythonurl = properties.getProperty("queimplementationlists");
		if (impofqpythonurl != null)
			return impofqpythonurl;
		else
			throw new RuntimeException(
					"Implementation of Queue in Python url is not specified in the Configuration.properties file.");
	}

	public static String getEditorUrl() {
		String editorurl = properties.getProperty("editorurl");
		if (editorurl != null)
			return editorurl;
		else
			throw new RuntimeException("Editor url is not specified in the Configuration.properties file.");
	}

	public static String getDQUrl() {
		String impcolldqurl = properties.getProperty("impdeqeueurl");
		if (impcolldqurl != null)
			return impcolldqurl;
		else
			throw new RuntimeException(
					"Implementation using collections deque url is not specified in the Configuration.properties file.");
	}

	public static String getImpArrayUrl() {
		String impusingarray = properties.getProperty("imparrayurl");
		if (impusingarray != null)
			return impusingarray;
		else
			throw new RuntimeException(
					"Implementation using array url is not specified in the Configuration.properties file.");
	}
	public static String getQueueOpUrl() {
		String qOp = properties.getProperty("queueopurl");
		if (qOp != null)
			return qOp;
		else
			throw new RuntimeException(
					"Queue Operations url is not specified in the Configuration.properties file.");
	}
	//Tree
	public static String getTreeUrl()
	{
		String trUrl = properties.getProperty("treepageurl");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Tree url is not specified in the Configuration.properties file.");
		
	}
	//Data structure
	public static String getDataStructureURL()
	{
		String trUrl = properties.getProperty("datastructureurl");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Data Structure url is not specified in the Configuration.properties file.");
	}
	public static String getTimeComplexityURL()
	{
		String trUrl = properties.getProperty("timecomplexityurl");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Time Complexity url is not specified in the Configuration.properties file.");
	}
	public static String getGraphURL()
	{
		String trUrl = properties.getProperty("graphurl");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Graph url is not specified in the Configuration.properties file.");
	}
	public static String getGraphURL2()
	{
		String trUrl = properties.getProperty("graphurl2");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Graph url 2 is not specified in the Configuration.properties file.");
	}
	public static String getGraphRepURL()
	{
		String trUrl = properties.getProperty("graphrepurl");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Graph Representations url is not specified in the Configuration.properties file.");
	}

	//Array
	public static String getArrayURL()
	{
		String trUrl = properties.getProperty("ArrayURL");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getArrayURL2()
	{
		String trUrl = properties.getProperty("ArrayURL2");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getArrayURL3()
	{
		String trUrl = properties.getProperty("ArrayURL3");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getArrayURL4()
	{
		String trUrl = properties.getProperty("ArrayURL4");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getArrayURL5()
	{
		String trUrl = properties.getProperty("ArrayURL5");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getArrayURL6()
	{
		String trUrl = properties.getProperty("ArrayURL6");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getArrayURL7()
	{
		String trUrl = properties.getProperty("ArrayURL7");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getArrayURL8()
	{
		String trUrl = properties.getProperty("ArrayURL8");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getArrayURL9()
	{
		String trUrl = properties.getProperty("ArrayURL9");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getArrayURL10()
	{
		String trUrl = properties.getProperty("ArrayURL10");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getArrayURL11()
	{
		String trUrl = properties.getProperty("ArrayURL11");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Array url is not specified in the Configuration.properties file.");
	}
	public static String getStackURL()
	{
		String trUrl = properties.getProperty("stackurl");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Stack url is not specified in the Configuration.properties file.");
	}
//linked list
	public static String getLinkedListURL()
	{
		String trUrl = properties.getProperty("linkedlisturl");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Linked list url is not specified in the Configuration.properties file.");
	}
	public static String getLinkedListIntroURL()
	{
		String trUrl = properties.getProperty("linkedlistintrourl");
		if (trUrl != null)
			return trUrl;
		else
			throw new RuntimeException(
					"Linked list url is not specified in the Configuration.properties file.");
	}

	

}
