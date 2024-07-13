package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GroHoverOver2 {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/hoverover/");
		driver.manage().window().maximize();
		
		WebElement Demo2 = driver.findElement(By.xpath("//*[@id=\"main\"]/div/div[2]/div/div[2]/div[1]/div[4]"));
		Actions a2 = new Actions(driver);
		a2.moveToElement(Demo2).perform();
		WebElement Pract1  = driver.findElement(By.xpath("(//div[@class='popup6'])[1]"));
		Pract1.click();

	}

}
