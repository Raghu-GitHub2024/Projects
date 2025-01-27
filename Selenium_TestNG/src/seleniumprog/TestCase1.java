package seleniumprog;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1 {
	@Test
	public static void login_Amazon() throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement Search = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")); //
		Search.sendKeys("Shoe");
		Thread.sleep(2000);
		List<WebElement> auto = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
		int count = auto.size();
		System.out.println(count);
		auto.get(0).click();
		List<WebElement> shoe = driver.findElements(By.xpath("(//a[@class='a-link-normal s-no-outline'])[1]"));
		shoe.get(0).click();
		Set<String> s1 = driver.getWindowHandles();

		System.out.println(s1);
		Iterator<String> pid = s1.iterator();
		String parentid = pid.next();
		String childid = pid.next();
		System.out.println(parentid);
		System.out.println(childid);
		driver.switchTo().window(childid);

		WebElement Wishlist = driver.findElement(By.id("wishListMainButton"));
		Wishlist.click();
		WebElement login = driver.findElement(By.id("ap_email")); //
		login.sendKeys("9600850349");
		WebElement cont = driver.findElement(By.id("continue"));
		cont.click();
		WebElement PWD = driver.findElement(By.id("ap_password"));
		PWD.sendKeys("Amazon$24");
		WebElement signin = driver.findElement(By.id("signInSubmit"));
		signin.click();
		Thread.sleep(2000);
		WebElement Cart = driver.findElement(By.id("add-to-cart-button"));
		Cart.click();
		WebElement Buy = driver.findElement(By.xpath("//input[@name='proceedToRetailCheckout']"));
		Buy.click();
	}
}
