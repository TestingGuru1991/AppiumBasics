import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Uiautomatortest extends base{

	public static void main(String[] args) throws MalformedURLException {
		
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//BASIC: driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
		// Scroll till you find View and click on it
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Views\").instance(0))").click();
		
		// Validate clickable feature for all options
		int count = driver.findElementsByAndroidUIAutomator("new UiSelector().clickable(true)").size();
		System.out.println("Clickable element count: " + count);

	}

}
