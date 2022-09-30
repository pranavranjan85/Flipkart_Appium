package ORG.TYSS.OBJECT_REPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchedProductPage
{
	public SearchedProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//android.widget.TextView[contains(@text,'pampa BLUEDART')]")
	private WebElement firstProduct;
	
	
	public void clickOnProduct()
	{
		firstProduct.click();
	}

}
