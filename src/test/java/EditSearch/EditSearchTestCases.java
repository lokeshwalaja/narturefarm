package EditSearch;

import org.testng.annotations.Test;

import PageObjects.EditSearch;
import TestUtility.Utility;

public class EditSearchTestCases extends Utility{
	
	
	
	@Test(priority=1)
	public void DisableNotificationsforsearch() throws InterruptedException
	{
		extentTest = extent.startTest("DisableNotificationsforsearch");
		EditSearch disablenotificationsforsearch=new EditSearch(driver);
		disablenotificationsforsearch.Disablenotificationsforsearch();
		
	}
	@Test(priority=2)
	public void EnableNotificationsforsearch() throws InterruptedException
	{
		extentTest = extent.startTest("EnableNotificationsforsearch");
		EditSearch enablenotificationsforsearch=new EditSearch(driver);
		enablenotificationsforsearch.EnableNotificationsforSearch();
		
	}
	@Test(priority=3)
	public void Pausesearch() throws InterruptedException
	{
		extentTest = extent.startTest("Pausesearch");
		EditSearch Pausesearch=new EditSearch(driver);
		Pausesearch.PausetheSearch();
		
	}
	@Test(priority=4)
	public void Resumesearch() throws InterruptedException
	{
		extentTest = extent.startTest("Resumesearch");
		EditSearch Resumesearch=new EditSearch(driver);
		Resumesearch.ResumeSearch();
		
	}
	
	/*@Test(priority=34)
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
*/

}
