package geForceSelenium.gForce.Script;

import org.testng.annotations.Test;

import geForceSelenium.gForce.Configuration.TestCaseBase;
import geForceSelenium.gForce.POM.webClassPOM;
import selenium.Util.Util;

public class webClassModule extends TestCaseBase {
	
	
	@Test(priority = 1)
	public void createClassTest()
	{
		classPage.click_class_tabLink(driver);
		classPage.click_addClass_Button(driver);
		classPage.selectIn_addClass_classType(driver, classData.class_addClass_classType);
		classPage.typeIn_addClass_className(driver, classData.class_addClass_className);
		classPage.typeIn_addClass_classRate(driver, classData.class_addClass_classRate);
		classPage.selectIn_addClass_classTeacher(driver, classData.class_addClass_classTeacher);
		classPage.typeIn_addClass_classVenue(driver, classData.class_addClass_classVenue);
		classPage.typeIn_addClass_classCapacity(driver, classData.class_addClass_classCapacity);
		//classPage.typeIn_addClass_classScheduleDate(driver, classData.class_addClass_classScheduleData);
		classPage.selectIn_addClass_classScheduleStartTime(driver);
		classPage.selectIn_addClass_classScheduleEndTime(driver);
		classPage.typeIn_addClass_classYouTubeURL(driver, classData.class_addClass_classYoutubeURL);
		classPage.clickIn_addClass_saveButton(driver);
		Util.checkThis(driver, classPage.class_classSuccessfullySaved_notification);
	}

	@Test(priority = 1)
	public void createGForceClassTest()
	{
		classPage.click_class_tabLink(driver);
		classPage.click_addClass_Button(driver);
		classPage.selectIn_addClass_classType(driver, classData.class_gForceProj_addClass_classType);
		classPage.selectIn_addClass_gForce_classSubType(driver, classData.class_gForceProj_addClass_subType);
		classPage.typeIn_addClass_className(driver, classData.class_gForceProj_addClass_className);
		classPage.typeIn_addClass_classRate(driver, classData.class_gForceProj_addClass_classRate);
		classPage.selectIn_addClass_classTeacher(driver, classData.class_gForceProj_addClass_classTeacher);
		classPage.typeIn_addClass_classVenue(driver, classData.class_gForceProj_addClass_classVenue);
		classPage.typeIn_addClass_gForce_address(driver, classData.class_gForceProj_addClass_classAddress);
		classPage.typeIn_addClass_gForce_area(driver, classData.class_gForceProj_addClass_classArea);
		classPage.typeIn_addClass_classCapacity(driver, classData.class_gForceProj_addClass_classCapacity);
		//classPage.typeIn_addClass_classScheduleDate(driver, classData.class_addClass_classScheduleData);
		//classPage.selectIn_addClass_classScheduleStartTime(driver);
		//classPage.selectIn_addClass_classScheduleEndTime(driver);
		classPage.typeIn_addClass_classYouTubeURL(driver, classData.class_gForceProj_addClass_classYoutubeURL);
		classPage.clickIn_addClass_saveButton(driver);
		Util.checkThis(driver, classPage.class_classSuccessfullySaved_notification);		
	}
	
	@Test(priority = 1)
	public void createGForceRegionalClassTest()
	{
		classPage.click_class_tabLink(driver);
		classPage.click_addClass_Button(driver);
		classPage.selectIn_addClass_classType(driver, classData.class_gForceProjreg_addClass_classType);
		classPage.selectIn_addClass_gForce_classSubType(driver, classData.class_gForceProjreg_addClass_subType);
		classPage.typeIn_addClass_className(driver, classData.class_gForceProjreg_addClass_className);
		classPage.typeIn_addClass_classRate(driver, classData.class_gForceProjreg_addClass_classRate);
		classPage.selectIn_addClass_classTeacher(driver, classData.class_gForceProjreg_addClass_classTeacher);
		classPage.typeIn_addClass_classVenue(driver, classData.class_gForceProjreg_addClass_classVenue);
		classPage.typeIn_addClass_gForce_address(driver, classData.class_gForceProjreg_addClass_classAddress);
		classPage.typeIn_addClass_gForce_area(driver, classData.class_gForceProjreg_addClass_classArea);
		classPage.typeIn_addClass_classCapacity(driver, classData.class_gForceProjreg_addClass_classCapacity);
		//classPage.typeIn_addClass_classScheduleDate(driver, classData.class_addClass_classScheduleData);
		//classPage.selectIn_addClass_classScheduleStartTime(driver);
		//classPage.selectIn_addClass_classScheduleEndTime(driver);
		classPage.typeIn_addClass_classYouTubeURL(driver, classData.class_gForceProj_addClass_classYoutubeURL);
		classPage.clickIn_addClass_saveButton(driver);
		Util.checkThis(driver, classPage.class_classSuccessfullySaved_notification);		
	}
	
	
	
