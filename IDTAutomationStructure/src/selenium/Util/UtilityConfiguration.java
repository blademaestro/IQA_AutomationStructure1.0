package selenium.Util;

public class UtilityConfiguration {
	
	public final static String marionetteDriverLocation = "AddOns\\BrowserDriver\\geckoDriver.exe";
	
	public final static String chromeDriverLocation = "AddOns\\BrowserDriver\\chromeDriver.exe";
	
	public final static String screenshotFilePath = "test-output\\Test-Screenshot\\" + Util.generateTimeNow() + "\\";
	public final static String screenshotFileType = ".png";
	
	public final static String reportFilePath = "Test-Screenshot\\" + Util.generateTimeNow() + "\\";
	public final static int driverWait_Duration = 10;

}
