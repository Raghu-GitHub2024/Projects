package Launch_browser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri_Auto {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gclid=EAIaIQobChMI3Miv8srHhgMVXTiDAx1CHyvhEAAYASAAEgLxkPD_BwE&gclsrc=aw.ds");
		driver.manage().window().maximize();
		WebElement search = driver.findElement(By.xpath("//span[.='Google']"));
		search.click();
		Thread.sleep(2000);
		Set<String> id = driver.getWindowHandles();
		Iterator<String> id1 = id.iterator();
		String pid=  id1.next();
		String cid= id1.next();
		
		driver.switchTo().window(cid);
		driver.close();
		
	}

}
