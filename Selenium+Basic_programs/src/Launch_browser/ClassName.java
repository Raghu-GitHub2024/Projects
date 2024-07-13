package Launch_browser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ClassName {

	public static void main(String[] args) throws IOException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.id("APjFqb")).sendKeys("India");
		driver.findElement(By.name("btnK")).click();
		// driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

		ClassName s1 = new ClassName(); // calling classname with reference varibale
		System.out.println(s1.getClass());

		TakesScreenshot a1 = driver;
		File source = a1.getScreenshotAs(OutputType.FILE);
		File destination;
		destination = new File("C:\\Users\\Raghuveer\\OneDrive\\Desktop\\FirstSS" + s1.getClass() + ".png");// concate
																											// the
																											// classname
																											// as the
																											// screenshot
																											// name

		FileHandler.copy(source, destination);
		driver.close();

	}

}
