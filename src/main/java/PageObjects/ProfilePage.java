package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ProfilePage extends Constructor
{
	
	
	 public ProfilePage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	/*@AndroidFindBy(xpath="//*[contains(@class,'androidx.appcompat.widget.AppCompatImageButton')]")
     private AndroidElement Menubar;*/
	 @AndroidFindBy(xpath ="//*[@contentDescription='Open navigation drawer']")
	 private AndroidElement Menubar;

	@AndroidFindBy(id ="tv_user_name")
	 private AndroidElement UserName;	
	
	@AndroidFindBy(id ="tv_name_update")
	 private AndroidElement UpdateUserName;
	
	@AndroidFindBy(id ="et_title")
	private AndroidElement ClearExistingUserName; 
	
	@AndroidFindBy(id ="et_title")
	private AndroidElement EnterUpdateUserName;
	
	@AndroidFindBy(id ="action_save")
	private AndroidElement SaveUserName;
	
	@AndroidFindBy(id ="tv_email_update")
	private AndroidElement AddEmail;
	
	@AndroidFindBy(id ="tv_email_update")
	private AndroidElement EnterEmail;
	
	@AndroidFindBy(id ="action_save")
	private AndroidElement SaveEmail;
	
	@AndroidFindBy(id ="switch_two_step_verify")
	private AndroidElement OnTwoStepVerification;
	
	@AndroidFindBy(id ="iv_user_profile")
	private AndroidElement ProfilePic;
	
	@AndroidFindBy(id ="action_edit")
	private AndroidElement Edit;
	
	@AndroidFindBy(xpath ="//*[text()='Delete Photo']")
    private AndroidElement DeletePhoto;
	
	@AndroidFindBy(id ="view_password")
	private AndroidElement Updatepassword;
	
	@AndroidFindBy(id ="et_current_password")
	private AndroidElement EnterCurrentPassword;
	
	@AndroidFindBy(id ="et_new_password")
	private AndroidElement EnterNewPassword;
	
	@AndroidFindBy(id ="et_confirm_password")
	private AndroidElement ConfirmPassword;
	
	@AndroidFindBy(id ="action_next")
	private AndroidElement NextButton;
	
	@AndroidFindBy(id ="tv_name_message")
	private AndroidElement ErrorMessageforName;
	
	public void UpdateNamewithInValidData() throws InterruptedException
	{
		Menubar.click();
		Thread.sleep(3000);
		UserName.click();
		Thread.sleep(3000);
		UpdateUserName.click();
		Thread.sleep(3000);
		ClearExistingUserName.clear();
		Thread.sleep(3000);
		EnterUpdateUserName.sendKeys("123456");
		Thread.sleep(3000);
		System.out.println(ErrorMessageforName.getText());
		Thread.sleep(2000);
		
	}
	 
	public void UpdateNamewithValidData() throws InterruptedException
	{
		/*Menubar.click();
		Thread.sleep(3000);
		UserName.click();
		Thread.sleep(3000);
		UpdateUserName.click();*/
		Thread.sleep(3000);
		ClearExistingUserName.clear();
		Thread.sleep(3000);
		EnterUpdateUserName.sendKeys("Keshav Kumar");
		Thread.sleep(3000);
		SaveUserName.click();
		Thread.sleep(1000);
		
		
	}
	public void AddEmailwithValidData() throws InterruptedException
	{
		Thread.sleep(2000);
		Entermail.clear();
		Thread.sleep(2000);
		Entermail.click();
		Thread.sleep(3000);
		Entermail.sendKeys("keshav.meghanath@vncdigital.com");
		Thread.sleep(3000);
		SaveEmail.click();
		Thread.sleep(2000);
	}
	
	@AndroidFindBy(id ="view_email")
	private AndroidElement Email;
	
	@AndroidFindBy(id ="tv_email_message")
	private AndroidElement ErrorMessageforEmail;
	@AndroidFindBy(id ="et_email")
	private AndroidElement Entermail;
	
	public void AddEmailwithInValidData() throws InterruptedException
	{
		Thread.sleep(2000);
		Email.click();
		Thread.sleep(3000);
		Entermail.clear();
		Thread.sleep(3000);
		Entermail.sendKeys("keshav.meghanathvncdigital.com");
		Thread.sleep(3000);
		System.out.println(ErrorMessageforEmail.getText());
		
	}
	public void turnOntwoStepVerification() throws InterruptedException
	{
		Thread.sleep(2000);
		OnTwoStepVerification.click();
		Thread.sleep(3000);
		Navigate.click();
		Thread.sleep(2000);
		
	}

	@AndroidFindBy(id ="otp_view")
	private AndroidElement OTP;
	
	@AndroidFindBy(id ="action_next")
	private AndroidElement NextButtonafterOTP;
	
	@AndroidFindBy(id ="tv_confirm_password_message_update")
	private AndroidElement errormessageforincorrectpasswords;
	
	 @AndroidFindBy(xpath="//*[contains(@class,'android.widget.ImageButton')]")
	 private AndroidElement BackbuttoninUpdatePassword;
	 @AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
	 private AndroidElement Navigate;  
	public void DifferentPasswords() throws InterruptedException
	{
		Thread.sleep(1000);
		Updatepassword.click();
		Thread.sleep(3000);
		EnterCurrentPassword.sendKeys("123456");
		Thread.sleep(3000);
		EnterNewPassword.sendKeys("Vnc@2019");
		Thread.sleep(3000);
		ConfirmPassword.sendKeys("Vnc@2018");
		
		Thread.sleep(3000);
		NextButton.click();
		Thread.sleep(1000);
		System.out.println(errormessageforincorrectpasswords.getText());
		Thread.sleep(2000);
		Navigate.click();
		
	}
	public void UpdatePasswordwithInvalidOTP() throws InterruptedException
	{
		Thread.sleep(2000);
		Updatepassword.click();
		Thread.sleep(3000);
		EnterCurrentPassword.clear();
		Thread.sleep(3000);
		EnterCurrentPassword.sendKeys("123456");
		Thread.sleep(3000);
		EnterNewPassword.clear();
		Thread.sleep(3000);
		EnterNewPassword.sendKeys("Vnc@2018");
		Thread.sleep(3000);
		ConfirmPassword.clear();
		Thread.sleep(3000);
		ConfirmPassword.sendKeys("Vnc@2018");
		
		Thread.sleep(3000);
		NextButton.click();
		
		Thread.sleep(3000);
		OTP.sendKeys("123456");
		Thread.sleep(8000);
		BackbuttoninUpdatePassword.click();
		Thread.sleep(2000);
		Navigate.click();
		Thread.sleep(1000);
	}
	public void UpdatePasswordwithValidOTP() throws InterruptedException
	{
		BackbuttoninUpdatePassword.click();
		//Updatepassword.click();
		Thread.sleep(3000);
		EnterCurrentPassword.sendKeys("123456");
		Thread.sleep(3000);
		EnterNewPassword.sendKeys("Vnc@2018");
		Thread.sleep(3000);
		ConfirmPassword.sendKeys("Vnc@2018");
		Thread.sleep(3000);
		NextButton.click();
		 OTPPage otp=new OTPPage();
		 otp.enterotp();
		 Thread.sleep(3000);
		 OTP.sendKeys(otp.getOTPvalue());
	}
	
	 public void DeletethePicture() throws InterruptedException
	 {
		 Menubar.click();
		 Thread.sleep(5000);
		 ProfilePic.click();
		 Thread.sleep(2000);
		 Edit.click();
		 Thread.sleep(2000);
		 DeletePhoto.click();
		 Thread.sleep(3000);
	 }
	 
}