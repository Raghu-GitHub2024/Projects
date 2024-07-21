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
	WebElement Search;
	
	
	
	public void Search() {
		Search.sendKeys("shoe");
		Search.sendKeys(Keys.ENTER);
	}
	
	public Amazon_Shoe_Search(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
}
