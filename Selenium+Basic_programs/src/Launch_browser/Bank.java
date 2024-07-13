package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bank {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		WebElement login = driver.findElement(By.className("login_button"));
		login.click();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("ABC");
		WebElement pwd = driver.findElement(By.name("password"));
		pwd.sendKeys("pwd@123");
		WebElement captcha = driver.findElement(By.name("loginCaptchaValue"));
		captcha.sendKeys("captcha");
		
	}

}
