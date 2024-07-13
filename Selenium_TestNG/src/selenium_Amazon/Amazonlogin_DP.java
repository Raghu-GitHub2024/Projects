package selenium_Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazonlogin_DP {
	@DataProvider(name = "login details")
	public Object[][] method1() {
		Object d1[][] = new Object[3][2];
		d1[0][0] = "test1@gmail.com";
		d1[0][1] = "ABCD";

		d1[1][0] = "test2@gmail.com";
		d1[1][1] = "ABCDE";

		d1[2][0] = "test3@gmail.com";
		d1[2][1] = "ABCDF";

		

		return d1;

	}

	@Test(dataProvider = "login details")
	public void launch(String un, String pwd) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement log = driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']"));
		log.click();

		WebElement login = driver.findElement(By.xpath("//input[@id=\"ap_email\"]"));
		login.sendKeys(un);

		WebElement conti = driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		conti.click();

		WebElement pwd1 = driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		pwd1.sendKeys(pwd);

		WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin.click();
		Thread.sleep(2000);
		
	}
}
