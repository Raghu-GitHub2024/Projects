package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAM_Pop {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/javascript-popup/");
		driver.manage().window().maximize();
		WebElement Click = driver.findElement(By.xpath("//button[@class='btnjs']"));
		Click.click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();
		
		

	}

}
