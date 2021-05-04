package NewPostRun;

import org.testng.annotations.Test;

import PageObjects.NewPostPage;
import TestUtility.Utility;

public class NewPost extends Utility

{

	 @Test(priority=0)
	 public void CreateNewPost() throws InterruptedException
	 {
		 extentTest = extent.startTest("CreateNewPost");
		NewPostPage Newpost= new NewPostPage(driver);
		Newpost.CreateaNewPost();
	
	 }
}