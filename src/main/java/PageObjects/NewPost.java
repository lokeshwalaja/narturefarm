package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewPost extends Constructor
{
	
	
		
	    public NewPost(AndroidDriver<AndroidElement> driver)
	    {
		super(driver);
	    }


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
		 
		/*
		 * @AndroidFindBy(xpath ="//*[contains(@class,'android.widget.ImageButton')]")
		 * private AndroidElement back;
		 */
		

		
		 public void createpost(String title,String desc,String budg,String loc) throws InterruptedException
		 {
			 
			 
			 
			/*
			 * LogPOst LP1=new LogPOst(); 
			 * LP1.getDataFromExcel();
			 */
			 
			 Thread.sleep(4000);
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
			 Thread.sleep(3000);
			 rate.click();
			 Thread.sleep(1000);
			 prefe.click();
			 Thread.sleep(1000);
			 select.click();
			 Thread.sleep(1000);
			 payment.click();
			 Thread.sleep(1000);
			 epay.click();
			 Thread.sleep(1000);
			 SELECT.click();
			 Thread.sleep(1000);
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
			 Thread.sleep(1000);
			 sameday.click();
			 Thread.sleep(1000);
			 SELECT1.click();
			 Thread.sleep(1000);
			 Post.click();
			 Thread.sleep(3000);
			 //back.click();
			 Thread.sleep(5000);
			 back.click();
		 }
		 
	}


