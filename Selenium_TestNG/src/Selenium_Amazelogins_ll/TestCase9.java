package Selenium_Amazelogins_ll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase9 extends Amaze_ll

{
	@Test(groups = {"Electronics"})
	public void Mobile_search() throws InterruptedException 
	{

		WebElement Deals = driver.findElement(By.linkText("Today's Deals"));
		Deals.click();
		
		WebElement DOD = driver.findElement(By.xpath("//*[@id=\"anonCarousel1\"]/ol/li[2]/button"));
		DOD.click();
		
		WebElement Select =driver.findElement(By.xpath("//*[@id=\"DealsGridScrollAnchor\"]/div[3]/div/div/div[2]/div/div/div/div[1]/div/a/div[1]/div/div"));
		Select.click();
	}
}
