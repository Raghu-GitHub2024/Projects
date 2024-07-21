package Maven.Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_AddToWishlist_Page {
	
	WebDriver driver;
	@FindBy(xpath ="//*[@id=\"continue-shopping\"]/span/span/input")
	WebElement continueshopping_btn;
	
	
	
	
	public void continue_shopping() {
		
		continueshopping_btn.click();
	}
	
	
	
	public Amazon_AddToWishlist_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
}
