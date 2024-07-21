package Maven.proj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Cart 
{
	WebDriver driver;
	@FindBy(xpath = "//input[@id='add-to-wishlist-button-submit']")
	WebElement addToWishlistButton;

	@FindBy(xpath = "(//span[.='View Your List'])[2]")
	WebElement viewYourListButton;

	@FindBy(xpath = "//a[@class='a-button-text a-text-center']")
	WebElement addToCartButton;

	@FindBy(xpath = "(//span[.='Proceed to checkout'])[2]")
	WebElement proceedToCheckOutButton;

	public void addToWishlist() {
		addToWishlistButton.click();
	}

	public void viewYourList() {
		viewYourListButton.click();
	}

	public void addToCart() {
		addToCartButton.click();
	}

	public void proceedToCheckOut() {
		proceedToCheckOutButton.click();
	}
	
	public Amazon_Cart(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
}
