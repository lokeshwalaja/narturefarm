package PageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class Log extends Constructor{

	public Log(AndroidDriver<AndroidElement> driver) {
		super(driver);
	}
	
	@AndroidFindBy(xpath="//*[@contentDescription='‎‏‎‎‎‎‎‏‎‏‏‏‎‎‎‎‎‏‎‎‏‎‎‎‎‏‏‏‏‏‎‏‏‎‏‏‎‎‎‎‏‏‏‏‏‏‏‎‏‏‏‏‏‎‏‎‎‏‏‎‏‎‎‎‎‎‏‏‏‎‏‎‎‎‎‎‏‏‎‏‏‎‎‏‎‏‎‏‏‏‏‏‎‎Navigate up‎‏‎‎‏‎']")
	private AndroidElement CreateAccountBack;
	
	@AndroidFindBy(xpath="//*[text()='Log In']")
	private AndroidElement LogIn;
	
	@AndroidFindBy(id="et_phone_number")
	private AndroidElement ph;
	@AndroidFindBy(id="et_password")
	private AndroidElement pas;
	@AndroidFindBy(id="action_next")
	private AndroidElement nxt;
	
	
	@AndroidFindBy(xpath="//*[text()='Next']")
	private AndroidElement Next;
	
	public void log() throws InterruptedException {
		
		CreateAccountBack.click();
		Thread.sleep(4000);
		LogIn.click();
		Thread.sleep(2000);
		ph.sendKeys("8106400696");
		Thread.sleep(2000);
		pas.sendKeys("123456");
		nxt.click();
		Thread.sleep(5000);
		
		
	}

}
