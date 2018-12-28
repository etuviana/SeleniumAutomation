package pageobjects;

import org.testng.annotations.DataProvider;

public class DataProviderPage {

	@DataProvider
	public Object[][] loginData(){
		return new Object[][]{{"standard_user","111"},{"standard_user","333"},
			{"standard_user","666"}};
	}


}
