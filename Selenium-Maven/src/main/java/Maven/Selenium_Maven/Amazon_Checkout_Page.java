package Maven.Selenium_Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Checkout_Page {
	
	WebDriver driver;
	@FindBy(xpath = "//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input")
	WebElement usethisaddress_btn;
	
	public void usethisaddress_btn() {
		
		usethisaddress_btn.click();
	}

	public Amazon_Checkout_Page(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
}
