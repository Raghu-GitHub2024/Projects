package Amaze_DProvider;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TimeOut {
	
	@Test(timeOut=9000)
	public void TestCase1()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.in/");
		driver.manage().window().maximize();
	}

}
