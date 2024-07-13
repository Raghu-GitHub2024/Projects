package Launch_browser; 	

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Face {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.manage().window().maximize();
		WebElement day=		driver.findElement(By.id("day"));
			
		Select s1=new Select(day);
		s1.selectByValue("22");
		WebElement month=		driver.findElement(By.id("month"));
		Select s2=new Select(month);
		s2.selectByValue("8");
		WebElement year=		driver.findElement(By.id("year"));
		Select s3=new Select(year);
		s3.selectByValue("2000");
	
	}

}
