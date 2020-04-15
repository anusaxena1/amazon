package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class ShoppingPage {

	
	public ShoppingPage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	
	@AndroidFindBy(xpath="//*[@text='Add to Cart from seller VIVO-AU and price $29.99']")
	private WebElement addTOCartbtn;
	
	@AndroidFindBy(accessibility ="Basket")
	private WebElement cartBtn;
	
	public WebElement getAddtoCart() {
		System.out.println("Selecting Add to cart button");
		return addTOCartbtn;
          }
	
	public WebElement getCartPage() {
		System.out.println("Selecting Add to cart button to navigate cart page");
		return cartBtn;
          }
	
}
