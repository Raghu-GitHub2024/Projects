package Maven.proj1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_PaymentMethods_Page {

	WebDriver driver;

	@FindBy(xpath = "//span[normalize-space()='Credit or debit card']")
	WebElement selectPaymentRadioButton;

	
	@FindBy(xpath = "(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")
	WebElement enterCardDetailLink;
	

	@FindBy(name = "ApxSecureIframe")
	WebElement iFrame;
	
	
	@FindBy(name = "addCreditCardNumber")
	WebElement cardNumber;

	
	@FindBy(name = "ppw-expirationDate_month")
	WebElement selectExpiryMonth;
	
	@FindBy(name = "ppw-expirationDate_year")
	WebElement selectExpiryYear;


	@FindBy(name = "ppw-widgetEvent:AddCreditCardEvent")
	WebElement enterButton;
	
	
	@FindBy(xpath = "//input[@name='addCreditCardVerificationNumber2']")
	WebElement cvvNumber;
	
	
	@FindBy(xpath = "//span[normalize-space()='State Bank of India Debit Card']")
	WebElement sbiCard;
	
	@FindBy(xpath = "//span[normalize-space()='Visa']")
	WebElement indusIndCard;

	@FindBy(xpath = "//span[@class='a-text-bold'][normalize-space()='Net Banking']")
	WebElement netBanking;

	@FindBy(xpath = "//span[normalize-space()='Other UPI Apps']")
	WebElement otherUPIApps;
		

	@FindBy(xpath = "//span[@class='a-text-bold'][normalize-space()='EMI']")
	WebElement emiOption;

	
	@FindBy(xpath = "(//div[@class='a-fixed-left-grid-inner']/div[@class='a-fixed-left-grid-col a-col-left'])[10]")
	WebElement codOption;
	
	@FindBy(xpath = "//input[@placeholder='Enter Code']")
	WebElement coupunCode;
	
	@FindBy(xpath = "//h1[normalize-space()='Checkout']")
	WebElement checkoutTextMsg;


	public void selectPayment() {
		selectPaymentRadioButton.click();
	}


	public void enterCardDetail() {
		enterCardDetailLink.click();
	}


	public void switchToIframe(WebDriver driver) {
		driver.switchTo().frame(iFrame);
	}


	public void enterCardNumber() {
		cardNumber.sendKeys("5305620224857900");
	}

	

	public void expiryMonth() {
		Select selectDate = new Select(selectExpiryMonth);
		selectDate.selectByValue("11");
	}


	public void expiryYear() {
		Select selectYear = new Select(selectExpiryYear);
		selectYear.selectByValue("2035");
	}


	public void saveCardDetails() {
		enterButton.click();
	}


	public void enterCvvNumber() {
		cvvNumber.sendKeys("111");
	}
	
	

	public void selectSBICard() {
		sbiCard.click();
	}
	
	

	public void selectNetBanking() {
		netBanking.click();
	}
	
	

	public void selectOtherUPIApps() {
		otherUPIApps.click();
	}
	
	public void selectEmiOption() {
		emiOption.click();
	}
	
	
	public void selectCodOption() {
		codOption.click();
	}
	
	
	public void enterCoupunCode() {
		coupunCode.sendKeys("coupun 20",Keys.ENTER);
	}
	

	public boolean assertTc12() {
		return checkoutTextMsg.isDisplayed();
	}
	
	public boolean assertTc13() {
		return checkoutTextMsg.isDisplayed();
	}
	
	
	
	
	public Amazon_PaymentMethods_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);

	}

}
