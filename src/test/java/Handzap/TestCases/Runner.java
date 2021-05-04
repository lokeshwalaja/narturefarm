package Handzap.TestCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import TestUtility.Utility;
import PageObjects.CreateAccount;
import PageObjects.EditPost;
import PageObjects.EditSearch;
import PageObjects.Log;
import PageObjects.NewPostPage;
import PageObjects.NewSearchPage;
import PageObjects.OnboardingPage;
import PageObjects.PrivacyPage;
import PageObjects.PrivacySettings;
import PageObjects.ProfilePage;
import PageObjects.SignupPage;


public class Runner extends Utility
{
	 

@Test(priority=1)
	 public void NavigationtoLanguagesScreen() throws InterruptedException
	 {
	
		extentTest = extent.startTest("NavigationtoLanguagesScreen");
		 OnboardingPage onboardingforLanguage= new OnboardingPage(driver);
		 onboardingforLanguage.Language();
		 //d.LanguageScreen();
		 //Reporter.log("languages Screen is displayed");
	 }
	 @Test(priority=3)
	 
	 public void SignupNavigation() throws InterruptedException
	 {
		 extentTest = extent.startTest("SignupNavigation");
		 OnboardingPage onboardingforSignup= new OnboardingPage(driver);
		 onboardingforSignup.SignupButton();
		// d.signupbuttonNavigation();
		 //Reporter.log("Welcome Page is Displayed");
		 
	 }
@Test(priority=2)
	 
