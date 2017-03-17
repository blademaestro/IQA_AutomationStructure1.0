package geForceSelenium.gForce.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import geForceSelenium.gForce.Configuration.TestCaseBase;
import geForceSelenium.gForce.Data.webStudentData;
import selenium.Util.Util;

public class webStudentPOM {
	
	webStudentData studentData = TestCaseBase.studentData;
	
	public By student_Tab_Link = By.cssSelector("span.menu-item-parent.ng-binding");
	public By student_searchStudent_firstName_field = By.xpath("(//input[@type='text'])[3]");
	public By student_searchStudent_lastName_field = By.xpath("(//input[@type='text'])[4]");
	public By student_searchStudent_gender_dropdown =By.xpath("//div[@id='user-search']/div/div/form/fieldset/section[3]/label[2]/select");
	public By student_searchStudent_searchButton = By.cssSelector("button.btn.btn-default");
	public By student_addStudent_Button = By.linkText("Add Student");
	public By student_addStudent_firstName_Field = By.name("firstName");
	public By student_addStudent_middleName_Field = By.name("middleName");
	public By student_addStudent_lastName_Field = By.name("lastName");
	public By student_addStudent_emailAddress_Field = By.name("emailAddress");
	
	public By student_addStudent_birthDate_Field = By.name("birthDate");
	public By student_addStudent_birthMonth_dropdown = By.name("birthMonth");
	public By student_addStudent_birthDay_dropdown = By.name("birthDay");
	public By student_addStudent_birthYear_dropdown = By.name("birthYear");	
	public By student_addStudent_country_Field = By.name("country");
	public By student_addStudent_address_Field = By.name("address") ;
	public By student_addStudent_gender_Button = By.name("gender");
	public By student_addStudent_genderMale_Button = By.cssSelector("label.radio > i");
	public By student_addStudent_save_Button = By.cssSelector("button.btn.btn-primary");
	public By student_addStudent_newPassword_Field = By.name("newPassword");
	public By student_addStudent_confirmPassword_Field = By.name("confirmPassword");
	public By student_addStudent_emergencyContactName_Field = By.name("contactName");
	public By student_addStudent_emergencyContactNumber_Field = By.name("contactEmergencyNumber");	
	public By student_addStudent_contactNumber_Field = By.name("contactNumber");
	public By student_addStudent_titleName = By.id("formModalLabel");

	

	public By student_viewStudent_studentName_Field = By.cssSelector("span.semi-bold.ng-binding");
	public By student_viewStudent_studentEmailAddress_Field = By.cssSelector("p.text-muted > a.ng-binding");
	public By student_viewStudent_studentContactNumber_Field = By.cssSelector("p.ng-binding");
	public By student_viewStudent_studentGender_Field = By.xpath("//li[3]/p");
	public By student_searchTable_nameAndEmailAddress_cell = By.cssSelector("td.ng-binding");
	public By student_searchTable_name_cell = By.cssSelector("strong.ng-binding");
	public By student_searchTable_mobileNumber_cell = By.xpath("//table[@id='entries']/tbody/tr/td[4]");
	public By student_searchTable_city_cell = By.xpath("//table[@id='entries']/tbody/tr/td[3]");
	public By student_searchTable_gender_cell = By.cssSelector("span.capitalize.ng-binding");
	
	public By student_viewStudent_Button = By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/ul/li[1]");
	public By student_editStudent_Button = By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/ul/li[2]");
	public By student_removeStudent_Button = By.xpath("html/body/div[1]/div[1]/div[2]/div[1]/ul/li[3]");
	public By student_tableRow_studentTable = By.cssSelector("td");
	public By student_deleteStudent_deleteConfirmation_Button = By.id("bot2-Msg1");
	
	public By student_searchResult_NoResult_notification = By.cssSelector("p.alert.alert-danger > strong");
	public By student_studentSuccessfullySaved_notification = By.cssSelector("div.textoFoto > span");
	
	public void click_studentTabLink(WebDriver driver)
	{
		Util.clickThis(driver, student_Tab_Link,"Student Tab Link");
	}
	
