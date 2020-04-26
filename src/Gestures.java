import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.touch.TouchActions;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;


public class Gestures extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

		WebElement expandlist = driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']");

		TouchAction t = new TouchAction(driver);

		t.tap(tapOptions().withElement(element(expandlist))).perform();
		
		driver.findElementByXPath("//android.widget.TextView[@text='1. Custom Adapter']").click();
		
		WebElement pnames = driver.findElementByXPath("//android.widget.TextView[@text='People Names']");
		
		t.longPress(longPressOptions().withElement(element(pnames)).withDuration(ofSeconds(2))).release().perform();
		
		System.out.println(driver.findElementById("android:id/title").isDisplayed());

	}

}
