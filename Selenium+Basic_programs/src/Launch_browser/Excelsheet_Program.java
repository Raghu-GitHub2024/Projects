package Launch_browser;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excelsheet_Program {

	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream(
				"C:\\Users\\Raghuveer\\eclipse-workspace\\BasicProgram_GroTechMinds\\Selenium+Basic_programs\\TestData\\Raghu.xlsx");
		Workbook wb = WorkbookFactory.create(f1);
		Sheet s1 = wb.getSheet("login");
		Row r1 = s1.getRow(2);
		Cell c1 = r1.getCell(1);
		String value1 = c1.getStringCellValue();
		System.out.println(value1);
	}

}
