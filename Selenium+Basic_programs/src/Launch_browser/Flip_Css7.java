package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip_Css7 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		//driver.findElement(By.cssSelector("input.Pke_EE[name='q']")).sendKeys("shoe");
		driver.findElement(By.cssSelector("input[title^='Search for Products']")).sendKeys("shoe");//syn 8 of css selector


	}

}
