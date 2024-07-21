package Maven.proj1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Details_Check
{
	WebDriver driver;
	
	@FindBy(name = "email")
	WebElement Mobileno;

	@FindBy(id = "continue")
	WebElement Continue_click;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement Signin;
	
	@FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
	WebElement Price;
	
	@FindBy(xpath ="//*[@id=\"acrPopover\"]/span[1]/a/i[1]")
	WebElement Rating;
	
	@FindBy(linkText="Product Description")
	WebElement Description;

	public void Mobileno() {

		Mobileno.sendKeys("9600850349");

	}

	public void Continue_click() {

		Continue_click.click();

	}

	public void password() {

																																	password.sendKeys("Amazon$24");
	}

	public void Signin() {

		Signin.click();
	}

	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	
	public void searching()
	{
		search_tf.sendKeys("shoe");
		search_tf.sendKeys(Keys.ENTER);
	}
	
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[1]/div/span/a/div/img")
	WebElement First_Prod;
	
	public void firstprod_click() 
	{
		
		First_Prod.click();
	}
	
	public void checkprice() {
		
		Price.isDisplayed();
		System.out.println(Price.isDisplayed());
	}
	
	public void Review_rating() {
		Rating.isDisplayed();
		System.out.println(Rating.isDisplayed());
	}
	
	public void Description() {
		Description.isDisplayed();
		System.out.println(Description.isDisplayed());
	}
	
	public Amazon_Details_Check(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}
