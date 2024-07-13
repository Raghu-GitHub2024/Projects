package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroHoverOver {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		
		WebElement Demo1 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]/div[1]"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(Demo1).perform();
		WebElement Pract3 = driver.findElement(By.xpath("(//div[@class='popup4'])[3]"));
		Pract3.click();
		
		
		
	}

}
