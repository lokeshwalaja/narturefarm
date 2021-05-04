package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class EditPost extends Constructor
	{
	
	public EditPost(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	@AndroidFindBy(xpath ="//*[@id='iv_settings' and (./preceding-sibling::* | ./following-sibling::*)[@text='Need a Electrician to fix AC']]")
	private AndroidElement MoreOptionsofthePost;
	
	@AndroidFindBy(xpath ="//*[text()='Edit Post']")
	private AndroidElement EditPost;
	
	@AndroidFindBy(id ="iv_add")
	private AndroidElement PostAttachments;
	
	@AndroidFindBy(xpath ="//*[text()='Camera']")
	private AndroidElement Camera;
	
	@AndroidFindBy(xpath ="//*[text()='Photos & Videos']")
	private AndroidElement PhotosandVideos;
	
	@AndroidFindBy(xpath ="//*[text()='Document']")
	private AndroidElement Document;
	
	@AndroidFindBy(id ="til_payment_method")
    private AndroidElement PaymentMethod;
	
	@AndroidFindBy(xpath ="//*[text()='E-Payment']")
	private AndroidElement EPayment;
	
	@AndroidFindBy(xpath ="//*[text()='Cash']")
	private AndroidElement Cash;
	
	@AndroidFindBy(xpath ="//*[text()='SELECT']")
	private AndroidElement SelectforPaymentMethod;
	
	@AndroidFindBy(id ="til_rate")
    private AndroidElement Rate;
	
	@AndroidFindBy(xpath ="//*[text()='Fixed Budget']")
	private AndroidElement FixedBudget;
	
	@AndroidFindBy(xpath ="//*[text()='Hourly Rate']")
	private AndroidElement HourlyRate;
	
	@AndroidFindBy(xpath ="//*[text()='SELECT']")
	private AndroidElement SelectforRate;
	
	@AndroidFindBy(id ="til_job_term")
    private AndroidElement JobTerm;
	
	@AndroidFindBy(xpath ="//*[text()='Recurring Job']")
	private AndroidElement RecurringJob;
	
	@AndroidFindBy(xpath ="//*[text()='Same Day Job']")
	private AndroidElement SameDayJob;
	
	@AndroidFindBy(xpath ="//*[text()='Multi Days Job']")
	private AndroidElement MultidaysJob;
	
	@AndroidFindBy(xpath ="//*[text()='SELECT']")
	private AndroidElement SelectforJobTerm;
	
	@AndroidFindBy(xpath ="//*[text()='Done']")
	private AndroidElement Done;
	
	 @AndroidFindBy(id ="et_title")
	    private AndroidElement Enterposttitle;
	 
	 @AndroidFindBy(id ="tv_frequency")
	    private AndroidElement Jobterminpostcard;
	 
	 public void EditJobTermforPostasMultiDaysJob() throws InterruptedException
	 {
		 Thread.sleep(1000);
		 MoreOptionsofthePost.click();
		 Thread.sleep(3000);
		 EditPost.click();
		 Thread.sleep(3000);
		 JobTerm.click(); 
		 Thread.sleep(3000);
		 MultidaysJob.click();
		 Thread.sleep(3000);
		 SelectforJobTerm.click();
		 Thread.sleep(3000);
		 Done.click();
		 Thread.sleep(3000);
		 String ActualJobterm=Jobterminpostcard.getText();
		 System.out.println(ActualJobterm);
		 Thread.sleep(1000);
		 String ExpJobTerm="Multi Days Job";
		
		 if (ExpJobTerm.equals(ActualJobterm))
		 {
		     System.out.println("Job term is Changed");
		 }
		 else
		 {
			 System.out.println("Job term is Not Changed"); 
		 }
		 
	 }
	 public void EditJobTermforPostasSameDayJob() throws InterruptedException
	 {
		 Thread.sleep(1000);
		 MoreOptionsofthePost.click();
		 Thread.sleep(3000);
		 EditPost.click();
		 Thread.sleep(3000);
		 JobTerm.click(); 
		 Thread.sleep(3000);
		 SameDayJob.click();
		 Thread.sleep(3000);
		 SelectforJobTerm.click();
		 Thread.sleep(3000);
		 Done.click();
		 Thread.sleep(3000);
		 String ActualJobterm=Jobterminpostcard.getText();
		 System.out.println(ActualJobterm);
		 String ExpJobTerm="Same Day Job";
		
		 if (ExpJobTerm.equals(ActualJobterm))
		 {
		     System.out.println("Job term is Changed");
		 }
		 else
		 {
			 System.out.println("Job term is Not Changed"); 
		 }
		 
	 }
	 public void EditJobTermforPostasRecurringJob() throws InterruptedException
	 {
		 Thread.sleep(1000);
		 MoreOptionsofthePost.click();
		 Thread.sleep(3000);
		 EditPost.click();
		 Thread.sleep(3000);
		 JobTerm.click(); 
		 Thread.sleep(3000);
		 RecurringJob.click();
		 Thread.sleep(3000);
		 SelectforJobTerm.click();
		 Thread.sleep(3000);
		 Done.click();
		 Thread.sleep(3000);
		 String ActualJobterm=Jobterminpostcard.getText();
		 System.out.println(ActualJobterm);
		 String ExpJobTerm="Recurring Job";
		
		 if (ExpJobTerm.equals(ActualJobterm))
		 {
		     System.out.println("Job term is Changed");
		 }
		 else
		 {
			 System.out.println("Job term is Not Changed"); 
		 }
		 
	 }
	 
	 public void EditpaymentMethodforPostasEpayment() throws InterruptedException
	 {
		 Thread.sleep(1000);
		 MoreOptionsofthePost.click();
		 Thread.sleep(3000);
		 EditPost.click();
		 Thread.sleep(3000);
		 PaymentMethod.click();
		 Thread.sleep(3000);
		 EPayment.click();
		 Thread.sleep(3000);
		 SelectforPaymentMethod.click();
		 Thread.sleep(3000);
		 Done.click();
		 Thread.sleep(3000);
		 
	 }
	 public void EditpaymentMethodforPostasCash() throws InterruptedException
	 {
		 Thread.sleep(1000);
		 MoreOptionsofthePost.click();
		 Thread.sleep(3000);
		 EditPost.click();
		 Thread.sleep(3000);
		 PaymentMethod.click();
		 Thread.sleep(3000);
		 Cash.click();
		 Thread.sleep(3000);
		 SelectforPaymentMethod.click();
		 Thread.sleep(3000);
		 Done.click();
		 Thread.sleep(3000);
	 }
	 public void EditRateforPostasFixedBudget() throws InterruptedException
	 {
		 Thread.sleep(1000);
		 MoreOptionsofthePost.click();
		 Thread.sleep(3000);
		 EditPost.click();
		 Thread.sleep(3000);
		 Rate.click();
		 Thread.sleep(3000);
		 FixedBudget.click();
		 Thread.sleep(3000);
		 SelectforRate.click();
		 Thread.sleep(3000);
		 Done.click();
		 Thread.sleep(3000);
	 }
	 public void EditRateforPostasHourlyRate() throws InterruptedException
	 {
		 Thread.sleep(1000);
		 MoreOptionsofthePost.click();
		 Thread.sleep(3000);
		 EditPost.click();
		 Thread.sleep(3000);
		 Rate.click();
		 Thread.sleep(3000);
		 HourlyRate.click();
		 Thread.sleep(3000);
		 SelectforRate.click();
		 Thread.sleep(3000);
		 Done.click();
		 Thread.sleep(3000);
	 }
	 
	 @AndroidFindBy(xpath="//*[text()='Disable Notifications']")
	 private AndroidElement disablenotifications;
	 
		@AndroidFindBy(xpath="//*[text()='Pause Post']")
		private AndroidElement PAUSE;
		
		@AndroidFindBy(xpath="//*[text()='Resume Post']")
		private AndroidElement RESUME;
	 
		@AndroidFindBy(xpath="//*[text()='Delete Post']")
		private AndroidElement delete;
		
		@AndroidFindBy(xpath="//*[text()='DELETE']") 
		 private AndroidElement Deleteinthepopup;
		
		@AndroidFindBy(xpath="//*[text()='CANCEL']")
		private AndroidElement CANCEL;
		
		public void deletePost() throws InterruptedException
		{
			Thread.sleep(1000);
			MoreOptionsofthePost.click();
			 Thread.sleep(3000);
			 
			delete.click();
			Thread.sleep(3000);
			Deleteinthepopup.click();
			Thread.sleep(3000);
			
		}
		public void Cancelfordeletepost() throws InterruptedException
		{
			Thread.sleep(1000);
			MoreOptionsofthePost.click();
			 Thread.sleep(3000);
			 
			delete.click();
			Thread.sleep(3000);
			CANCEL.click();
			Thread.sleep(1000);
		}
		 public void DisableNotificationsforPost() throws InterruptedException
		 {
			 Thread.sleep(1000);
			 MoreOptionsofthePost.click();
			 Thread.sleep(2000);
			 disablenotifications.click();
			 Thread.sleep(3000);
		 }
		
		@AndroidFindBy(xpath="//*[text()='Enable Notifications']")
		private AndroidElement enablenotifications;
		
		 public void EnableNotificationsforPost() throws InterruptedException
		 {
			 Thread.sleep(1000);
			 MoreOptionsofthePost.click();
			 Thread.sleep(2000);
			 enablenotifications.click();
			 Thread.sleep(3000);
		 }
		 public void PausethePost() throws InterruptedException
		 {
			 Thread.sleep(1000);
			 MoreOptionsofthePost.click();
			 Thread.sleep(3000);
			 PAUSE.click();
			 Thread.sleep(3000);
		 }
	
		public void ResumethePost() throws InterruptedException
		 {
			Thread.sleep(1000);
			 MoreOptionsofthePost.click();
			 Thread.sleep(3000);
			 RESUME.click();
			 Thread.sleep(3000);
		 }
		
		
		@AndroidFindBy(xpath="//*[text()='Invite Favorites']")
		private AndroidElement inviteFavotites;
		@AndroidFindBy(xpath="//*[@id='iv_profile']")
		private AndroidElement SelectUser;
		@AndroidFindBy(xpath="//*[@text='Invite']")
		private AndroidElement invite;
		@AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
		private AndroidElement NavigateBack;
		@AndroidFindBy(id ="tv_empty_post_description‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏")
		private AndroidElement NoContent;
		
		public void invitefavourites() throws InterruptedException
		{
			Thread.sleep(1000);
			 MoreOptionsofthePost.click();
			 Thread.sleep(2000);
			 inviteFavotites.click();
			 Thread.sleep(3000);
			 SelectUser.click();
			 Thread.sleep(3000);
			 /*String Content=NoContent.getText();
			 System.out.println(Content);*/
			 invite.click();
			 Thread.sleep(2000);
			 NavigateBack.click();
		}
}