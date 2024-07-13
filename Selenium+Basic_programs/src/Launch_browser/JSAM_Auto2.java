package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JSAM_Auto2 {

	public static void main(String[] args)
	{
	
		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Raghuveer/Downloads/learningHTML1.html");
		WebElement JSAM = driver.findElement(By.xpath("//input[@id='1']"));
		JSAM.sendKeys("ABCDE");
		WebElement JSAM1 = driver.findElement(By.xpath("//input[@id='2']"));
		JSAM1.sendKeys("Alphabets");
		WebElement JSAM2 = driver.findElement(By.xpath("//input[@id='3']"));
		JSAM2.sendKeys("Edge");
		WebElement JSAM3 = driver.findElement(By.xpath("//input[@name='fname']"));
		JSAM3.sendKeys("ABC");
		WebElement JSAM4 = driver.findElement(By.xpath("//input[@id='123']"));
		JSAM4.click();
		WebElement JSAM5 = driver.findElement(By.xpath("//input[@name='name2']"));
		JSAM5.click();
		WebElement JSAM6 = driver.findElement(By.xpath("//input[@id='321']"));
		JSAM6.click();
		WebElement JSAM7 = driver.findElement(By.xpath("(//input)[11]"));
		JSAM7.click();
		WebElement JSAM8 = driver.findElement(By.xpath("(//input)[13]"));
		JSAM8.click();

	}

}
