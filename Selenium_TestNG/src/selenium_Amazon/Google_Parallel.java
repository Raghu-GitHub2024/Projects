package selenium_Amazon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Google_Parallel 
{
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void testcase1(String nameofbrowser)
	{
		if(nameofbrowser.equals("chrome")) 
		{
			driver = new ChromeDriver();
		}
		if(nameofbrowser.equals("edge")) 
		{
			driver = new EdgeDriver();
		}
		if(nameofbrowser.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebDriverWait W1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		W1.until(ExpectedConditions.titleContains("Goo"));
		
		WebElement Search = driver.findElement(By.id("APjFqb"));
		Search.sendKeys("India");
		Search.sendKeys(Keys.ENTER);
		
		
		
	}
	
}
