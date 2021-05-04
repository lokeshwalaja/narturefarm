package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class MenuInvitations extends Constructor
{
	
	public MenuInvitations(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	@AndroidFindBy(xpath="//*[contains(@class,'androidx.appcompat.widget.AppCompatImageButton')]")
     private AndroidElement Menubar;
	 
	@AndroidFindBy(id="tv_label_invitations")
	private AndroidElement MenuInvitations;
	
	@AndroidFindBy(xpath="//*[text()='Invitations']")
    private AndroidElement Invitations;
	
	@AndroidFindBy(id="Invitations")
	private AndroidElement Search;
	
	@AndroidFindBy(id="action_menu_filter")
	private AndroidElement Filters;
	
	@AndroidFindBy(xpath="//*[text()='Location (Nearest)']")
	private AndroidElement Locationnearestfilter;

	@AndroidFindBy(xpath="//*[text()='Poster Rating (Highest)']")
	private AndroidElement PosterRating;

	@AndroidFindBy(xpath="//*[text()='Post Start Date (Earliest)']")
	private AndroidElement PoststartDate;

	@AndroidFindBy(xpath="//*[text()='Unread Only']")
	private AndroidElement UnreadOnly;

	@AndroidFindBy(id="tv_ok_action")
	private AndroidElement OK;
	
	public void Menuinvitations() throws InterruptedException
	{
		Menubar.click();
		Thread.sleep(3000);
		MenuInvitations.click();
	}
	public void filtersforlocation() throws InterruptedException
	{
		Filters.click();
		Thread.sleep(3000);
		Locationnearestfilter.click();
		Thread.sleep(3000);
		OK.click();
		
	}
	public void filtersforPosterrating() throws InterruptedException
	{
		Filters.click();
		Thread.sleep(3000);
		PosterRating.click();
		Thread.sleep(3000);
		OK.click();
	}
	public void filtersforPostStartDate() throws InterruptedException
	{
		Filters.click();
		Thread.sleep(3000);
		PoststartDate.click();
		Thread.sleep(3000);
		OK.click();
		
	}
	public void UnReadMessages() throws InterruptedException
	{
		UnreadOnly.click();
		Thread.sleep(3000);
		OK.click();
	}
}