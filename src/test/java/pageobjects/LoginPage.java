package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;



public class LoginPage extends BasePage{
	@FindBy(css="[data-test='username']")
	@CacheLookup
	private WebElement userField;
	@FindBy(css="[data-test='password']")
	@CacheLookup
	private WebElement passwordField;
	@FindBy(css="[id='login-button']")
	@CacheLookup
	private WebElement btnLogin;
	@FindBy(css="[data-test=\"error\"]")
	@CacheLookup
	private WebElement txtError;


	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void login(String user,String password) {
		fillText(userField, user);
		fillText(passwordField, password);
		click(btnLogin);
	}

	public String GetErrorMessage(){

		return txtError.getText();
	}



}