	 public void Loginnavigation() throws InterruptedException
	 {
	
	extentTest = extent.startTest("Loginnavigation");
	 OnboardingPage onboardingforlogin= new OnboardingPage(driver);
	 onboardingforlogin.LoginButton();  
	 
	 
	 }
	
@Test(priority=4)

public void CreateAccountwithInvalidPhoneNumber() throws InterruptedException
{
	extentTest = extent.startTest("CreateAccountwithInvalidPhoneNumber");
	CreateAccount CA=new CreateAccount(driver);
	 CA.CreateAccountwithInValidMobilenumber();
	 CA.clearallfields();

	 
}
@Test(priority=5)

public void CreateAccountwithInvalidFullName() throws InterruptedException
{
	extentTest = extent.startTest("CreateAccountwithInvalidFullName");
	CreateAccount CAwithinvalidfullname=new CreateAccount(driver);
	CAwithinvalidfullname.CreateAccountwithInValidFullname();
	CAwithinvalidfullname.clearallfields();
	
	Reporter.log("Invalid Name is Shown");
}

@Test(priority=6)

public void CreateAccountwithInvalidPassword() throws InterruptedException
{
	extentTest = extent.startTest("CreateAccountwithInvalidPassword");
	CreateAccount CAwithinvalidfpassword=new CreateAccount(driver);
	CAwithinvalidfpassword.CreateAccountwithInValidPassword();
	CAwithinvalidfpassword.clearallfields();
	
	Reporter.log("Error Message is Shown");
}
@Test(priority=7)

public void CreateAccountwithRegisterednumber() throws InterruptedException
{
	extentTest = extent.startTest("CreateAccountwithRegisterednumber");
	CreateAccount CAwithRegisterednumber=new CreateAccount(driver);
	CAwithRegisterednumber.CreateAccountwithRegisteredmobileNumber();
	CAwithRegisterednumber.clearallfields();
	
	Reporter.log("Error Message  is Shown");
}
@Test(priority=8)

public void CreateAccountwithnumberirrespectivetocountry() throws InterruptedException
{
	extentTest = extent.startTest("CreateAccountwithnumberirrespectivetocountry");
	CreateAccount CAwithnumberirrespectivetocountry=new CreateAccount(driver);
	CAwithnumberirrespectivetocountry.entermobilenumberwhichisirrespecttoselectcountry();
	CAwithnumberirrespectivetocountry.clearallfields();
	
	Reporter.log("Invalid PhoneNumber is Shown");
}

@Test(priority=9)
public void login() throws InterruptedException {
	extentTest = extent.startTest("login");
	Log lg=new Log(driver);
	lg.log();
}
	
	
	/*
	 @Test(priority=10 , description = "Valid Login Scenario with  username and password.")
	 public void CreateAccountwithvalidCredentials() throws InterruptedException
	 {
		 extentTest = extent.startTest("CreateAccountwithvalidCredentials");
		 SignupPage signup=new SignupPage(driver);
		 signup.UserSignUp();
		 
			
	 }
	 @Test(priority=11)
	 public void validatephonenumberinOTPscreen() throws InterruptedException
	 {
		 extentTest = extent.startTest("validatephonenumberinOTPscreen");
		 SignupPage phonenumberinOTPscreen=new SignupPage(driver);
		 phonenumberinOTPscreen.validatephonenumber();
		
	 }
	 @Test(priority=12)
	 public void validatewithInvalidOTP() throws InterruptedException
	 {
		 extentTest = extent.startTest("validatewithInvalidOTP");
		 SignupPage InvalidOTP=new SignupPage(driver);
		 InvalidOTP.enterinvalidOtp();
		 InvalidOTP.clearOtp();

	 }
	 @Test(priority=13)
	 public void validatewithValidOTP() throws InterruptedException
	 {
		 extentTest = extent.startTest("validatewithValidOTP");
		 SignupPage ValidOTP=new SignupPage(driver);
		 ValidOTP.OTPvalue();
		
		
	 }
*/	
	
	
	@Test(priority=14)
	 public void CreateNewPost() throws InterruptedException
	 {
		extentTest = extent.startTest("CreateNewPost");
		NewPostPage Newpost= new NewPostPage(driver);
		Newpost.CreateaNewPost();
	
	 }
	
@Test(priority=15)
public void editpostformultidaysjob() throws InterruptedException

{
	extentTest = extent.startTest("editpostformultidaysjob");
	EditPost editpostformultidaysjob=new EditPost(driver);
	
	editpostformultidaysjob.EditJobTermforPostasMultiDaysJob();
	
}

@Test(priority=16)
public void editpostasrecurringjob() throws InterruptedException

{
	extentTest = extent.startTest("editpostasrecurringjob");
	EditPost editpostasrecurringjob=new EditPost(driver);
	editpostasrecurringjob.EditJobTermforPostasRecurringJob();
	
}
@Test(priority=17)
public void editpostassamedayjob() throws InterruptedException

{
	extentTest = extent.startTest("editpostassamedayjob");
	EditPost editpostassamedayjob=new EditPost(driver);
	editpostassamedayjob.EditJobTermforPostasSameDayJob();
	
}
@Test(priority=18)
public void editpostforpaymentmethodascash() throws InterruptedException

{
	extentTest = extent.startTest("editpostforpaymentmethodascash");
	EditPost editpostforpaymentmethodascash=new EditPost(driver);
	editpostforpaymentmethodascash.EditpaymentMethodforPostasCash();
	
}
@Test(priority=19)
public void editpostforpaymentmethodasEpayment() throws InterruptedException

{
	extentTest = extent.startTest("editpostforpaymentmethodasEpayment");
	EditPost editpostforpaymentmethodasEpayment=new EditPost(driver);

	editpostforpaymentmethodasEpayment.EditpaymentMethodforPostasEpayment();
	
	
}
@Test(priority=20)
public void editpostforpaymentmethodasFixedBudget() throws InterruptedException

{
	extentTest = extent.startTest("editpostforpaymentmethodasFixedBudget");
	EditPost editpostforpaymentmethodasFixedBudget=new EditPost(driver);
	editpostforpaymentmethodasFixedBudget.EditRateforPostasFixedBudget();
	
	
}
@Test(priority=21)
public void editpostforpaymentmethodasHourlyRate() throws InterruptedException

{
	extentTest = extent.startTest("editpostforpaymentmethodasHourlyRate");
	EditPost editpostforpaymentmethodasHourlyRate=new EditPost(driver);
	editpostforpaymentmethodasHourlyRate.EditRateforPostasHourlyRate();
	
	
}

@Test(priority=22)
public void InviteFavourites() throws InterruptedException

{
	extentTest = extent.startTest("InviteFavourites");
	EditPost InviteFavourites=new EditPost(driver);
	InviteFavourites.invitefavourites();
}

@Test(priority=23)
public void DisableNotificationsforPost() throws InterruptedException

{
	extentTest = extent.startTest("DisableNotificationsforPost");
	EditPost Disablenotifications=new EditPost(driver);
	Disablenotifications.DisableNotificationsforPost();
}
@Test(priority=24)
public void EnableNotificationsforPost() throws InterruptedException

{
	extentTest = extent.startTest("EnableNotificationsforPost");
	EditPost Enablenotifications=new EditPost(driver);
	Enablenotifications.EnableNotificationsforPost();
}
@Test(priority=25)
public void PausePost() throws InterruptedException

{
	extentTest = extent.startTest("PausePost");
	EditPost PausePost=new EditPost(driver);
	PausePost.PausethePost();
}
@Test(priority=26)
public void ResumePost() throws InterruptedException

{
	extentTest = extent.startTest("ResumePost");
	EditPost ResumePost=new EditPost(driver);
	ResumePost.ResumethePost();
}

@Test(priority=27)
public void Cancelfordeletepost() throws InterruptedException

{
	extentTest = extent.startTest("Cancelfordeletepost");
	EditPost ResumePost=new EditPost(driver);
	ResumePost.Cancelfordeletepost();
}
	 
@Test(priority=28)
public void deletePost() throws InterruptedException

{
	extentTest = extent.startTest("deletePost");
	EditPost ResumePost=new EditPost(driver);
	ResumePost.deletePost();
}

	
	/*@Test(priority=29)
	 public void CreateNewSearch() throws InterruptedException
	 {
		NewSearchPage newsearch=new NewSearchPage(driver);
		newsearch.CreateaNewSearch();
		
	 }*/

	
		@Test(priority=30)
		public void DisableNotificationsforsearch() throws InterruptedException
		{
			extentTest = extent.startTest("DisableNotificationsforsearch");
			EditSearch disablenotificationsforsearch=new EditSearch(driver);
			disablenotificationsforsearch.Disablenotificationsforsearch();
			
		}
		@Test(priority=31)
		public void EnableNotificationsforsearch() throws InterruptedException
		{
			extentTest = extent.startTest("EnableNotificationsforsearch");
			EditSearch enablenotificationsforsearch=new EditSearch(driver);
			enablenotificationsforsearch.EnableNotificationsforSearch();
			
		}
		@Test(priority=32)
		public void Pausesearch() throws InterruptedException
		{
			extentTest = extent.startTest("Pausesearch");
			EditSearch Pausesearch=new EditSearch(driver);
			Pausesearch.PausetheSearch();
			
		}
		@Test(priority=33)
		public void Resumesearch() throws InterruptedException
		{
			extentTest = extent.startTest("Resumesearch");
			EditSearch Resumesearch=new EditSearch(driver);
			Resumesearch.ResumeSearch();
			
		}
		
