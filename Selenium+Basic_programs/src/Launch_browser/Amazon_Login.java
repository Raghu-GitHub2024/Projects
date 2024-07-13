package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Login {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//WebElement log = driver.findElement(By.partialLinkText("Hello"));
		WebElement log = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		
		log.click();
		

	}

}
