import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowseCricbuzz extends BaseChrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AndroidDriver<AndroidElement> driver = Capabilities();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.cricbuzz.com");

		driver.findElementByXPath("//a[@href='#menu']").click();

		driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();

		System.out.println(driver.getCurrentUrl()); // https://m.cricbuzz.com/

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,480)", "");
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));

		// adb devices stop start
		// adb kill-server
		// adb start-server
		// adb devices

	}

}
