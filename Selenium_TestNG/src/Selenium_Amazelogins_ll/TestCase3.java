package Selenium_Amazelogins_ll;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase3 extends Amaze_ll {

	@Test(groups = {"mouse"})
	public void Mobile_search() throws InterruptedException 
	{

		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search.sendKeys("mouse");
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(500);

		WebElement Mouse = driver.findElement(By.xpath("//*[@id=\"p_90/20912642031\"]/span/a/span"));
		Mouse.click();

	}

}
