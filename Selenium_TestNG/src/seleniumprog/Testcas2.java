package seleniumprog;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Testcas2 {
	
	@Test
	public static void AM_login() {

		
		ChromeOptions c1 = new ChromeOptions();
		c1.addArguments("--Headless");
		ChromeDriver driver = new ChromeDriver(c1);
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fgp%2Fyourstore%2Fhome%3Fpath%3D%252Fgp%252Fyourstore%252Fhome%26useRedirectOnSuccess%3D1%26signIn%3D1%26action%3Dsign-out%26ref_%3Dnav_AccountFlyout_signout&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		WebElement login = driver.findElement(By.id("ap_email"));
		login.sendKeys("9600850349");
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement PWD = driver.findElement(By.id("ap_password"));
		PWD.sendKeys("Amazon$24");
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();

	}

}
