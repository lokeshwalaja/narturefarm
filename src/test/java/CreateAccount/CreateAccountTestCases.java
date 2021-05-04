package CreateAccount;


import org.testng.annotations.Test;

import PageObjects.CreateAccount;
import TestUtility.Utility;


public class CreateAccountTestCases extends Utility

{

	@Test(priority=1)

	public void CreateAccountwithInvalidPhoneNumber() throws InterruptedException
	{
		extentTest = extent.startTest("CreateAccountwithInvalidPhoneNumber");
		CreateAccount CA=new CreateAccount(driver);
		 CA.CreateAccountwithInValidMobilenumber();
		 CA.clearallfields();

		 
	}
	@Test(priority=2)

	public void CreateAccountwithInvalidFullName() throws InterruptedException
	{
		extentTest = extent.startTest("CreateAccountwithInvalidFullName");
		CreateAccount CAwithinvalidfullname=new CreateAccount(driver);
		CAwithinvalidfullname.CreateAccountwithInValidFullname();
		CAwithinvalidfullname.clearallfields();
		
		
	}
	@Test(priority=3)

	public void CreateAccountwithInvalidPassword() throws InterruptedException
	{
		extentTest = extent.startTest("CreateAccountwithInvalidPassword");
		CreateAccount CAwithinvalidfpassword=new CreateAccount(driver);
		CAwithinvalidfpassword.CreateAccountwithInValidPassword();
		CAwithinvalidfpassword.clearallfields();
		
		
	}
	@Test(priority=4)

	public void CreateAccountwithRegisterednumber() throws InterruptedException
	{
		extentTest = extent.startTest("CreateAccountwithRegisterednumber");
		CreateAccount CAwithRegisterednumber=new CreateAccount(driver);
		CAwithRegisterednumber.CreateAccountwithRegisteredmobileNumber();
		CAwithRegisterednumber.clearallfields();
		
		
	}
	@Test(priority=5)

	public void CreateAccountwithnumberirrespectivetocountry() throws InterruptedException
	{
		extentTest = extent.startTest("CreateAccountwithnumberirrespectivetocountry");
		CreateAccount CAwithnumberirrespectivetocountry=new CreateAccount(driver);
		CAwithnumberirrespectivetocountry.entermobilenumberwhichisirrespecttoselectcountry();
		CAwithnumberirrespectivetocountry.clearallfields();
		
	}
	
	
	
}