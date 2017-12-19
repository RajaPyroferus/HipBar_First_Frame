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

public class Hipbar_first_scenerio 
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
		cap.setCapability("appActivity", "in.hipbar.hipbar_user_app.UI.Activity.SplashScreenActivity");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);

	}

@Test(priority=1,description="This test case will click Browse Drinks button")
public void BrowsDrinks()
{
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	driver.findElement(By.name("agree & continue")).click();
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	driver.findElement(By.name("rowse Drinks")).click();
	
	
}
	 
@Test(priority=2,description="This test case will check and click on FromStores drinks",dependsOnMethods="BrowsDrinks")
public void FromStores() throws InterruptedException
{
	
	driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
    List<WebElement> drinks=driver.findElements(By.id("iv_browse_from_store_list"));
	
    for(int i=1; i<=3; i++)
    {
    	drinks.get(i).click();
    	Thread.sleep(3000);
    	driver.navigate().back();
    	Thread.sleep(3000);
    }
    
  
}





}
