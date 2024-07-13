package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_IND {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#APjFqb")).sendKeys("India");//syntax 1 of css selector
		//driver.findElement(By.cssSelector(".gLFyf")).sendKeys("India"); //syntax 2 of css selector
		//driver.findElement(By.cssSelector("textarea#APjFqb")).sendKeys("India");//syntax 3 of css selector
		//driver.findElement(By.cssSelector("[id='APjFqb']")).sendKeys("India");//syntax 4 of css selector
		//driver.findElement(By.cssSelector("textarea[id='APjFqb']")).sendKeys("India");//syntax 5 of css selector
		driver.findElement(By.cssSelector("textarea.gLFyf[id='APjFqb']")).sendKeys("India");//syntax 6 of css selector
		
	}

}