		@Test(priority=34)
		public void EditsearchRatefieldasFixedBudget() throws InterruptedException
		{
			extentTest = extent.startTest("EditsearchRatefieldasFixedBudget");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.EditSearchforRateFieldasFixedBudget();
			
		}
		@Test(priority=35)
		public void EditsearchRatefieldasHourlyRate() throws InterruptedException
		{
			extentTest = extent.startTest("EditsearchRatefieldasHourlyRate");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.EditSearchforRateFieldasHourlyRate();
			
		}
		
		@Test(priority=36)
		public void EditsearchPaymentMethodasEPayment() throws InterruptedException
		{
			extentTest = extent.startTest("EditsearchPaymentMethodasEPayment");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.PaymentFieldasEPayment();
			
		}
		@Test(priority=37)
		public void EditsearchPaymentMethodasCash() throws InterruptedException
		{
			extentTest = extent.startTest("EditsearchPaymentMethodasCash");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.PaymentFieldasCash();
		}
		@Test(priority=38)
		public void SearchRadiustoFiveKms() throws InterruptedException
		{
			extentTest = extent.startTest("SearchRadiustoFiveKms");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.SearchRadiustoFiveKms();
		}
		@Test(priority=39)
		public void SearchRadiustoTenKms() throws InterruptedException
		{
			extentTest = extent.startTest("SearchRadiustoTenKms");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.SearchRadiustoTenKms();
		}
		@Test(priority=40)
		public void SearchRadiustoTwentyFiveKms() throws InterruptedException
		{
			extentTest = extent.startTest("SearchRadiustoTwentyFiveKms");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.SearchRadiustoTwentyFiveKms();
		}
		@Test(priority=41)
		public void SearchRadiustoFiftyKms() throws InterruptedException
		{
			extentTest = extent.startTest("SearchRadiustoFiftyKms");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.SearchRadiustoFiftyKms();
		}
		
