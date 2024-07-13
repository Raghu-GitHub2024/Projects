package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		
		WebElement D1 = driver.findElement(By.linkText("Gmail"));
		Actions a1 = new Actions(driver);
		a1.doubleClick(D1).perform();
		

	}

}
