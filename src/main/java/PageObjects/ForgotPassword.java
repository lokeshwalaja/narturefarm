package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ForgotPassword  extends Constructor
{
	

	

	public ForgotPassword(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	@AndroidFindBy(id ="tv_forgot_password")
	private AndroidElement forgotpassword;
	
	@AndroidFindBy(id ="et_phone_number")
	private AndroidElement EnterMobileNumber;
	
	@AndroidFindBy(id ="action_next")
	private AndroidElement NextButton;
	
	@AndroidFindBy(id ="otp_view")
	private AndroidElement EnterOTP;
	
	@AndroidFindBy(id ="action_next")
	private AndroidElement NextButtonAfterEnteringOTP;
	public void Forgotpassword() throws InterruptedException 
	{
		forgotpassword.click();
		Thread.sleep(3000);
		EnterMobileNumber.sendKeys("");
		Thread.sleep(3000);
		NextButton.click();
		Thread.sleep(3000);
		OTPPage otp=new OTPPage();
		otp.enterotp();
		System.out.println(otp.getOTPvalue());
		Thread.sleep(3000);
		EnterOTP.sendKeys(otp.getOTPvalue());
		
		Thread.sleep(3000);
		NextButtonAfterEnteringOTP.click();
		
	}
	
}