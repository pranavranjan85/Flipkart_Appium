package ORG.TYSS.OBJECT_REPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//android.widget.TextView[@text='Search for products']")
	private WebElement searchBox;
	
	
	@FindBy(xpath = "//android.widget.EditText[@text='Search for Products, Brands and More']")
	private WebElement writeProductName;
	
	@FindBy(xpath = "//android.widget.TextView[@text='winter heater']")
	private WebElement product;
	
	public void clickOnSearchBox()
	{
		searchBox.click();
	}
	public void enterProduct(String heater)
	{
		writeProductName.sendKeys(heater);
		
	}
	public void SearchProduct()
	{
		product.click();
	}
}
