package Selenium_Amazelogins_ll;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class Amaze_ll {
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")

	public void testcase1(String nameofbrowser) {
		if (nameofbrowser.equals("chrome")) {
			driver = new ChromeDriver();
		}
		/*
		 * if (nameofbrowser.equals("edge")) { driver = new EdgeDriver(); }
		 */
		// driver = new Driver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.manage().window().maximize();

	}

	@AfterMethod
	@Parameters("browser")

	public void Close(String nameofbrowser) {

		driver.quit();

	}
}
