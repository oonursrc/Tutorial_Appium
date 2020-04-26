import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomatortest extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		AndroidDriver<AndroidElement> driver =Capabilities();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		
		//driver.findElementByAndroidUIAutomator("text(\"Animation\")").click();
		
		
		//validate clickable feature for all options
		//driver.findElementByAndroidUIAutomator("new UiSelector().property(value)");
		
		System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());
		
		
	}

}
