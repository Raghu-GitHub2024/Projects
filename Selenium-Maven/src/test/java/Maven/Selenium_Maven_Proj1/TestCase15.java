package Maven.Selenium_Maven_Proj1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Maven.Selenium_Maven.Amazon_SearchResult_Page;
import Maven.proj1.Amazon_Cart_WithoutLogin15;
import Maven.proj1.Amazon_Shoe_Search;

public class TestCase15 
{
	@Test
	public void login_to_search() 
	{
			WebDriver driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://www.amazon.in");
			driver.manage().window().maximize();
			
			Amazon_Shoe_Search  a2 = new Amazon_Shoe_Search (driver);
			a2.Search();
			
			Amazon_SearchResult_Page a3 = new Amazon_SearchResult_Page(driver);
			a3.firstprod_click();
			

			Set<String> s1 = driver.getWindowHandles();
			Iterator<String> parentChildId = s1.iterator();
			parentChildId.next();
			String childId = parentChildId.next();
			driver.switchTo().window(childId);
			

				
			Amazon_Cart_WithoutLogin15 a4 = new Amazon_Cart_WithoutLogin15(driver);		
			a4.addToCart();
			a4.GotoCart_Btn();
		
	
}
}
