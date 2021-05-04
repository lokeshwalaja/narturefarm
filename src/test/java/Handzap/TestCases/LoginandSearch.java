package Handzap.TestCases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.Test;

import TestUtility.Utility;
import PageObjects.LoginAndSearch;

	
public class LoginandSearch	extends Utility
{
	
	
	@Test(dataProvider="LoginAndSearch",priority=1)
	public void Search(String Phonenumber, String Password, String EnterSearchTitle, String Location) throws Exception {
	
		LoginAndSearch ls=new LoginAndSearch(driver);
		ls.loginsearch(Phonenumber, Password, EnterSearchTitle, Location);
	}	

	@AfterMethod
	public void logout() throws Exception {
		PageObjects.LoginAndPost lnp=new PageObjects.LoginAndPost(driver);
		lnp.logout();
	}
		

	}

