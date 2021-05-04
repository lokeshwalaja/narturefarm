package Handzap.TestCases;

import java.io.IOException;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import TestUtility.Utility;
import PageObjects.LoginAndSearch;

public class LoginandPost extends Utility {
	
	

	@Test(dataProvider="LoginAndPost",priority=1)
	public void Post(String mobile, String password, String title, String desc, String budg, String loc ) throws Exception {
	
		PageObjects.LoginAndPost lnp=new PageObjects.LoginAndPost(driver);
		lnp.loginpost(mobile, password, title, desc, budg, loc);
	
	}
	@AfterMethod
	public void logout() throws Exception {
			LoginAndSearch ls=new LoginAndSearch(driver);
			ls.logout();
	}
	
	/*@AfterMethod
	
	public void getResult(ITestResult result) throws IOException{
		 if(result.getStatus() == ITestResult.FAILURE){
		 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getName());
		 logger.log(LogStatus.FAIL, "Test Case Failed is "+result.getThrowable());
		 //To capture screenshot path and store the path of the screenshot in the string "screenshotPath"
		    //We do pass the path captured by this mehtod in to the extent reports using "logger.addScreenCapture" method. 
		   String screenshotPath = ExtentReportsClass.getScreenshot(driver, result.getName());
		 //To add it in the extent report 
		 logger.log(LogStatus.FAIL, logger.addScreenCapture(screenshotPath));
		 }else if(result.getStatus() == ITestResult.SKIP){
		 logger.log(LogStatus.SKIP, "Test Case Skipped is "+result.getName());
		 }
		 // ending test
		 //endTest(logger) : It ends the current test and prepares to create HTML report
		 extent.endTest(logger);
		 }*/
}
