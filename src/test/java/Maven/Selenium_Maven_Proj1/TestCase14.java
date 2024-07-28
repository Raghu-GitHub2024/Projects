package Maven.Selenium_Maven_Proj1;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Maven.proj1.Amazon_Correct_login;
import Maven.proj1.Amazon_Order_Page;
import Maven.proj1.Amazon_Shoe_Search;


@Test
public class TestCase14 {
	
	
	public void checkoutProcess() throws InterruptedException, IOException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_custrec_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		Amazon_Correct_login a1 = new Amazon_Correct_login(driver);
		a1.Mobileno();
		a1.Continue_click();
		a1.password();
		a1.Signin();

		
		Amazon_Shoe_Search homePage = new Amazon_Shoe_Search(driver);
		homePage.returnsAndOrders();
		
		Amazon_Order_Page ordersPage = new Amazon_Order_Page(driver);
		ordersPage.orderPalcedDate();
		ordersPage.productReview();
		Thread.sleep(800);
		ordersPage.rateFiveStar();
		Thread.sleep(1000);
		ordersPage.clearRating();
		
		Assert.assertEquals(ordersPage.assertTC14(), true, "Test case 14 failed");

	}	
}
