package geForceSelenium.gForce.Configuration;


import java.io.IOException;
import java.lang.reflect.Method;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import geForceSelenium.gForce.Data.webClassData;
import geForceSelenium.gForce.Data.webStudentData;
import geForceSelenium.gForce.Data.webTeacherData;
import geForceSelenium.gForce.POM.webClassPOM;
import geForceSelenium.gForce.POM.webStudentPOM;
import geForceSelenium.gForce.POM.webTeacherPOM;
import selenium.Util.BrowserFactory;
import selenium.Util.Util;
import selenium.Util.UtilityConfiguration;

public class TestCaseBase {

	public static WebDriver driver;
	public static webStudentPOM studentPage;
	public static webStudentData studentData;
	public static webTeacherPOM teacherPage;
	public static webTeacherData teacherData;
	public static webClassPOM classPage;
	public static webClassData classData;
	

	 
	public TestCaseBase() {
		
	}

	@BeforeTest
	public void setupTest()
	{
		studentPage = new webStudentPOM();
		studentData = new webStudentData();
		teacherPage = new webTeacherPOM();
		teacherData = new webTeacherData();
		classPage = new webClassPOM();
		classData = new webClassData();
		
		//ExtentReports extent = new ExtentReports();
		driver = BrowserFactory.initializeDriver();
		projectRoutines.loginRoutine(driver);
		
	}
	
	@BeforeMethod
	public void beforeTest(Method method)
	{
		//System.out.println(UtilityConfiguration.marionetteDriverLocation);
		Util.defaultBeforeMethod(method);
		Util.temporaryWaitSolution();
		Util.temporaryWaitSolution();
		Util.goToURL(driver, projectConfiguration.homeURL);
	
	}
	
	@AfterMethod
	public void afterMethod(Method method, ITestResult result) throws IOException
	{
		Reporter.setCurrentTestResult(result);
		if (ITestResult.FAILURE == result.getStatus())
		{
			Util.takeScreenshot(driver, method, "FAILED");
		}
		else
		{
			Util.takeScreenshot(driver, method, "SUCCESS");
		}
		
		
		
		
	}
	
	@AfterTest
	public void afterTest ()
	{
		//driver.quit();
	}
	// How to destroy webdriver session
	
}
