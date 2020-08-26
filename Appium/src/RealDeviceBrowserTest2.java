import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.junit.Assert;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RealDeviceBrowserTest2 extends CapabilitiesForChromeBrowser {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Go to web page / m stands for mobile
		driver.get("https://m.cricbuzz.com/");
		
		//Click on Menu
		driver.findElement(By.xpath("//a[@href='#menu']")).click();
		
		//Click on Home
		driver.findElement(By.cssSelector("a[title='Cricbuzz Home']")).click();
		
		//Check url
		System.out.println(driver.getCurrentUrl());
		
		//Scroll down
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 480)", "");
		
		//If it is true then pass, if it is not fail
		Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
		
		
	}
}
