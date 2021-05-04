package PageObjects;

import TestUtility.TestNGUtilityLogin;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Login extends Constructor
{

	public Login(AndroidDriver<AndroidElement> driver) 
	{
		super(driver);
		
	}

	@AndroidFindBy(xpath="//*[@text='Log In']")
	private AndroidElement lg;
	@AndroidFindBy(id="et_phone_number")
	private AndroidElement ph;
	@AndroidFindBy(id="et_password")
	private AndroidElement pas;
	@AndroidFindBy(id="action_next")
	private AndroidElement nxt;
	@AndroidFindBy(xpath="action_next")
	private AndroidElement otpview;
	
	//*[@id='otp_view']
	
	@AndroidFindBy(xpath="//*[text()='Log In']")
	private AndroidElement LogIn;
	
	@AndroidFindBy(xpath="//*[text()='Next']")
	private AndroidElement OTPNXT;
	
	@AndroidFindBy(xpath="//*[@contentDescription='Open navigation drawer']")
	private AndroidElement MenuOptions;
	
	@AndroidFindBy(xpath="//*[@id='tv_user_name']")
	private AndroidElement username;
	
	@AndroidFindBy(xpath="//*[text()='Log Out']")
	private AndroidElement Logout;

	@AndroidFindBy(xpath="//*[text()='LOG OUT']")
	private AndroidElement Logedout;



public void login(String Phonenumber,String Password) throws Exception 
{
	TestNGUtilityLogin tg=new TestNGUtilityLogin();
	tg.getDataFromExcel();
	OTPPage page=new OTPPage();
	//page.enterotp();
	lg.click();
	Thread.sleep(2000);
	ph.sendKeys(Phonenumber);
	pas.sendKeys(Password);
	nxt.click();
	Thread.sleep(8000);
	//page.enterotp();
	//page.getOTPvalue();
	//page.enterotp();
	//OTPNXT.click();
}
public void logout() throws InterruptedException
{
	MenuOptions.click();
	username.click();
	Logout.click();
	Logedout.click();
	Thread.sleep(5000);
	LogIn.click();

}    
}