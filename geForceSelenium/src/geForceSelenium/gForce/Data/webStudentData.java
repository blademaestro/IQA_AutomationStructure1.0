package geForceSelenium.gForce.Data;

import selenium.Util.Util;

public class webStudentData {


	//Core
	public String student_addStudent_middleName = Util.generateRandomString(8);
	public String student_addStudent_firstName = Util.generateRandomString(8);
	public String student_addStudent_lastName = Util.generateRandomString(8);
	public String student_addStudent_emailAddress = Util.generateRandomString(5)+"email@mailinator.com";
	public String student_addStudent_birthDate = "Jul-10-1990";
	public String student_addStudent_country = "Philippines";
	public String student_addStudent_address= "Bayan";
	
	public String student_addStudent_contactNumber = "9654321";	
	public String student_addStudent_newPassword = "Password1!";
	public String student_addStudent_confirmPassword = "Password1!";
	public String student_addStudent_emergencyContactName = "emergencyName";
	public String student_addStudent_emergencyContactNumber = "emergencyNumber" ;
	public String student_searchStudent_firstName =  student_addStudent_firstName;
	public String student_searchStudent_lastName = student_addStudent_lastName ;
	public String student_searchStudent_gender = "Male";
	public String student_viewStudent_studentName = "Woof";
	public String student_viewStudent_studentEmailAddress = "arf@arf.com";
	public String student_viewStudent_studentContactNumber =  "0923465897";	

	public String student_editStudent_middleName = Util.generateRandomString(8);
	public String student_editStudent_firstName = Util.generateRandomString(8);
	public String student_editStudent_lastName = Util.generateRandomString(8);
	public String student_editStudent_emailAddress = Util.generateRandomString(5)+"email@mailinator.com";
	
	


}
