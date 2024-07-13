package Selenium_Amazelogins_ll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TestCase6 extends Amaze_ll 
{
	
	@Test(groups = {"Amazon fresh"})
	public void Mobile_search() throws InterruptedException 
	{

		WebElement Dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select s1=new Select(Dropdown);
		s1.selectByVisibleText("Amazon Fresh");
		
	


	
	
	
	
	
	

	
	}

}
