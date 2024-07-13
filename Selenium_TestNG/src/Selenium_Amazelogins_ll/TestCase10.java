package Selenium_Amazelogins_ll;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase10 extends Amaze_ll
{
	@Test(groups = {"Shoe"})
	public void shoe_search() throws InterruptedException
{

	WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	Search.sendKeys("Shoe");
	Thread.sleep(2000);
	List<WebElement> auto = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	int count = auto.size();
	System.out.println(count);
	auto.get(0).click();
	driver.navigate().back();


}
}