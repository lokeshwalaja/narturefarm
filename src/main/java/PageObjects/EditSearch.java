package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditSearch extends Constructor
{

		public EditSearch(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

		/*@AndroidFindBy(xpath ="//*[text()='Find a Job']")
		    private AndroidElement FindaJob;*/
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
		 @AndroidFindBy(xpath ="//*[@text='Carpentry']")
		    private AndroidElement CarpentryCategory;
		 
		 @AndroidFindBy(id ="til_rate")
		    private AndroidElement rat;
		 @AndroidFindBy(xpath ="//*[text()='Rate']")
		    private AndroidElement rate;
		 @AndroidFindBy(xpath ="//*[text()='No Preference']")
		    private AndroidElement NoPrefer;
		 @AndroidFindBy(xpath ="//*[@text='SELECT']")
		    private AndroidElement Select;
		 @AndroidFindBy(xpath ="//*[text()='Fixed Budget']")
		    private AndroidElement FixedBudget;
		 @AndroidFindBy(xpath ="//*[@text='Hourly Rate']")
		    private AndroidElement HourlyRate;
		
		 @AndroidFindBy(id ="til_payment_method")
		    private AndroidElement payment;
		 @AndroidFindBy(xpath ="//*[text()='Payment Method']")
		    private AndroidElement PaymentMethod;
		 @AndroidFindBy(xpath ="//*[text()='E-Payment']")
		    private AndroidElement Epayment;
		 @AndroidFindBy(xpath ="//*[text()='Cash']")
		    private AndroidElement Cash;
		 
		 @AndroidFindBy(id ="action_select")
		    private AndroidElement SelectCat;
		 
		 
		 @AndroidFindBy(xpath ="//*[text()='Enter Search Location']")
		    private AndroidElement EntersearchLocation;
		 
		 @AndroidFindBy(xpath ="//*[@text='Set Location on Map']")
		    private AndroidElement Location;
		 
		 @AndroidFindBy(xpath ="//*[@text='Set Location']")
		    private AndroidElement SetLocation;
		
		 @AndroidFindBy(id ="action_find")
		    private AndroidElement Find;
		 
		 @AndroidFindBy(xpath ="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
		    private AndroidElement Back;
		 
		 @AndroidFindBy(xpath ="//*[@class='android.widget.EditText' and ./parent::*[./parent::*[@id='til_job_term']]]")
		    private AndroidElement jobterm;
		 
		 @AndroidFindBy(xpath ="//*[@text='CANCEL']")
		    private AndroidElement cancel;
		 
		 @AndroidFindBy(xpath ="//*[@text='Required' and ./parent::*[@id='til_categories']]")
		    private AndroidElement req;
		 
		 @AndroidFindBy(id ="til_radius")
		    private AndroidElement SearchRadius;
			 
		 @AndroidFindBy(xpath ="//*[text()='5 Kilometers']")
		    private AndroidElement FiveKilometers;
			 
		 @AndroidFindBy(xpath ="//*[text()='10 Kilometers']")
		    private AndroidElement TenKilometers;
			 
		 @AndroidFindBy(xpath ="//*[text()='25 Kilometers']")
		    private AndroidElement TwentyFiveKilometers;
			 
		 @AndroidFindBy(xpath ="//*[text()='50 Kilometers']")
		    private AndroidElement FiftyKilometers;
			 
		 @AndroidFindBy(xpath ="//*[text()='100 Kilometers']")
		    private AndroidElement HundredKilometers;
			 
		 @AndroidFindBy(xpath ="//*[text()='250 Kilometers']")
		    private AndroidElement TwoFiftyKilometers;
		 
		 @AndroidFindBy(xpath ="//*[text()='SELECT']")
		    private AndroidElement SelectforRadius;
		 
		 @AndroidFindBy(xpath ="//*[text()='CANCEL']")
		    private AndroidElement CancelforRadius;
		 
		 
		 @AndroidFindBy(xpath ="//*[text()='Done']")
		    private AndroidElement DoneButtonforSearch;
		 
		 
		 @AndroidFindBy(xpath ="//*[@id='iv_settings' and (./preceding-sibling::* | ./following-sibling::*)[@text='Electrician']]")
			private AndroidElement MoreOptionsoftheSearch;
		 
		 @AndroidFindBy(xpath="//*[text()='Disable Notifications']")
		 private AndroidElement disablenotificationsforsearch;
		 
			public void Disablenotificationsforsearch() throws InterruptedException
			{
				Thread.sleep(2000);
				FindaJob.click();
				Thread.sleep(3000);
				MoreOptionsoftheSearch.click();
				Thread.sleep(3000);
				disablenotificationsforsearch.click();
				Thread.sleep(2000);
			}
			
			public void EnableNotificationsforSearch() throws InterruptedException
			{
				Thread.sleep(2000);
				MoreOptionsoftheSearch.click();
				Thread.sleep(3000);	
				Enablenotificationsforsearch.click();
				Thread.sleep(2000);
			}
		 
		 @AndroidFindBy(xpath="//*[text()='Enable Notifications']")
		 private AndroidElement Enablenotificationsforsearch;
			
		 public void PausetheSearch() throws InterruptedException
		 {
			 Thread.sleep(2000);
			 MoreOptionsoftheSearch.click();
				Thread.sleep(3000);	
				PauseSearch.click();
				Thread.sleep(3000);
		 }
		 
		 public void ResumeSearch() throws InterruptedException
		 {
			 Thread.sleep(2000);
			 MoreOptionsoftheSearch.click();
				Thread.sleep(3000);	
				ResumeSearch.click();
				Thread.sleep(2000);
		 }
		 
			@AndroidFindBy(xpath ="//*[text()='Edit Search']")
			private AndroidElement EditSearch;
			
			@AndroidFindBy(xpath ="//*[text()='Pause Search']")
			private AndroidElement PauseSearch;
			

			@AndroidFindBy(xpath ="//*[text()='Resume Search']")
			private AndroidElement ResumeSearch;
			
			
			public void deletesearch() throws InterruptedException
			{
				Thread.sleep(2000);
				 MoreOptionsoftheSearch.click();
					Thread.sleep(3000);	
					DeleteSearch.click();
					Thread.sleep(3000);
					Delete.click();
					Thread.sleep(3000);
			}
		
			public void CancelSearch() throws InterruptedException
			{
				Thread.sleep(1000);
				 MoreOptionsoftheSearch.click();
					Thread.sleep(3000);	
					DeleteSearch.click();
					Thread.sleep(2000);
					Cancel.click();
					Thread.sleep(2000);
			}
			@AndroidFindBy(xpath ="//*[text()='Delete Search']")
			private AndroidElement DeleteSearch;
			@AndroidFindBy(xpath ="//*[text()='DELETE']")
			private AndroidElement Delete;
			@AndroidFindBy(xpath ="//*[text()='CANCEL']")
			private AndroidElement Cancel;
			
			@AndroidFindBy(id ="tv_categories")
			private AndroidElement cat;
			
		 public void SearchRadiustoFiveKms() throws InterruptedException
		 {
			 Thread.sleep(1000);
			 cat.click();
			 Thread.sleep(2000);
			 SearchRadius.click();
			 Thread.sleep(3000);
			 FiveKilometers.click();
			 Thread.sleep(3000);
			 SelectforRadius.click();
			 Thread.sleep(3000);
			 DoneButtonforSearch.click();
			 Thread.sleep(3000);
		 }
		 
		 public void SearchRadiustoTenKms() throws InterruptedException
		 {
			 Thread.sleep(1000);
			 cat.click();
			 Thread.sleep(2000);
			 SearchRadius.click();
			 Thread.sleep(3000);
			 TenKilometers.click();
			 Thread.sleep(3000);
			 SelectforRadius.click();
			 Thread.sleep(3000);
			 DoneButtonforSearch.click();
			 Thread.sleep(3000);
		 }
		 public void SearchRadiustoTwentyFiveKms() throws InterruptedException
		 {
			 Thread.sleep(1000);
			 cat.click();
			 SearchRadius.click();
			 Thread.sleep(3000);
			 TwentyFiveKilometers.click();
			 Thread.sleep(3000);
			 SelectforRadius.click();
			 Thread.sleep(3000);
			 DoneButtonforSearch.click();
			 Thread.sleep(3000);
		 }
		 public void SearchRadiustoFiftyKms() throws InterruptedException
		 {
			 Thread.sleep(1000);
			 cat.click();
			 SearchRadius.click();
			 Thread.sleep(3000);
			 FiftyKilometers.click();
			 Thread.sleep(3000);
			 SelectforRadius.click();
			 Thread.sleep(3000);
			 DoneButtonforSearch.click();
			 Thread.sleep(3000);
		 }
		 public void SearchRadiustoHundredKms() throws InterruptedException
		 {
			 Thread.sleep(1000);
			 cat.click();
			 SearchRadius.click();
			 Thread.sleep(3000);
			 HundredKilometers.click();
			 Thread.sleep(3000);
			 SelectforRadius.click();
			 Thread.sleep(3000);
			 DoneButtonforSearch.click();
			 Thread.sleep(3000);
		 }
			
		 public void SearchRadiustoTwoFiftyKms() throws InterruptedException
		 {
			 Thread.sleep(1000);
			 cat.click();
			 SearchRadius.click();
			 Thread.sleep(2000);
			 TwoFiftyKilometers.click();
			 Thread.sleep(2000);
			 SelectforRadius.click();
			 Thread.sleep(2000);
			 DoneButtonforSearch.click();
			 Thread.sleep(3000);
		 }
		 //Verify Mandatory Fields without data and Find 
			/* public void MandatoryFieldsWithoutData() throws InterruptedException{
			 FindaJob.click();	 
			 NewSearch.click();
			 Thread.sleep(2000);
			 jobterm.click();
			 Thread.sleep(2000);
			 cancel.click();
			 Thread.sleep(2000);
			 String stg=req.getText();
			 System.out.println("Mandatory fields"+stg);
			 }	 */
			 /*//Verify whether user can >6 Categories
			 public void Selectmorethan6Categories() throws InterruptedException {
				 FindaJob.click();
				 NewSearch.click();
				 SelectSearchCategory.click();
				 Thread.sleep(2000);
				 ElectricalCategory.click();
				 Thread.sleep(2000);
				 PlumblingCategory.click();
				 Thread.sleep(2000);
				 HeatandCoolCategory.click();
				 Thread.sleep(2000);
				 PaintandWallCategory.click();
				 Thread.sleep(2000);
				 ConstructionCategory.click();
				 Thread.sleep(2000);
				 CarpentryCategory.click();
				 Thread.sleep(2000);
				 Select.click();
			 }*/
			// Verify Rate DropDown  Android Functionality
		 
		 		
		 		
			 public void EditSearchforRateFieldasFixedBudget() throws InterruptedException {
			
				 Thread.sleep(1000);
				 cat.click();
				 Thread.sleep(4000);
				 rat.click();
				 
				 Thread.sleep(4000);
				 FixedBudget.click();
				 Thread.sleep(4000);
				 Select.click();
				 DoneButtonforSearch.click();
				 Thread.sleep(3000);
			 }
			 public void EditSearchforRateFieldasHourlyRate() throws InterruptedException {
			
				 Thread.sleep(1000);
				 cat.click();
				 Thread.sleep(4000);
				 rat.click();
				 Thread.sleep(4000);
				 HourlyRate.click();
				 Select.click();
				 DoneButtonforSearch.click();
				 Thread.sleep(3000);
			 }
			
			 public void PaymentFieldasEPayment() throws InterruptedException {
				
				 Thread.sleep(1000);
				 cat.click();
				 Thread.sleep(4000);
				 payment.click();
				 Thread.sleep(4000);
				 Epayment.click();
				 Thread.sleep(4000);
				 Select.click();
				 Thread.sleep(4000);
				 DoneButtonforSearch.click();
				 Thread.sleep(3000);
			 }
			 public void PaymentFieldasCash() throws InterruptedException {
				 

				 Thread.sleep(2000);
				 cat.click();
				 Thread.sleep(4000);
				 payment.click();
				 Thread.sleep(4000);
				 Cash.click();
				 Thread.sleep(4000);
				 Select.click();
				 Thread.sleep(4000);
				 DoneButtonforSearch.click();	
				 Thread.sleep(3000);
			 }
			 @AndroidFindBy(id ="til_job_term")
				private AndroidElement JobTerm;
			 @AndroidFindBy(xpath ="//*[text()='Recurring Job']")
				private AndroidElement RecurringJOb;
			 @AndroidFindBy(xpath ="//*[text()='Same Day Job']")
				private AndroidElement SameDayJOb;
			 @AndroidFindBy(xpath ="//*[text()='Multi Days Job']")
				private AndroidElement MultiDaysJob;
			 @AndroidFindBy(xpath ="//*[text()='SELECT']")
				private AndroidElement select;
			 
			 public void JobtermFieldasRecurring() throws InterruptedException {
				 Thread.sleep(1000);
				 cat.click();
				 Thread.sleep(2000);
				 JobTerm.click();
				 Thread.sleep(2000);
				 RecurringJOb.click();
				 Thread.sleep(2000);
				 select.click();
				 Thread.sleep(2000);
				 DoneButtonforSearch.click();
				 Thread.sleep(3000);
				 
			 }
			 public void JobtermFieldasSameDayJob() throws InterruptedException {
				Thread.sleep(1000);
				 cat.click();
				 Thread.sleep(2000);
				 JobTerm.click();
				 Thread.sleep(2000);
				 SameDayJOb.click();
				 Thread.sleep(2000);
				 select.click();
				 Thread.sleep(2000);
				 DoneButtonforSearch.click();
				 Thread.sleep(3000);
				 
			 }
			 public void JobtermFieldasMultiDaysJob() throws InterruptedException {
				 Thread.sleep(1000);
				 cat.click();
				 Thread.sleep(2000);
				 JobTerm.click();
				 Thread.sleep(2000);
				 MultiDaysJob.click();
				 Thread.sleep(2000);
				 select.click();
				 Thread.sleep(2000);
				 DoneButtonforSearch.click();
				 Thread.sleep(3000);
			 }
			
			 
			 
			 
}