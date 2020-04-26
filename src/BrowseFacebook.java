import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowseFacebook extends BaseChrome{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver =Capabilities();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("http://www.facebook.com");
		
		driver.findElementByXPath("//*[@id='m_login_email']").sendKeys("onur@kanki.com");
		
		driver.findElementByXPath("//*[@id='m_login_password']").sendKeys("1234");
		
		driver.findElementByXPath("//button[@value='Giriş Yap']").click(); // Turkish using in real device
		
		
	}

}
