package ITestListener;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners1 implements ITestListener
{
	static ChromeDriver driver;
	@Override
	public void onTestStart(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		TakesScreenshot s1 = (TakesScreenshot) driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Raghuveer\\OneDrive\\Desktop\\screenshots\\PASS\\"+"ABC"+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		TakesScreenshot s1 = (TakesScreenshot) driver;
		File source = s1.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Raghuveer\\OneDrive\\Desktop\\screenshots\\FAIL\\"+"EFG"+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

}
