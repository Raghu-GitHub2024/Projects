package Maven.Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult_Page 
{
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[1]/div/span/a/div/img")
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
