package Selenium_Amazelogins_ll;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase5 extends Amaze_ll


{

	@Test(groups = {"Electronics"})
	public void Mobile_search() throws InterruptedException 
	{

		WebElement Electronics = driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]"));
		Electronics.click();
		
		WebElement Red = driver.findElement(By.linkText("Redmi"));
		Red.click();
}
}
