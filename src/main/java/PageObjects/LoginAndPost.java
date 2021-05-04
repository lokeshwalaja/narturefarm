package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LoginAndPost extends Constructor{

	public LoginAndPost(AndroidDriver<AndroidElement> driver) {
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

	@AndroidFindBy(id ="btn_new_post")
	private AndroidElement NewPost;
	
	 @AndroidFindBy(id ="et_title")
	 private AndroidElement Enterposttitle;
	 
	 @AndroidFindBy(id ="et_description") 
	 private AndroidElement postdesc;
	 
	
	 @AndroidFindBy(id ="et_categories")
	 private AndroidElement SelectCategories;
	 
	 @AndroidFindBy(xpath ="//*[text()='Electrical']")
	 private AndroidElement ElectricalCategory;
	 
	 @AndroidFindBy(id ="action_select")
	 private AndroidElement Select;
	 
	 @AndroidFindBy(id ="et_budget")
	 private AndroidElement budget;
	 
	 @AndroidFindBy(xpath="//*[text()='Rate']")
	 private AndroidElement rate;
	 
	 @AndroidFindBy(xpath="//*[text()='No Preference']")
	 private AndroidElement prefe;
	 
	 @AndroidFindBy(xpath="//*[text()='SELECT']")
	 private AndroidElement select;
	 
	 @AndroidFindBy(xpath="//*[text()='Payment Method']")
	 private AndroidElement payment;
	 
	 @AndroidFindBy(xpath="//*[text()='E-Payment']")
	 private AndroidElement epay;
	 
	 @AndroidFindBy(xpath="//*[text()='SELECT']")
	 private AndroidElement SELECT;
	 
	 @AndroidFindBy(xpath ="//*[text()='Enter Post Location']")
	 private AndroidElement EnterPostLocation;
	 
	 /*
	 * @AndroidFindBy(xpath ="//*[text()='Brigade']")
	 *  private AndroidElement loc1;
	 */
	 
	 @AndroidFindBy(id ="action_search")
	 private AndroidElement ClickonEnterLocation;
	 
	 @AndroidFindBy(id ="search_src_text")
	 private AndroidElement text;
	 
	 @AndroidFindBy(id ="tv_title")
	 private AndroidElement Loc;
	 
	 @AndroidFindBy(xpath ="//*[text()='Start Date']")
	 private AndroidElement StartDate;
	 
	 @AndroidFindBy(id ="button1")
	 private AndroidElement OK;
	 
	 @AndroidFindBy(xpath ="//*[text()='Job Term']")
	 private AndroidElement job;
	 
	 @AndroidFindBy(xpath ="//*[text()='Same Day Job']")
	 private AndroidElement sameday;
	 
	 @AndroidFindBy(xpath ="//*[text()='SELECT']")
	 private AndroidElement SELECT1;
	 
	 @AndroidFindBy(id ="action_post")
	 private AndroidElement Post;
	 
	 @AndroidFindBy(xpath ="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
	 private AndroidElement back;
	 
	 
	 
	 public void loginpost(String mobile,String password,String title,String desc,String budg,String loc) throws Exception {
		 
		 lg.click();
		 Thread.sleep(2000);
		 ph.sendKeys(mobile);
		 pas.sendKeys(password);
		 Thread.sleep(5000);
		 nxt.click();
		 Thread.sleep(8000);
	 
		 //Thread.sleep(4000);
		 NewPost.click();
		 Thread.sleep(3000);
		 Enterposttitle.sendKeys(title);
		 
		 Thread.sleep(3000);
		 postdesc.sendKeys(desc);
		 SelectCategories.click();
		 Thread.sleep(3000);
		 ElectricalCategory.click();
		 Thread.sleep(3000);
		 Select.click();
		 Thread.sleep(3000);
		 budget.sendKeys(budg);
		 rate.click();
		 prefe.click();
		 select.click();
		 payment.click();
		 epay.click();
		 SELECT.click();
		 EnterPostLocation.click();
		 Thread.sleep(3000);
		 ClickonEnterLocation.click();
		 Thread.sleep(7000);
		 text.sendKeys(loc);
	     Thread.sleep(6000);
	     Loc.click();
	     //loc1.click();
		 Thread.sleep(3000);
		 //hyd.click();
		 StartDate.click();
		 Thread.sleep(3000);
		 OK.click();
		 job.click();
		 Thread.sleep(3000);
		 sameday.click();
		 SELECT1.click();
		 Thread.sleep(1000);
		 Post.click();
		 Thread.sleep(3000);
		 //back.click();
		 Thread.sleep(5000);
		 back.click();
	 }
	 
	 public void logout() throws Exception {
		 
		 MenuOptions.click();
			username.click();
			Logout.click();
			Logedout.click();
			Thread.sleep(5000);
			LogIn.click();
		 
		 
	 }
	
	

}
