package NewSearchRun;

import org.testng.annotations.Test;

import PageObjects.NewSearchPage;
import TestUtility.Utility;

public class NewSearch extends Utility
{
	
	 @Test(priority=1)
	 public void CreateNewSearch() throws InterruptedException
	 {
		 extentTest = extent.startTest("CreateNewSearch");
		NewSearchPage newsearch=new NewSearchPage(driver);
		newsearch.CreateaNewSearch();
		
	 }
	
}