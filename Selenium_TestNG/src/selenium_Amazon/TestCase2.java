package selenium_Amazon;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchQuit
{
	@Test
	public void Addcart() throws InterruptedException 

{
		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search.sendKeys("Shoe");
		
		WebElement Search1 = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Search1.click();
				
		WebElement Select = driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/span/div/div/div[1]/div/span/a/div/img"));
		Select.click();
		Thread.sleep(1000);
		
		Set<String> s1 = driver.getWindowHandles();
		System.out.println(s1);
		Iterator<String> pid =s1.iterator();
		String parentid =pid.next();
		String childid =pid.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid); 
		Thread.sleep(500);
		
		
	
		WebElement Wishlist = driver.findElement(By.xpath("//input[@id='add-to-wishlist-button-submit']"));	
		Wishlist.click();
		Thread.sleep(2000);
		
		WebElement view = driver.findElement(By.linkText("View Your List"));
		view.click();
		Thread.sleep(2000);
	
		WebElement Addcart = driver.findElement(By.linkText("Add to Cart"));
		Addcart.click();
}
}
