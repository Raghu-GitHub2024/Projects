package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Grotech_Drop {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		//EdgeDriver driver = new EdgeDriver();
		driver.get("https://grotechminds.com/dropdown/");
		driver.manage().window().maximize();
		WebElement var1 = driver.findElement(By.id("Choice1"));
		
		Select s1 = new Select(var1);
		s1.selectByValue("Demo2");
		
		WebElement var2 = driver.findElement(By.id("Choice9"));
		
		Select s2 = new Select(var2);
		//s2.selectByIndex(14);
		//s2.selectByValue("SQL15");
		s2.selectByVisibleText("SQL15");
		
		
		WebElement var3 = driver.findElement(By.id("Choice6"));
		
		Select s3 = new Select(var3);
		//s2.selectByIndex(14);
		//s2.selectByValue("SQL15");
		s3.selectByVisibleText("Night10");
		
		WebElement var4 = driver.findElement(By.id("Choice8"));
		
		Select s4 = new Select(var4);
		//s2.selectByIndex(14);
		//s2.selectByValue("SQL15");
		s4.selectByVisibleText("QTP10");
		
		
		WebElement var5 = driver.findElement(By.id("Choice4"));
		
		Select s5 = new Select(var5);
		//s2.selectByIndex(14);
		//s2.selectByValue("SQL15");
		s5.selectByVisibleText("Energy15");
		
		
	}

}
