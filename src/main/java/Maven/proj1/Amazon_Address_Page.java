package Maven.proj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Address_Page {
	
	WebDriver driver;
	
	@FindBy(xpath = "//span[@class='break-word'][normalize-space()='Raghuveer']")
	WebElement selectAddressRadioButton;
	
	public void selectAddress() {
		selectAddressRadioButton.click();
	}
	
	@FindBy(xpath = "//input[@aria-labelledby='orderSummaryPrimaryActionBtn-announce']")
	WebElement useThisAddressButton;
	
	public void useThisAddress() {
		useThisAddressButton.click();
	}
	
	
	

	public Amazon_Address_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}



}
