package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class India_Css {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("india");
		driver.findElement(By.name("btnk")).sendKeys(Keys.ENTER);
	
		

	}

}
