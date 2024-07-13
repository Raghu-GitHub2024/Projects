package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flip_Auto {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		WebElement Search = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Search.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='YGcVZO _2VHNef']"));
		int count = auto.size();
		System.out.println(count);
		auto.get(0).click();
		List<WebElement>shoe = driver.findElements(By.xpath("//div[@class='gqcSqV YGE0gZ']"));
		shoe.get(0).click();
		driver.close();

	}

}
