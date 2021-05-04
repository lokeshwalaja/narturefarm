package PageObjects;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Constructor 
{
	public AppiumDriver<AndroidElement> driver;
	
    public Constructor(AndroidDriver<AndroidElement> driver)
    {
    	this.driver=driver;
    	PageFactory.initElements(new AppiumFieldDecorator(driver),this);
    	
    }
   
}
