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

public class DragDrop extends Base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElementByXPath("//android.widget.TextView[@text='Views']").click();

		driver.findElementByXPath("//android.widget.TextView[@text='Drag and Drop']").click();

		TouchAction t = new TouchAction(driver);
		// long press 1 sec , move and release to destination

		WebElement source = driver.findElementsByClassName("android.view.View").get(0);
		WebElement destination = driver.findElementsByClassName("android.view.View").get(1);

		t.longPress(longPressOptions().withElement(element(source)).withDuration(ofSeconds(1)))
				.moveTo(element(destination)).release().perform();

	}

}
