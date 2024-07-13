package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser_Launch {

	public static void main(String[] args) 
	{
	
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login.php");
		System.out.println(driver.getWindowHandle());
		System.out.println(driver.getWindowHandles());
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();
		driver.findElement(By.id("email"));
		driver.findElements(By.id("pass"));
		driver.quit();
	}

}
