package basetest;

import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
//import java.security.Timestamp;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
//import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

public class Listener extends ExtentReport implements ITestListener
{
	public void onTestFailure(ITestResult result)
	
	//this is used to take screenshot (mtlab jahan jahan fail hoga ss lega  )
	{
		
		
		System.out.println("On testfailure");  //check krne ke lie ki chlra h ya nhi method
		TakesScreenshot scrShot = (TakesScreenshot) BaseClass.driver;

		//Call getScreenshotAs method to create image file

		
        File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
        System.out.println("SrcFile : "+SrcFile);
        //Move image file to new destination
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy.HH.mm.ss");
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        String timeString = "./ScreenShots/"+formatter.format(timestamp) +"_Failed.png";
        System.out.println("To check Path : "+timeString);
        File DestFile = new File(timeString);
        System.out.println(DestFile);
        try {
			FileUtils.copyFile(SrcFile,DestFile);
		} catch (IOException e)
        {
			e.printStackTrace();
		}
        
        if (result.getStatus() == ITestResult.FAILURE) 
		{
			try {
				test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
				test.log(Status.FAIL,
						MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
				
				test.addScreenCaptureFromPath(System.getProperty("user.dir")+"/ScreenShot/"+formatter.format(timestamp) +"_Failed.png");
				 
				//test.log(Status.FAIL, (Markup) test.addScreenCaptureFromPath(System.getProperty("user.dir")+"/screenshots/"+result.getName()+" Failed"+".png"));
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

//	public void onTestSkipped(ITestResult result) {
//	}
//
//	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
//	}
//


//	public void onTestFailedWithTimeout(ITestResult result)
//	{
//			}
	
	
//
//	public void onStart(ITestContext context) 
//	{
//		test = extent.createTest(result.getMethod().getDescription());
	//}
//
//	public void onFinish(ITestContext context) {
//		// TODO Auto-generated method stub
//	}

	public void onTestStart(ITestResult result)
	{
		test = extent.createTest(result.getMethod().getDescription());
	}

	public void onTestSuccess(ITestResult result) 
	{
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			System.out.println("Successfully Executed");
			test.log(Status.PASS,"Passed test case is: "+ result.getName());
		}
	}

}
