package TestUtility;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Utility {
	
	//public AndroidDriver driver;
	public ExtentReports extent;
	public ExtentTest extentTest;
	
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    public static AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();
    
    @BeforeTest
    public void setUp() throws MalformedURLException 
    {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "3200d4a45e9f56bb");   // 380cb03b16057ece    //c821a998
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.handzap.handzap.global");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.handzap.handzap.ui.main.splash.SplashScreenActivity");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
        driver.setLogLevel(Level.INFO);
    }
    
    @BeforeSuite
	public void setExtent()
    {
		extent = new ExtentReports(System.getProperty("user.dir")+"/TestReport/Handzap-Test-Automaton-Report.html", true);
		extent.addSystemInfo("Host Name", "chalama Windows");
		extent.addSystemInfo("User Name", "VNC Automation Labs");
		extent.addSystemInfo("Environment", "QA");
	}
    @AfterTest
	public void endReport()
    {
		extent.flush();
		extent.close();
	}
    
    public static String getScreenshot(AndroidDriver driver, String screenshotName) throws IOException
    {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		// after execution, you could see a folder "FailedTestsScreenshots"
		// under src folder
		String destination = System.getProperty("user.dir") + "/FailedTestsScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
    
    @AfterMethod
	public void tearDown(ITestResult result) throws IOException
    {
		
		if(result.getStatus()==ITestResult.FAILURE)
		{
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getName()); //to add name in extent report
			extentTest.log(LogStatus.FAIL, "TEST CASE FAILED IS "+result.getThrowable()); //to add error/exception in extent report
			
			String screenshotPath = Utility.getScreenshot(driver, result.getName());
			extentTest.log(LogStatus.FAIL, extentTest.addScreenCapture(screenshotPath)); //to add screenshot in extent report
			// extentTest.log(LogStatus.FAIL, extentTest.addScreencast(screenshotPath)); //to add screencast/video in extent report
		}
		else if(result.getStatus()==ITestResult.SKIP)
		{
			extentTest.log(LogStatus.SKIP, "Test Case SKIPPED IS " + result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			extentTest.log(LogStatus.PASS, "Test Case PASSED IS " + result.getName());

		}
		
		extent.endTest(extentTest); //ending test and ends the current test and prepare to create html report
		//driver.quit();
		
		
    }
   
    
    @DataProvider
	public Iterator<Object[]> getTestData()
    {
		ArrayList<Object[]> testdata=TestNGUtilityLogin.getDataFromExcel();
		return testdata.iterator();
	}
	@DataProvider
	public Iterator<Object[]> PostData() 
	{
		ArrayList<Object[]> testdata=NewPostUtil.getDataFromExcel();
		return testdata.iterator();
	}
	@DataProvider
	public Iterator<Object[]> SearchData() 
	{
		ArrayList<Object[]> testdata=NewSearchUtility.getDataFromExcel();
		return testdata.iterator();
	}
		
	@DataProvider
	public Iterator<Object[]> LoginAndPost() 
	{
		ArrayList<Object[]> testdata=LoginAndPostUtil.getDataFromExcel();
		return testdata.iterator();
	}	
	@DataProvider
	public Iterator<Object[]> LoginAndSearch() 
	{
		ArrayList<Object[]> testdata=LoginAndSearchUtil.getDataFromExcel();
		return testdata.iterator();
	}
	 
	 
}