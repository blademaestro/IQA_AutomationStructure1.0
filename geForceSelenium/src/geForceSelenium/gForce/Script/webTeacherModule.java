package geForceSelenium.gForce.Script;

import org.testng.annotations.Test;

import geForceSelenium.gForce.Configuration.TestCaseBase;
import selenium.Util.Util;

public class webTeacherModule extends TestCaseBase{

	@Test(priority = 1)
	public void createTeacherTest()
	{
	 teacherPage.click_teacher_tabLink(driver);
	 teacherPage.click_addTeacher_Button(driver); 
	 Util.temporaryWaitSolution();
	 teacherPage.typeIn_addTeacher_firstName(driver, teacherData.teacher_addTeacher_firstName);
	 teacherPage.typeIn_addTeacher_middleName(driver, teacherData.teacher_addTeacher_middleName);
	 teacherPage.typeIn_addTeacher_lastName(driver, teacherData.teacher_addTeacher_lastName);
	 teacherPage.typeIn_addTeacher_contactNumber(driver, teacherData.teacher_addTeacher_contactNumber);
	 teacherPage.typeIn_addTeacher_emailAddress(driver, teacherData.teacher_addTeacher_emailAddress);
	 teacherPage.typeIn_addTeacher_birthDate(driver, teacherData.teacher_addTeacher_birthDate);
	 teacherPage.selectIn_addTeacher_country(driver, teacherData.teacher_addTeacher_country);
	 teacherPage.selectIn_addTeacher_address(driver, teacherData.teacher_addTeacher_address);
	 teacherPage.click_addTeacher_maleGender(driver);
	 teacherPage.typeIn_addTeacher_description(driver, teacherData.teacher_addTeacher_description);
	 teacherPage.click_addTeacher_availableForTraining(driver);
	 teacherPage.typeIn_addTeacher_newPassword(driver, teacherData.teacher_addTeacher_newPassword);
	 teacherPage.typeIn_addTeacher_confirmPassword(driver, teacherData.teacher_addTeacher_confirmPassword);
	 teacherPage.typeIn_addTeacher_emergencyContactName(driver, teacherData.teacher_addTeacher_emergencycontactName);
	 teacherPage.typeIn_addTeacher_emergencyContactNumber(driver, teacherData.teacher_addTeacher_contactNumber);
	 teacherPage.click_addTeacher_Save_Button(driver);
	 Util.checkThis(driver, teacherPage.teacher_tabLink);
	}
	
	@Test(priority = 1)
	public void createTeacherNotAvailableForTrainingTest()
	{
		 teacherPage.click_teacher_tabLink(driver);
		 teacherPage.click_addTeacher_Button(driver);
		 
		 Util.temporaryWaitSolution();
		 teacherPage.typeIn_addTeacher_firstName(driver, teacherData.teacher_addTeacher_nonTrainerFirstName);
		 teacherPage.typeIn_addTeacher_middleName(driver, teacherData.teacher_addTeacher_middleName);
		 teacherPage.typeIn_addTeacher_lastName(driver, teacherData.teacher_addTeacher_lastName);
		 teacherPage.typeIn_addTeacher_contactNumber(driver, teacherData.teacher_addTeacher_contactNumber);
		 teacherPage.typeIn_addTeacher_emailAddress(driver, teacherData.teacher_addTeacher_nonTrainerEmail);
		 teacherPage.typeIn_addTeacher_birthDate(driver, teacherData.teacher_addTeacher_birthDate);
		 teacherPage.selectIn_addTeacher_country(driver, teacherData.teacher_addTeacher_country);
		 teacherPage.selectIn_addTeacher_address(driver, teacherData.teacher_addTeacher_address);
		 teacherPage.click_addTeacher_maleGender(driver);
		 teacherPage.typeIn_addTeacher_description(driver, teacherData.teacher_addTeacher_description);
		 teacherPage.typeIn_addTeacher_newPassword(driver, teacherData.teacher_addTeacher_newPassword);
		 teacherPage.typeIn_addTeacher_confirmPassword(driver, teacherData.teacher_addTeacher_confirmPassword);
		 teacherPage.typeIn_addTeacher_emergencyContactName(driver, teacherData.teacher_addTeacher_emergencycontactName);
		 teacherPage.typeIn_addTeacher_emergencyContactNumber(driver, teacherData.teacher_addTeacher_contactNumber);
		 teacherPage.click_addTeacher_Save_Button(driver);
		 Util.checkThis(driver, teacherPage.teacher_tabLink);
	}
	
	@Test(priority = 1)
	public void createTeacherFutureDateTest()
	{
		 teacherPage.click_teacher_tabLink(driver);
		 teacherPage.click_addTeacher_Button(driver);
		 
		 Util.temporaryWaitSolution();
		 teacherPage.typeIn_addTeacher_firstName(driver, teacherData.teacher_addTeacher_firstName);
		 teacherPage.typeIn_addTeacher_middleName(driver, teacherData.teacher_addTeacher_middleName);
		 teacherPage.typeIn_addTeacher_lastName(driver, teacherData.teacher_addTeacher_lastName);
		 teacherPage.typeIn_addTeacher_contactNumber(driver, teacherData.teacher_addTeacher_contactNumber);
		 teacherPage.typeIn_addTeacher_emailAddress(driver, teacherData.teacher_addTeacher_randomTeacherEmail);
		 teacherPage.typeIn_addTeacher_birthDate(driver, teacherData.teacher_addTeacher_birthDate);
		 teacherPage.selectIn_addTeacher_country(driver, teacherData.teacher_addTeacher_country);
		 teacherPage.selectIn_addTeacher_address(driver, teacherData.teacher_addTeacher_address);
		 teacherPage.click_addTeacher_maleGender(driver);
		 teacherPage.typeIn_addTeacher_description(driver, teacherData.teacher_addTeacher_description);
		 teacherPage.typeIn_addTeacher_newPassword(driver, teacherData.teacher_addTeacher_newPassword);
		 teacherPage.typeIn_addTeacher_confirmPassword(driver, teacherData.teacher_addTeacher_confirmPassword);
		 teacherPage.typeIn_addTeacher_emergencyContactName(driver, teacherData.teacher_addTeacher_emergencycontactName);
		 teacherPage.typeIn_addTeacher_emergencyContactNumber(driver, teacherData.teacher_addTeacher_contactNumber);
		 teacherPage.click_addTeacher_Save_Button(driver);
		 
		 Util.checkThis(driver, teacherPage.teacher_tabLink);
	}
		
	@Test(priority = 2)
	public void searchTeacherTest()
	{
		teacherPage.click_teacher_tabLink(driver);
		
		
		teacherPage.typeIn_searchTeacher_firstName(driver, teacherData.teacher_searchTeacher_firstName);
		teacherPage.typeIn_searchTeacher_lastName(driver, teacherData.teacher_searchTeacher_lastName);
		teacherPage.click_searchTeacher_button(driver);
		
		Util.temporaryWaitSolution();
		Util.compareStrings(teacherPage.getThis_teacherTable_Name(driver), teacherData.teacher_addTeacher_firstName+ " " + teacherData.teacher_addTeacher_lastName);
		Util.compareStrings(teacherPage.getThis_teacherTable_Gender(driver), teacherData.teacher_addTeacher_gender);
		Util.compareStrings(teacherPage.getThis_teacherTable_City(driver), teacherData.teacher_addTeacher_address);
		Util.compareStrings(teacherPage.getThis_teacher_contactNumber(driver), teacherData.teacher_addTeacher_contactNumber);
		
		
	
		
	}
}
