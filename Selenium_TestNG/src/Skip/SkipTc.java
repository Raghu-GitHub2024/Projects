package Skip;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SkipTc {
	
	@Test
	public void login() {
		
		Assert.assertTrue(false);
		
	}
	
	@Test(dependsOnMethods="login")
	public void logout() {
		
	}

}
