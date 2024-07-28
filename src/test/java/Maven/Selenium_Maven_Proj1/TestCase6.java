package Maven.Selenium_Maven_Proj1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Maven.proj1.Amazon_Correct_login;
import Maven.proj1.Amazon_Fliter;
import Maven.proj1.Amazon_Shoe_Search;


public class TestCase6
{

	@Test
	
	
	public void login_to_search() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		Amazon_Correct_login a2 = new Amazon_Correct_login(driver);
		a2.Mobileno();
		a2.Continue_click();
		a2.password();
		a2.Signin();
		
		Amazon_Shoe_Search a4 = new  Amazon_Shoe_Search(driver);
		a4.Search();
		
		Amazon_Fliter a5 = new Amazon_Fliter(driver);
		a5.selectCategory();
		a5.sortbyfeature();
		a5.lowhighsort();
		
	
	}

}