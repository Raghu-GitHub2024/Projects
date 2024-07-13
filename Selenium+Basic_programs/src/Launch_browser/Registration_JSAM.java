package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration_JSAM {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://grotechminds.com/registration/");		
		driver.manage().window().maximize();
		WebElement Fname = driver.findElement(By.xpath("//input[@id='fname']"));
		Fname.sendKeys("vishwak");
		Fname.sendKeys(Keys.ENTER);
		
		WebElement Lname = driver.findElement(By.id("lname"));
		Lname.sendKeys("veeraghav");
		Lname.sendKeys(Keys.ENTER);
		
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys("veer.raghuveer@gmail.com");
		Email.sendKeys(Keys.ENTER);
		
		WebElement PWD = driver.findElement(By.xpath("//input[@id='password']"));
		PWD.sendKeys("Auto123!");
		PWD.sendKeys(Keys.ENTER);
		
		WebElement Gender = driver.findElement(By.xpath("//input[@id='male']"));
		Gender.click();
		
		WebElement Skills=driver.findElement(By.id("Skills"));
		Select s1 = new Select(Skills);
		s1.selectByIndex(1);
		
		WebElement Country=driver.findElement(By.id("Country"));
		Select s2 = new Select(Country);
		s2.selectByValue("India");
		
		WebElement Paddress=driver.findElement(By.id("Present-Address"));
		Paddress.sendKeys("#4, ABCD, bangalore");
		
		WebElement Peraddress = driver.findElement(By.id("Permanent-Address"));
		Peraddress.sendKeys("#5, EFGH, Hosur");
		
		WebElement Pincode = driver.findElement(By.xpath("//input[@id='Pincode']"));
		Pincode.sendKeys("635109");
		
		WebElement Religion = driver.findElement(By.id("Relegion"));
		Select R1 = new Select(Religion);//dropdown handler
		R1.selectByValue("Hindu");
		
		WebElement Upload = driver.findElement(By.id("file"));
		Upload.sendKeys("C:\\Users\\Raghuveer\\Downloads\\e_card.pdf");//upload document 
		
		WebElement Relocate = driver.findElement(By.id("relocate"));
		Relocate.click();
		
		WebElement Submit= driver.findElement(By.xpath("//button[@name='Submit']"));
		Submit.click();
		Thread.sleep(500);
		driver.switchTo().alert().accept();//popup handler 
		
		

	}

}
