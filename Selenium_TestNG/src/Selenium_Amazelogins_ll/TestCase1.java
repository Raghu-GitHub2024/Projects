package Selenium_Amazelogins_ll;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase1 extends Amaze_ll

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
	List<WebElement>shoe = driver.findElements(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
	shoe.get(0).click();

	Set<String> s1 = driver.getWindowHandles();
	//System.out.println(s1);
	Iterator<String> pid =s1.iterator();
	String parentid =pid.next();
	String childid =pid.next();
	//System.out.println(parentid);
	//System.out.println(childid);
	driver.switchTo().window(childid); 
	Thread.sleep(2000);

	
}	
}
