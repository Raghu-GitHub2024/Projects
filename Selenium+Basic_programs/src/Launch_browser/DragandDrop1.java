package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragandDrop1 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement Amaz =driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Amaz.sendKeys(Keys.ARROW_DOWN);
		Amaz.sendKeys(Keys.ARROW_DOWN);
		Amaz.sendKeys(Keys.ARROW_DOWN);
		Amaz.sendKeys(Keys.ARROW_DOWN);
		

	}

}
