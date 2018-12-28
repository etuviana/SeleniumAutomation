package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pageobjects.DataProviderPage;
import pageobjects.LoginPage;

public class BranchTest extends BaseTest{
	
	@Test 
	public void LT01_loginWithFaker() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.loginFaker();
	}	
	
	@Test(dataProviderClass= DataProviderPage.class, dataProvider="loginData") 
	public void LT02_loginWithDataProvider(String username, String password) throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(username,password);		
	}
		        	
	@Test @Parameters({"user1", "pass1"})
	public void LT03_loginFailedWithParameters(String user1, String pass1) throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(user1,pass1);		
	}
	
	public void LT04_loginFailedWithParameters(String user1, String pass1) throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(user1,pass1);		
	}
			
	@Test @Parameters({"eee", "ttt"})
	public void LT04_loginSuccedWithParameters(String user3, String pass3) throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.login(user3,pass3);
	}
	
	
		
	
	
}
