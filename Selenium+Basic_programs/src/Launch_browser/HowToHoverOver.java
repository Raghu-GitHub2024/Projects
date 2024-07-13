package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HowToHoverOver {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		WebElement account = driver.findElement(By.xpath("//span[@class ='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(account).perform();
		WebElement Am = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		Am.click();
	}

}
