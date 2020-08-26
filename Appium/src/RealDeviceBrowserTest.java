import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class RealDeviceBrowserTest extends CapabilitiesForChromeBrowser {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = Capabilities();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		//Go to web page
		driver.get("http://facebook.com");
		
		//Enter email
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("email@google.com");
		
		//Enter password
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
		
		//Click on login button
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}
}
