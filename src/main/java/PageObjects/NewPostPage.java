package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class NewPostPage extends Constructor 
{
 public NewPostPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}



	/*@AndroidFindBy(xpath ="//*[@text='Hire']")
	    private AndroidElement Hire;*/
	
	 @AndroidFindBy(id ="btn_new_post")
	    private AndroidElement NewPost;
	 
	 @AndroidFindBy(id ="et_title")
	    private AndroidElement Enterposttitle;
	
	 @AndroidFindBy(id ="et_categories")
	    private AndroidElement SelectCategories;
	 
	 @AndroidFindBy(xpath ="//*[text()='Electrical']")
	    private AndroidElement ElectricalCategory;
	 
	 @AndroidFindBy(id ="action_select")
	    private AndroidElement Select;
	 
	 @AndroidFindBy(xpath ="//*[text()='Enter Post Location']")
	    private AndroidElement EnterPostLocation;
	
	 @AndroidFindBy(id ="tv_location_map")
	    private AndroidElement Location;
	 
	 @AndroidFindBy(id ="btn_select_location")
	 private AndroidElement SelectLocation;
	 
	 @AndroidFindBy(xpath ="//*[text()='Start Date']")
	    private AndroidElement StartDate;
	 
	 @AndroidFindBy(id ="button1")
	 private AndroidElement OK;
	 
	 @AndroidFindBy(id ="action_post")
	    private AndroidElement Post;
	
	 @AndroidFindBy(xpath="//*[contains(@class,'android.widget.ImageButton')]")
	 private AndroidElement Backbutton;
	 
	
	 
	 
	 
	 
	 
	 public void CreateaNewPost() throws InterruptedException
	 {
		 Thread.sleep(3000);
		 NewPost.click();
		 Thread.sleep(3000);
		 Enterposttitle.sendKeys("Need a Electrician to fix AC");
		 
		 Thread.sleep(3000);
		 SelectCategories.click();
		 Thread.sleep(3000);
		 ElectricalCategory.click();
		 Thread.sleep(3000);
		 Select.click();
		 Thread.sleep(3000);
		 EnterPostLocation.click();
		 Thread.sleep(3000);
		 Location.click();
		 Thread.sleep(5000);
		 SelectLocation.click();
		 Thread.sleep(3000);
		 StartDate.click();
		 Thread.sleep(3000);
		 OK.click();
		 Thread.sleep(3000);
		 Post.click();
		 Thread.sleep(7000);
		Backbutton.click();
	 }
	 
	 
}