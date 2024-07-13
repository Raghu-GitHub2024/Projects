
package DataProvider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Face_DataP extends LaunchAndQuit
	{	
		@DataProvider(name="Register")
		public Object[][] method1()

		{
			Object d1[][] = new Object[4][4];
			d1[0][0]="raghu";
			d1[0][1]="veer";
			d1[0][2]="7454865445";
			d1[0][3]="password";
		
			
			
			d1[1][0]="laxman";
			d1[1][1]="murhty";
			d1[1][2]="7454865455";
			d1[1][3]="password";
			
			d1[2][0]="Anand";
			d1[2][1]="kumar";
			d1[2][2]="7454865465";
			d1[2][3]="password";
			
			d1[3][0]="Sri";
			d1[3][1]="ram";
			d1[3][2]="7454865475";
			d1[3][3]="password";
			return d1;
			
		}

		
		@Test(dataProvider="Register")
		public void testcase1(String Fname, String Lname, String Mob, String Pwd )
		{
			
			
			WebElement Fname1 = driver.findElement(By.name("firstname"));
			Fname1.sendKeys(Fname);
			
			WebElement Lname1 = driver.findElement(By.name("lastname"));
			Lname1.sendKeys(Lname);
			
			WebElement Mob1 = driver.findElement(By.name("reg_email__"));
			Mob1.sendKeys(Mob);
			
			WebElement Pwd1 = driver.findElement(By.name("reg_passwd__"));
			Pwd1.sendKeys(Pwd);
			
			WebElement day=		driver.findElement(By.id("day"));
			Select s1=new Select(day);
			s1.selectByValue("22");
			
			WebElement month=		driver.findElement(By.id("month"));
			Select s2=new Select(month);
			s2.selectByValue("8");
			
			WebElement year=		driver.findElement(By.id("year"));
			Select s3=new Select(year);
			s3.selectByValue("2000");
			
			WebElement Gender = driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
			Gender.click();
			
			
		}


}
