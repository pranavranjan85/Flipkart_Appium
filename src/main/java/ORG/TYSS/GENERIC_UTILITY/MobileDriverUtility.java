package ORG.TYSS.GENERIC_UTILITY;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class MobileDriverUtility 
{
	public AndroidDriver driver;
	/**
	 * This method is used to wait the page by using implicit wait
	 * @param longTimeout
	 */
	public void implicitWait(long longTimeout)
	{
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS);
	}
	/**
	 * This method is used to click on particular element
	 * @param element
	 */
	public void tapAction(MobileElement element, int fingerTap)
	{
		element.tap(fingerTap, 500);
	}
	
	/**
	 * This method is used to swipe any app up-down, left-right
	 * @param x1
	 * @param y1
	 * @param x2
	 * @param y2
	 * @param time
	 */
	public void swipeAction(int x1, int y1, int x2, int y2, int time)
	{
		driver.swipe(x1, y1, x2, y2, time);
	}
	
	/**
	 * This method is used to switch from running app to another app
	 * @param appPackage
	 * @param appActivity
	 */
	public void switchAppAction(String appPackage, String appActivity)
	{
		driver.startActivity(appPackage, appActivity);
	}
	
	/**
	 * This method is used to zoom a particular element
	 * @param element
	 */
	public void zoomElement(MobileElement element)
	{
		driver.zoom(element);
	}
	
	/**
	 * This method is used to zoom particular dimension
	 * @param x
	 * @param y
	 */
	public void ZoomDimension(int x, int y)
	{
		driver.zoom(x, y);
	}
	
	/**
	 * This is used to Zoom in one particular element
	 * @param element
	 */
	public void pinchAction(MobileElement element)
	{
		driver.pinch(element);
	}
	
	/**
	 * This method is used to Zoom in particular dimension
	 * @param x
	 * @param y
	 */
	public void pinchDimension(int x, int y)
	{
		driver.pinch(x, y);
	}

}
