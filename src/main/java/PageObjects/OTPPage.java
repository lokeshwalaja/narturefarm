package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OTPPage {

// public String phonenumber;
public static WebDriver webdriver;
public  String OTPvalue;




public static WebDriver getWebdriver() {
	return webdriver;
}




public static void setWebdriver(WebDriver webdriver) {
	OTPPage.webdriver = webdriver;
}




public String getOTPvalue() {
	return OTPvalue;
}




public void setOTPvalue(String oTPvalue) {
	OTPvalue = oTPvalue;
}




public void enterotp() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver", "F:\\server driver\\ChromeDriver.exe");
	  webdriver = new ChromeDriver();
	  
		

webdriver.get("https://dev-alb.dt.handzap.com/in/onboarding/v1/otp-value?complete_mobile_number=+916304337562");

 webdriver.manage().window().maximize();
 String OTPvalue1=(String) webdriver.getPageSource().subSequence(177, 183);
 Thread.sleep(3000);
 System.out.println(OTPvalue1);
 this.OTPvalue = OTPvalue1;
 
}
public void closechromedriver()
{
	webdriver.close();
}

	
	

}