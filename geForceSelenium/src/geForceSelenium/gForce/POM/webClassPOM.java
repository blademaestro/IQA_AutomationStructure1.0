package geForceSelenium.gForce.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import geForceSelenium.gForce.Configuration.TestCaseBase;
import geForceSelenium.gForce.Data.webClassData;
import selenium.Util.Util;

public class webClassPOM {
	
	webClassData classData = TestCaseBase.classData;
	
	public By class_viewClass_Button = By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/ul/li[1]");
	public By class_publishClass_Button = By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/ul/li[2]");
	public By class_editClass_Button = By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/ul/li[3]");
	public By class_removeClass_Button = By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/ul/li[4]");
	public By class_tableRow_classTable = By.cssSelector("td");
	public By class_tabLink_Button = By.cssSelector("a[title=\"Classes\"] > span.menu-item-parent.ng-binding");
	public By class_addClass_Button = By.linkText("Add Classes");
	public By class_addClass_classType_Dropdown = By.id("class-type-option1");

	public By class_addClass_className_field = By.name("name");
	public By class_addClass_classRate_field = By.name("rate");
	public By class_addClass_classTeachers_selectField = By.name("teachers");	
	public By class_addClass_classVenue_field = By.name("venue");
		
	public By class_addClass_gForceProject_classType_Dropdown = By.id("class-type-option2");
	public By class_addClass_gForceProject_classSubType_Dropdown = By.name("subType.id");
	public By class_addClass_gforceProject_classAddress_field = By.name("address");
	public By class_addClass_gForceProject_classArea_Field = By.name("area.id");
	
	public By class_addClass_classCapacity_field = By.name("capacity");
	public By class_addClass_classScheduleData_dateField = By.name("date0");
	public By class_addClass_classScheduleStartTime_timeField = By.name("stime0");
	public By class_addClass_classScheduleEndTime_timeField = By.name("etime0");
	public By class_addClass_classYoutubeURL_field = By.name("youtubeUrl");
	public By class_addClass_saveClass_Button = By.cssSelector("button.btn.btn-primary");	
	
	public By class_classSuccessfullySaved_notification = By.cssSelector("div.textoFoto > span");
	public By class_searchClass_className_dropdown = By.xpath("(//input[@type='text'])[3]");
	public By class_searchClass_classType_dropdown = By.xpath("//select");
	public By class_searchClass_classTeacher_dropdown = By.xpath("//section[3]/label[2]/select");
	public By class_searchClass_classPublished_dropdown = By.xpath("//section[4]/label[2]/select");
	public By class_searchClass_button = By.cssSelector("button.btn.btn-default");
	
	public By class_classTable_className_row = By.cssSelector("strong.ng-binding");
	public By class_classTable_classDate_row = By.cssSelector("td > small.ng-scope");
	public By class_classTable_classTeachers_row = By.xpath("//div[@id='dance-class-entries']/div/div/div[3]/div/table/tbody/tr/td[3]/span");
	public By class_classTable_classType_row = By.cssSelector("td.ng-binding"); 
	public By class_classTable_classRate_row = By.cssSelector("span.ng-binding.money");

	public By class_deleteClass_deleteConfirmation_Button = By.id("bot2-Msg1");
	public By class_publishClass_publishConfirmation_Button = By.id("bot1-Msg1");
	
	public By class_searchClass_searchResult_NoResult_notification = By.cssSelector("p.alert.alert-danger > strong");
			
			
			
	public void click_class_tabLink(WebDriver driver)
	{
		Util.clickThis(driver, class_tabLink_Button);	
	}
	public void click_addClass_Button(WebDriver driver)
	{
		Util.clickThis(driver, class_addClass_Button);		
	}	
	public void click_viewClass_Button(WebDriver driver)
	{
		Util.clickThis(driver, class_tableRow_classTable, "Class Table");
		Util.clickThis(driver, class_viewClass_Button, "View Class");
	}
	public void click_publishClass_Button(WebDriver driver)
	{
		Util.clickThis(driver, class_tableRow_classTable, "Class Table");
		Util.clickThis(driver, class_publishClass_Button, "Publish Class");
		Util.clickThis(driver, class_publishClass_publishConfirmation_Button, "Confirm publish");
	}
	public void click_editClass_Button(WebDriver driver)
	{
		Util.clickThis(driver, class_tableRow_classTable, "Class Table");
		Util.clickThis(driver, class_editClass_Button, "Edit Class");
	}
	public void click_deleteClass_Button(WebDriver driver)
	{
		Util.clickThis(driver, class_tableRow_classTable, "Class Table");
		Util.clickThis(driver, class_removeClass_Button, "Remove Class");
		Util.clickThis(driver, class_deleteClass_deleteConfirmation_Button, "Delete Class Confirmation");
		
	}

	public void selectIn_addClass_classType(WebDriver driver, String value)
	{
		Util.temporaryWaitSolution();
		Util.selectThis(driver, class_addClass_classType_Dropdown, value, "Class Type");
	}		
	public void typeIn_addClass_className(WebDriver driver, String value)
	{
		Util.typeThis(driver, class_addClass_className_field, value, "Class Name");
	}
	public void typeIn_addClass_classRate(WebDriver driver, double value)
	{
		Util.typeThis(driver, class_addClass_classRate_field, value, "Class Rate");	
	}
	public void selectIn_addClass_classTeacher(WebDriver driver, String value)
	{
		Util.selectThis(driver, class_addClass_classTeachers_selectField, value, "Class Teacher");
	}
	

