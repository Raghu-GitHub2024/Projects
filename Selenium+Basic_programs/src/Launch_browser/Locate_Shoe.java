package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locate_Shoe {

	public static void main(String[] args)
	{
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			WebElement shoe = driver.findElement(By.xpath("(//option)[38]"));
			shoe.click();
			
			/*
			 * Select s1 = new Select(shoe); s1.selectByValue("search-alias=shoes");
			 */
			

	}

}
