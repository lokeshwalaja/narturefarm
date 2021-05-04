package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CreateAccount extends Constructor 
	{
	
	
	 public CreateAccount(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	 
	 
	@AndroidFindBy(id ="btn_sign_up")
		private static AndroidElement Signup;
		
		@AndroidFindBy(id ="btn_action_create_account")
		private static AndroidElement CreateAccount;
		
	@AndroidFindBy(id ="iv_country_image")
	    private AndroidElement CountryDropdown;
	 
	 @AndroidFindBy(xpath="//*[contains(@class,'android.widget.ImageButton')]")
	 private AndroidElement BackbuttoninSelectCountry;
	 
	 @AndroidFindBy(xpath="//*[contains(@class,'android.widget.ImageButton')]")
	 private AndroidElement BackbuttoninCreateAccount;
	 
	 
	 
	 @AndroidFindBy(id ="tv_country")
		private AndroidElement SelectCountry;
	 
	 @AndroidFindBy(id ="et_phone_number")
		private static AndroidElement PhoneNumber;
		
	 @AndroidFindBy(id ="action_search")
		private AndroidElement SearchforCountry;
	 
		@AndroidFindBy(id ="et_name")
		private static AndroidElement FullName;
		
		@AndroidFindBy(id ="et_password")
		private static AndroidElement CreatePassword;
		
		@AndroidFindBy(id ="action_next")
		private AndroidElement NextButton;
		
		@AndroidFindBy(id ="tv_phone_message")
		private static AndroidElement InvalidphoneNumber;
		
		@AndroidFindBy(id ="tv_name_message")
		private AndroidElement InvalidfullName;
		
		@AndroidFindBy(id ="tv_password_message")
		private AndroidElement PassworderrorMessage;
		
		@AndroidFindBy(id ="snackbar_text")
		private AndroidElement errorMessageforregisteredaccount;
		
		@AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
		private AndroidElement CreateAccountBack;
		
	  public void CreateAccountwithValidCredentials() throws InterruptedException
	  {
		  Signup.click();
		  CreateAccount.click();
		  PhoneNumber.sendKeys("8000000008");
		  FullName.sendKeys("Keshav");
		  CreatePassword.sendKeys("123456");
		  NextButton.click();
		  Thread.sleep(10000);
		  BackbuttoninCreateAccount.click();
		 
	  }
	  public void CreateAccountwithInValidMobilenumber() throws InterruptedException
	  {
		  
		  
		  //Signup.click();
		  CreateAccount.click();
		  
		  Thread.sleep(3000);
		  PhoneNumber.sendKeys("9856321");
		 
		  
		 FullName.click();
		 Thread.sleep(3000);
		  FullName.sendKeys("Keshav");
		  String Message=InvalidphoneNumber.getText();
		  System.out.println(Message);
		  CreatePassword.sendKeys("123456");
		  
	  }
	  public void CreateAccountwithInValidFullname() throws InterruptedException
	  {
		  PhoneNumber.sendKeys("6304337562");
		  FullName.sendKeys("9444");
		  CreatePassword.click();
		  String MessageforName=InvalidfullName.getText();
		  System.out.println(MessageforName);
		  
		  Thread.sleep(3000);
		  CreatePassword.sendKeys("123456");
		  
	  }
	  public void CreateAccountwithInValidPassword() throws InterruptedException
	  {
		  PhoneNumber.sendKeys("6304337562");
		  FullName.sendKeys("Keshav");
		
		  CreatePassword.sendKeys("123");
		  PhoneNumber.click();
			 Thread.sleep(3000);
		  String Errormessageforpassword=PassworderrorMessage.getText();
		  System.out.println(Errormessageforpassword);
	  }
	  public void CreateAccountwithRegisteredmobileNumber() throws InterruptedException
	  {
		  PhoneNumber.sendKeys("7569753109");
		  FullName.sendKeys("chalama");
		 
		  CreatePassword.sendKeys("123456");
		  
		  NextButton.click();
		  Thread.sleep(3000);
		  String Errormessage=errorMessageforregisteredaccount.getText();
		  System.out.println(Errormessage);
		  
	  }
	 public void CreateAccountwithphonenumberwhichisirrespecttoselectcountry() throws InterruptedException
	  {
		  CountryDropdown.click();
		  Thread.sleep(5000);
		  SearchforCountry.sendKeys("Egypt");
		  Thread.sleep(5000);
		  SelectCountry.click();
		  Thread.sleep(5000);
		  PhoneNumber.sendKeys("9444676906");
		  FullName.click();
	  }
	  public void entermobilenumberwhichisirrespecttoselectcountry() throws InterruptedException
	  {
		  PhoneNumber.sendKeys("0000000");
		  Thread.sleep(3000);
		
		  CreatePassword.click();
		  System.out.println(InvalidphoneNumber.getText());
		 
		  
	  }
	  
	  public void clearallfields()
	  {
		  PhoneNumber.clear();
		  FullName.clear();
		  CreatePassword.clear();
	  }
	  public void selectcountryasindia() throws InterruptedException
	  {
		  Thread.sleep(3000);
		  CountryDropdown.click();
		  Thread.sleep(3000);
		  SearchforCountry.sendKeys("India");
		  Thread.sleep(3000);
		  SelectCountry.click();
		   
		  
	  }
	  
	 
}