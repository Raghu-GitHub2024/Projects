package Maven.Selenium_Maven;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page 
{
	WebDriver driver;
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	
	
	public void searching()
	{
		search_tf.sendKeys("shoe"+ Keys.ENTER);
	}
	
public Amazon_Home_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
}
