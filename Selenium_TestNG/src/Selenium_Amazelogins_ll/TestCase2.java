package Selenium_Amazelogins_ll;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase2 extends Amaze_ll
{
	
	@Test(groups = {"mobile"})
	public void Mobile_search() throws InterruptedException
{

	WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	Search.sendKeys("Mobile");
	Thread.sleep(2000);
	Search.sendKeys(Keys.ENTER);
	
    WebElement Mobile = driver.findElement(By.xpath("//div[@class='aok-relative']"));
    Mobile.click();
    Reporter.log("Mobile Click");

}	

}
