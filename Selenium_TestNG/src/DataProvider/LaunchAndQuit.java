package DataProvider;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchAndQuit {

	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launchFacebook(String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.manage().window().maximize();
		WebElement Signup = driver.findElement(By.linkText("Create new account"));
		Signup.click();

	}

	@AfterMethod
	@Parameters("browser")
	public void quitFacebook() {
		driver.quit();
	}
}