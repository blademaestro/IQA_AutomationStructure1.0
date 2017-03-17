package geForceSelenium.gForce.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;


import selenium.Util.Util;

public class webTeacherPOM {

	//Search
	
	//driver.get(baseUrl + "/student/list");	
	public By teacher_tabLink = By.cssSelector("a[title=\"Teachers\"] > span.menu-item-parent.ng-binding");
	public By teacher_searchTeacher_firstName_field = By.xpath("(//input[@type='text'])[3]");
	public By teacher_searchTeacher_lastName_field = By.xpath("(//input[@type='text'])[4]");
	public By teacher_searchTeacher_gender_dropdown = By.xpath("//div[@id='user-search']/div/div/form/fieldset/section[3]/label[2]/select");
	public By teacher_searchTeacher_search_button = By.cssSelector("button.btn.btn-default");
	public By teacher_teacherTable_teacherName_Row  = By.cssSelector("strong.ng-binding");
	public By teacher_teacherTable_teacherGender_Row = By.cssSelector("span.capitalize.ng-binding");
	public By teacher_teacherTable_teacherCity_Row = By.xpath("//table[@id='entries']/tbody/tr/td[3]");
	public By teacher_teacherTable_teacherMobile_Row = By.xpath("//table[@id='entries']/tbody/tr/td[4]");
	
	public By click_addTeacher_Button = By.linkText("Add Teacher");
	public By teacher_addTeacher_firstName_field = By.name("firstName");	
	public By teacher_addTeacher_middleName_field = By.name("middleName");
	public By teacher_addTeacher_lastName_field = By.name("lastName");
	public By teacher_addTeacher_contactNumber_field = By.name("contactNumber");
	public By teacher_addTeacher_emailAddress_field = By.name("emailAddress");
	public By teacher_addTeacher_birthDate_field = By.name("birthDate");
	public By teacher_addTeacher_country_dropDown = By.name("country");
	public By teacher_addTeacher_country_dropDownAlt = By.cssSelector("option.ng-binding.ng-scope");
	public By teacher_addTeacher_address_field = By.name("address");
	public By teacher_addTeacher_gender_radioButton = By.name("gender");
	public By teacher_addTeacher_description_textArea = By.name("aboutMe");
	public By teacher_addTeacher_availableForTraining = By.name("checkbox-inline");
	public By teacher_addTeacher_availableForTrainingAl = By.cssSelector("label.checkbox > i");
	public By teacher_addTeacher_maleGender = By.cssSelector("label.radio > i");
	public By teacher_addTeacher_newPassword_Field = By.name("newPassword");
	public By teacher_addTeacher_confirmPassword_Field = By.name("confirmPassword");	
	public By teacher_addTeacher_emergencyContactName_Field = By.xpath("(//input[@type='text'])[10]");		
	public By teacher_addTeacher_emergencyContactNumber_Field = By.xpath("(//input[@type='text'])[11]");		
	public By teacher_addTeacher_Save_Button = By.cssSelector("button.btn.btn-primary");


	public void click_teacher_tabLink(WebDriver driver)
	{
		Util.clickThis(driver, teacher_tabLink, "Teacher");
	}
	
	public void typeIn_searchTeacher_firstName(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_searchTeacher_firstName_field, value, "First Name");
	}
	
	public void typeIn_searchTeacher_lastName(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_searchTeacher_lastName_field, value, "Last Name");
	}
	
	public void selectIn_searchTeacher_gender(WebDriver driver, String value) throws InterruptedException
	{
		Util.selectThis(driver, teacher_searchTeacher_gender_dropdown, value);
	}
	
	public void click_searchTeacher_button(WebDriver driver)
	{
		Util.clickThis(driver, teacher_searchTeacher_search_button);
	}
	
	//Add
	

	public void click_addTeacher_Button(WebDriver driver)
	{
		Util.clickThis(driver, click_addTeacher_Button);
	}
	
	public void typeIn_addTeacher_firstName(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_firstName_field, value, "First Name");
	}
	
	public void typeIn_addTeacher_middleName(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_middleName_field, value);
	}
	
	public void typeIn_addTeacher_lastName(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_lastName_field, value, "Last Name");
	}
	
	public void typeIn_addTeacher_contactNumber(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_contactNumber_field, value, "Contact Number");
	}

	public void typeIn_addTeacher_emailAddress(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_emailAddress_field, value, "Email Address");
	}
	
	public void typeIn_addTeacher_birthDate(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_birthDate_field, value, "Birth Date");
	}
	
	public void selectIn_addTeacher_country(WebDriver driver, String value) 
	{
		new Select(driver.findElement(teacher_addTeacher_country_dropDown)).selectByVisibleText(value);
	}
	
	public void selectIn_addTeacher_address(WebDriver driver, String value) 
	{
		new Select(driver.findElement(teacher_addTeacher_address_field)).selectByVisibleText(value);
	}
	
	public void click_addTeacher_maleGender(WebDriver driver)
	{
		Util.clickThis(driver, teacher_addTeacher_maleGender, "Male Gender");

	}
	
	public void typeIn_addTeacher_description(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_description_textArea, value);
	}
	
	public void click_addTeacher_availableForTraining(WebDriver driver)
	{
		//Util.clickThis(driver, teacher_addTeacher_availableForTraining, "Available For Training Status");
		Util.clickThis(driver, teacher_addTeacher_availableForTrainingAl, "Available For Training Status");
		
	}
	
	public void typeIn_addTeacher_newPassword(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_newPassword_Field, value, "Password");
	}
	
	public void typeIn_addTeacher_confirmPassword(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_confirmPassword_Field, value, "Confirm Password");
	}	

	public void typeIn_addTeacher_emergencyContactName(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_emergencyContactName_Field, value);
	}
	
	public void typeIn_addTeacher_emergencyContactNumber(WebDriver driver, String value)
	{
		Util.typeThis(driver, teacher_addTeacher_emergencyContactNumber_Field, value);
	}
	
	public void click_addTeacher_Save_Button(WebDriver driver)
	{
		Util.clickThis(driver, teacher_addTeacher_Save_Button);
	}



	public String getThis_teacherTable_Name(WebDriver driver)
	{
		return Util.retrieveThis(driver, teacher_teacherTable_teacherName_Row).getText();
	}
	
	public String getThis_teacherTable_Gender(WebDriver driver)
	{
		return Util.retrieveThis(driver, teacher_teacherTable_teacherGender_Row).getText();
	}
	
	public String getThis_teacherTable_City(WebDriver driver)
	{
		return Util.retrieveThis(driver, teacher_teacherTable_teacherCity_Row).getText();
	}
	
	public String getThis_teacher_contactNumber(WebDriver driver)
	{
		return Util.retrieveThis(driver, teacher_teacherTable_teacherMobile_Row).getText();
	}



	
	
}
