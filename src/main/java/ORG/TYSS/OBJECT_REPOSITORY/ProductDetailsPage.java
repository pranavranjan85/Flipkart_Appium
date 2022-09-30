package ORG.TYSS.OBJECT_REPOSITORY;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDetailsPage 
{
	public ProductDetailsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//android.widget.TextView[@text='Add to cart']")
	private WebElement addToCartButton;
	
	@FindBy(xpath = "//android.widget.TextView[@text='Go to cart']")
	private WebElement goToCartButton;
	
	@FindBy(xpath = "//android.widget.TextView[@bounds='[32,901][688,975]']")
	private WebElement expectedProductName;
	
	
	
	
	public void clickOnAddToCart()
	{
		addToCartButton.click();
		goToCartButton.click();
	}
	public String getExpectedProductName()
	{
	return	expectedProductName.getText();
	}
}


