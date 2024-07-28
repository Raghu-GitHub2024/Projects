package Maven.proj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Cart 
{
	WebDriver driver;
	
	@FindBy(xpath = "//input[@id='add-to-wishlist-button-submit']")
	WebElement addToWishlistButton;

	@FindBy(xpath = "(//span[.='View Your List'])[2]")
	WebElement viewYourListButton;

	@FindBy(xpath = "//input[@id=\"add-to-cart-button\"]")
	WebElement addToCartButton;

	@FindBy(name = "proceedToRetailCheckout")
	WebElement proceedToCheckOutButton;
	
	
	@FindBy(linkText= "Go to Cart")
 	WebElement Goto_Cart_btn;
	
	@FindBy(css = "[name='quantityBox']")
	WebElement quantityTextField;
	

	@FindBy(css = "[value='Delete']")
	WebElement deleteProductButton;
	
	@FindBy(name = "quantity")
	WebElement selectProductQuantity;
	
	@FindBy(xpath = "//h1[normalize-space()='Your Amazon Cart is empty.']")
	WebElement emptyCartTextMsg;
	
	
	@FindBy(xpath = "//h1[normalize-space()='Added to Cart']")
	WebElement addedToCartCartText;

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
	
	public void gotocart() {
		 Goto_Cart_btn.click();
	}

	public void editQuantity() {
		quantityTextField.clear();
		quantityTextField.sendKeys("5");
	}

	public void deleteProductFromCart() {
		deleteProductButton.click();
	}
	

	
	public boolean assertTC10() {
		return emptyCartTextMsg.isDisplayed();
	}
	
	public Amazon_Cart(WebDriver driver){
		
		PageFactory.initElements(driver, this);
		
	}
	public boolean assertTC09() {
		return addedToCartCartText.isDisplayed();
	}
	
	public boolean assertTC15() {
		return addedToCartCartText.isDisplayed();
	}

	

	public void selectQuantityFromDropdown() {
		Select selectQuantity = new Select(selectProductQuantity);
		selectQuantity.selectByValue("3");
		
	}
}
