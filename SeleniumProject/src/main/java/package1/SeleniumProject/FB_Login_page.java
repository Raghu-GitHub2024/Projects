package package1.SeleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_Login_page
{
	WebDriver driver;
//step 1 : locate each element using @FindBy
	
	@FindBy(id="email") WebElement username;
	
	@FindBy(id="pass") WebElement password;
	
	@FindBy(xpath="//button[@name='login']") WebElement loginbutton;
	
	//Step2 : Create a separate method for each components to perform its action
	
	public void un()
	{
		username.sendKeys("veer.raghuveer07@gmail.com");
	}
	
	public void pwd()
	{
		password.sendKeys("veer07");
	}
	
	public void login()
	{
		loginbutton.click();
	}
	
	//step3: Initilize each element using Pagefactory class inside the constructor
	
	public FB_Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
