package Maven.Selenium_Maven_Proj1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Maven.Selenium_Maven.Amazon_Home_Page;
import Maven.Selenium_Maven.Amazon_Login_Page;
import Maven.proj1.Amazon_Details_Check;

public class TestCase_DCheck {
	

	@Test
	public void login_to_search() 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		Amazon_Login_Page a1 = new Amazon_Login_Page(driver);
		a1.Mobileno();
		a1.Continue_click();
		a1.password();
		a1.Signin();
		
		Amazon_Home_Page a2 = new Amazon_Home_Page(driver);
		a2.searching();
		
		Amazon_Details_Check a3 = new  Amazon_Details_Check(driver);
		a3.firstprod_click();
		

		Set<String> s1 = driver.getWindowHandles();
		Iterator<String> parentChildId = s1.iterator();
		parentChildId.next();
		String childId = parentChildId.next();
		driver.switchTo().window(childId);
		
		a3.checkprice();
		a3.Review_rating();
		a3.Description();
		
	}


}
