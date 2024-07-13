package Launch_browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_DDTReg {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement account = driver.findElement(By.xpath("//span[@class ='nav-line-2 ']"));
		Actions a1 = new Actions(driver);
		a1.moveToElement(account).perform();
		WebElement Am = driver.findElement(By.xpath("(//span[.='Sign in'])[1]"));
		Am.click();

		WebElement Register = driver.findElement(By.xpath("//span[@id='auth-create-account-link']"));
		Register.click();

		FileInputStream c1 = new FileInputStream(
				"C:\\Users\\Raghuveer\\eclipse-workspace\\BasicProgram_GroTechMinds\\Selenium+Basic_programs\\TestData\\Raghu.xlsx");
		Workbook wb = WorkbookFactory.create(c1);
		String Username = wb.getSheet("CAccount").getRow(1).getCell(0).getStringCellValue();
		WebElement Name = driver.findElement(By.xpath("//input[@id='ap_customer_name']"));
		Name.sendKeys(Username);

		String MobileNO = NumberToTextConverter
				.toText(wb.getSheet("CAccount").getRow(1).getCell(1).getNumericCellValue());
		WebElement Mobile = driver.findElement(By.xpath("//input[@id='ap_phone_number']"));
		Mobile.sendKeys(MobileNO);

		String Password = wb.getSheet("CAccount").getRow(1).getCell(2).getStringCellValue();
		WebElement Pwd = driver.findElement(By.xpath("//input[@id='ap_password']"));
		Pwd.sendKeys(Password);

	}

}
