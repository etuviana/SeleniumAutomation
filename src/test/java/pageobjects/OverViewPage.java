package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OverViewPage extends BasePage{
	@FindBy(css="[id=\"continue\"]")
	@CacheLookup
	private WebElement btnContinue;
	@FindBy(css=".cart_cancel_link")
	@CacheLookup
	private WebElement btnCancel;
	@FindBy(css="[id=\"finish\"]")
	@CacheLookup
	private WebElement btnFinish;

	public OverViewPage(WebDriver driver) {
		super(driver);
	}

	public void finish() {
		click(btnFinish);
	}

	public void cancel() {
		click(btnCancel);
	}

}
