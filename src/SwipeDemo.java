import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;

public class SwipeDemo extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

		driver.findElementByXPath("//android.widget.TextView[@text='Date Widgets']").click();

		driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();

		driver.findElementByXPath("//*[@content-desc='9']").click();

		TouchAction t = new TouchAction(driver);
		// long press 1 sec on element then move to aother element and release

		WebElement firstelem = driver.findElementByXPath("//*[@content-desc='15']");
		WebElement secondelem = driver.findElementByXPath("//*[@content-desc='45']");

		t.longPress(longPressOptions().withElement(element(firstelem)).withDuration(ofSeconds(1))).moveTo(element(secondelem)).release().perform();

		
	}

}
