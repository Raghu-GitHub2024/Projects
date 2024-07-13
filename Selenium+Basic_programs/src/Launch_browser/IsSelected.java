package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args)
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Raghuveer/Downloads/learningHTML1.html");
		driver.manage().window().maximize();
		WebElement B_Checkbox = driver.findElement(By.id("123"));
		boolean CB = B_Checkbox.isSelected();
		if(CB==true)
		{
			System.out.println("It is selected");
		}
		else
		{
			System.out.println("It is not selected");
			//B_Checkbox.click();
			//System.out.println("It is selected now");
		}
		 


	}

}
