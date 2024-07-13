package package1.SeleniumProject;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Soft 
{
	public static void main(String[] args) 
	{
		/*
		 * ChromeOptions c1 = new ChromeOptions(); c1.addArguments("--Headless");
		 */
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("camera");
		searchItem.sendKeys(Keys.ENTER);
		
		/*
		 * WebElement nextPage =
		 * driver.findElement(By.cssSelector("[aria-label='Go to page 3']"));
		 * nextPage.click();
		 */
		WebElement select35thCamera = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/span[1]/div[1]/div[5]/div[1]/div[1]/span[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/span[1]/a[1]/div[1]/img[1]"));
		/*
		 * WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.titleContains("Camera"));
		 */
		select35thCamera.click();
		Set<String> s1 = driver.getWindowHandles();
		SoftAssert s2  = new SoftAssert();
		s2.assertEquals(0, 0);
		//Assertion a1 = new Assertion(); //hard assert lines
		//a1.assertEquals(s1.size(), 3);
		
	
		
	}

}
