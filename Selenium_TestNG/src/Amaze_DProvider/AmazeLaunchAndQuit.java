package Amaze_DProvider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class AmazeLaunchAndQuit {
	WebDriver driver;

	@BeforeMethod
	@Parameters("browser")
	public void launchAmazon(String browserName) {
		if (browserName.equals("chrome")) {
			driver = new ChromeDriver();
		}
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F_encoding%3DUTF8%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
		driver.manage().window().maximize();
		WebElement Signup = driver.findElement(By.id("createAccountSubmit"));
		Signup.click();

	}

	@AfterMethod
	@Parameters("browser")
	public void quitAmazon() {
		driver.quit();
	}

}



	
