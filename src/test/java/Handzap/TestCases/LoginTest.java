package Handzap.TestCases;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import TestUtility.TestNGUtilityLogin;
import TestUtility.Utility;
import PageObjects.Login;
import PageObjects.NewSearch;
import PageObjects.OTPPage;
//import com.datadrivenTestNG.utility.TestNGUtility;


public class LoginTest extends Utility{
	

	
	@Test(dataProvider="getTestData",priority=1)
	public void login(String Phonenumber, String Password) throws Exception 
	{
		extentTest = extent.startTest("login");
		Login lp=new Login(driver);
		lp.login(Phonenumber, Password);
		
	}
	@Test(dataProvider="PostData",priority=2)
	public void NewPost(String title,String desc,String budg,String loc) throws Exception
	{
		extentTest = extent.startTest("NewPost");
		PageObjects.NewPost np= new PageObjects.NewPost(driver);
		np.createpost(title, desc, budg, loc);
	}
	
	@Test(dataProvider="SearchData",priority=3)
	public void NewSearch(String EnterSearchTitle,String Location) throws Exception
	{
		NewSearch ns=new NewSearch(driver);
		ns.Search(EnterSearchTitle, Location);
		
	}
	
	@AfterClass
	public void logout() throws InterruptedException
	{
		Login lp=new Login(driver);
		lp.logout();
	}

}