	public void typeIn_searchStudent_firstName(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_searchStudent_firstName_field, value, "First Name Field");
	}

	public void typeIn_searchStudent_lastName(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_searchStudent_lastName_field, value, "Last Name Field");
	}
	
	public void selectIn_searchStudent_gender(WebDriver driver, String value)
	{
		new Select(driver.findElement(student_searchStudent_gender_dropdown)).selectByVisibleText("Male");
	}

	public void click_searchButton(WebDriver driver)
	{
		Util.clickThis(driver, student_searchStudent_searchButton, "Search Student Button" );
	}	
	
	public void click_addStudent_Button(WebDriver driver)
	{
		Util.clickThis(driver, student_addStudent_Button, "Add Student");
	}
	public void typeIn_addStudent_firstName(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_addStudent_firstName_Field, value, "First Name Field");
	}
	
	public void typeIn_addStudent_middleName(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_addStudent_middleName_Field, value, "Middle Name Field");
	}

	public void typeIn_addStudent_lastName(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_addStudent_lastName_Field, value, "Last Name Field");
	}
	
	public void typeIn_addStudent_emailAddress(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_addStudent_emailAddress_Field, value, "Email Address Field");
	}
	
	public void typeIn_addStudent_birthDate(WebDriver driver, String value)
	{
		String student_addStudent_birthMonth = Util.retrieveStringSpecific(value, 0,3);
		String student_addStudent_birthDay = Util.retrieveStringSpecific(value, 4,6);
		String student_addStudent_birthYear = Util.retrieveStringSpecific(value, 7,11);	
		
		new Select(driver.findElement(student_addStudent_birthMonth_dropdown)).selectByVisibleText(student_addStudent_birthMonth);
		new Select(driver.findElement(student_addStudent_birthDay_dropdown)).selectByVisibleText(student_addStudent_birthDay);
		Util.typeThis(driver, student_addStudent_birthYear_dropdown, student_addStudent_birthYear, "Birth Date Field");
		
	}
	
	public void selectIn_addStudent_country(WebDriver driver, String value)
	{
		new Select(driver.findElement(student_addStudent_country_Field)).selectByVisibleText("Philippines");
	}

	public void selectIn_addStudent_address(WebDriver driver, String value)
	{
		new Select(driver.findElement(student_addStudent_address_Field)).selectByVisibleText("Bayan");
	}	

	
	public void typeIn_addStudent_contactNumber(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_addStudent_contactNumber_Field, value, "Address Field");
	}

	public void click_addStudent_genderMale(WebDriver driver)
	{
		//Util.clickThis(driver, student_addStudent_gender_Button, "Gender ");
		Util.clickThis(driver, student_addStudent_genderMale_Button, "Gender 'Male'");
	}
	
	public void typeIn_addStudent_newPassword(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_addStudent_newPassword_Field, value, "New Password");
	}
	
	public void typeIn_addStudent_confirmPassword(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_addStudent_confirmPassword_Field, value, "New Password");
	}
	
	public void typeIn_addStudent_emergencyContactName(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_addStudent_emergencyContactName_Field, value, "Emergency Contact Name");
	}

	public void typeIn_addStudent_emergencyContactNumber(WebDriver driver, String value)
	{
		Util.typeThis(driver, student_addStudent_emergencyContactNumber_Field, value, "Emergency Contact Number");
	}

	public void click_addStudent_Save_Button(WebDriver driver)
	{
		Util.clickThis(driver, student_addStudent_save_Button, "Save Student");
	}


	public String getThis_viewStudent_studentName(WebDriver driver)
	{
		return Util.retrieveThis(driver, student_viewStudent_studentName_Field).getText();
	}
	

	public String getThis_viewStudent_studentEmailAddress(WebDriver driver)
	{
		return Util.retrieveThis(driver, student_viewStudent_studentEmailAddress_Field).getText();
	}
	
	public String getThis_viewStudent_studentContactNumber(WebDriver driver)
	{
		return Util.retrieveThis(driver, student_viewStudent_studentContactNumber_Field).getText();
	} 	
	
	public String getThis_viewStudent_studentGender(WebDriver driver)
	{
		return Util.retrieveThis(driver, student_viewStudent_studentGender_Field).getText();
	}
	
	public String getThis_searchTable_nameandEmailAddress(WebDriver driver)
	{
		return Util.retrieveThis(driver, student_searchTable_name_cell).getText();
	}

	public String getThis_searchTable_gender(WebDriver driver)
	{
		return Util.retrieveThis(driver, student_searchTable_gender_cell).getText();
	}
	
	public String getThis_searchTable_city(WebDriver driver)
	{
		return Util.retrieveThis(driver, student_searchTable_city_cell).getText();
	}

	public String getThis_searchTable_mobileNumber(WebDriver driver)
	{
		return Util.retrieveThis(driver, student_searchTable_mobileNumber_cell).getText();
	}
	
	public void click_viewStudent(WebDriver driver)
	{
		Util.clickThis(driver, student_tableRow_studentTable, "Class Row");
		Util.clickThis(driver, student_viewStudent_Button, "View Student");
	}
	
	public void click_deleteStudent(WebDriver driver)
	{
		Util.clickThis(driver, student_tableRow_studentTable, "Class Row");
		Util.clickThis(driver, student_removeStudent_Button, "View Student");
		Util.clickThis(driver, student_deleteStudent_deleteConfirmation_Button, "Delete Confirmation");
	}
	
	public void click_editStudent(WebDriver driver)
	{
		Util.clickThis(driver, student_tableRow_studentTable, "Class Row");
		Util.clickThis(driver, student_editStudent_Button, "Edit Student");
	}
	
	
	

}