	public void typeIn_addClass_gForce_address(WebDriver driver, String value)
	{
		Util.typeThis(driver, class_addClass_gforceProject_classAddress_field, value, "Address");
	}
	public void typeIn_addClass_gForce_area(WebDriver driver, String value)
	{
		//Util.typeThis(driver, class_addClass_gForceProject_classArea_Field, value, "Area");
		Util.selectThis(driver, class_addClass_gForceProject_classArea_Field, value, "Area");
	}
	public void selectIn_addClass_gForce_classType(WebDriver driver , String value)
	{
		Util.selectThis(driver, class_addClass_gForceProject_classType_Dropdown, value, "gForceProject ClassType");
	}
	public void selectIn_addClass_gForce_classSubType(WebDriver driver, String value)
	{
		Util.selectThis(driver, class_addClass_gForceProject_classSubType_Dropdown, value, "gForceProject SubType");
	}
	public void typeIn_addClass_classVenue(WebDriver driver, String value)
	{
		Util.typeThis(driver, class_addClass_classVenue_field, value, "Class Venue");
	}	

	public void typeIn_addClass_classCapacity(WebDriver driver, double value)
	{
		Util.typeThis(driver, class_addClass_classCapacity_field, value, "Class Capacity");
	}
	
	public void typeIn_addClass_classScheduleDate(WebDriver driver, String value)
	{
		Util.typeThis(driver, class_addClass_classScheduleData_dateField, value, "Class Schedule Date");
	}
	
	//driver.findElement(By.cssSelector("input.bootstrap-timepicker-hour.form-control")).sendKeys("5");
	//driver.findElement(By.cssSelector("input.bootstrap-timepicker-minute.form-control")).sendKeys("30");

	public void selectIn_addClass_classScheduleStartTime(WebDriver driver)
	{
		Util.clickThis(driver, class_addClass_classScheduleStartTime_timeField, "Start Time");
	}
	public void selectIn_addClass_classScheduleEndTime(WebDriver driver)
	{
		Util.clickThis(driver, class_addClass_classScheduleEndTime_timeField, "End Time" );
	}

	public void typeIn_addClass_classYouTubeURL(WebDriver driver, String value)
	{
		Util.typeThis(driver, class_addClass_classYoutubeURL_field, value, "Youtube URL");
	}

	public void clickIn_addClass_saveButton(WebDriver driver)
	{
		Util.clickThis(driver, class_addClass_saveClass_Button, "Save Class");
	}
	
	public void typeIn_searchClass_className(WebDriver driver, String value)
	{
		driver.findElement(class_searchClass_className_dropdown).sendKeys("sadas");
		Util.typeThis(driver, class_searchClass_className_dropdown, value, "Class Name");
	}
	
	public void selectIn_searchClass_classType(WebDriver driver, String value)
	{
		Util.selectThis(driver, class_searchClass_classType_dropdown, value, "Class Type");
	}
	
	public void selectIn_searchClass_classTeacher(WebDriver driver, String value)
	{
		//Util.selectThis(driver, class_searchClass_classTeacher_dropdown, value, "Class Teacher");
	}
	
	public void selectIn_searchClass_classPublished(WebDriver driver, String value)
	{
		Util.selectThis(driver, class_searchClass_classPublished_dropdown, value, "Class Published");
	}

	public void click_searchClass_button(WebDriver driver)
	{
	Util.clickThis(driver, class_searchClass_button, "Search Button");
	}
	
	public String getThis_classTable_className(WebDriver driver)
	{
		return Util.retrieveThis(driver, class_classTable_className_row).getText();
	}
	
	public String getThis_classTable_classDate(WebDriver driver)
	{
		return Util.retrieveThis(driver, class_classTable_classDate_row).getText();
	}
	
	public String getThis_classTable_classTeacher(WebDriver driver)
	{
		return Util.retrieveThis(driver, class_classTable_classTeachers_row).getText();
	}
	
	public String getThis_classTable_classType(WebDriver driver)
	{
		return Util.retrieveThis(driver, class_classTable_classType_row).getText();
	}
	
	public double getThis_classTable_classRate(WebDriver driver)
	{
		return Util.retrieveNumbers(driver, class_classTable_classRate_row);
	}
	
	public void createClass(WebDriver driver)
	{	
		click_class_tabLink(driver);
		click_editClass_Button(driver);
		selectIn_addClass_classType(driver, classData.class_editClass_classType);
		typeIn_addClass_className(driver, classData.class_editClass_className);
		typeIn_addClass_classRate(driver, classData.class_editClass_classRate);
		selectIn_addClass_classTeacher(driver, classData.class_editClass_classTeacher);
		typeIn_addClass_classVenue(driver, classData.class_editClass_classVenue);
		typeIn_addClass_classCapacity(driver, classData.class_editClass_classCapacity);
		//classPage.typeIn_addClass_classScheduleDate(driver, classData.class_editClass_classScheduleData);
		selectIn_addClass_classScheduleStartTime(driver);
		selectIn_addClass_classScheduleEndTime(driver);
		typeIn_addClass_classYouTubeURL(driver, classData.class_editClass_classYoutubeURL);
		clickIn_addClass_saveButton(driver);
		Util.checkThis(driver, class_classSuccessfullySaved_notification);
	}
	
	
	public void searchClass(WebDriver driver)
	{
		
		Util.clickThis(driver, class_tabLink_Button);
		typeIn_searchClass_className(driver, classData.class_searchClass_className );
		selectIn_searchClass_classType(driver, classData.class_searchClass_classType);
		selectIn_searchClass_classTeacher(driver, classData.class_addClass_classTeacher);
		selectIn_searchClass_classPublished(driver, classData.class_searchClass_classPublished);
		click_searchClass_button(driver);
		
		

		




}



	
	
}


