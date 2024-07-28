package Maven.Selenium_Maven_Proj1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Maven.proj1.Amazon_Incorrect_login;
import Maven.proj1.Amazon_Register;



public class TestCase1 {
	@Test
	public void login_to_search() {
	
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	driver.manage().window().maximize();
	
	Amazon_Incorrect_login a2 = new Amazon_Incorrect_login (driver);
	a2.Mobileno();
	a2.Continue_click();
	
	
	Amazon_Register a1 = new Amazon_Register(driver);
	a1.CreateAccount();
	a1.Cust_Name();
	a1.PhoneNo();
	a1.password();
	a1.Continue();
		
	
	
	Assert.assertEquals(driver.getTitle(), "Authentication required","Registration not successful");
	
	


	

}
}
