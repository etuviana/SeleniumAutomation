package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class ProductsPage extends BasePage{
	@FindBy(css=".inventory_item")
	@CacheLookup
	private List<WebElement> list;
	@FindBy(css="[class=\"shopping_cart_badge\"]")
	@CacheLookup
	private WebElement btnCart;
	@FindBy(css="[class=\"shopping_cart_badge\"]")
	@CacheLookup
	private WebElement iconCartNumberOfItems;
	@FindBy(css="[class=\"title\"]")
	@CacheLookup
	private WebElement txtProducts;
	@FindBy(css="[class=\"bm-burger-button\"]")
	@CacheLookup
	private WebElement btnBurger;
	@FindBy(css="[id=\"logout_sidebar_link\"]")
	@CacheLookup
	private WebElement btnLogout;

	public ProductsPage(WebDriver driver) {
		super(driver);
	}

	public void addToCart(String name) {
		for (int i = 0; i < list.size(); i++) {
			WebElement titleEl = list.get(i).findElement(By.cssSelector(".inventory_item_name"));
			String title = getText(titleEl);
			if (name.equalsIgnoreCase(title)) {
				//click the button
				WebElement btnAdd = list.get(i).findElement(By.cssSelector("[class=\"btn btn_primary btn_small btn_inventory\"]"));
				click(btnAdd);
			}
		}
	}

	public void openCart() {
		click(btnCart);
	}
	
	public int getNumberOfProductInCart() {
		int num = 0;
		String sNum = getText(iconCartNumberOfItems);
		num = Integer.parseInt(sNum);
		return num;
	}

	public String GetProductsTitle(){
		return txtProducts.getText();
	}

	public void ClickOnLogout() {
		click(btnBurger);
		sleep(1000);
		click(btnLogout);
	}

}
