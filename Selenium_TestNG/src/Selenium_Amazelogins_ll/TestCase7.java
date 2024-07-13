package Selenium_Amazelogins_ll;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase7 extends Amaze_ll

{
	@Test(groups = {"Camera"})
	public void Camera_search() throws InterruptedException 
	{

		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search.sendKeys("nikon 28-75");
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(500);

		WebElement Camera = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[16]"));
		Camera.click();

	}


}
