package FLIPKART_MOBILE_APP;

import org.testng.Assert;
import org.testng.annotations.Test;

import ORG.TYSS.GENERIC_UTILITY.BaseClass;
import ORG.TYSS.OBJECT_REPOSITORY.HomePage;
import ORG.TYSS.OBJECT_REPOSITORY.MyCartPage;
import ORG.TYSS.OBJECT_REPOSITORY.ProductDetailsPage;
import ORG.TYSS.OBJECT_REPOSITORY.SearchedProductPage;

public class AddProductTest extends BaseClass
{
	@Test
	public void addProductTest()
	{
	HomePage homePage=new HomePage(driver);
	SearchedProductPage searchedProductPage=new SearchedProductPage(driver);
	ProductDetailsPage productDetailsPage=new ProductDetailsPage(driver);
	MyCartPage myCartPage=new MyCartPage(driver);
	
	homePage.clickOnSearchBox();
	homePage.enterProduct(product);
	homePage.SearchProduct();
	searchedProductPage.clickOnProduct();
	String expectedProduct = productDetailsPage.getExpectedProductName();
	productDetailsPage.clickOnAddToCart();
	String actualProduct = myCartPage.getProductName();
	Assert.assertEquals(actualProduct, expectedProduct);
	
	
	
	}

}
