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
import org.openqa.selenium.support.ui.Select;

public class JASM_RegDDT {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("https://grotechminds.com/registeration-form/");
	//	driver.get("https://grotechminds.com/registeration-form/");
		driver.manage().window().maximize();
		
		FileInputStream c1 = new FileInputStream(
				"C:\\Users\\Raghuveer\\eclipse-workspace\\BasicProgram_GroTechMinds\\Selenium+Basic_programs\\TestData\\Raghu.xlsx");
		Workbook wb = WorkbookFactory.create(c1);
		String Firstname = wb.getSheet("JASM").getRow(1).getCell(0).getStringCellValue();
		WebElement FName = driver.findElement(By.xpath("//input[@id='firstName']"));
		FName.sendKeys(Firstname);
		
		String Lastname = wb.getSheet("JASM").getRow(1).getCell(1).getStringCellValue();
		WebElement LName = driver.findElement(By.xpath("//input[@id='lastName']"));
		LName.sendKeys(Lastname);

		String EmailID = wb.getSheet("JASM").getRow(1).getCell(2).getStringCellValue();
		WebElement Email = driver.findElement(By.xpath("//input[@id='email']"));
		Email.sendKeys(EmailID);
		
		String Phoneno = NumberToTextConverter
				.toText(wb.getSheet("JASM").getRow(1).getCell(3).getNumericCellValue());
		WebElement Pno = driver.findElement(By.xpath("//input[@id='phone']"));
		Pno.sendKeys(Phoneno);
		
		WebElement Gender = driver.findElement(By.xpath("//select[@id='gender']"));
		Select s1 = new Select(Gender);
		s1.selectByValue("male");
		
		WebElement State = driver.findElement(By.xpath("//select[@id='state']"));
		Select s2 = new Select(State);
		s2.selectByValue("tamilNadu");
		
		String Aadhaar = NumberToTextConverter
				.toText(wb.getSheet("JASM").getRow(1).getCell(4).getNumericCellValue());
		WebElement Acard = driver.findElement(By.xpath("//input[@id='aadhaar']"));
		Acard.sendKeys(Aadhaar);

		String PAN = wb.getSheet("JASM").getRow(1).getCell(5).getStringCellValue();
		WebElement Pcard = driver.findElement(By.xpath("//input[@id='pan']"));
		Pcard.sendKeys(PAN);
		
		WebElement TC = driver.findElement(By.xpath("//input[@id='terms']"));
		TC.click();
		
		driver.navigate().refresh();
		
		WebElement Register = driver.findElement(By.xpath("//button[@name='Submit']"));
		Register.click();
	}

}
