package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipkartHoverOver {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement account = driver.findElement(By.xpath("(//span[.='Fashion'])[1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(account).perform();
		WebElement Men = driver.findElement(By.linkText("Men's T-Shirts"));
		Men.click();
		System.out.println(driver.getTitle());
		driver.close();

	}

}
