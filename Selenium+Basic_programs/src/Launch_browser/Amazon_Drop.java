package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Drop {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement Drop = driver.findElement(By.id("searchDropdownBox"));

		Select D1 = new Select(Drop);
		D1.selectByValue("search-alias=stripbooks");

		WebElement Drop1 = driver.findElement(By.id("searchDropdownBox"));

		Select D2 = new Select(Drop1);
		D2.selectByVisibleText("Appliances");

		WebElement Drop2 = driver.findElement(By.id("searchDropdownBox"));

		Select D3 = new Select(Drop2);
		D3.selectByIndex(19);

	}

}
