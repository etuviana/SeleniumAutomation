package tests;

import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.DataProviderPage;
import pageobjects.LoginPage;
import pageobjects.ProductsPage;

public class LoginTest extends BaseTest{


	@Test(description = "Navigate to Login page Fail Test")
	@Description("Open web, enter bad user Name and password click on Login, verify Error alert")
	public void LT01_loginWith_problem_user() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("locked_out_user","secret_sauce");
		Assert.assertEquals(loginPage.GetErrorMessage(),"Epic sadface: Sorry, this user has been locked out.");
	}

	@Test(description = "Navigate to Login page good Test")
	@Description("Open web, enter user Name and password click on Login, verify Error alert")
	public void LT02_loginWith_standard_user() {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login("standard_user","secret_sauce");

		ProductsPage productsPage = new ProductsPage(driver);
		Assert.assertEquals(productsPage.GetProductsTitle(),"PRODUCTS");
		productsPage.ClickOnLogout();
	}





	
		
	
	
}
