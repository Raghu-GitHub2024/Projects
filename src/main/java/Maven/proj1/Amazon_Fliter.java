package Maven.proj1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Fliter 
{
	WebDriver driver;

		@FindBy(linkText = "Men's Sneakers")
		WebElement mensSneakerCategory;
		
		public void selectCategory()
		{
			mensSneakerCategory.click();
		}
		
		@FindBy(xpath = "//span[@class='a-dropdown-prompt']")
		WebElement sortbyfeature;
		
		public void sortbyfeature() 
		{
			sortbyfeature.click();
		}
		
		
		@FindBy(id = "s-result-sort-select_1")
		public WebElement  lowhighsort;
		
		public void lowhighsort() {
			lowhighsort.sendKeys(Keys.ARROW_DOWN);
			lowhighsort.click();
		}
		
		
		
			
		
		public Amazon_Fliter(WebDriver driver)
		{
		PageFactory.initElements(driver, this);
		
		}

}
