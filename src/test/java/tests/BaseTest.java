package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	WebDriver driver;
	
	@BeforeClass
	protected void setup() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Automation\\Drivers\\chromedriver.exe"); 
		//ChromeOptions cOptions = new ChromeOptions();
		//cOptions.addArguments("disable-infobars");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");		
	}	
	@AfterClass
	protected void tearDown() {
		driver.quit();
	}
}
