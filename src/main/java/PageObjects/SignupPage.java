package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SignupPage extends Constructor 
{
	
	
	 public SignupPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	@AndroidFindBy(xpath="//*[contains(@class,'android.widget.ImageButton')]")
	 private AndroidElement BackbuttoninCreateAccount;
	 
	 @AndroidFindBy(id ="tv_number")
		private AndroidElement Phonenumber;

	@AndroidFindBy(id ="btn_sign_up")
	private AndroidElement Signup;
	
	@AndroidFindBy(id ="btn_action_create_account")
	private AndroidElement CreateAccount;
	
	@AndroidFindBy(id ="et_phone_number")
	private AndroidElement PhoneNumber;
	
	@AndroidFindBy(id ="et_name")
	private AndroidElement FullName;
	
	@AndroidFindBy(id ="et_password")
	private AndroidElement CreatePassword;
	
	@AndroidFindBy(id ="action_next")
	private AndroidElement NextButton;
	
	@AndroidFindBy(id ="otp_view")
	private AndroidElement OTP;
	
	@AndroidFindBy(id ="action_next")
	private AndroidElement NextButtonafterOTP;
	
	@AndroidFindBy(id ="tv_error")
	private AndroidElement ErrorMessage;
	
	 public void UserSignUp() throws InterruptedException
	 {
		BackbuttoninCreateAccount.click();
		 /*Thread.sleep(3000);
		 Signup.click();
		 Thread.sleep(2000);
		 CreateAccount.click();
		 Thread.sleep(2000);
		 Signup.click();*/
		 Thread.sleep(2000);
		 CreateAccount.click();
		 Thread.sleep(2000);
		 PhoneNumber.sendKeys("6304337562");
		 Thread.sleep(2000);
		 FullName.sendKeys("chalama");
		 Thread.sleep(2000);
		 CreatePassword.sendKeys("123456");
		 Thread.sleep(2000);
		 NextButton.click();
	 }
		 public void OTPvalue() throws InterruptedException
		 {
		 OTPPage otp=new OTPPage();
		 otp.enterotp();
		 Thread.sleep(2000);
		 System.out.println(otp.getOTPvalue());
		 OTP.sendKeys(otp.getOTPvalue());
		 Thread.sleep(3000);
		 otp.closechromedriver();
		 Thread.sleep(3000);
		 NextButtonafterOTP.click();
		 
		 Thread.sleep(3000);
	 }
		 public void validatephonenumber() throws InterruptedException
		 {
			 Thread.sleep(3000);
			String mobilenumber= Phonenumber.getText();
			
			 System.out.println(mobilenumber);
			 
		 }
		 public void clearOtp()
		 {
			 OTP.clear();
		 }
		 public void enterinvalidOtp() throws InterruptedException
		 {
			 OTP.sendKeys("123456");

			 Thread.sleep(3000);
			 NextButtonafterOTP.click();
			System.out.println( ErrorMessage.getText());
			 
			 
		 }
	
}