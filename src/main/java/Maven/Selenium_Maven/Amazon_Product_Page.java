package Maven.Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Product_Page {
	
	WebDriver driver;
   @FindBy(id = "add-to-wishlist-button-submit")
   WebElement wishlist_btn;
   @FindBy(id = "add-to-cart-button")
   WebElement Addcart_btn;
   
   
   public void add_to_wishlist() {
	   
	   wishlist_btn.click();
	   
   }
   
   public void add_to_cart() {
	   
	   Addcart_btn.click();
   }
   
   public Amazon_Product_Page(WebDriver driver) 
   {
		PageFactory.initElements(driver, this);
   }
	
}