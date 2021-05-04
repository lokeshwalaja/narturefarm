/*package PageObjects;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewSearchPage extends Constructor 
{
	
	public NewSearchPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	
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
	@AndroidFindBy(xpath="//*[contains(@class,'android.widget.ImageButton')]")
	private AndroidElement Backbutton;
	 
	@AndroidFindBy(id ="action_select")
	private AndroidElement Select;
	 
	 
	@AndroidFindBy(xpath ="//*[text()='Enter Search Location']")
	private AndroidElement EntersearchLocation;
	 
	@AndroidFindBy(id ="tv_location_map")
	private AndroidElement Location;
	 
	@AndroidFindBy(id ="btn_select_location")
	private AndroidElement SetLocation;
	
	@AndroidFindBy(id ="action_find")
    private AndroidElement Find;
	
	
	 public void CreateaNewSearch() throws InterruptedException
	 {
		 
		 FindaJob.click();
	
		 Thread.sleep(2000);
		 
		 NewSearch.click();
		 Thread.sleep(2000);
		 
		 Entersearchtitle.sendKeys("Electrician");
		 Thread.sleep(2000);
	 
		 SelectSearchCategory.click();
		 Thread.sleep(2000);
	 
		 ElectricalCategory.click();
		 Thread.sleep(2000);
		 Select.click();
		 Thread.sleep(2000);
		 EntersearchLocation.click();
		 Thread.sleep(2000);
		 Location.click();
		 Thread.sleep(4000);
		 
		 SetLocation.click();
		 Thread.sleep(2000);
		 Find.click();
		 Thread.sleep(2000);
		 Backbutton.click();
	 }
		
		
	 }*/


package PageObjects;


import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewSearchPage extends Constructor 
{
	/* @AndroidFindBy(xpath ="//*[text()='Find a Job']")
	    private AndroidElement FindaJob;*/
	
	public NewSearchPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}



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
	 @AndroidFindBy(xpath="//*[contains(@class,'android.widget.ImageButton')]")
	 private AndroidElement Backbutton;
	 
	 @AndroidFindBy(id ="action_select")
	    private AndroidElement Select;
	 
	 
	 @AndroidFindBy(xpath ="//*[text()='Enter Search Location']")
	    private AndroidElement EntersearchLocation;
	 
	 @AndroidFindBy(id ="tv_location_map")
	    private AndroidElement Location;
	 
	 @AndroidFindBy(id ="btn_select_location")
	 private AndroidElement SetLocation;
	/* @AndroidFindBy(xpath ="//*[text()='a']")
	    private AndroidElement Location;*/
	 
	
	 @AndroidFindBy(id ="action_find")
	    private AndroidElement Find;
	 
	 
	
	 public void CreateaNewSearch() throws InterruptedException
	 {
		 
		 FindaJob.click();
	
		 Thread.sleep(2000);
		 
		 NewSearch.click();
		 Thread.sleep(2000);
		 
		 Entersearchtitle.sendKeys("Electrician");
		 Thread.sleep(2000);
	 
		 SelectSearchCategory.click();
		 Thread.sleep(2000);
	 
		 ElectricalCategory.click();
		 Thread.sleep(2000);
		 Select.click();
		 Thread.sleep(2000);
		 EntersearchLocation.click();
		 Thread.sleep(2000);
		 Location.click();
		 Thread.sleep(4000);
		 
	 SetLocation.click();
	 Thread.sleep(2000);
			Find.click();
			Thread.sleep(2000);
			Backbutton.click();
	 }
		
		
	 }



