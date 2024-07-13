package package1.SeleniumProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 
{
	@Test
	public void login_to_facebook_using_valid_credentials() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		FB_Login_page FB =new FB_Login_page(driver);
		FB.un();
		FB.pwd();
		FB.login();
	}

}
