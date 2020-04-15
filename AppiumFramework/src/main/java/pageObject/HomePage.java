package pageObject;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class HomePage {

	public HomePage(AndroidDriver<AndroidElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath="//*[@text='Search']")
	private WebElement searchbox;
	
	public WebElement getSearchBox() {
		System.out.println("Trying to enter any search to the search box");
		return searchbox;
	}
	
	@AndroidFindBy(xpath="//*[@text='VIVO Universal LCD Flat Screen TV Table Top VESA Mount Stand Black | Base fits 22... 4.5 out of 5 stars 6,096']")
	public WebElement vivo;

}
