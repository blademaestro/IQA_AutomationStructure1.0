package geForceSelenium.gForce.Data;

import selenium.Util.Util;

//import selenium.Util.Util;


public class webClassData {


	
	public String class_addClass_classType = "Open Class";
	public String class_addClass_className = "ClassName" + Util.generateRandomString(5);	
	public double class_addClass_classRate = 100.00;
	public String class_addClass_classTeacher = "Danica Mozo";
	public String class_addClass_classVenue = "Vnu" + Util.generateRandomString(5);
	//public String class_addClass_classArea = "Area" + Util.generateRandomString(4);
	public double class_addClass_classCapacity = 50.00;
	public String class_addClass_classScheduleData = "2017-02-16";
	public String class_addClass_classYoutubeURL = "https://www.youtube.com/watch?v=9azGzlvCygA";	
	public String class_gForceProj_addClass_classVenue = "Vnu" + Util.generateRandomString(5);
	
	public String[] listOfGFPArea = {"Quezon City","Makati", "Taguig", "Alabang", "Batangas"};
	public String class_gForceProj_addClass_classArea = listOfGFPArea[Util.generateRandomNumber(0,5)];
	public String class_gForceProj_addClass_classType = "G-Force Project";
	public String class_gForceProj_addClass_className = "G-Force Project" + Util.generateRandomString(5) + " "+ class_gForceProj_addClass_classArea ;	
	public double class_gForceProj_addClass_classRate = 100.00;
	public String class_gForceProj_addClass_classTeacher = "Danica Mozo";
	public String class_gForceProj_addClass_classAddress = "Test Address" + class_gForceProj_addClass_classArea;
	public double class_gForceProj_addClass_classCapacity = 50.00;
	public String class_gForceProj_addClass_classScheduleData = "2017-02-16";
	public String class_gForceProj_addClass_classYoutubeURL = "https://www.youtube.com/watch?v=9azGzlvCygA";
	public String class_gForceProj_addClass_subType = "2017";
	public String class_gForceProjreg_addClass_classVenue = "Vnu" + Util.generateRandomString(5);
	
	
	public String[] listofGFPRArea = {"Davao", "Cebu", "Lucena", "Cavite", "Southern Leyte"};
	public String class_gForceProjreg_addClass_classArea = listofGFPRArea[Util.generateRandomNumber(0,5)];;
	public String class_gForceProjreg_addClass_classType = "G-Force Project Regional";
	public String class_gForceProjreg_addClass_className = "G-Force Project Regional" + Util.generateRandomString(5) + " "+ class_gForceProjreg_addClass_classArea ;	
	public double class_gForceProjreg_addClass_classRate = 500.00;
	public String class_gForceProjreg_addClass_classTeacher = "Danica Mozo";
	public String class_gForceProjreg_addClass_classAddress = "Test Address" + class_gForceProj_addClass_classArea;
	public double class_gForceProjreg_addClass_classCapacity = 50.00;
	public String class_gForceProjreg_addClass_classScheduleData = "2017-02-16";
	public String class_gForceProjreg_addClass_classYoutubeURL = "https://www.youtube.com/watch?v=9azGzlvCygA";
	public String class_gForceProjreg_addClass_subType = "2017";
	

	public String class_searchClass_className = class_addClass_className;
	public String class_searchClass_classType = class_addClass_classType;
	public String class_searchClass_classTeacher = class_addClass_classTeacher;
	public String class_searchClass_classNotPublished = "No";	
	public String class_searchClass_classPublished = "Yes";
	public double class_searchClass_classRate = 100.00;
	
	public String class_editClass_classType = "Open Class";
	public String class_editClass_className = "ClassName" + Util.generateRandomString(5);	
	public double class_editClass_classRate = 300.00;
	public String class_editClass_classTeacher = "AJ Albaniel";
	public String class_editClass_classVenue = "Vnu" + Util.generateRandomString(5);
	public double class_editClass_classCapacity = 50;
	public String class_editClass_classScheduleData = "2017-02-16";
	public String class_editClass_classYoutubeURL = "https://www.youtube.com/watch?v=ll8KDdQzoKY&t=1266s";

	public webClassData()
	{
			
		
	}
	

}

	