		@Test(priority=42)
		public void SearchRadiustoHundredKms() throws InterruptedException
		{
			extentTest = extent.startTest("SearchRadiustoHundredKms");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.SearchRadiustoHundredKms();
		}
		@Test(priority=43)
		public void SearchRadiustoTwoFiftyKms() throws InterruptedException
		{
			extentTest = extent.startTest("SearchRadiustoTwoFiftyKms");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.SearchRadiustoTwoFiftyKms();
		}
		@Test(priority=44)
		public void JobtermFieldasRecurring() throws InterruptedException
		{
			extentTest = extent.startTest("JobtermFieldasRecurring");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.JobtermFieldasRecurring();
		}
		@Test(priority=45)
		public void JobtermFieldasSameDayJob() throws InterruptedException
		{
			extentTest = extent.startTest("JobtermFieldasSameDayJob");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.JobtermFieldasSameDayJob();
		}
		@Test(priority=46)
		public void JobtermFieldasMultiDaysJob() throws InterruptedException
		{
			extentTest = extent.startTest("JobtermFieldasMultiDaysJob");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.JobtermFieldasMultiDaysJob();
		}
		@Test(priority=47)
		public void CancelSearch() throws InterruptedException
		{
			extentTest = extent.startTest("CancelSearch");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.CancelSearch();
		}
		@Test(priority=48)
		public void deletesearch() throws InterruptedException
		{
			extentTest = extent.startTest("deletesearch");
			EditSearch Editsearch=new EditSearch(driver);
			Editsearch.deletesearch();
		}
		
	
	
	
	@Test(priority=49)
	public void UpdateNamewithInValidData() throws InterruptedException
	{
		extentTest = extent.startTest("UpdateNamewithInValidData");
		ProfilePage Profile=new ProfilePage(driver);
		Profile.UpdateNamewithInValidData();
	}
	@Test(priority=50)
	public void UpdateNamewithValidData() throws InterruptedException
	{
		extentTest = extent.startTest("UpdateNamewithValidData");
		ProfilePage Profile=new ProfilePage(driver);
		Profile.UpdateNamewithValidData();
	}
	@Test(priority=51)
	public void AddEmailwithInValidData() throws InterruptedException
	{
		extentTest = extent.startTest("AddEmailwithInValidData");
		ProfilePage Profile=new ProfilePage(driver);
		Profile.AddEmailwithInValidData();
	}
	@Test(priority=52)
	public void AddEmailwithValidData() throws InterruptedException
	{
		extentTest = extent.startTest("AddEmailwithValidData");
		ProfilePage Profile=new ProfilePage(driver);
		Profile.AddEmailwithValidData();
	}
	@Test(priority=53)
	public void DifferentPasswords() throws InterruptedException
	{
		extentTest = extent.startTest("DifferentPasswords");
		ProfilePage Profile=new ProfilePage(driver);
		Profile.DifferentPasswords();
	}
	@Test(priority=54)
	public void UpdatePasswordwithInvalidOTP() throws InterruptedException
	{
		extentTest = extent.startTest("UpdatePasswordwithInvalidOTP");
		ProfilePage Profile=new ProfilePage(driver);
		Profile.UpdatePasswordwithInvalidOTP();
	}


	@Test(priority=55)
	public void turnOntwoStepVerification() throws InterruptedException
	{
		extentTest = extent.startTest("turnOntwoStepVerification");
		ProfilePage Profile=new ProfilePage(driver);
		Profile.turnOntwoStepVerification();
	}
	@Test(priority=56)
	public void DeletethePicture() throws InterruptedException
	{
		extentTest = extent.startTest("DeletethePicture");
		ProfilePage Profile=new ProfilePage(driver);
		Profile.DeletethePicture();
	}
	
	
	
