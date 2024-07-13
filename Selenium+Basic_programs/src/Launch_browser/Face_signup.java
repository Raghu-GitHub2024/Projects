package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Face_signup {

	public static void main(String[] args) 
	{
		EdgeDriver Face = new EdgeDriver();
		Face.manage().window().maximize();
		Face.get("https://www.facebook.com/");
		WebElement Fac = Face.findElement(By.partialLinkText("Create"));
		Fac.click();
		WebElement Fac1 = Face.findElement(By.xpath("//input[@name='firstname']"));		
		Fac1.sendKeys("ABCD");
	}

}
