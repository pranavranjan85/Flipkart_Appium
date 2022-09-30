package ORG.TYSS.GENERIC_UTILITY;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import ORG.TYSS.OBJECT_REPOSITORY.HomePage;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class BaseClass
{
	//AppiumDriverLocalService services;
	public AndroidDriver driver;
	 public String product;
	// creating object 
	FileUtility fileUtility=new FileUtility();
	ExcelFileUtility excelFileUtility= new ExcelFileUtility();

@BeforeClass
public void startServer()
{
	// services=AppiumDriverLocalService.buildDefaultService();
		//services.start();
	
  
}

@BeforeMethod
public void startApplication() throws MalformedURLException
{
	//get the data from property file
		String platformName = fileUtility.getDataFromProperty("platformName");
		String platformVersion = fileUtility.getDataFromProperty("platformVersion");
		String dedviceId = fileUtility.getDataFromProperty("deviceId");
		String serverUrl = fileUtility.getDataFromProperty("url");
		String appPackage = fileUtility.getDataFromProperty("appPackage");
		String appActivity = fileUtility.getDataFromProperty("appActivity");
	    product = excelFileUtility.getDataFromExcel("flipkart", 0, 1);
	    
	    DesiredCapabilities dc=new DesiredCapabilities();
	
	    dc.setCapability(MobileCapabilityType.PLATFORM_NAME, platformName);
	    dc.setCapability(MobileCapabilityType.PLATFORM_VERSION, platformVersion);
	    dc.setCapability(MobileCapabilityType.UDID, dedviceId);
	    dc.setCapability("appPackage",appPackage);
	    dc.setCapability("appActivity",appActivity);
	    dc.setCapability("noReset", true);
	    URL url= new URL(serverUrl);
	    driver=new AndroidDriver(url, dc);
	   // driver.launchApp();
}

@AfterMethod
public void stopApplication()
{
//	driver.closeApp();
}

@AfterClass
public void stopServer()
{
	//services.stop();
}

}
