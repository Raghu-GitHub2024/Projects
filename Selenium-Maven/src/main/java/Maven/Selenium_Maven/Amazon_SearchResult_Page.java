package Maven.Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult_Page 
{
	WebDriver driver;
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	WebElement First_Prod;
	
	public void firstprod_click() 
	{
		
		First_Prod.click();
	}
	public Amazon_SearchResult_Page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	

}
