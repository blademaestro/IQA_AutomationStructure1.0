package selenium.Util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;


public class BrowserFactory {
	

	
	public static WebDriver initializeDriver()
	{
		
		System.out.println("Running Set Property Webdriver Marrionette");
		System.setProperty("webdriver.firefox.marionette", UtilityConfiguration.marionetteDriverLocation);		
		System.out.println("Running driver");
		
		ProfilesIni mozillaProfiles = new ProfilesIni();
		FirefoxProfile profile = mozillaProfiles.getProfile("testProfile");
		WebDriver driver = new FirefoxDriver(profile);
		
		driver.manage().window().maximize();
		return driver;

	}
	
	public static WebDriver initializeMozillaDriver()
	{
		
		System.setProperty("webdriver.firefox.marionette", UtilityConfiguration.marionetteDriverLocation);
		Util.logger("Initialize Marrionete Driver");
		ProfilesIni mozillaProfiles = new ProfilesIni();
		FirefoxProfile profile = mozillaProfiles.getProfile("testProfile");
		WebDriver driver = new FirefoxDriver(profile);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver initializeChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", UtilityConfiguration.chromeDriverLocation);
		Util.logger("Initialize Chrome Driver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	
	

}
