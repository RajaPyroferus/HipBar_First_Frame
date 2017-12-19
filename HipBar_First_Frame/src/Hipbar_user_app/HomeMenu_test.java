package Hipbar_user_app;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeMenu_test 
{

	WebDriver driver;
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("deviceName", "33003dd826e6b3cb");
		cap.setCapability("version", "6.0.1");
		cap.setCapability("platformName", "Android");
        // Here we mention the app's package name, to find the package name we  have to convert .apk file into java class files
		cap.setCapability("appPackage", "in.hipbar.hipbar_user_app");
		   //Here we mention the activity name, which is invoked initially as app's first page.                          
		cap.setCapability("appActivity", "in.hipbar.hipbar_user_app.UI.Activity.SplashScreenActivity");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

	}
	
	@Test(priority=1,description="To check Browse Drinks button is enable")
	public void Browse_Drinks()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement Browse_Drinks=driver.findElement(By.id("ll_browse"));
		Boolean status1=Browse_Drinks.isEnabled();
		Assert.assertTrue(status1);
		System.out.println("Browse Drinks button is enable");
		
	}
	
	@Test(priority=1,description="To check What's new button is enable")
	public void Whats_New()
	{
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		WebElement Whats_New=driver.findElement(By.id("ll_whats_new"));
		Boolean status1=Whats_New.isEnabled();
		Assert.assertTrue(status1);
		System.out.println("Browse Drinks button is enable");
		
	}
	
	
	
}
