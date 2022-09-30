package ORG.TYSS.OBJECT_REPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyCartPage 
{
	public MyCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[@bounds='[216,461][712,496]']")
	private WebElement addedProduct;
	
	public String getProductName()
	{
	return	addedProduct.getText();
	}

}
