package Maven.Selenium_Maven_Proj1;

import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import Maven.Selenium_Maven.Amazon_SearchResult_Page;
import Maven.proj1.Amazon_Address_Page;
import Maven.proj1.Amazon_Cart;
import Maven.proj1.Amazon_Correct_login;
import Maven.proj1.Amazon_PaymentMethods_Page;
import Maven.proj1.Amazon_Shoe_Search;


@Test
public class TestCase12 {
	
	
	
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


		Amazon_Shoe_Search  a2 = new Amazon_Shoe_Search (driver);
		a2.Search();
		
		Amazon_SearchResult_Page a3 = new Amazon_SearchResult_Page(driver);
		a3.firstprod_click();
		

		Set<String> windowHandles = driver.getWindowHandles();
		Iterator<String> iterator = windowHandles.iterator();
		String parentId = iterator.next();
		String childId = iterator.next();
		driver.switchTo().window(childId);

		Amazon_Cart productPage = new Amazon_Cart(driver);
		productPage.addToCart();
		productPage.gotocart();

		productPage.selectQuantityFromDropdown();
		productPage.proceedToCheckOut();

		Amazon_Address_Page addressPage = new Amazon_Address_Page(driver);
		addressPage.selectAddress();
		addressPage.useThisAddress();
	
	
		Amazon_PaymentMethods_Page paymentPage = new Amazon_PaymentMethods_Page(driver);
		paymentPage.selectSBICard();
		paymentPage.selectPayment();
		paymentPage.selectNetBanking();
		paymentPage.selectOtherUPIApps();
		paymentPage.selectEmiOption();
		paymentPage.selectCodOption();

		Assert.assertEquals(paymentPage.assertTc12(), true, "Test case 12 failed");

	}
}