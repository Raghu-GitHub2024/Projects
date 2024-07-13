package Launch_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Facebok_login {

	public static void main(String[] args) 
	{
			EdgeDriver Face = new EdgeDriver();
			Face.manage().window().maximize();
			Face.get("https://www.facebook.com/");
			Face.findElement(By.id("email")).sendKeys("asdfsf");
			Face.findElement(By.id("pass")).sendKeys("pwd");
			Face.findElement(By.name("login")).click();
			Face.close();
			

	}

}
