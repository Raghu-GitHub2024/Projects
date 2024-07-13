package Assert10;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase2 extends LaunchAndQuit{

	@Test
	public void assertSearchMobile() {
		WebElement searchItem = driver.findElement(By.id("twotabsearchtextbox"));
		searchItem.sendKeys("mobile");
		searchItem.sendKeys(Keys.ENTER);

		WebElement selectItem = driver
				.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		selectItem.click();

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> parentChildId = windowHandles.iterator();

		String parentId = parentChildId.next();
		String childId = parentChildId.next();

		driver.switchTo().window(childId);

		WebElement addToCart = driver.findElement(By.xpath("(//input[@id= 'add-to-cart-button'])[2]"));

		Assert.assertEquals(addToCart.isDisplayed(), true, "Test case 2 failed!");

	}
}