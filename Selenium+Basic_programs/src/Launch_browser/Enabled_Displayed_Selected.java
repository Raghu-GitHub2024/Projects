package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Enabled_Displayed_Selected {

	public static void main(String[] args) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://google.co.in/");
		driver.manage().window().maximize();
		//WebElement search_tf = driver.findElement(By.name("q"));
		WebElement search_tf = driver.findElement(By.cssSelector("#APjFqb"));//Css selector
		if(search_tf.isDisplayed() && search_tf.isEnabled())
		{
			search_tf.sendKeys("india");
			Thread.sleep(2000);
		}
		List<WebElement> auto_suggestion = driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		int count = auto_suggestion.size();
		System.out.println(count);
		auto_suggestion.get(4).click();
		

	}

}
