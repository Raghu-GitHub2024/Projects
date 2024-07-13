package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/drag-and-drop/");
		driver.manage().window().maximize();
		
		WebElement Drag = driver.findElement(By.xpath("(//div[@id='container'])[7]"));
		WebElement Drop = driver.findElement(By.xpath("//div[@id='div2']"));
		Thread.sleep(2000);
		WebElement Drag1 = driver.findElement(By.xpath("//div[@id='div2']"));
		WebElement Drop1 = driver.findElement(By.xpath("(//div[@id='container'])[7]"));
		Actions A1 = new Actions(driver);
		A1.dragAndDrop(Drag, Drop).perform();
		A1.dragAndDrop(Drag1, Drop1).perform(); 
		
		
	}

}
