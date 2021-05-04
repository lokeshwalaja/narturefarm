package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class OnboardingPage extends Constructor
{


	public OnboardingPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(id ="tv_language")
	private AndroidElement Language;
	 
	@AndroidFindBy(id ="btn_sign_up")
	private AndroidElement Signup;
	
	@AndroidFindBy(id ="tv_welcome_message")
	private AndroidElement WelcomeMessage;
	
	@AndroidFindBy(id ="btn_login")
	private AndroidElement Loginbutton;
	
	@AndroidFindBy(id ="back")
	private AndroidElement backbutton;
	
	 @AndroidFindBy(xpath="//*[contains(@class,'android.widget.ImageButton')]")
	 private AndroidElement BackbuttonfromLoginPage;
	 
	 @AndroidFindBy(xpath="//*[contains(@class,'android.widget.ImageButton')]")
	 private AndroidElement BackbuttoninlanguagePage;
	 
	 
public void SignupButton() throws InterruptedException 
{
	//Language.click();
	Thread.sleep(3000);
	Signup.click();
	String ExpText="Welcome to Handzap";
	
 String ActualText=WelcomeMessage.getText();
 System.out.println(ActualText);
 if (ActualText.equals(ExpText))
 {
     System.out.println("User is in Welcome Page");
 }
 else
 {
	 System.out.println("User is not in Welcome Page");
 }
 Thread.sleep(4000);

}
public void LoginButton() throws InterruptedException
{

	Thread.sleep(3000);
	Loginbutton.click();
	Thread.sleep(3000);
	BackbuttonfromLoginPage.click();
}
public void Language() throws InterruptedException
{
	Language.click();
	Thread.sleep(3000);
	BackbuttoninlanguagePage.click();
}
}