package Amaze_DProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase1 extends AmazeLaunchAndQuit
{

	@DataProvider(name="Create")
	public Object[][] method1()

	{
		Object d1[][] = new Object[5][3];
		d1[0][0]="raghu";
		d1[0][1]="7454865445";
		d1[0][2]="password";
		
			
		d1[1][0]="laxman";
		d1[1][1]="7454865445";
		d1[1][2]="password";
		
		d1[2][0]="Anand";
		d1[2][1]="7454865445";
		d1[2][2]="password";
		
		d1[3][0]="Sri";
		d1[3][1]="7454865445";
		d1[3][2]="password";
		
		d1[4][0]="Sri";
		d1[4][1]="7454865445";
		d1[4][2]="password";
		
		
		
		return d1;
		
	}

	
	@Test(dataProvider="Create")
	public void testcase1(String Fname, String Mob, String Pwd )
	{		
		WebElement Fname1 = driver.findElement(By.name("customerName"));
		Fname1.sendKeys(Fname);

		WebElement Mob1 = driver.findElement(By.name("email"));
		Mob1.sendKeys(Mob);
		
		WebElement Pwd1 = driver.findElement(By.name("password"));
		Pwd1.sendKeys(Pwd);
		
	}
}
