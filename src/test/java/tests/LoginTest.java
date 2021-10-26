package tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.DataProviderPage;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;

public class LoginTest extends BaseTest{


	@Test
	public void LT01_loginWith_problem_user() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("locked_out_user","secret_sauce");
		Assert.assertEquals(loginPage.GetErrorMessage(),"Epic sadface: Sorry, this user has been locked out.");
	}
	@Test
	public void LT02_loginWith_standard_user() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("standard_user","secret_sauce");

		ProductsPage productsPage = new ProductsPage(driver);
		Assert.assertEquals(productsPage.GetProductsTitle(),"PRODUCTS");
	}



	
		
	
	
}
