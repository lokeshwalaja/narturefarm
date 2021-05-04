package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PrivacySettings extends Constructor

{


	public PrivacySettings(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	
	@AndroidFindBy(xpath ="//*[@contentDescription='Open navigation drawer']")
    private AndroidElement Menubar;
	
	@AndroidFindBy(id="tv_settings")
	private AndroidElement settings;
	
	@AndroidFindBy(id="tv_privacy")
	private AndroidElement Privacy;
	
	@AndroidFindBy(id="tv_language")
	private AndroidElement Language;
	
	public void Settings() throws InterruptedException
	{
		Menubar.click();
		Thread.sleep(3000);
		settings.click();
		Thread.sleep(3000);
		Privacy.click();
		Thread.sleep(3000);
		
	}
}