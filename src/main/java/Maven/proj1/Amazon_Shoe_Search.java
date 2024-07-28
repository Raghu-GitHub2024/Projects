package Maven.proj1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Shoe_Search 
{
	
	WebDriver driver;
	@FindBy(id = "twotabsearchtextbox")
	public WebElement Search;
	
	@FindBy(linkText= "Men's Sports & Outdoor Shoes")
	WebElement category;
	
	@FindBy(linkText= "Men's Walking Shoes")
	WebElement subcategory1;

	@FindBy(linkText= "Men's Running Shoes")
	WebElement subcategory2;
	
	@FindBy(id ="p_36/range-slider_slider-item")
	WebElement Price;
	
	@FindBy(xpath ="(//i[@class='a-icon a-icon-checkbox'])[3]")
	WebElement Material;
	
	@FindBy(xpath ="(//i[@class='a-icon a-icon-checkbox'])[3]")
	WebElement Sortby;
	
	@FindBy(xpath ="(//a[@class='a-link-normal s-no-outline'])[1]")
	WebElement FirstShoe;
	
	@FindBy(xpath = "//a[@id='nav-orders']")
	WebElement returnsAndOrders;

	
	
	public void Search() {
		Search.sendKeys("shoe");
		Search.sendKeys(Keys.ENTER);
	}
	public void returnsAndOrders() {
		returnsAndOrders.click();
	}
	
	public Amazon_Shoe_Search(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}




}
