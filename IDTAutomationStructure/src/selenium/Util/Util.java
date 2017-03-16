package selenium.Util;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotSelectableException;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Util {


//	INTERACTION METHODS
//	------------------------------------------------------------------------------------------------------------------------------------
//	------------------------------------------------------------------------------------------------------------------------------------
	public static void goToURL(WebDriver driver, String url)
	{
		driver.navigate().to(url);
		Util.logger("Navigating to :" + url);
	}
	public static WebElement retrieveThis (WebDriver driver, By byFinder )
	{
		try
		{
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(byFinder));
			WebElement e = driver.findElement(byFinder);
			Util.logger("Retrieve this element " + e.getText() );
			return e;
		}
		catch(NoSuchElementException e)
		{
			Util.logger("FAILED: Unable to retrieve element, See error below for more details");
			throw e;
		}
	}
	public static void selectThis(WebDriver driver, By byFinder, String value, String message)
	{
		selectThis(driver, byFinder, value);
		Util.logger("Selecting " + String.valueOf(value) + " in " + message + " Select Field");
	}	
	public static void selectThis(WebDriver driver, By byFinder, String value)
	{
		try
		{
			(new WebDriverWait(driver, UtilityConfiguration.driverWait_Duration)).until(ExpectedConditions.elementToBeClickable(byFinder));
			Select webElement = new Select(driver.findElement(byFinder));
			webElement.selectByVisibleText(value);		
		}
		catch(ElementNotSelectableException | NoSuchElementException e)
		{
			Util.logger("FAILED: Unable to Select Element, See below for more details : " + e);
			throw e;
		}
	}
	public static void pressThis( WebDriver driver, By byFinder, Keys key)
	{
		try
		{
		    (new WebDriverWait(driver, UtilityConfiguration.driverWait_Duration)).until(ExpectedConditions.presenceOfElementLocated(byFinder)).sendKeys(key);;
		    Util.logger("Press key");
		}
		catch(NoSuchElementException e )
		{
			Util.logger("FAILED: Unable to Press the Key, See below for more details :" + e);
			throw e;
		}
	}
	public static void typeThis ( WebDriver driver, By byFinder, Object value, String message )
	{
		typeThis(driver, byFinder, value);
		Util.logger("Typing " + String.valueOf(value) + " in " + message + " field");
	}
	public static void typeThis ( WebDriver driver, By byFinder, Object value ) 
	{
		try
		{
			(new WebDriverWait(driver, UtilityConfiguration.driverWait_Duration)).until(ExpectedConditions.presenceOfElementLocated(byFinder)).clear();
			driver.findElement(byFinder).sendKeys(String.valueOf(value));	
		}
		catch(NoSuchElementException e)
		{
			Util.logger("FAILED: Unable to type on the element, See below for more details : " + e);
			throw e;
		}
	}	
	public static void typeAndCompleteThis ( WebDriver driver, By byFinder, Object value )
	{
		Util.typeThis(driver, byFinder, value);
		Util.pressThis(driver, byFinder, Keys.ENTER);
	}
	public static void clickThis (WebDriver driver, By byFinder, String message )
	{
		clickThis(driver, byFinder);
		Util.logger("Clicking " + message);
	}
	public static void clickThis ( WebDriver driver, By byFinder )
	{
		try
		{
			(new WebDriverWait(driver, UtilityConfiguration.driverWait_Duration)).until(ExpectedConditions.elementToBeClickable(byFinder)).click();
		}
		catch(ElementNotVisibleException | NoSuchElementException e)
		{
			Util.logger("FAILED: Unable to click element, See below for more details: " + e);
			throw e;
		}
	}
	
//	CHECKING METHODS
//	------------------------------------------------------------------------------------------------------------------------------------
//	------------------------------------------------------------------------------------------------------------------------------------	
	public static void checkThis(WebDriver driver, By byFinder)
	{
		 try 
		 {
			 (new WebDriverWait(driver, UtilityConfiguration.driverWait_Duration)).until(ExpectedConditions.presenceOfElementLocated(byFinder));
			 driver.findElement(byFinder);
			 Util.logger("Element has been located");
		 } 
		 catch (NoSuchElementException|AssertionError e) 
		 { 
			 Util.logger("Element could not be located, See below for more details" + e );
			 throw e;
		 }
	}
	public static void checkThisShouldNotBePresent(WebDriver driver, By byFinder)
	{
		try 
		 {
		   Util.temporaryWaitSolution();
		   driver.findElement(byFinder);
		   Assert.fail("Element was found, Element should be be visible");
		 } 
		catch (NoSuchElementException e) 
		 { 
			Util.logger("Element is not visible");	 
		 }
	}
	public static void containsString( String actual, String expected)
	{
		try
		{
			Assert.assertTrue(expected.contains(actual));
			Util.logger("Strings Matched : " + actual + " & " + expected);
		}
		catch(AssertionError e)
		{
			Util.logger("FAILED : Strings failed to match : " + actual + " & " + expected);
			throw e;
		}
	}
	public static void compareValues( int actual, int expected )
	{
		try
		{
			Assert.assertEquals(actual, expected);
			Util.logger("Strings Matched : " + actual + " & " + expected);
		}
		catch(AssertionError e)
		{
			Util.logger("FAILED : Strings failed to match : " + actual + " & " + expected);
			throw e;
		}
	}
	public static void compareValues( double actual, double expected )
	{
		try
		{
			Assert.assertEquals(actual, expected);
			Util.logger("Strings Matched : " + expected + " & " + actual);
		}
		catch(AssertionError e)
		{
			Util.logger("FAILED : Strings failed to match : " + actual + " & " + expected);
			throw e;
		}
	}
	public static void compareStrings ( String actual, String expected )
	{
		try
		{
			Assert.assertTrue(actual.toLowerCase().contains(expected.toLowerCase()));
			Util.logger("Strings Matched : " + actual + " & " + expected);		
		}
		catch(AssertionError e)
		{
			Util.logger("FAILED : Strings failed to match : " + actual + " & " + expected);
			throw e;
		}
	}
	
