package selenium_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LaunchQuit   
{ChromeDriver driver; 
	@BeforeMethod
	public void launch() throws InterruptedException 
	{
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement log = driver.findElement(By.partialLinkText("Hello"));
		WebElement log = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		log.click();
		
		WebElement login = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		login.sendKeys("veer.raghuveer07@gmail.com");
		
		WebElement conti = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		conti.click();
		
		WebElement pwd=driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		pwd.sendKeys("Amazon$24");
		
		WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin.click();
		Thread.sleep(2000);
		
		
	}
	
	@AfterMethod
	public void quit() throws InterruptedException 
	{
		
		WebElement logout = driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]/span"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(logout).perform();
				
		WebElement logout1 = driver.findElement(By.xpath("//*[@id=\"nav-item-signout\"]/span"));
		logout1.click();
	}
}
