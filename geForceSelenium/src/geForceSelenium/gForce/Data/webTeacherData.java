package geForceSelenium.gForce.Data;

import selenium.Util.Util;

public class webTeacherData {


	//public String teacher_searchTeacher_gender = ;		
	public String teacher_addTeacher_firstName = "TRAINERTEACHER " + Util.generateRandomString(5);	
	public String teacher_addTeacher_middleName = Util.generateRandomString(8);	
	public String teacher_addTeacher_lastName = Util.generateRandomString(8);	
	public String teacher_addTeacher_contactNumber = "876524315";
	public String teacher_addTeacher_gender = "Male";
	public String teacher_addTeacher_emailAddress = Util.generateRandomString(8)+ "email@email.com";		
	public String teacher_addTeacher_birthDate = "2017-01-03";	

	public String teacher_addTeacher_country = "Philippines";		
	public String teacher_addTeacher_address = "Bayan";		
	public String teacher_addTeacher_description = "Description Text Area";		
	public String teacher_addTeacher_newPassword = "Password";	
	public String teacher_addTeacher_confirmPassword = "Password";	
	public String teacher_addTeacher_emergencycontactName = "contactName";
	public String teacher_addTeacher_emergencyContactNumber = "3114213123";	
	
	public String teacher_searchTeacher_firstName = teacher_addTeacher_firstName;
	public String teacher_searchTeacher_lastName = teacher_addTeacher_lastName;
	
	public String teacher_addTeacher_nonTrainerFirstName = "NON-TRAINERTEACHER" + Util.generateRandomString(3);
	public String teacher_addTeacher_nonTrainerEmail = "NON-TRAINERTEACHEREMAIL" + Util.generateRandomString(3) + "@mailinator.com"; 

	public String teacher_addTeacher_randomTeacherEmail = "randomEMail" + Util.generateTimeNow() + "@mailinator.com";
	
	public String teacher_addTeacher_birthDateFutureDate = "2099-01-03";
}