//	UTILITY METHODS
//	------------------------------------------------------------------------------------------------------------------------------------
//	------------------------------------------------------------------------------------------------------------------------------------
	
	public static String retrieveStringSpecific ( String sentence, int fromWhere, int toWhere)
	{
		return sentence.substring(fromWhere, toWhere);
	}
	public static String retrieveStringSpecific ( String sentence, int fromWhere)
	{
		return sentence.substring(fromWhere);
	}	
	public static double retrieveNumbers (String sentence)
	{
		sentence = sentence.replaceAll("[^0-9]","");	
		try
		{
			double value = Double.parseDouble(sentence);
			return value;
		}
		catch(NullPointerException e)
		{
			Util.logger(e.toString());
			return 0;
		}
	}
	public static double retrieveNumbers (WebDriver driver, By byFinder)
	{
		String sentence = Util.retrieveThis(driver, byFinder).getText().replaceAll("[^0-9]","");
		try
		{
			double value = Double.parseDouble(sentence);
			return value;
		}
		catch(NullPointerException e)
		{
			Util.logger(e.toString());
			return 0;
		}
	}
	public static void logger(String log)
	{
		Reporter.log("<p>  " + log + "  </p>");
		System.out.println(log);
	}
	
	public static void imageLogger(String log)
	{
		Reporter.log(log);
	}
	public static void temporaryWaitSolution()
	{
		try {
			Thread.sleep(1000);
			Util.logger("Finished waiting");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	
	
	private static Random random = new Random((new Date()).getTime());
	public static String generateRandomString(final int length) {
    	final char[] values = {'a','b','c','d','e','f','g','h','i','j',
    					 'k','l','m','n','o','p','q','r','s','t',
    					 'u','v','w','x','y','z','0','1','2','3',
    					 '4','5','6','7','8','9','A','B','C','D',
    					 'E','F','G','H','I','J','K','L','M','N',
    					 'O','P','Q','R','S','T','U','V','W','X',
    					 'Y','Z'};
    	String out = "";
    	
    	for (int i=0;i<length;i++) 
    	{
        	final int idx = random.nextInt(values.length);
    		out += values[idx];
    	}
    	return out;
    }	
	public static String generateTimeNow()
	{
	
		Date dt = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
		return dateFormat.format(dt);
		
	}
	public static void takeScreenshot(WebDriver driver, Method method, String result) throws IOException
	{		
		Util.temporaryWaitSolution();
		File filepath = new File(UtilityConfiguration.screenshotFilePath + result + "-" + method.getName() + UtilityConfiguration.screenshotFileType);
		String screenshotpath = UtilityConfiguration.reportFilePath + result + "-" + method.getName() + UtilityConfiguration.screenshotFileType;
		Util.imageLogger("<br> <img src=" + screenshotpath  + "  width='600' height='400'/> </br>");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Util.logger("Performing Screenshot");
		FileUtils.copyFile(scrFile, filepath );	
	}	
	public static void takeScreenshot(WebDriver driver, String method, String result) throws IOException
	{
		Util.temporaryWaitSolution();
		File filepath = new File(UtilityConfiguration.screenshotFilePath + result + "-" + method + UtilityConfiguration.screenshotFileType);
		String screenshotpath = UtilityConfiguration.reportFilePath + result + "-" + method + UtilityConfiguration.screenshotFileType;
		Util.imageLogger("<br> <img src=" + screenshotpath  + "  width='600' height='400'/> </br>");
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Util.logger("Performing Screenshot");
		FileUtils.copyFile(scrFile, filepath );	
	}
	
	
//  TESTNG RELATED METHODS	
//	------------------------------------------------------------------------------------------------------------------------------------
//	------------------------------------------------------------------------------------------------------------------------------------
	public static void defaultBeforeMethod(Method method)
	{
		Util.logger("---------------------" + method.getName() + "---------------------");
		Util.logger("---------------------TEST STARTING---------------------");
	}
	public static void defaultAfterMethod()
	{
		Util.logger("---------------------TEST END---------------------");
	}
	
//	------------------------------------------------------------------------------------------------------------------------------------
//	------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	/*
	 This code snippet is for splitting strings based on spaces 
	double purchasePriceUnit = Double.parseDouble(inventory_supplyTable_priceUnit_1stRow.split(" ")[1].split("\n")[0]);
	double purchasePriceTotal = Double.parseDouble(purchase_price_total.split(" ")[1]);
	
	This is an alternate method for the retrieveNumerics method
	public static class StringHelper {
	    //Separate words from String which has gigits
	        public String drawDigitsFromString(String strValue){
	            String str = strValue.trim();
	            String digits="";
	            for (int i = 0; i < str.length(); i++) {
	                char chrs = str.charAt(i);              
	                if (Character.isDigit(chrs))
	                    digits = digits+chrs;
	            }
	            return digits;
	        }
	    }
	  
	This is an alternate method for the retrieveNumerics method
	public static double retrieveNumbers(String sentence)
	{
		double value = 0;
		for(int i = 0; i <= sentence.length(); i++)
		{
			char c = sentence.charAt(i);
		}
		return value;
	}
	*/
	
}