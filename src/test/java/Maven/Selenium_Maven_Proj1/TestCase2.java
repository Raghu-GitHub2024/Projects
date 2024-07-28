package Maven.Selenium_Maven_Proj1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Maven.proj1.Amazon_Correct_login;

public class TestCase2 {
	

	
	@Test
	public void login_to_search() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		
		Amazon_Correct_login a1 = new Amazon_Correct_login(driver);
		a1.Account(driver);
		
		a1.Signin1();
		a1.Mobileno();
		a1.Continue_click();
		a1.password();
		a1.Signin();
		a1.searchbox();
		
		
		Assert.assertEquals(a1.searchbox.isDisplayed(), true,"Testcase pass");
	
	}
}
