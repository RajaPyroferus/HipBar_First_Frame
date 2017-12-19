package Hipbar_user_app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;

public class Hipbar_Updated_Module 
{

	WebDriver driver;
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("udid", "33003dd826e6b3cb");
		cap.setCapability("deviceName", "Samsung");
		cap.setCapability("version", "6.0.1");
		cap.setCapability("platformName", "Android");
        // Here we mention the app's package name, to find the package name we  have to convert .apk file into java class files
		cap.setCapability("appPackage", "in.hipbar.hipbar_user_app");
		   //Here we mention the activity name, which is invoked initially as app's first page.                          
		cap.setCapability("appActivity", "in.hipbar.hipbar_user_app.ui.activities.SplashScreenActivity");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

	}

	@Test
    public void demo()
    {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("Beer")).click();
    }
	
	
}
