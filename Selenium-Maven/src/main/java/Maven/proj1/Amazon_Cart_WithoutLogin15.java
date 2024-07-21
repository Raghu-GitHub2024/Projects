package Maven.proj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Cart_WithoutLogin15 
{
	WebDriver driver;
	
	
	@FindBy(id = "//add-to-cart-button")
	WebElement addToCartButton;

	@FindBy(xpath = "//*[@id=\"sw-gtc\"]/span/a")
	WebElement Goto_Cart;



	public void addToCart() {
		addToCartButton.click();
	}
	
	public void GotoCart_Btn() {
		Goto_Cart.click();
	}
	
	

	public Amazon_Cart_WithoutLogin15(WebDriver driver2)
	{
		PageFactory.initElements(driver, this);
	}

}
