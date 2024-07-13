package Launch_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Apollo_AutoSelect {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.apollopharmacy.in/");
		driver.manage().window().maximize();
		WebElement Search = driver.findElement(By.xpath("//input[@id='searchProduct']"));
		Search.sendKeys("Diclo");
		Thread.sleep(2000);
		List<WebElement> auto = driver.findElements(By.xpath("//ul[@id=\"random\"]/li"));
		int count = auto.size();
		System.out.println(count);
		auto.get(3).click();
		
	
		

	}

}
