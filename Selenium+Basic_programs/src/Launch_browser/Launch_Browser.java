package Launch_browser;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Launch_Browser {

	public static void main(String[] args) throws IOException, InterruptedException {
	
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		driver.findElement(By.name("btnK")).click();
		//driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
		TakesScreenshot a1 = driver;
		File source = a1.getScreenshotAs(OutputType.FILE);
		//File destination=new File("C:\\Users\\Raghuveer\\OneDrive\\Desktop\\FirstSS"+Math.random()+".png");
		String timestamp = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
		File destination=new File("C:\\Users\\Raghuveer\\OneDrive\\Desktop\\FirstSS"+timestamp+".png");
		//File destination=new File("M:\\Users\\Raghuveer\\OneDrive\\Desktop\\FirstSS"+timestamp+".png");
		FileHandler.copy(source, destination);
		
		driver.close();

}
}