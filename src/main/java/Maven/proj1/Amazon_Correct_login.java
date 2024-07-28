package Maven.proj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Correct_login
{
	
WebDriver driver;

	@FindBy(xpath= "//span[@class ='nav-line-2 ']")
	WebElement account;
		
	@FindBy(xpath = "//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	WebElement Signin1;
	
	@FindBy(name = "email")
	WebElement Mobileno;

	@FindBy(id = "continue")
	WebElement Continue_click;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement Signin;

	@FindBy(id = "twotabsearchtextbox")
	public WebElement searchbox;
	
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
	
	public void Account(WebDriver driver) {
		Actions a1 = new Actions(driver);
		a1.moveToElement(account).perform();
	}
	
	/*
	 * public void AM() { AM.click();
	 * 
	 * }
	 */
	
	public void Signin1() {
		Signin1.click();
	}
	
	public void searchbox() {
		searchbox.clear();
	}
	
	public Amazon_Correct_login(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}


}
