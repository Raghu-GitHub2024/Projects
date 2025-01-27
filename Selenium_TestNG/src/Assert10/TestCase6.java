package Assert10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestCase6 extends LaunchAndQuit {

	@Test
	public void assertSelectRedmi() {
		
		WebElement electronicsMajorTab = driver.findElement(By.xpath("(//a[@tabindex='0'])[12]"));
		electronicsMajorTab.click();
		
		WebElement selectRedmi = driver.findElement(By.xpath("(//div[@class='sl-sobe-carousel-sub-card-image'])[54]"));
		selectRedmi.click();
		
		WebElement result = driver.findElement(By.xpath("//span[@class='a-size-medium-plus a-color-base a-text-bold']"));
		
		Assert.assertEquals(result.isDisplayed(), true,"Test case 6 failed!");
	}
}