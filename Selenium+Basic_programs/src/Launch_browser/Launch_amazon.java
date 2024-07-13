package Launch_browser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_amazon {

	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
	
		
		

	}

}
