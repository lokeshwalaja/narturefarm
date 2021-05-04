package PageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class PrivacyPage extends Constructor
{
	
	public PrivacyPage(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}

	@AndroidFindBy(id ="tv_post_notification")
	private AndroidElement PostNotifications;
	
	@AndroidFindBy(xpath="//*[@id='switch_audio_calls']")
	private AndroidElement TurnOffAudiocallsforPost;
	
	@AndroidFindBy(xpath="//*[@id='switch_video_calls']")
	private AndroidElement TurnOffVideocallsforPost;
	
	@AndroidFindBy(xpath="//*[@id='switch_all_alerts']")
	private AndroidElement DisableAlertsforPost;
	
	@AndroidFindBy(xpath="//*[@id='switch_all_notification']")
	private AndroidElement DisableAllNotificationsforPost;
	
	@AndroidFindBy(id="action_save")
	private AndroidElement SaveForPost;
	
	@AndroidFindBy(id ="tv_search_notification")
	private AndroidElement SearchNotifications;
	
	@AndroidFindBy(xpath="//*[@id='switch_audio_calls']")
	private AndroidElement TurnOffAudiocallsforSearch;
	
	@AndroidFindBy(xpath="//*[@id='switch_video_calls']")
	private AndroidElement TurnOffVideocallsforSearch;
	
	@AndroidFindBy(xpath="//*[@id='switch_all_alerts']")
	private AndroidElement DisableAlertsforSearch;
	
	@AndroidFindBy(xpath="//*[@id='switch_all_notification']")
	private AndroidElement DisableAllNotificationsforSearch;
	
	@AndroidFindBy(id="action_save")
	private AndroidElement SaveForSearch;
	
	@AndroidFindBy(id ="tv_do_not_distrub")
	private AndroidElement DoNotDisturb;
	public void AlwaysforDoNotdistrub() throws InterruptedException
	{
		DoNotDisturb.click();
		Thread.sleep(3000);
		AlwaysDND.click();
		Thread.sleep(3000);
		SaveForDND.click();
		Thread.sleep(3000);
	}
	public void ScheduledforDoNotDisturb() throws InterruptedException
	{
		DoNotDisturb.click();
		Thread.sleep(3000);
		ScheduleDND.click();
		Thread.sleep(3000);
		ScheduleDNDFrom.click();
		Thread.sleep(3000);
		OKButton.click();
		Thread.sleep(3000);
		ScheduleDNDTo.click();
		Thread.sleep(3000);
		TooKButton.click();
		Thread.sleep(3000);
		SaveForDND.click();
		Thread.sleep(3000);
	}
	
	@AndroidFindBy(xpath="//*[@id='switch_always']")
	private AndroidElement AlwaysDND;
	
	@AndroidFindBy(xpath="//*[@id='switch_scheduled']")
	private AndroidElement ScheduleDND;
	
	@AndroidFindBy(xpath="//*[text()='From']")
	private AndroidElement ScheduleDNDFrom;
	
	@AndroidFindBy(id="button1")
	private AndroidElement OKButton;
	
	@AndroidFindBy(xpath="//*[text()='To']")
	private AndroidElement ScheduleDNDTo;
	
	@AndroidFindBy(id="button1")
	private AndroidElement TooKButton;
	
	@AndroidFindBy(id="action_save")
	private AndroidElement SaveForDND;
	
	@AndroidFindBy(xpath="//*[text()='Posters’ Invitations']")
	private AndroidElement PostersInvitations;
	
	
	@AndroidFindBy(id="switch_poster_invitation")
	private AndroidElement DisablePostersInvitation;
	
	@AndroidFindBy(id="action_save")
	private AndroidElement SaveForDisablePostersInvitations;
	
	@AndroidFindBy(id ="tv_media_auto_download")
	private AndroidElement MediaAutoDownload;
	
	@AndroidFindBy(id ="tv_photos")
	private AndroidElement Photos;
	@AndroidFindBy(id="tv_audio")
	private AndroidElement Audio;
	@AndroidFindBy(id="tv_video")
	private AndroidElement Videos;
	@AndroidFindBy(id="tv_document")
	private AndroidElement Document;
	
	@AndroidFindBy(xpath ="//*[text()='Never']")
	private AndroidElement Never;
	@AndroidFindBy(xpath ="//*[text()='Wi-Fi']")
	private AndroidElement Wifi;
	@AndroidFindBy(xpath ="//*[text()='Always Allow']")
	private AndroidElement AlwaysAllow;
	@AndroidFindBy(xpath ="//*[text()='SELECT']")
	private AndroidElement Select;
	@AndroidFindBy(xpath ="//*[text()='Save']")
	private AndroidElement Save;
	
	
	@AndroidFindBy(xpath="//*[text()='Always Allow']")
	private AndroidElement AlwaysAllowforPictures;
	@AndroidFindBy(xpath="//*[text()='Wi-Fi']")
	private AndroidElement WiFiforPictures;
	@AndroidFindBy(xpath="//*[text()='Never']")
	private AndroidElement NeverforPictures;
	
	
	@AndroidFindBy(xpath="//*[text()='Always Allow']")
	private AndroidElement AlwaysAllowforAudio;
	@AndroidFindBy(xpath="//*[text()='Wi-Fi']")
	private AndroidElement WiFiforAudio;
	@AndroidFindBy(xpath="//*[text()='Never']")
	private AndroidElement NeverforAudio;
	
	@AndroidFindBy(id="tv_ok_action")
	private AndroidElement SelectForAudio;
	
	
	
	@AndroidFindBy(xpath="//*[text()='Always Allow']")
	private AndroidElement AlwaysAllowforVideo;
	
	@AndroidFindBy(xpath="//*[text()='Wi-Fi']")
	private AndroidElement WiFiforVideo;
	
	@AndroidFindBy(xpath="//*[text()='Never']")
	private AndroidElement NeverforVideo;
	
	@AndroidFindBy(id="tv_ok_action")
	private AndroidElement SelectForVideo;
	
	
	
	@AndroidFindBy(xpath="//*[text()='Always Allow']")
	private AndroidElement AlwaysAllowforDocuments;
	
	@AndroidFindBy(xpath="//*[text()='Wi-Fi']")
	private AndroidElement WiFiforDocuments;
	
	@AndroidFindBy(xpath="//*[text()='Never']")
	private AndroidElement NeverforDocuments;
	
	@AndroidFindBy(id="tv_ok_action")
	private AndroidElement SelectForDocument;
	/*
	@AndroidFindBy(id ="tv_read_receipts")
	private AndroidElement ReadReceipts;
	
	@AndroidFindBy(id="switch_read_receipts")
	private AndroidElement DisableReadReceipts;
	
	@AndroidFindBy(id="action_save")
	private AndroidElement SaveForDisableReadReceipts;*/
	
	
	@AndroidFindBy(xpath="//*[text()='History Retention']")
	private AndroidElement HistoryRetention;
	
	@AndroidFindBy(id="tv_duration")
	private AndroidElement Duration;
	
	
	
	@AndroidFindBy(xpath="//*[text()='6 Months']")
	private AndroidElement SixMonths;
	
	@AndroidFindBy(xpath="//*[text()='9 Months']")
	private AndroidElement NineMonths;
	
	@AndroidFindBy(xpath="//*[text()='12 Months']")
	private AndroidElement TweleveMonths;
	
	@AndroidFindBy(id="tv_ok_action")
	private AndroidElement ApplyforDuration;
	
	@AndroidFindBy(xpath="//*[text()='Delete Account']")
	private AndroidElement DeleteAccount;
	
	@AndroidFindBy(xpath="//*[text()='DELETE']")
	private AndroidElement Delete;
	
	@AndroidFindBy(xpath="//*[text()='CANCEL']")
	private AndroidElement Cancel;
	
	public void autoDownloadedNever() throws InterruptedException
	{
		Thread.sleep(2000);
		MediaAutoDownload.click();
		Thread.sleep(2000);
		Photos.click();
		Thread.sleep(1000);
		Never.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Audio.click();
		Thread.sleep(1000);
		Never.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Videos.click();
		Thread.sleep(1000);
		Never.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Document.click();
		Thread.sleep(1000);
		Never.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(4000);
		
	}
	
	public void autoDownloadedWiFi() throws InterruptedException
	{
		Thread.sleep(2000);
		MediaAutoDownload.click();
		Thread.sleep(2000);
		Photos.click();
		Thread.sleep(1000);
		Wifi.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Audio.click();
		Thread.sleep(1000);
		Wifi.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Videos.click();
		Thread.sleep(1000);
		Wifi.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Document.click();
		Thread.sleep(1000);
		Wifi.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(4000);
		
	}
	public void autoDownloadedAlwaysAllow() throws InterruptedException
	{
		Thread.sleep(2000);
		MediaAutoDownload.click();
		Thread.sleep(2000);
		Photos.click();
		Thread.sleep(1000);
		AlwaysAllow.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Audio.click();
		Thread.sleep(1000);
		AlwaysAllow.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Videos.click();
		Thread.sleep(1000);
		AlwaysAllow.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Document.click();
		Thread.sleep(1000);
		AlwaysAllow.click();
		Thread.sleep(1000);
		Select.click();
		Thread.sleep(1000);
		Save.click();
		Thread.sleep(4000);
		
	}
	
	public void disableAudioCallsforPost() throws InterruptedException
	{
		PostNotifications.click();
		Thread.sleep(3000);
	TurnOffAudiocallsforPost.click();
	Thread.sleep(2000);
	SaveForPost.click();
	Thread.sleep(3000);
	
	}
	public void disableVideoCallsforPost() throws InterruptedException
	{
		Thread.sleep(2000);
		PostNotifications.click();
		Thread.sleep(3000);
		TurnOffVideocallsforPost.click();
		Thread.sleep(2000);
		SaveForPost.click();
		Thread.sleep(3000);
	}
public void disableAlertsforPost() throws InterruptedException


{
	PostNotifications.click();
	Thread.sleep(3000);
	DisableAlertsforPost.click();
	Thread.sleep(2000);
	SaveForPost.click();
	Thread.sleep(3000);
}
public void disableAllnotificationsforPost() throws InterruptedException
{
	Thread.sleep(2000);
	PostNotifications.click();
	Thread.sleep(3000);
	DisableAllNotificationsforPost.click();
	Thread.sleep(2000);
	SaveForPost.click();
	Thread.sleep(3000);
}

public void disableAudioCallsforSearch() throws InterruptedException
{
	Thread.sleep(2000);
	SearchNotifications.click();
	Thread.sleep(3000);
TurnOffAudiocallsforSearch.click();
Thread.sleep(2000);
SaveForSearch.click();
Thread.sleep(3000);

}
public void disableVideoCallsforSearch() throws InterruptedException
{
	SearchNotifications.click();
	Thread.sleep(3000);
	TurnOffVideocallsforSearch.click();
	Thread.sleep(2000);
	SaveForSearch.click();
	Thread.sleep(3000);
}
public void disableAlertsforSearch() throws InterruptedException


{
	SearchNotifications.click();
Thread.sleep(3000);
DisableAlertsforSearch.click();
Thread.sleep(2000);
SaveForSearch.click();
Thread.sleep(3000);
}
public void disableAllnotificationsforSearch() throws InterruptedException
{
	SearchNotifications.click();
Thread.sleep(3000);
DisableAllNotificationsforSearch.click();
Thread.sleep(2000);
SaveForSearch.click();
Thread.sleep(3000);
}
@AndroidFindBy(xpath="//*[text()='Read Receipts']")
private AndroidElement ReadReceipts;

@AndroidFindBy(id="switch_read_receipts")
private AndroidElement DisableReadReceipts;

@AndroidFindBy(id="action_save")
private AndroidElement SaveForDisableReadReceipts;


public void ReadReceipts() throws InterruptedException
{
	

}
public void DeleteAccount() throws InterruptedException
	{
		DeleteAccount.click();
		Thread.sleep(3000);
		Delete.click();
		Thread.sleep(3000);
		
	}
	
	@AndroidFindBy(id="tv_history_retention")
	private AndroidElement Historyretention;

	@AndroidFindBy(id="tv_duration")
	private AndroidElement Durationforhistory;

	@AndroidFindBy(id="action_save")
	private AndroidElement SaveforHistoryretention;

		public void SetDurationforSixMonths() throws InterruptedException
		{
			Thread.sleep(2000);
			Historyretention.click();
			Thread.sleep(3000);
			Durationforhistory.click();
			Thread.sleep(2000);
			SixMonths.click();
			Thread.sleep(2000);
			ApplyforDuration.click();
			Thread.sleep(2000);
			SaveforHistoryretention.click();
			Thread.sleep(3000);
		}
		public void SetDurationforNineMonths() throws InterruptedException
		{
			Historyretention.click();
			Thread.sleep(2000);
			Durationforhistory.click();
			Thread.sleep(2000);
			NineMonths.click();
			Thread.sleep(2000);
			ApplyforDuration.click();
			Thread.sleep(2000);
			SaveforHistoryretention.click();
			Thread.sleep(3000);
			
		}
		public void SetDurationforTweleveMonths() throws InterruptedException
		{
			Historyretention.click();
			Thread.sleep(2000);
			Durationforhistory.click();
			Thread.sleep(2000);
			TweleveMonths.click();
			Thread.sleep(2000);
			ApplyforDuration.click();
			Thread.sleep(2000);
			SaveforHistoryretention.click();
			Thread.sleep(3000);
		}
		public void SetDurationforNever() throws InterruptedException
		{
			Historyretention.click();
			Thread.sleep(2000);
			Durationforhistory.click();
			Thread.sleep(2000);
			Never.click();
			Thread.sleep(2000);
			ApplyforDuration.click();
			Thread.sleep(2000);
			SaveforHistoryretention.click();
			Thread.sleep(3000);
		}
		public void DisablePostersInvitations() throws InterruptedException
		{
			PostersInvitations.click();
			Thread.sleep(3000);
			DisablePostersInvitation.click();
			Thread.sleep(2000);
			SaveForDisablePostersInvitations.click();
			Thread.sleep(3000);
		}
	}