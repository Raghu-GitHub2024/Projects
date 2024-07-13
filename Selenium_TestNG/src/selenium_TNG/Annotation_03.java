package selenium_TNG;

import org.testng.annotations.Test;

public class Annotation_03
{
	@Test(priority=-1)
	public void register() 
	{
		
	}
	
	@Test(priority=0, invocationCount =10)
	public void login()
	{
		
	}
	
	//@Test(enabled=false)
	@Test(priority = 1)
	public void logout()
	{
		
	}

	
}
