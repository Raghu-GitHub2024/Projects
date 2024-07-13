package Selenium_Amazelogins_ll;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase4 extends Amaze_ll
{
	@Test(groups = {"mobile cover"})
	public void Mobile_search() throws InterruptedException 
	{

		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search.sendKeys("mobile cover");
		Search.sendKeys(Keys.ENTER);
		Thread.sleep(500);

		WebElement MobCover = driver.findElement(By.linkText("Include Out of Stock"));
		MobCover.click();

	}


}
