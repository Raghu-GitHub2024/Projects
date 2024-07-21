package Maven.proj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Profile_Edit 
{ 
	WebDriver driver;
	@FindBy(id ="nav-link-accountList-nav-line-1")
	WebElement AccountandList;
	
	@FindBy(xpath ="//*[@id=\"selectProfileModalId\"]/div/button")
	WebElement ManageProf;
	
	@FindBy(linkText= "View")
	WebElement View;
	

	

	public void Account_list(WebDriver driver)
	{			
		Actions a1 = new Actions(driver);
		a1.moveToElement(AccountandList).perform();
			
	}
	
	public void Manage_profile()
	{
		ManageProf.click();
	}
	
	public void View() 
	{
		
		View.click();
		
	}
	
	public Amazon_Profile_Edit(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
}
