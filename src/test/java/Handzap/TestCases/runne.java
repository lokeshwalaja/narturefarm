package Handzap.TestCases;

import org.testng.annotations.Test;

import PageObjects.EditPost;
import PageObjects.NewPostPage;
import TestUtility.Utility;

public class runne extends Utility{
	
	
	@Test(priority=1)
	 public void CreateNewPost() throws InterruptedException
	 {
		extentTest = extent.startTest("CreateNewPost");
		NewPostPage Newpost= new NewPostPage(driver);
		Newpost.CreateaNewPost();
	
	 }
	
@Test(priority=2)
public void editpostformultidaysjob() throws InterruptedException

{
	extentTest = extent.startTest("editpostformultidaysjob");
	EditPost editpostformultidaysjob=new EditPost(driver);
	
	editpostformultidaysjob.EditJobTermforPostasMultiDaysJob();
	
}

@Test(priority=3)
public void editpostasrecurringjob() throws InterruptedException

{
	extentTest = extent.startTest("editpostasrecurringjob");
	EditPost editpostasrecurringjob=new EditPost(driver);
	editpostasrecurringjob.EditJobTermforPostasRecurringJob();
	
}
@Test(priority=4)
public void editpostassamedayjob() throws InterruptedException

{
	extentTest = extent.startTest("editpostassamedayjob");
	EditPost editpostassamedayjob=new EditPost(driver);
	editpostassamedayjob.EditJobTermforPostasSameDayJob();
	
}
@Test(priority=5)
public void editpostforpaymentmethodascash() throws InterruptedException

{
	extentTest = extent.startTest("editpostforpaymentmethodascash");
	EditPost editpostforpaymentmethodascash=new EditPost(driver);
	editpostforpaymentmethodascash.EditpaymentMethodforPostasCash();
	
}
@Test(priority=6)
public void editpostforpaymentmethodasEpayment() throws InterruptedException

{
	extentTest = extent.startTest("editpostforpaymentmethodasEpayment");
	EditPost editpostforpaymentmethodasEpayment=new EditPost(driver);

	editpostforpaymentmethodasEpayment.EditpaymentMethodforPostasEpayment();
	
	
}
@Test(priority=7)
public void editpostforpaymentmethodasFixedBudget() throws InterruptedException

{
	extentTest = extent.startTest("editpostforpaymentmethodasFixedBudget");
	EditPost editpostforpaymentmethodasFixedBudget=new EditPost(driver);
	editpostforpaymentmethodasFixedBudget.EditRateforPostasFixedBudget();
	
	
}
@Test(priority=8)
public void editpostforpaymentmethodasHourlyRate() throws InterruptedException

{
	extentTest = extent.startTest("editpostforpaymentmethodasHourlyRate");
	EditPost editpostforpaymentmethodasHourlyRate=new EditPost(driver);
	editpostforpaymentmethodasHourlyRate.EditRateforPostasHourlyRate();
	
	
}

@Test(priority=9)
public void InviteFavourites() throws InterruptedException

{
	extentTest = extent.startTest("InviteFavourites");
	EditPost InviteFavourites=new EditPost(driver);
	InviteFavourites.invitefavourites();
}
@Test(priority=10)
public void DisableNotificationsforPost() throws InterruptedException

{
	extentTest = extent.startTest("DisableNotificationsforPost");
	EditPost Disablenotifications=new EditPost(driver);
	Disablenotifications.DisableNotificationsforPost();
}
@Test(priority=11)
public void EnableNotificationsforPost() throws InterruptedException

{
	extentTest = extent.startTest("EnableNotificationsforPost");
	EditPost Enablenotifications=new EditPost(driver);
	Enablenotifications.EnableNotificationsforPost();
}
@Test(priority=12)
public void PausePost() throws InterruptedException

{
	extentTest = extent.startTest("PausePost");
	EditPost PausePost=new EditPost(driver);
	PausePost.PausethePost();
}
@Test(priority=13)
public void ResumePost() throws InterruptedException

{
	extentTest = extent.startTest("ResumePost");
	EditPost ResumePost=new EditPost(driver);
	ResumePost.ResumethePost();
}

@Test(priority=14)
public void Cancelfordeletepost() throws InterruptedException

{
	extentTest = extent.startTest("Cancelfordeletepost");
	EditPost ResumePost=new EditPost(driver);
	ResumePost.Cancelfordeletepost();
}
	 
@Test(priority=15)
public void deletePost() throws InterruptedException

{
	extentTest = extent.startTest("deletePost");
	EditPost ResumePost=new EditPost(driver);
	ResumePost.deletePost();
}

}
