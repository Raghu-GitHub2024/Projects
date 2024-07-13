package Launch_browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_DDTlogin {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		WebElement account = driver.findElement(By.xpath("//span[@class ='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(account).perform();
		WebElement Am = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		Am.click();

		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Raghuveer\\eclipse-workspace\\BasicProgram_GroTechMinds\\Selenium+Basic_programs\\TestData\\Raghu.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		String Username = wb.getSheet("Amazon").getRow(1).getCell(0).getStringCellValue();
		// System.out.println(Username);
		WebElement Login = driver.findElement(By.xpath("//input[@id='ap_email']"));
		Login.sendKeys(Username);
		WebElement cont = driver.findElement(By.xpath("//span[@id='continue']"));
		cont.click();

		String Password = wb.getSheet("Amazon").getRow(1).getCell(1).getStringCellValue();
		WebElement pwd = driver.findElement(By.xpath("//input[@id='ap_password']"));
		pwd.sendKeys(Password);
		WebElement signin = driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		signin.click();

	}

}