	@Test(priority=57)
	public void Settings() throws InterruptedException
	{
		extentTest = extent.startTest("Settings");
		PrivacySettings Setting=new PrivacySettings(driver);
		Setting.Settings();
	}
	@Test(priority=58)
	public void DisableAudiocallforPost() throws InterruptedException
	{
		extentTest = extent.startTest("DisableAudiocallforPost");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.disableAudioCallsforPost();
	}
	@Test(priority=59)
	public void DisableVideocallforPost() throws InterruptedException
	{
		extentTest = extent.startTest("DisableVideocallforPost");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.disableVideoCallsforPost();
	}
	@Test(priority=60)
	public void DisableAlertsforPost() throws InterruptedException
	{
		extentTest = extent.startTest("DisableAlertsforPost");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.disableAlertsforPost();
	}
	@Test(priority=61)
	public void DisableAllNotificationsforPost() throws InterruptedException
	{
		extentTest = extent.startTest("DisableAllNotificationsforPost");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.disableAllnotificationsforPost();
	}
	@Test(priority=62)
	public void DisableAudiocallforSearch() throws InterruptedException
	{
		extentTest = extent.startTest("DisableAudiocallforSearch");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.disableAudioCallsforSearch();
	}
	@Test(priority=63)
	public void DisableVideocallforSearch() throws InterruptedException
	{
		extentTest = extent.startTest("DisableVideocallforSearch");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.disableVideoCallsforSearch();
	}
	@Test(priority=64)
	public void DisableAlertsforSearch() throws InterruptedException
	{
		extentTest = extent.startTest("DisableAlertsforSearch");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.disableAlertsforSearch();
	}
	@Test(priority=65)
	public void DisableAllNotificationsforSearch() throws InterruptedException
	{
		extentTest = extent.startTest("DisableAllNotificationsforSearch");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.disableAllnotificationsforSearch();
	}
	@Test(priority=66)
	public void DoNotDisturbforAlways() throws InterruptedException
	{
		extentTest = extent.startTest("DoNotDisturbforAlways");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.AlwaysforDoNotdistrub();
	}
	@Test(priority=67)
	public void DoNotDisturbforSchedulded() throws InterruptedException
	{
		extentTest = extent.startTest("DoNotDisturbforSchedulded");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.ScheduledforDoNotDisturb();
	}
	@Test(priority=68)
	public void DisablePosterInvitation() throws InterruptedException
	{
		extentTest = extent.startTest("DisablePosterInvitation");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.DisablePostersInvitations();
	}
	@Test(priority=69)
	public void RetentionforSixMonths() throws InterruptedException
	{
		extentTest = extent.startTest("RetentionforSixMonths");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.SetDurationforSixMonths();
	}
	
	@Test(priority=70)
	public void RetentionforNineMonths() throws InterruptedException
	{
		extentTest = extent.startTest("RetentionforNineMonths");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.SetDurationforNineMonths();
	}
	@Test(priority=71)
	public void RetentionforTwelveMonths() throws InterruptedException
	{
		extentTest = extent.startTest("RetentionforTwelveMonths");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.SetDurationforTweleveMonths();
	}
	@Test(priority=72)
	public void RetentionforNever() throws InterruptedException
	{
		extentTest = extent.startTest("RetentionforNever");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.SetDurationforNever();
	}
	@Test(priority=73)
	public void autoDownloadedNever() throws InterruptedException
	{
		extentTest = extent.startTest("autoDownloadedNever");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.autoDownloadedNever();
	}
	@Test(priority=74)
	public void autoDownloadedWiFi() throws InterruptedException
	{
		extentTest = extent.startTest("autoDownloadedWiFi");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.autoDownloadedWiFi();
	}
	@Test(priority=75)
	public void autoDownloadedAlwaysAllow() throws InterruptedException
	{
		extentTest = extent.startTest("autoDownloadedAlwaysAllow");
		PrivacyPage privacy=new PrivacyPage(driver);
		privacy.autoDownloadedAlwaysAllow();
	}
	
	
	

		
}