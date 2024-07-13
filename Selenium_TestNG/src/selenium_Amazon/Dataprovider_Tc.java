package selenium_Amazon;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider_Tc 
{
	@DataProvider(name="data1")
	public Object method1()
	{
		return new  Object[] [] {{"veera"}, {"raghav"},{"perumal"}, {"vishwak"}};
		
	}
	
	@DataProvider(name="data2")
	public Object method2()
	{
		return new  Object[] [] {{11}, {12},{13}, {14}};
		
	}
	
	
	/*
	  @Test(dataProvider="data1") 
	  public void Testcase1(String name)
	   {
	  System.out.println(name.concat("veer")); }
	 */

	@Test(dataProvider="data2")
	public void Testcase2(int rollno)
	{
		System.out.println(rollno+100);
	}
}