	@Test(priority = 2)
	public void searchClassTest()
	{	
		
		classPage.click_class_tabLink(driver);		
		classPage.typeIn_searchClass_className(driver, classData.class_searchClass_className );
		classPage.selectIn_searchClass_classType(driver, classData.class_searchClass_classType);
		classPage.selectIn_searchClass_classTeacher(driver, classData.class_addClass_classTeacher);
		classPage.selectIn_searchClass_classPublished(driver, classData.class_searchClass_classNotPublished);
		classPage.click_searchClass_button(driver);
		Util.temporaryWaitSolution();
		Util.compareStrings(classPage.getThis_classTable_className(driver), classData.class_searchClass_className);
		Util.compareStrings(classPage.getThis_classTable_classType(driver), classData.class_searchClass_classType);
		//Util.compareValues(classPage.getThis_classTable_classRate(driver) , classData.class_searchClass_classRate);	
	}
	
	@Test(priority = 3)
	public void editClassTest()
	{
		//classPage.editClass(driver);
		
		classPage.click_class_tabLink(driver);		
		classPage.typeIn_searchClass_className(driver, classData.class_searchClass_className );
		classPage.selectIn_searchClass_classType(driver, classData.class_searchClass_classType);
		classPage.selectIn_searchClass_classTeacher(driver, classData.class_addClass_classTeacher);
		classPage.selectIn_searchClass_classPublished(driver, classData.class_searchClass_classNotPublished);
		classPage.click_searchClass_button(driver);
		Util.temporaryWaitSolution();
		Util.compareStrings(classPage.getThis_classTable_className(driver), classData.class_searchClass_className);
		Util.compareStrings(classPage.getThis_classTable_classType(driver), classData.class_searchClass_classType);

		classPage.click_editClass_Button(driver);
		classPage.selectIn_addClass_classType(driver, classData.class_editClass_classType);
		classPage.typeIn_addClass_className(driver, classData.class_editClass_className);
		classPage.typeIn_addClass_classRate(driver, classData.class_editClass_classRate);
		classPage.selectIn_addClass_classTeacher(driver, classData.class_editClass_classTeacher);
		classPage.typeIn_addClass_classVenue(driver, classData.class_editClass_classVenue);
		classPage.typeIn_addClass_classCapacity(driver, classData.class_editClass_classCapacity);
		//classPage.typeIn_addClass_classScheduleDate(driver, classData.class_editClass_classScheduleData);
		classPage.selectIn_addClass_classScheduleStartTime(driver);
		classPage.selectIn_addClass_classScheduleEndTime(driver);
		classPage.typeIn_addClass_classYouTubeURL(driver, classData.class_editClass_classYoutubeURL);
		classPage.clickIn_addClass_saveButton(driver);
		Util.checkThis(driver, classPage.class_classSuccessfullySaved_notification);
	}
		
	@Test( priority = 4)
	public void deleteClassTest()
	{
		classPage.click_class_tabLink(driver);
		classPage.typeIn_searchClass_className(driver, classData.class_editClass_className );
		classPage.selectIn_searchClass_classType(driver, classData.class_editClass_classType);
		classPage.selectIn_searchClass_classTeacher(driver, classData.class_editClass_classTeacher);
		//classPage.selectIn_searchClass_classPublished(driver, classData.class_searchClass_classNotPublished);
		classPage.click_searchClass_button(driver);
		
		Util.temporaryWaitSolution();
		Util.temporaryWaitSolution();
		classPage.click_deleteClass_Button(driver);
		Util.checkThis(driver, classPage.class_searchClass_searchResult_NoResult_notification);	
	}
	
	@Test (priority = 5)
	public void publishClassTest()
	{
		createClassTest();
		//createGForceClassTest();
		searchClassTest();
		
		Util.temporaryWaitSolution();
		classPage.click_publishClass_Button(driver);
		Util.temporaryWaitSolution();
		classPage.click_class_tabLink(driver);
		classPage.typeIn_searchClass_className(driver, classData.class_addClass_className );
		classPage.selectIn_searchClass_classType(driver, classData.class_addClass_classType);
		classPage.selectIn_searchClass_classTeacher(driver, classData.class_addClass_classTeacher);
		classPage.selectIn_searchClass_classPublished(driver, classData.class_searchClass_classPublished);
		classPage.click_searchClass_button(driver); 
		
		
	}

	@Test
	public void unifiedRunTest()
	{
		createClassTest();
		createGForceClassTest();
		createGForceRegionalClassTest();
	}
}
