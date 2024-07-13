package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jsam_auto1 {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Raghuveer/Downloads/learningHTML1.html");
		WebElement JSAM = driver.findElement(By.xpath("html/body/input[1]"));
		JSAM.sendKeys("ABCD");
		WebElement JSAM1 = driver.findElement(By.xpath("html/body/input[2]"));
		JSAM1.sendKeys("Website name");
		WebElement JSAM3 = driver.findElement(By.xpath("html/body/input[3]"));
		JSAM3.sendKeys("password");
		WebElement JSAM4 = driver.findElement(By.xpath("html/body/form/input[1]"));
		JSAM4.sendKeys("efghh");
		WebElement JSAM5 = driver.findElement(By.xpath("html/body/form[2]/input[1]"));
		JSAM5.click();
		WebElement JSAM6 = driver.findElement(By.xpath("html/body/form[2]/input[2]"));
		JSAM6.click();
		WebElement JSAM7 = driver.findElement(By.xpath("html/body/form[2]/input[1]"));
		JSAM.click();
		WebElement JSAM8 = driver.findElement(By.xpath("html/body/form[2]/input[2]"));
		JSAM.click();
		WebElement JSAM9 = driver.findElement(By.xpath("html/body/form[2]/input[3]"));
		JSAM9.click();
		WebElement JSAM10 = driver.findElement(By.xpath("html/body/input[4]"));
		JSAM10.click();
		WebElement JSAM11 = driver.findElement(By.xpath("html/body/input[6]"));
		JSAM11.click();
		
	
	}

}
