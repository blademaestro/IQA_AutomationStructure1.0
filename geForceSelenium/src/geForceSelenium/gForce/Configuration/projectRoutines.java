package geForceSelenium.gForce.Configuration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import selenium.Util.Util;

public class projectRoutines {

	public static void loginRoutine(WebDriver driver )
	{
		By login_Username_Field = By.name("username");
		By login_Password_Field = By.name("password");
		By login_login_Button = By.cssSelector("button.btn.btn-primary");
		String login_username = "gab";
		String login_password = "123qwe123";
		
		driver.get(projectConfiguration.url);
		
		Util.typeThis(driver, login_Username_Field, login_username);
		Util.typeThis(driver, login_Password_Field, login_password);
		Util.clickThis(driver, login_login_Button);

	}
}
