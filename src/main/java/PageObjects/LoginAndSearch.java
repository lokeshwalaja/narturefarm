package PageObjects;

import TestUtility.LoginAndSearchUtil;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginAndSearch extends Constructor {

	public LoginAndSearch(AndroidDriver<AndroidElement> driver) {
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
	
	
	
	@AndroidFindBy(xpath ="//*[text()='Get Hired']")
    private AndroidElement FindaJob;

	@AndroidFindBy(id ="btn_new_search")
    private AndroidElement NewSearch;
	
	@AndroidFindBy(id ="et_keywords")
    private AndroidElement Entersearchtitle;
	
	@AndroidFindBy(xpath ="//*[text()='Select Search Categories']")
    private AndroidElement SelectSearchCategory;
	
	@AndroidFindBy(xpath ="//*[text()='Electrical']")
    private AndroidElement ElectricalCategory;
	@AndroidFindBy(xpath ="//*[@text='Plumbing']")
    private AndroidElement PlumblingCategory;
	@AndroidFindBy(xpath ="//*[@text='Heating & Cooling']")
    private AndroidElement HeatandCoolCategory;
	@AndroidFindBy(xpath ="//*[@text='Painting & Wallpaper']")
    private AndroidElement PaintandWallCategory;
	@AndroidFindBy(xpath ="//*[@text='Construction']")
    private AndroidElement ConstructionCategory;
	@AndroidFindBy(id ="action_select")
    private AndroidElement SelectCat;
	
	@AndroidFindBy(xpath ="//*[text()='Rate']")
    private AndroidElement rate;
	@AndroidFindBy(xpath ="//*[text()='No Preference']")
    private AndroidElement NoPrefer;
	@AndroidFindBy(xpath ="//*[@text='SELECT']")
    private AndroidElement Select;
	
	@AndroidFindBy(xpath ="//*[text()='Payment Method']")
    private AndroidElement Payment;
	@AndroidFindBy(xpath ="//*[text()='E-Payment']")
    private AndroidElement Epayment;
	@AndroidFindBy(xpath ="//*[text()='SELECT']")
    private AndroidElement SelectPayment;
	
	@AndroidFindBy(xpath ="//*[text()='Enter Search Location']")
    private AndroidElement EntersearchLocation;
	@AndroidFindBy(xpath ="//*[@id='action_search']")
    private AndroidElement SearchLocation;
	@AndroidFindBy(xpath ="//*[text()='Enter Location']")
    private AndroidElement EnterLocation;
	@AndroidFindBy(xpath ="//*[@id='tv_title']")
    private AndroidElement SelectLocation;
	//*[@id='tv_title']
	@AndroidFindBy(xpath ="//*[@text='Set Location on Map']")
    private AndroidElement Location;
	@AndroidFindBy(xpath ="//*[@text='Set Location']")
    private AndroidElement SetLocation;
 
	@AndroidFindBy(xpath ="//*[text()='Search Radius']")
    private AndroidElement SearchRadius;
	@AndroidFindBy(xpath ="//*[text()='No Preference']")
    private AndroidElement Noprefer;
	@AndroidFindBy(xpath ="//*[text()='SELECT']")
    private AndroidElement RadiusSelect;
	
	@AndroidFindBy(xpath ="//*[text()='Job Term']")
    private AndroidElement JobTerm;
	@AndroidFindBy(xpath ="//*[text()='No Preference']")
    private AndroidElement Noprefe;
	@AndroidFindBy(xpath ="//*[text()='SELECT']")
    private AndroidElement JobTermSelect;
	
	@AndroidFindBy(xpath ="//*[text()='Find']")
    private AndroidElement Find;
	
	@AndroidFindBy(xpath ="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
    private AndroidElement Navigate;
	
	
	public void loginsearch(String Phonenumber,String Password, String EnterSearchTitle, String Location) throws Exception 
	{
		LoginAndSearchUtil ls=new LoginAndSearchUtil();
		ls.getDataFromExcel();
		lg.click();
		Thread.sleep(2000);
		ph.sendKeys(Phonenumber);
		pas.sendKeys(Password);
		nxt.click();
		Thread.sleep(8000);
		FindaJob.click();
		 NewSearch.click();
		 Entersearchtitle.sendKeys(EnterSearchTitle);
		 SelectSearchCategory.click();
		 ElectricalCategory.click();
		 PlumblingCategory.click();
		 HeatandCoolCategory.click();
		 PaintandWallCategory.click();
		 ConstructionCategory.click();
		 SelectCat.click();
		 rate.click();
		 NoPrefer.click();
		 Select.click();
		 Payment.click();
		 Epayment.click();
		 SelectPayment.click();
		 EntersearchLocation.click();
		 SearchLocation.click();
		 EnterLocation.sendKeys(Location);
		 Thread.sleep(6000);
		 SelectLocation.click();
		// Location.click();
		 //Thread.sleep(5000);
		 //SetLocation.click();
		 Thread.sleep(2000);
		 SearchRadius.click();
		 Noprefer.click();
		 RadiusSelect.click();
		 JobTerm.click();
		 Noprefe.click();
		 JobTermSelect.click();
		 Find.click();
		 Thread.sleep(4000);
		 Navigate.click();
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
