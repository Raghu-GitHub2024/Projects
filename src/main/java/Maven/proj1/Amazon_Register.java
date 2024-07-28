package Maven.proj1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Register 
{
	WebDriver driver;
	
	@FindBy(id ="createAccountSubmit")
	public WebElement CreateAcc;
	
	@FindBy(id = "ap_customer_name")
	WebElement Cname;
	
	
	@FindBy(id = "ap_phone_number")
	WebElement Phno;
	
	@FindBy(id = "ap_password")
	WebElement PWD;
	
	
	@FindBy(id = "continue")
	WebElement VMob_no;
	
	@FindBy(linkText="Start Puzzle")
	public WebElement puzzle;
	
	@FindBy(id="auth-pv-enter-code")
	WebElement OTP;
	
	public void CreateAccount() {
		
		CreateAcc.click();
	}
	
	public void Cust_Name() {
		Cname.sendKeys("Raghu");
	}
	
	public void PhoneNo() {
		Phno.sendKeys("960850300");
	}
	
	public void password() {
		PWD.sendKeys("Raghu07");
	}
		
	public void Continue() {
		
		VMob_no.click();
		
	}
	
	public void OTP() {
		OTP.sendKeys("1234");
	}
	
	public void puzzle() {
		puzzle.click();
	}
public Amazon_Register(WebDriver driver) 
{
		
		PageFactory.initElements(driver, this);
	}

	

}
