package Maven.Selenium_Maven_Proj1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Maven.proj1.Amazon_Shoe_Search;

public class TestCase5
{
	@Test
	public void login_to_search() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/gp/css/homepage.html?ref_=nav_ya_signin");
		driver.manage().window().maximize();
		
		Amazon_Shoe_Search a3 = new  Amazon_Shoe_Search(driver);
		a3.Search();
		
		Assert.assertEquals(a3.Search.isDisplayed(),true, "Test showing result");
	}

}
